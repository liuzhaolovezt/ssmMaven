package com.ssm.model;

import java.util.Date;

public class Leaveinfo {
    private Integer leaveId;

    private Integer passId;

    private String userId;

    private String duserId;

    private Date leaveStarttime;

    private Date leaveEndtime;

    private String leaveReason;

    private Date leavePasstime;

    private String leavePasscont;

    public Integer getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Integer leaveId) {
        this.leaveId = leaveId;
    }

    public Integer getPassId() {
        return passId;
    }

    public void setPassId(Integer passId) {
        this.passId = passId;
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

    public Date getLeaveStarttime() {
        return leaveStarttime;
    }

    public void setLeaveStarttime(Date leaveStarttime) {
        this.leaveStarttime = leaveStarttime;
    }

    public Date getLeaveEndtime() {
        return leaveEndtime;
    }

    public void setLeaveEndtime(Date leaveEndtime) {
        this.leaveEndtime = leaveEndtime;
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason == null ? null : leaveReason.trim();
    }

    public Date getLeavePasstime() {
        return leavePasstime;
    }

    public void setLeavePasstime(Date leavePasstime) {
        this.leavePasstime = leavePasstime;
    }

    public String getLeavePasscont() {
        return leavePasscont;
    }

    public void setLeavePasscont(String leavePasscont) {
        this.leavePasscont = leavePasscont == null ? null : leavePasscont.trim();
    }
}