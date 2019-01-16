package com.ssm.model;

import java.util.Date;

public class Notice {
      private Integer noticeId;

    private String userId;

    private String noticeScope;

    private String noticeTitle;

    private String noticeCont;

    private Date noticeTime;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getNoticeScope() {
        return noticeScope;
    }

    public void setNoticeScope(String noticeScope) {
        this.noticeScope = noticeScope == null ? null : noticeScope.trim();
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle == null ? null : noticeTitle.trim();
    }

    public String getNoticeCont() {
        return noticeCont;
    }

    public void setNoticeCont(String noticeCont) {
        this.noticeCont = noticeCont == null ? null : noticeCont.trim();
    }

    public Date getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
    }
}