package com.springinaction.knights;

public class DamesRescuingKnight implements Knights {

    private RescueDamselQues ques;

    public DamesRescuingKnight() {
        this.ques = new RescueDamselQues();
    }


    public void embarkOnQuest() {
        ques.embark();
    }
}
