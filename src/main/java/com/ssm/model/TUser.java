package com.ssm.model;

import java.util.Date;

public class TUser {
    private String userId;

    private Integer deptId;

    private Integer jobId;

    private String userName;

    private String userSex;

    private Integer userAge;

    private Integer userSalary;

    private String userTel;

    private String userAdd;

    private String userEml;

    private Date userDate;

    private String userPho;

    private String userPw;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Integer getUserSalary() {
        return userSalary;
    }

    public void setUserSalary(Integer userSalary) {
        this.userSalary = userSalary;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getUserAdd() {
        return userAdd;
    }

    public void setUserAdd(String userAdd) {
        this.userAdd = userAdd == null ? null : userAdd.trim();
    }

    public String getUserEml() {
        return userEml;
    }

    public void setUserEml(String userEml) {
        this.userEml = userEml == null ? null : userEml.trim();
    }

    public Date getUserDate() {
        return userDate;
    }

    public void setUserDate(Date userDate) {
        this.userDate = userDate;
    }

    public String getUserPho() {
        return userPho;
    }

    public void setUserPho(String userPho) {
        this.userPho = userPho == null ? null : userPho.trim();
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw == null ? null : userPw.trim();
    }
}