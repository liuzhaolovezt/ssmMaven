package com.ssm.model;

public class Expenseclass {
    private Integer exclassId;

    private String exclassInfo;

    public Integer getExclassId() {
        return exclassId;
    }

    public void setExclassId(Integer exclassId) {
        this.exclassId = exclassId;
    }

    public String getExclassInfo() {
        return exclassInfo;
    }

    public void setExclassInfo(String exclassInfo) {
        this.exclassInfo = exclassInfo == null ? null : exclassInfo.trim();
    }
}