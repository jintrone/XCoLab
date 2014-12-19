package org.xcolab.proposals.events;

import com.ext.portlet.model.Proposal;
import com.liferay.portal.model.User;

public class ProposalRemovedVoteEvent extends BaseProposalUserActivityEvent {

    public ProposalRemovedVoteEvent(Proposal proposal, User user) {
        super(proposal, user);
    }

}
