package com.example.allinone;

public class Question {

    private int ansID;
    private boolean answerCorrect;

    public Question(int ansID, boolean answerCorrect) {
        this.ansID = ansID;
        this.answerCorrect = answerCorrect;
    }

    public int getAnsID() {
        return ansID;
    }

    public void setAnsID(int ansID) {
        this.ansID = ansID;
    }

    public boolean isAnswerCorrect() {
        return answerCorrect;
    }

    public void setAnswerCorrect(boolean answerCorrect) {
        this.answerCorrect = answerCorrect;
    }
}
