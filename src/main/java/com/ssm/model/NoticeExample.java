package com.ssm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeExample() {
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

        public Criteria andNoticeIdIsNull() {
            addCriterion("NOTICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIsNotNull() {
            addCriterion("NOTICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdEqualTo(Integer value) {
            addCriterion("NOTICE_ID =", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotEqualTo(Integer value) {
            addCriterion("NOTICE_ID <>", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThan(Integer value) {
            addCriterion("NOTICE_ID >", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NOTICE_ID >=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThan(Integer value) {
            addCriterion("NOTICE_ID <", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThanOrEqualTo(Integer value) {
            addCriterion("NOTICE_ID <=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIn(List<Integer> values) {
            addCriterion("NOTICE_ID in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotIn(List<Integer> values) {
            addCriterion("NOTICE_ID not in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdBetween(Integer value1, Integer value2) {
            addCriterion("NOTICE_ID between", value1, value2, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NOTICE_ID not between", value1, value2, "noticeId");
            return (Criteria) this;
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

        public Criteria andNoticeScopeIsNull() {
            addCriterion("NOTICE_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andNoticeScopeIsNotNull() {
            addCriterion("NOTICE_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeScopeEqualTo(String value) {
            addCriterion("NOTICE_SCOPE =", value, "noticeScope");
            return (Criteria) this;
        }

        public Criteria andNoticeScopeNotEqualTo(String value) {
            addCriterion("NOTICE_SCOPE <>", value, "noticeScope");
            return (Criteria) this;
        }

        public Criteria andNoticeScopeGreaterThan(String value) {
            addCriterion("NOTICE_SCOPE >", value, "noticeScope");
            return (Criteria) this;
        }

        public Criteria andNoticeScopeGreaterThanOrEqualTo(String value) {
            addCriterion("NOTICE_SCOPE >=", value, "noticeScope");
            return (Criteria) this;
        }

        public Criteria andNoticeScopeLessThan(String value) {
            addCriterion("NOTICE_SCOPE <", value, "noticeScope");
            return (Criteria) this;
        }

        public Criteria andNoticeScopeLessThanOrEqualTo(String value) {
            addCriterion("NOTICE_SCOPE <=", value, "noticeScope");
            return (Criteria) this;
        }

        public Criteria andNoticeScopeLike(String value) {
            addCriterion("NOTICE_SCOPE like", value, "noticeScope");
            return (Criteria) this;
        }

        public Criteria andNoticeScopeNotLike(String value) {
            addCriterion("NOTICE_SCOPE not like", value, "noticeScope");
            return (Criteria) this;
        }

        public Criteria andNoticeScopeIn(List<String> values) {
            addCriterion("NOTICE_SCOPE in", values, "noticeScope");
            return (Criteria) this;
        }

        public Criteria andNoticeScopeNotIn(List<String> values) {
            addCriterion("NOTICE_SCOPE not in", values, "noticeScope");
            return (Criteria) this;
        }

        public Criteria andNoticeScopeBetween(String value1, String value2) {
            addCriterion("NOTICE_SCOPE between", value1, value2, "noticeScope");
            return (Criteria) this;
        }

        public Criteria andNoticeScopeNotBetween(String value1, String value2) {
            addCriterion("NOTICE_SCOPE not between", value1, value2, "noticeScope");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIsNull() {
            addCriterion("NOTICE_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIsNotNull() {
            addCriterion("NOTICE_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleEqualTo(String value) {
            addCriterion("NOTICE_TITLE =", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotEqualTo(String value) {
            addCriterion("NOTICE_TITLE <>", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThan(String value) {
            addCriterion("NOTICE_TITLE >", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("NOTICE_TITLE >=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThan(String value) {
            addCriterion("NOTICE_TITLE <", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThanOrEqualTo(String value) {
            addCriterion("NOTICE_TITLE <=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLike(String value) {
            addCriterion("NOTICE_TITLE like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotLike(String value) {
            addCriterion("NOTICE_TITLE not like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIn(List<String> values) {
            addCriterion("NOTICE_TITLE in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotIn(List<String> values) {
            addCriterion("NOTICE_TITLE not in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleBetween(String value1, String value2) {
            addCriterion("NOTICE_TITLE between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotBetween(String value1, String value2) {
            addCriterion("NOTICE_TITLE not between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeContIsNull() {
            addCriterion("NOTICE_CONT is null");
            return (Criteria) this;
        }

        public Criteria andNoticeContIsNotNull() {
            addCriterion("NOTICE_CONT is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeContEqualTo(String value) {
            addCriterion("NOTICE_CONT =", value, "noticeCont");
            return (Criteria) this;
        }

        public Criteria andNoticeContNotEqualTo(String value) {
            addCriterion("NOTICE_CONT <>", value, "noticeCont");
            return (Criteria) this;
        }

        public Criteria andNoticeContGreaterThan(String value) {
            addCriterion("NOTICE_CONT >", value, "noticeCont");
            return (Criteria) this;
        }

        public Criteria andNoticeContGreaterThanOrEqualTo(String value) {
            addCriterion("NOTICE_CONT >=", value, "noticeCont");
            return (Criteria) this;
        }

        public Criteria andNoticeContLessThan(String value) {
            addCriterion("NOTICE_CONT <", value, "noticeCont");
            return (Criteria) this;
        }

        public Criteria andNoticeContLessThanOrEqualTo(String value) {
            addCriterion("NOTICE_CONT <=", value, "noticeCont");
            return (Criteria) this;
        }

        public Criteria andNoticeContLike(String value) {
            addCriterion("NOTICE_CONT like", value, "noticeCont");
            return (Criteria) this;
        }

        public Criteria andNoticeContNotLike(String value) {
            addCriterion("NOTICE_CONT not like", value, "noticeCont");
            return (Criteria) this;
        }

        public Criteria andNoticeContIn(List<String> values) {
            addCriterion("NOTICE_CONT in", values, "noticeCont");
            return (Criteria) this;
        }

        public Criteria andNoticeContNotIn(List<String> values) {
            addCriterion("NOTICE_CONT not in", values, "noticeCont");
            return (Criteria) this;
        }

        public Criteria andNoticeContBetween(String value1, String value2) {
            addCriterion("NOTICE_CONT between", value1, value2, "noticeCont");
            return (Criteria) this;
        }

        public Criteria andNoticeContNotBetween(String value1, String value2) {
            addCriterion("NOTICE_CONT not between", value1, value2, "noticeCont");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNull() {
            addCriterion("NOTICE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNotNull() {
            addCriterion("NOTICE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeEqualTo(Date value) {
            addCriterion("NOTICE_TIME =", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotEqualTo(Date value) {
            addCriterion("NOTICE_TIME <>", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThan(Date value) {
            addCriterion("NOTICE_TIME >", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("NOTICE_TIME >=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThan(Date value) {
            addCriterion("NOTICE_TIME <", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThanOrEqualTo(Date value) {
            addCriterion("NOTICE_TIME <=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIn(List<Date> values) {
            addCriterion("NOTICE_TIME in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotIn(List<Date> values) {
            addCriterion("NOTICE_TIME not in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeBetween(Date value1, Date value2) {
            addCriterion("NOTICE_TIME between", value1, value2, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotBetween(Date value1, Date value2) {
            addCriterion("NOTICE_TIME not between", value1, value2, "noticeTime");
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