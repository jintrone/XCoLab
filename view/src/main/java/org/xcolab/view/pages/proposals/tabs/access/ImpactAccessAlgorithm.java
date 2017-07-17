package org.xcolab.view.pages.proposals.tabs.access;

import org.xcolab.client.admin.attributes.configuration.ConfigurationAttributeKey;
import org.xcolab.client.contest.OntologyClientUtil;
import org.xcolab.client.contest.pojo.Contest;
import org.xcolab.util.enums.contest.ContestTier;
import org.xcolab.view.pages.proposals.permissions.ProposalsPermissions;
import org.xcolab.view.pages.proposals.tabs.ProposalTabCanAccessAlgorithm;
import org.xcolab.view.pages.proposals.utils.context.ProposalContext;

import java.util.List;

public class ImpactAccessAlgorithm implements ProposalTabCanAccessAlgorithm {

    private final boolean isEdit;

    private ImpactAccessAlgorithm(boolean isEdit) {
        this.isEdit = isEdit;
    }

    public static ImpactAccessAlgorithm view() {
        return new ImpactAccessAlgorithm(false);
    }

    public static ImpactAccessAlgorithm edit() {
        return new ImpactAccessAlgorithm(true);
    }

    @Override
    public boolean canAccess(ProposalContext proposalContext) {
        if (isEdit) {
            return getCanEdit(proposalContext);
        }
        return getCanView(proposalContext);
    }

    private boolean getCanView(ProposalContext proposalContext) {
        if (ConfigurationAttributeKey.IMPACT_TAB_IS_ACTIVE.get()) {
            final Contest contest = proposalContext.getContest();

            if (contest.getContestTier() != ContestTier.NONE.getTierType()
                    && contest.getContestTier() != ContestTier.REGION_SECTOR.getTierType()) {
                long focusAreaId = contest.getFocusAreaId();
                if (!isDescendantOfExcludedOntologyTerm(focusAreaId)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isDescendantOfExcludedOntologyTerm(long focusAreaId) {

        final List<Long> excludedOntologyTermIds = ConfigurationAttributeKey
                .IMPACT_TAB_EXCLUDED_ONTOLOGY_TERM_IDS.get();
        for (Long excludedOntologyTermId : excludedOntologyTermIds) {
            if (OntologyClientUtil
                    .isAnyOntologyTermOfFocusAreaIdADescendantOfOntologyTermId(
                            focusAreaId, excludedOntologyTermId)) {
                return true;
            }
        }
        return false;
    }

    private boolean getCanEdit(ProposalContext proposalContext) {
        ProposalsPermissions permissions = proposalContext.getPermissions();
        Contest contest = proposalContext.getContest();

        final boolean memberCanAccess = permissions.getIsTeamMember()
                || permissions.getCanAdminProposal()
                || permissions.getCanIAFActions();
        if (!memberCanAccess || contest == null || contest.getContestTier() == null) {
            return false;
        }
        switch (ContestTier.getContestTierByTierType(contest.getContestTier())) {
            case BASIC:
            case REGION_AGGREGATE:
            case GLOBAL:
                return true;
            default:
                return false;
        }
    }
}
