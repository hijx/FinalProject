package com.example.myapplication;

import java.io.Serializable;

public class Action implements Serializable {

    private String actionName;
    private int actionImg;
    private String actionExplanation;
    private String actionMandatoryDocuments;


    public Action(String actionName, int actionImg, String actionExplanation, String actionMandatoryDocuments) {

        this.actionName = actionName;
        this.actionImg = actionImg;
        this.actionExplanation = actionExplanation;
        this.actionMandatoryDocuments = actionMandatoryDocuments;

    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public int getActionImg() {
        return actionImg;
    }

    public void setActionImg(int actionImg) {
        this.actionImg = actionImg;
    }

    public String getActionExplanation() {
        return actionExplanation;
    }

    public void setActionExplanation(String actionExplanation) {
        this.actionExplanation = actionExplanation;
    }

    public String getActionMandatoryDocuments() {
        return actionMandatoryDocuments;
    }

    public void setActionMandatoryDocuments(String actionMandatoryDocuments) {
        this.actionMandatoryDocuments = actionMandatoryDocuments;
    }
}


