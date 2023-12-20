package org.wecancodeit.backend.games.trivia.model;

public class QuestionModel {

    private String questionText;
    private String[] choices;
    private int answerIndex;

    public QuestionModel() {
    }

    public QuestionModel(String questionText, String[] choices, int answerIndex) {
        this.questionText = questionText;
        this.choices = choices;
        this.answerIndex = answerIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    public int getAnswerIndex() {
        return answerIndex;
    }

    public void setAnswerIndex(int answerIndex) {
        this.answerIndex = answerIndex;
    }

}
