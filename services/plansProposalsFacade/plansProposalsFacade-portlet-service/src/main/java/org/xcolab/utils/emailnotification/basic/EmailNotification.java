package org.xcolab.utils.emailnotification.basic;

import com.ext.portlet.ProposalAttributeKeys;
import com.ext.portlet.messaging.MessageUtil;
import com.ext.portlet.model.Contest;
import com.ext.portlet.model.ContestEmailTemplate;
import com.ext.portlet.model.ContestType;
import com.ext.portlet.model.Proposal;
import com.ext.portlet.service.ContestLocalServiceUtil;
import com.ext.portlet.service.ContestTypeLocalServiceUtil;
import com.ext.portlet.service.ProposalLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.util.mail.MailEngine;
import com.liferay.util.mail.MailEngineException;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.xcolab.helpers.ProposalAttributeHelper;
import org.xcolab.utils.TemplateReplacementUtil;
import org.xcolab.utils.judging.EmailTemplateWrapper;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public abstract class EmailNotification {
    protected static final long ADMINISTRATOR_USER_ID = 10144L;

    private static final String FIRSTNAME_PLACEHOLDER = "firstname";
    private static final String FULL_NAME_PLACEHOLDER = "fullname";

    private static final String PROPOSAL_LINK_PLACEHOLDER = "proposal-link";
    private static final String CONTEST_LINK_PLACEHOLDER = "contest-link";

    private static final String PROPOSAL_STRING_PLACEHOLDER = "proposal-string";
    private static final String PROPOSALS_STRING_PLACEHOLDER = "proposals-string";
    private static final String CONTEST_STRING_PLACEHOLDER = "contest-string";
    private static final String CONTESTS_STRING_PLACEHOLDER = "contests-string";

    private static final String TWITTER_PLACEHOLDER = "twitter";
    private static final String FACEBOOK_PLACEHOLDER = "facebook";
    private static final String PINTEREST_PLACEHOLDER = "pinterest";
    private static final String LINKEDIN_PLACEHOLDER = "linkedin";

    protected static final String FACEBOOK_PROPOSAL_SHARE_LINK
            = "https://www.facebook.com/sharer/sharer.php?u=%s&display=popup";
    protected static final String TWITTER_PROPOSAL_SHARE_LINK
            = "https://twitter.com/share?url=%s&text=%s";
    protected static final String LINKEDIN_PROPOSAL_SHARE_LINK
            = "https://www.linkedin.com/shareArticle?mini=true&url=%s&title=%s&summary=%s&source=";
    protected static final String PINTEREST_PROPOSAL_SHARE_LINK
            = "https://pinterest.com/pin/create/button/?url=g%s&media=http://climatecolab.org/climatecolab-theme/images/logo-climate-colab.png&description=%s";

    protected static final String LINK_FORMAT_STRING = "<a href='%s' target='_blank'>%s</a>";

    protected ProposalAttributeHelper proposalAttributeHelper;

    protected ServiceContext serviceContext;

    protected Log _log;

    public EmailNotification(ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
        _log = LogFactoryUtil.getLog(this.getClass());
    }

    protected String getProposalLinkWithLinkText(Contest contest, Proposal proposal, String linkText, String tab)
            throws SystemException {
        String proposalLinkUrl = serviceContext.getPortalURL()
                + ProposalLocalServiceUtil.getProposalLinkUrl(contest, proposal);
        if (tab != null) {
            proposalLinkUrl += "/tab/" + tab;
        }
        return String.format(LINK_FORMAT_STRING, proposalLinkUrl, linkText);
    }

    /**
     * Returns the HTML link for the passed proposal and contest
     *
     * @param contest  The contest object in which the proposal was written
     * @param proposal The proposal object (must not be null)
     * @return Proposal URL as String
     */
    protected String getProposalLinkForDirectVoting(Contest contest, Proposal proposal) throws SystemException {
        final String proposalName = new ProposalAttributeHelper(proposal)
                .getAttributeValueString(ProposalAttributeKeys.NAME, "");
        final String proposalLinkUrl = serviceContext.getPortalURL()
                + ProposalLocalServiceUtil.getProposalLinkUrl(contest, proposal) + "/vote";
        return String.format(LINK_FORMAT_STRING, proposalLinkUrl, proposalName);
    }

    /**
     * Returns the HTML link for the passed contest
     *
     * @param contest The contest object
     * @return Contest URL as String
     */
    protected String getContestLink(Contest contest) {
        final String contestLinkUrl =
                serviceContext.getPortalURL() + ContestLocalServiceUtil.getContestLinkUrl(contest);
        return String.format(LINK_FORMAT_STRING, contestLinkUrl, contest.getContestShortName());
    }

    protected Contest getContest() {
        return null;
    }

    protected ProposalAttributeHelper getProposalAttributeHelper() {
        if (proposalAttributeHelper == null) {
            proposalAttributeHelper = new ProposalAttributeHelper(getProposal());
        }
        return proposalAttributeHelper;
    }

    protected Proposal getProposal() {
        return null;
    }

    /**
     * Returns the link url to the given proposal
     *
     * @param contest         Contest in which the proposal is in
     * @param proposalToShare The Proposal that should be shared
     * @throws SystemException
     * @throws PortalException
     */
    protected String getProposalLinkUrl(Contest contest, Proposal proposalToShare)
            throws SystemException, PortalException {
        return serviceContext.getPortalURL() + ProposalLocalServiceUtil.getProposalLinkUrl(contest, proposalToShare);
    }

    /**
     * Returns the link url to the given contest
     *
     * @param contest Contest to be shared
     */
    protected String getContestLinkUrl(Contest contest) {
        return serviceContext.getPortalURL() + ContestLocalServiceUtil.getContestLinkUrl(contest);
    }

    /**
     * Returns a fully prepared Facebook share link for the given url
     *
     * @param urlToShare The url to be shared
     */
    protected String getFacebookShareLink(String urlToShare) {
        String url = String.format(FACEBOOK_PROPOSAL_SHARE_LINK, urlToShare);
        return String.format(LINK_FORMAT_STRING, url, "Facebook");
    }

    /**
     * Returns a fully prepared Twitter share link for the given url including the specified share message
     *
     * @param urlToShare   The url to be shared
     * @param shareMessage The message that should be included for sharing
     * @throws SystemException
     */
    protected String getTwitterShareLink(String urlToShare, String shareMessage) throws SystemException {
        try {
            String url = String.format(TWITTER_PROPOSAL_SHARE_LINK, urlToShare,
                    URLEncoder.encode(shareMessage, "UTF-8"));
            return String.format(LINK_FORMAT_STRING, url, "Twitter");
        } catch (UnsupportedEncodingException e) {
            // Should never happen
            throw new SystemException(e);
        }
    }

    protected String getLinkedInShareLink(String urlToShare, String shareTitle, String shareMessage)
            throws SystemException {
        try {
            String url = String.format(LINKEDIN_PROPOSAL_SHARE_LINK, urlToShare,
                    URLEncoder.encode(shareTitle, "UTF-8"),
                    URLEncoder.encode(shareMessage, "UTF-8"));
            return String.format(LINK_FORMAT_STRING, url, "LinkedIn");
        } catch (UnsupportedEncodingException e) {
            // Should never happen
            throw new SystemException(e);
        }
    }

    protected String getPinterestShareLink(String urlToShare, String shareMessage) throws SystemException {
        try {
            String url = String.format(PINTEREST_PROPOSAL_SHARE_LINK, urlToShare,
                    URLEncoder.encode(shareMessage, "UTF-8"));
            return String.format(LINK_FORMAT_STRING, url, "Pinterest");
        } catch (UnsupportedEncodingException e) {
            // Should never happen
            throw new SystemException(e);
        }
    }

    public void sendEmailNotification() throws SystemException, PortalException {
        EmailTemplateWrapper template = getTemplateWrapper();
        String subject = template.getSubject();
        String body = template.getHeader() + "\n" + template.getFooter();
        sendMessage(subject, body, getRecipient());
    }

    protected abstract EmailTemplateWrapper getTemplateWrapper() throws SystemException, PortalException;

    protected void sendMessage(String subject, String body, User recipient) throws SystemException {
        try {
            InternetAddress fromEmail = TemplateReplacementUtil.getAdminFromEmailAddress();
            InternetAddress toEmail = new InternetAddress(recipient.getEmailAddress(), recipient.getFullName());
            MailEngine.send(fromEmail, toEmail, subject, body, true);
        } catch (MailEngineException | UnsupportedEncodingException e) {
            _log.error("Could not send vote message", e);
        }
    }

    protected abstract User getRecipient() throws SystemException, PortalException;

    public void sendMessage() throws SystemException, PortalException {
        List<Long> recipients = new ArrayList<>();
        recipients.add(getRecipient().getUserId());
        EmailTemplateWrapper template = getTemplateWrapper();
        try {
            String content = template.getHeader() + template.getFooter();
            content = content.replace("\n", " ").replace("\r", " ");
            MessageUtil.sendMessage(template.getSubject(), content, ADMINISTRATOR_USER_ID, ADMINISTRATOR_USER_ID,
                    recipients, null);
        } catch (MailEngineException | AddressException | UnsupportedEncodingException e) {
            throw new SystemException(e);
        }
    }

    protected class EmailNotificationTemplate extends EmailTemplateWrapper {
        public EmailNotificationTemplate(ContestEmailTemplate template, String proposalName, String contestName) {
            super(template, proposalName, contestName);
        }

        @Override
        protected Node resolvePlaceholderTag(Element tag) throws SystemException, PortalException {
            final Node node = super.resolvePlaceholderTag(tag);
            if (node != null) {
                return node;
            }
            Contest contest = getContest();
            Proposal proposal = getProposal();
            final boolean hasProposal = contest != null && proposal != null;
            final ContestType contestType = contest != null
                    ? ContestTypeLocalServiceUtil.getContestType(contest) : null;

            switch (tag.nodeName()) {
                case FIRSTNAME_PLACEHOLDER:
                    return new TextNode(getRecipient().getFirstName(), "");
                case FULL_NAME_PLACEHOLDER:
                    return new TextNode(getRecipient().getFullName(), "");
                case CONTEST_LINK_PLACEHOLDER:
                    if (contest != null) {
                        return parseXmlNode(getContestLink(contest));
                    }
                    break;
                case PROPOSAL_LINK_PLACEHOLDER:
                    if (hasProposal) {
                        final String tab = tag.hasAttr("tab") ? tag.attr("tab") : null;

                        final String linkText;
                        if (StringUtils.isNotBlank(tag.ownText())) {
                            linkText = tag.ownText();
                        } else {
                            linkText = getProposalAttributeHelper()
                                    .getAttributeValueString(ProposalAttributeKeys.NAME, "");
                        }
                        return parseXmlNode(getProposalLinkWithLinkText(contest, proposal, linkText, tab));
                    }
                    break;
                case PROPOSAL_STRING_PLACEHOLDER:
                    if (contest != null) {
                        return new TextNode(contestType.getProposalName(), "");
                    }
                    break;
                case PROPOSALS_STRING_PLACEHOLDER:
                    if (contest != null) {
                        return new TextNode(contestType.getProposalNamePlural(), "");
                    }
                    break;
                case CONTEST_STRING_PLACEHOLDER:
                    if (contest != null) {
                        return new TextNode(contestType.getContestName(), "");
                    }
                    break;
                case CONTESTS_STRING_PLACEHOLDER:
                    if (contest != null) {
                        return new TextNode(contestType.getContestNamePlural(), "");
                    }
                    break;
                case TWITTER_PLACEHOLDER:
                    if (hasProposal) {
                        return parseXmlNode(getTwitterShareLink(getProposalLinkUrl(contest, proposal), tag.ownText()));
                    }
                    break;
                case PINTEREST_PLACEHOLDER:
                    if (hasProposal) {
                        return parseXmlNode(
                                getPinterestShareLink(getProposalLinkUrl(contest, proposal), tag.ownText()));
                    }
                    break;
                case FACEBOOK_PLACEHOLDER:
                    if (hasProposal) {
                        return parseXmlNode(getFacebookShareLink(getProposalLinkUrl(contest, proposal)));
                    }
                    break;
                case LINKEDIN_PLACEHOLDER:
                    if (hasProposal) {
                        return parseXmlNode(getLinkedInShareLink(getProposalLinkUrl(contest, proposal),
                                tag.attr("title"), tag.ownText()));
                    }
                    break;
                default:
            }
            return null;
        }
    }
}