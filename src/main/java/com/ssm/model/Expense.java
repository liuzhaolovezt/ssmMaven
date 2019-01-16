package com.ssm.model;

import java.util.Date;

public class Expense {
    private Integer expenseId;

    private Integer exclassId;

    private String userId;

    private String duserId;

    private Integer passId;

    private String expenseInfo;

    private Integer expenseMoney;

    private Date expenseTime;

    private Date expensePasstime;

    private String expensePassinfo;

    public Integer getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Integer expenseId) {
        this.expenseId = expenseId;
    }

    public Integer getExclassId() {
        return exclassId;
    }

    public void setExclassId(Integer exclassId) {
        this.exclassId = exclassId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getDuserId() {
        return duserId;
    }

    public void setDuserId(String duserId) {
        this.duserId = duserId == null ? null : duserId.trim();
    }

    public Integer getPassId() {
        return passId;
    }

    public void setPassId(Integer passId) {
        this.passId = passId;
    }

    public String getExpenseInfo() {
        return expenseInfo;
    }

    public void setExpenseInfo(String expenseInfo) {
        this.expenseInfo = expenseInfo == null ? null : expenseInfo.trim();
    }

    public Integer getExpenseMoney() {
        return expenseMoney;
    }

    public void setExpenseMoney(Integer expenseMoney) {
        this.expenseMoney = expenseMoney;
    }

    public Date getExpenseTime() {
        return expenseTime;
    }

    public void setExpenseTime(Date expenseTime) {
        this.expenseTime = expenseTime;
    }

    public Date getExpensePasstime() {
        return expensePasstime;
    }

    public void setExpensePasstime(Date expensePasstime) {
        this.expensePasstime = expensePasstime;
    }

    public String getExpensePassinfo() {
        return expensePassinfo;
    }

    public void setExpensePassinfo(String expensePassinfo) {
        this.expensePassinfo = expensePassinfo == null ? null : expensePassinfo.trim();
    }
}