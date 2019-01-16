package com.ssm.model;

public class Passinfo {
    private Integer passId;

    private String passState;

    public Integer getPassId() {
        return passId;
    }

    public void setPassId(Integer passId) {
        this.passId = passId;
    }

    public String getPassState() {
        return passState;
    }

    public void setPassState(String passState) {
        this.passState = passState == null ? null : passState.trim();
    }
}