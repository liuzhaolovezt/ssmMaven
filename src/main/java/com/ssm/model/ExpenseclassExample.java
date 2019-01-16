package com.ssm.model;

import java.util.ArrayList;
import java.util.List;

public class ExpenseclassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExpenseclassExample() {
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

        public Criteria andExclassIdIsNull() {
            addCriterion("EXCLASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andExclassIdIsNotNull() {
            addCriterion("EXCLASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExclassIdEqualTo(Integer value) {
            addCriterion("EXCLASS_ID =", value, "exclassId");
            return (Criteria) this;
        }

        public Criteria andExclassIdNotEqualTo(Integer value) {
            addCriterion("EXCLASS_ID <>", value, "exclassId");
            return (Criteria) this;
        }

        public Criteria andExclassIdGreaterThan(Integer value) {
            addCriterion("EXCLASS_ID >", value, "exclassId");
            return (Criteria) this;
        }

        public Criteria andExclassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXCLASS_ID >=", value, "exclassId");
            return (Criteria) this;
        }

        public Criteria andExclassIdLessThan(Integer value) {
            addCriterion("EXCLASS_ID <", value, "exclassId");
            return (Criteria) this;
        }

        public Criteria andExclassIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXCLASS_ID <=", value, "exclassId");
            return (Criteria) this;
        }

        public Criteria andExclassIdIn(List<Integer> values) {
            addCriterion("EXCLASS_ID in", values, "exclassId");
            return (Criteria) this;
        }

        public Criteria andExclassIdNotIn(List<Integer> values) {
            addCriterion("EXCLASS_ID not in", values, "exclassId");
            return (Criteria) this;
        }

        public Criteria andExclassIdBetween(Integer value1, Integer value2) {
            addCriterion("EXCLASS_ID between", value1, value2, "exclassId");
            return (Criteria) this;
        }

        public Criteria andExclassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXCLASS_ID not between", value1, value2, "exclassId");
            return (Criteria) this;
        }

        public Criteria andExclassInfoIsNull() {
            addCriterion("EXCLASS_INFO is null");
            return (Criteria) this;
        }

        public Criteria andExclassInfoIsNotNull() {
            addCriterion("EXCLASS_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andExclassInfoEqualTo(String value) {
            addCriterion("EXCLASS_INFO =", value, "exclassInfo");
            return (Criteria) this;
        }

        public Criteria andExclassInfoNotEqualTo(String value) {
            addCriterion("EXCLASS_INFO <>", value, "exclassInfo");
            return (Criteria) this;
        }

        public Criteria andExclassInfoGreaterThan(String value) {
            addCriterion("EXCLASS_INFO >", value, "exclassInfo");
            return (Criteria) this;
        }

        public Criteria andExclassInfoGreaterThanOrEqualTo(String value) {
            addCriterion("EXCLASS_INFO >=", value, "exclassInfo");
            return (Criteria) this;
        }

        public Criteria andExclassInfoLessThan(String value) {
            addCriterion("EXCLASS_INFO <", value, "exclassInfo");
            return (Criteria) this;
        }

        public Criteria andExclassInfoLessThanOrEqualTo(String value) {
            addCriterion("EXCLASS_INFO <=", value, "exclassInfo");
            return (Criteria) this;
        }

        public Criteria andExclassInfoLike(String value) {
            addCriterion("EXCLASS_INFO like", value, "exclassInfo");
            return (Criteria) this;
        }

        public Criteria andExclassInfoNotLike(String value) {
            addCriterion("EXCLASS_INFO not like", value, "exclassInfo");
            return (Criteria) this;
        }

        public Criteria andExclassInfoIn(List<String> values) {
            addCriterion("EXCLASS_INFO in", values, "exclassInfo");
            return (Criteria) this;
        }

        public Criteria andExclassInfoNotIn(List<String> values) {
            addCriterion("EXCLASS_INFO not in", values, "exclassInfo");
            return (Criteria) this;
        }

        public Criteria andExclassInfoBetween(String value1, String value2) {
            addCriterion("EXCLASS_INFO between", value1, value2, "exclassInfo");
            return (Criteria) this;
        }

        public Criteria andExclassInfoNotBetween(String value1, String value2) {
            addCriterion("EXCLASS_INFO not between", value1, value2, "exclassInfo");
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