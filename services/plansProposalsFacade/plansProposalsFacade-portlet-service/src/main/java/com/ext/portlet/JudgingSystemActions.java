package com.ext.portlet;

/**
 * @author pdeboer
 *         First created on 10/7/13 at 7:37 PM
 */
public class JudgingSystemActions {
    public enum JudgeAction {
        NO_DECISION(0, "no decision"), DONT_MOVE_ON(1, "don't move on"), MOVE_ON(2, "move on");

        int attributeValue;
        String description;

        private JudgeAction(int attributeValue, String description) {
            this.attributeValue = attributeValue;
            this.description = description;
        }

        public static JudgeAction fromInt(Integer value) {
            for(JudgeAction a : values()) {
                if(a.attributeValue == value) return a;
            }

            return NO_DECISION;
        }

        public int getAttributeValue(){
            return this.attributeValue;
        }

        public String getDescription(){
            return description;
        }
    }

    public enum FellowAction {
        NO_DECISION(0, "No decision", false, false), INCOMPLETE(1, "Incomplete", true, false), OFFTOPIC(2, "Off-topic", true, false), PASSTOJUDGES(3, "Advance to judges", false, true);

        int attributeValue;
        String description;
        boolean commentEnabled;
        boolean selectJudgesEnabled;

        private FellowAction(int attributeValue, String description, boolean commentEnabled, boolean selectJudgesEnabled) {
            this.attributeValue = attributeValue;
            this.description = description;
            this.commentEnabled = commentEnabled;
            this.selectJudgesEnabled = selectJudgesEnabled;
        }

        public static FellowAction fromInt(Integer value) {
            for(FellowAction a : values()) {
                if(a.attributeValue == value) return a;
            }

            return NO_DECISION;
        }

        public int getAttributeValue(){
            return this.attributeValue;
        }

        public String getDescription(){
            return description;
        }

        public boolean getCommentEnabled() {
            return commentEnabled;
        }

        public boolean getSelectJudgesEnabled() {
            return selectJudgesEnabled;
        }
    }
}
