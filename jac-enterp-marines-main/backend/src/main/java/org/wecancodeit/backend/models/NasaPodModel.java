package org.wecancodeit.backend.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NasaPodModel {

    @JsonProperty("title")
    private String title;

    @JsonProperty("date")
    private String date;

    @JsonProperty("url")
    private String url;

    @JsonProperty("explanation")
    private String explanation;

    public NasaPodModel() {
    }

    public NasaPodModel(String title, String date, String url, String explanation) {
        this.title = title;
        this.date = date;
        this.url = url;
        this.explanation = explanation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}
