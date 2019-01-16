package com.ssm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Integer value) {
            addCriterion("DEPT_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Integer value) {
            addCriterion("DEPT_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Integer value) {
            addCriterion("DEPT_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEPT_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Integer value) {
            addCriterion("DEPT_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("DEPT_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Integer> values) {
            addCriterion("DEPT_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Integer> values) {
            addCriterion("DEPT_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("DEPT_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DEPT_ID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNull() {
            addCriterion("JOB_ID is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("JOB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Integer value) {
            addCriterion("JOB_ID =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Integer value) {
            addCriterion("JOB_ID <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Integer value) {
            addCriterion("JOB_ID >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("JOB_ID >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Integer value) {
            addCriterion("JOB_ID <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Integer value) {
            addCriterion("JOB_ID <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Integer> values) {
            addCriterion("JOB_ID in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Integer> values) {
            addCriterion("JOB_ID not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Integer value1, Integer value2) {
            addCriterion("JOB_ID between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("JOB_ID not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("USER_SEX is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("USER_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("USER_SEX =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("USER_SEX <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("USER_SEX >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("USER_SEX >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("USER_SEX <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("USER_SEX <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("USER_SEX like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("USER_SEX not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("USER_SEX in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("USER_SEX not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("USER_SEX between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("USER_SEX not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNull() {
            addCriterion("USER_AGE is null");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNotNull() {
            addCriterion("USER_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andUserAgeEqualTo(Integer value) {
            addCriterion("USER_AGE =", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotEqualTo(Integer value) {
            addCriterion("USER_AGE <>", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThan(Integer value) {
            addCriterion("USER_AGE >", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_AGE >=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThan(Integer value) {
            addCriterion("USER_AGE <", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThanOrEqualTo(Integer value) {
            addCriterion("USER_AGE <=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeIn(List<Integer> values) {
            addCriterion("USER_AGE in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotIn(List<Integer> values) {
            addCriterion("USER_AGE not in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeBetween(Integer value1, Integer value2) {
            addCriterion("USER_AGE between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_AGE not between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserSalaryIsNull() {
            addCriterion("USER_SALARY is null");
            return (Criteria) this;
        }

        public Criteria andUserSalaryIsNotNull() {
            addCriterion("USER_SALARY is not null");
            return (Criteria) this;
        }

        public Criteria andUserSalaryEqualTo(Integer value) {
            addCriterion("USER_SALARY =", value, "userSalary");
            return (Criteria) this;
        }

        public Criteria andUserSalaryNotEqualTo(Integer value) {
            addCriterion("USER_SALARY <>", value, "userSalary");
            return (Criteria) this;
        }

        public Criteria andUserSalaryGreaterThan(Integer value) {
            addCriterion("USER_SALARY >", value, "userSalary");
            return (Criteria) this;
        }

        public Criteria andUserSalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_SALARY >=", value, "userSalary");
            return (Criteria) this;
        }

        public Criteria andUserSalaryLessThan(Integer value) {
            addCriterion("USER_SALARY <", value, "userSalary");
            return (Criteria) this;
        }

        public Criteria andUserSalaryLessThanOrEqualTo(Integer value) {
            addCriterion("USER_SALARY <=", value, "userSalary");
            return (Criteria) this;
        }

        public Criteria andUserSalaryIn(List<Integer> values) {
            addCriterion("USER_SALARY in", values, "userSalary");
            return (Criteria) this;
        }

        public Criteria andUserSalaryNotIn(List<Integer> values) {
            addCriterion("USER_SALARY not in", values, "userSalary");
            return (Criteria) this;
        }

        public Criteria andUserSalaryBetween(Integer value1, Integer value2) {
            addCriterion("USER_SALARY between", value1, value2, "userSalary");
            return (Criteria) this;
        }

        public Criteria andUserSalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_SALARY not between", value1, value2, "userSalary");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNull() {
            addCriterion("USER_TEL is null");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNotNull() {
            addCriterion("USER_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andUserTelEqualTo(String value) {
            addCriterion("USER_TEL =", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotEqualTo(String value) {
            addCriterion("USER_TEL <>", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThan(String value) {
            addCriterion("USER_TEL >", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TEL >=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThan(String value) {
            addCriterion("USER_TEL <", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThanOrEqualTo(String value) {
            addCriterion("USER_TEL <=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLike(String value) {
            addCriterion("USER_TEL like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotLike(String value) {
            addCriterion("USER_TEL not like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelIn(List<String> values) {
            addCriterion("USER_TEL in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotIn(List<String> values) {
            addCriterion("USER_TEL not in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelBetween(String value1, String value2) {
            addCriterion("USER_TEL between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotBetween(String value1, String value2) {
            addCriterion("USER_TEL not between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserAddIsNull() {
            addCriterion("USER_ADD is null");
            return (Criteria) this;
        }

        public Criteria andUserAddIsNotNull() {
            addCriterion("USER_ADD is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddEqualTo(String value) {
            addCriterion("USER_ADD =", value, "userAdd");
            return (Criteria) this;
        }

        public Criteria andUserAddNotEqualTo(String value) {
            addCriterion("USER_ADD <>", value, "userAdd");
            return (Criteria) this;
        }

        public Criteria andUserAddGreaterThan(String value) {
            addCriterion("USER_ADD >", value, "userAdd");
            return (Criteria) this;
        }

        public Criteria andUserAddGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ADD >=", value, "userAdd");
            return (Criteria) this;
        }

        public Criteria andUserAddLessThan(String value) {
            addCriterion("USER_ADD <", value, "userAdd");
            return (Criteria) this;
        }

        public Criteria andUserAddLessThanOrEqualTo(String value) {
            addCriterion("USER_ADD <=", value, "userAdd");
            return (Criteria) this;
        }

        public Criteria andUserAddLike(String value) {
            addCriterion("USER_ADD like", value, "userAdd");
            return (Criteria) this;
        }

        public Criteria andUserAddNotLike(String value) {
            addCriterion("USER_ADD not like", value, "userAdd");
            return (Criteria) this;
        }

        public Criteria andUserAddIn(List<String> values) {
            addCriterion("USER_ADD in", values, "userAdd");
            return (Criteria) this;
        }

        public Criteria andUserAddNotIn(List<String> values) {
            addCriterion("USER_ADD not in", values, "userAdd");
            return (Criteria) this;
        }

        public Criteria andUserAddBetween(String value1, String value2) {
            addCriterion("USER_ADD between", value1, value2, "userAdd");
            return (Criteria) this;
        }

        public Criteria andUserAddNotBetween(String value1, String value2) {
            addCriterion("USER_ADD not between", value1, value2, "userAdd");
            return (Criteria) this;
        }

        public Criteria andUserEmlIsNull() {
            addCriterion("USER_EML is null");
            return (Criteria) this;
        }

        public Criteria andUserEmlIsNotNull() {
            addCriterion("USER_EML is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmlEqualTo(String value) {
            addCriterion("USER_EML =", value, "userEml");
            return (Criteria) this;
        }

        public Criteria andUserEmlNotEqualTo(String value) {
            addCriterion("USER_EML <>", value, "userEml");
            return (Criteria) this;
        }

        public Criteria andUserEmlGreaterThan(String value) {
            addCriterion("USER_EML >", value, "userEml");
            return (Criteria) this;
        }

        public Criteria andUserEmlGreaterThanOrEqualTo(String value) {
            addCriterion("USER_EML >=", value, "userEml");
            return (Criteria) this;
        }

        public Criteria andUserEmlLessThan(String value) {
            addCriterion("USER_EML <", value, "userEml");
            return (Criteria) this;
        }

        public Criteria andUserEmlLessThanOrEqualTo(String value) {
            addCriterion("USER_EML <=", value, "userEml");
            return (Criteria) this;
        }

        public Criteria andUserEmlLike(String value) {
            addCriterion("USER_EML like", value, "userEml");
            return (Criteria) this;
        }

        public Criteria andUserEmlNotLike(String value) {
            addCriterion("USER_EML not like", value, "userEml");
            return (Criteria) this;
        }

        public Criteria andUserEmlIn(List<String> values) {
            addCriterion("USER_EML in", values, "userEml");
            return (Criteria) this;
        }

        public Criteria andUserEmlNotIn(List<String> values) {
            addCriterion("USER_EML not in", values, "userEml");
            return (Criteria) this;
        }

        public Criteria andUserEmlBetween(String value1, String value2) {
            addCriterion("USER_EML between", value1, value2, "userEml");
            return (Criteria) this;
        }

        public Criteria andUserEmlNotBetween(String value1, String value2) {
            addCriterion("USER_EML not between", value1, value2, "userEml");
            return (Criteria) this;
        }

        public Criteria andUserDateIsNull() {
            addCriterion("USER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUserDateIsNotNull() {
            addCriterion("USER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUserDateEqualTo(Date value) {
            addCriterionForJDBCDate("USER_DATE =", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("USER_DATE <>", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateGreaterThan(Date value) {
            addCriterionForJDBCDate("USER_DATE >", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("USER_DATE >=", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateLessThan(Date value) {
            addCriterionForJDBCDate("USER_DATE <", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("USER_DATE <=", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateIn(List<Date> values) {
            addCriterionForJDBCDate("USER_DATE in", values, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("USER_DATE not in", values, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("USER_DATE between", value1, value2, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("USER_DATE not between", value1, value2, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserPhoIsNull() {
            addCriterion("USER_PHO is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoIsNotNull() {
            addCriterion("USER_PHO is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoEqualTo(String value) {
            addCriterion("USER_PHO =", value, "userPho");
            return (Criteria) this;
        }

        public Criteria andUserPhoNotEqualTo(String value) {
            addCriterion("USER_PHO <>", value, "userPho");
            return (Criteria) this;
        }

        public Criteria andUserPhoGreaterThan(String value) {
            addCriterion("USER_PHO >", value, "userPho");
            return (Criteria) this;
        }

        public Criteria andUserPhoGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PHO >=", value, "userPho");
            return (Criteria) this;
        }

        public Criteria andUserPhoLessThan(String value) {
            addCriterion("USER_PHO <", value, "userPho");
            return (Criteria) this;
        }

        public Criteria andUserPhoLessThanOrEqualTo(String value) {
            addCriterion("USER_PHO <=", value, "userPho");
            return (Criteria) this;
        }

        public Criteria andUserPhoLike(String value) {
            addCriterion("USER_PHO like", value, "userPho");
            return (Criteria) this;
        }

        public Criteria andUserPhoNotLike(String value) {
            addCriterion("USER_PHO not like", value, "userPho");
            return (Criteria) this;
        }

        public Criteria andUserPhoIn(List<String> values) {
            addCriterion("USER_PHO in", values, "userPho");
            return (Criteria) this;
        }

        public Criteria andUserPhoNotIn(List<String> values) {
            addCriterion("USER_PHO not in", values, "userPho");
            return (Criteria) this;
        }

        public Criteria andUserPhoBetween(String value1, String value2) {
            addCriterion("USER_PHO between", value1, value2, "userPho");
            return (Criteria) this;
        }

        public Criteria andUserPhoNotBetween(String value1, String value2) {
            addCriterion("USER_PHO not between", value1, value2, "userPho");
            return (Criteria) this;
        }

        public Criteria andUserPwIsNull() {
            addCriterion("USER_PW is null");
            return (Criteria) this;
        }

        public Criteria andUserPwIsNotNull() {
            addCriterion("USER_PW is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwEqualTo(String value) {
            addCriterion("USER_PW =", value, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwNotEqualTo(String value) {
            addCriterion("USER_PW <>", value, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwGreaterThan(String value) {
            addCriterion("USER_PW >", value, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PW >=", value, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwLessThan(String value) {
            addCriterion("USER_PW <", value, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwLessThanOrEqualTo(String value) {
            addCriterion("USER_PW <=", value, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwLike(String value) {
            addCriterion("USER_PW like", value, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwNotLike(String value) {
            addCriterion("USER_PW not like", value, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwIn(List<String> values) {
            addCriterion("USER_PW in", values, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwNotIn(List<String> values) {
            addCriterion("USER_PW not in", values, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwBetween(String value1, String value2) {
            addCriterion("USER_PW between", value1, value2, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwNotBetween(String value1, String value2) {
            addCriterion("USER_PW not between", value1, value2, "userPw");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}