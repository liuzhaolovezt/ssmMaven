package com.ssm.model;

import java.util.ArrayList;
import java.util.List;

public class PassinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PassinfoExample() {
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

        public Criteria andPassIdIsNull() {
            addCriterion("PASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPassIdIsNotNull() {
            addCriterion("PASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPassIdEqualTo(Integer value) {
            addCriterion("PASS_ID =", value, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdNotEqualTo(Integer value) {
            addCriterion("PASS_ID <>", value, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdGreaterThan(Integer value) {
            addCriterion("PASS_ID >", value, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PASS_ID >=", value, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdLessThan(Integer value) {
            addCriterion("PASS_ID <", value, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdLessThanOrEqualTo(Integer value) {
            addCriterion("PASS_ID <=", value, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdIn(List<Integer> values) {
            addCriterion("PASS_ID in", values, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdNotIn(List<Integer> values) {
            addCriterion("PASS_ID not in", values, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdBetween(Integer value1, Integer value2) {
            addCriterion("PASS_ID between", value1, value2, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PASS_ID not between", value1, value2, "passId");
            return (Criteria) this;
        }

        public Criteria andPassStateIsNull() {
            addCriterion("PASS_STATE is null");
            return (Criteria) this;
        }

        public Criteria andPassStateIsNotNull() {
            addCriterion("PASS_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andPassStateEqualTo(String value) {
            addCriterion("PASS_STATE =", value, "passState");
            return (Criteria) this;
        }

        public Criteria andPassStateNotEqualTo(String value) {
            addCriterion("PASS_STATE <>", value, "passState");
            return (Criteria) this;
        }

        public Criteria andPassStateGreaterThan(String value) {
            addCriterion("PASS_STATE >", value, "passState");
            return (Criteria) this;
        }

        public Criteria andPassStateGreaterThanOrEqualTo(String value) {
            addCriterion("PASS_STATE >=", value, "passState");
            return (Criteria) this;
        }

        public Criteria andPassStateLessThan(String value) {
            addCriterion("PASS_STATE <", value, "passState");
            return (Criteria) this;
        }

        public Criteria andPassStateLessThanOrEqualTo(String value) {
            addCriterion("PASS_STATE <=", value, "passState");
            return (Criteria) this;
        }

        public Criteria andPassStateLike(String value) {
            addCriterion("PASS_STATE like", value, "passState");
            return (Criteria) this;
        }

        public Criteria andPassStateNotLike(String value) {
            addCriterion("PASS_STATE not like", value, "passState");
            return (Criteria) this;
        }

        public Criteria andPassStateIn(List<String> values) {
            addCriterion("PASS_STATE in", values, "passState");
            return (Criteria) this;
        }

        public Criteria andPassStateNotIn(List<String> values) {
            addCriterion("PASS_STATE not in", values, "passState");
            return (Criteria) this;
        }

        public Criteria andPassStateBetween(String value1, String value2) {
            addCriterion("PASS_STATE between", value1, value2, "passState");
            return (Criteria) this;
        }

        public Criteria andPassStateNotBetween(String value1, String value2) {
            addCriterion("PASS_STATE not between", value1, value2, "passState");
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