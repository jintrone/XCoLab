package org.xcolab.client.proposals.pojo.proposals;

import org.xcolab.client.proposals.pojo.evaluation.judges.ProposalRating;

import java.util.ArrayList;
import java.util.List;

public class AverageProposalRating extends ProposalRatings {

    public AverageProposalRating() {
        this(new ArrayList<>(), 1L);
    }

    public AverageProposalRating(List<ProposalRating> ratings, Long roundFactor) {
        super(ratings, roundFactor);
    }
}