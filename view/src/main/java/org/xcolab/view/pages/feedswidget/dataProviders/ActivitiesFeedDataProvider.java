package org.xcolab.view.pages.feedswidget.dataProviders;

import org.springframework.ui.Model;

import org.xcolab.client.activities.ActivitiesClientUtil;
import org.xcolab.client.activities.pojo.ActivityEntry;
import org.xcolab.client.members.MembersClient;
import org.xcolab.client.members.legacy.enums.MemberRole;
import org.xcolab.client.members.pojo.Member;
import org.xcolab.client.members.pojo.MemberCategory;
import org.xcolab.view.pages.feedswidget.FeedTypeDataProvider;
import org.xcolab.view.pages.feedswidget.FeedsPreferences;
import org.xcolab.view.pages.feedswidget.wrappers.SocialActivityWrapper;
import org.xcolab.view.util.entity.ActivityUtil;
import org.xcolab.view.util.pagination.SortFilterPage;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActivitiesFeedDataProvider implements FeedTypeDataProvider {

	@Override
	public String populateModel(HttpServletRequest request,
								HttpServletResponse response, SortFilterPage sortFilterPage,
								FeedsPreferences feedsPreferences, Model model) {



        Map<String, String[]> parameters = request.getParameterMap();
        final int pageSize = feedsPreferences.getFeedSize();
        String userIdStr = null;
        if (parameters.containsKey("userId")) {
            userIdStr = parameters.get("userId")[0];
        } else if (request.getParameter("userId") != null) {
            userIdStr = request.getParameter("userId");
        }
        long filterUserId = 0L;
        if (userIdStr != null) {
            try {
                filterUserId = Long.parseLong(userIdStr);
                Member filterUser = MembersClient.getMember(filterUserId);
                model.addAttribute("filterUserId", filterUserId);
                model.addAttribute("filterUser", filterUser);
            } catch (Throwable ignored) {
            }
        }
        List <Member> staffList;
        List <Member> adminList;
        HashMap<Long, Long> idsToExclude = new HashMap<>();
        if(feedsPreferences.getRemoveAdmin()){//STAFF
            final MemberCategory memberCategory = MembersClient.getMemberCategory(MemberRole.ADMINISTRATOR.getRoleId());
            adminList = MembersClient.listMembers(memberCategory.getCategoryName(),null,null, null, true, 0, Integer.MAX_VALUE);
            if(adminList!= null &&! adminList.isEmpty()) {
                for (Member m : adminList){
                    idsToExclude.put(m.getId_(),m.getUserId());
                }
            }
        }

        final MemberCategory memberCategory = MembersClient.getMemberCategory(MemberRole.STAFF.getRoleId());
        staffList = MembersClient.listMembers(memberCategory.getCategoryName(),null,null, null, true, 0, Integer.MAX_VALUE);
        if(staffList!= null &&! staffList.isEmpty()) {
            for (Member m : staffList){
                idsToExclude.put(m.getId_(),m.getUserId());
            }
        }

        List<ActivityEntry> windowedActivities;
        int startRetrievalAt = sortFilterPage.getPage() * pageSize;
        int endRetrievalAt = (sortFilterPage.getPage() + 1) * pageSize;
        if (filterUserId == 0) {
            windowedActivities = ActivitiesClientUtil
                    .getActivityEntries(startRetrievalAt, endRetrievalAt, null, new ArrayList<>(idsToExclude.keySet()));

        } else {
            windowedActivities = ActivitiesClientUtil
                    .getActivityEntries(startRetrievalAt, endRetrievalAt, filterUserId, new ArrayList<>(idsToExclude.keySet()));
        }

        int lastDaysBetween = -1;
        int i = 0;
        List<SocialActivityWrapper> activities = new ArrayList<>();
        Date now = new Date();
        for (ActivityEntry activity : windowedActivities) {

            if (SocialActivityWrapper.isEmpty(activity, request)) {
                continue;
            }

            if (i >= feedsPreferences.getFeedSize()) {
                break;
            }

            int curDaysBetween =
                        getDaysBetween(new Date(activity.getCreateDate().getTime()), now);
            activities.add(new SocialActivityWrapper(activity, curDaysBetween,
                    lastDaysBetween < curDaysBetween, i % 2 == 1, request,
                    feedsPreferences.getFeedMaxLength()));
            lastDaysBetween = curDaysBetween;
            i++;
        }

        model.addAttribute("activities", activities);

        if (filterUserId == 0) {
            model.addAttribute("isLastPage",
                    ((pageSize * (sortFilterPage.getPage() + 1)) >= ActivityUtil
                            .getAllActivitiesCount()));
        } else {
            model.addAttribute("isLastPage",
                    ((pageSize * (sortFilterPage.getPage() + 1) >= ActivityUtil
                            .getActivitiesCount(filterUserId))));
        }

        return "feedswidget/activities";
    }
    private static int getDaysBetween(Date d1, Date d2){
        return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }
}
