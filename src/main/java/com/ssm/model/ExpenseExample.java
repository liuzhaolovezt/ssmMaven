package com.ssm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpenseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExpenseExample() {
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

        public Criteria andExpenseIdIsNull() {
            addCriterion("EXPENSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andExpenseIdIsNotNull() {
            addCriterion("EXPENSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseIdEqualTo(Integer value) {
            addCriterion("EXPENSE_ID =", value, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdNotEqualTo(Integer value) {
            addCriterion("EXPENSE_ID <>", value, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdGreaterThan(Integer value) {
            addCriterion("EXPENSE_ID >", value, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXPENSE_ID >=", value, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdLessThan(Integer value) {
            addCriterion("EXPENSE_ID <", value, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXPENSE_ID <=", value, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdIn(List<Integer> values) {
            addCriterion("EXPENSE_ID in", values, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdNotIn(List<Integer> values) {
            addCriterion("EXPENSE_ID not in", values, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdBetween(Integer value1, Integer value2) {
            addCriterion("EXPENSE_ID between", value1, value2, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXPENSE_ID not between", value1, value2, "expenseId");
            return (Criteria) this;
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

        public Criteria andDuserIdIsNull() {
            addCriterion("DUSER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDuserIdIsNotNull() {
            addCriterion("DUSER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDuserIdEqualTo(String value) {
            addCriterion("DUSER_ID =", value, "duserId");
            return (Criteria) this;
        }

        public Criteria andDuserIdNotEqualTo(String value) {
            addCriterion("DUSER_ID <>", value, "duserId");
            return (Criteria) this;
        }

        public Criteria andDuserIdGreaterThan(String value) {
            addCriterion("DUSER_ID >", value, "duserId");
            return (Criteria) this;
        }

        public Criteria andDuserIdGreaterThanOrEqualTo(String value) {
            addCriterion("DUSER_ID >=", value, "duserId");
            return (Criteria) this;
        }

        public Criteria andDuserIdLessThan(String value) {
            addCriterion("DUSER_ID <", value, "duserId");
            return (Criteria) this;
        }

        public Criteria andDuserIdLessThanOrEqualTo(String value) {
            addCriterion("DUSER_ID <=", value, "duserId");
            return (Criteria) this;
        }

        public Criteria andDuserIdLike(String value) {
            addCriterion("DUSER_ID like", value, "duserId");
            return (Criteria) this;
        }

        public Criteria andDuserIdNotLike(String value) {
            addCriterion("DUSER_ID not like", value, "duserId");
            return (Criteria) this;
        }

        public Criteria andDuserIdIn(List<String> values) {
            addCriterion("DUSER_ID in", values, "duserId");
            return (Criteria) this;
        }

        public Criteria andDuserIdNotIn(List<String> values) {
            addCriterion("DUSER_ID not in", values, "duserId");
            return (Criteria) this;
        }

        public Criteria andDuserIdBetween(String value1, String value2) {
            addCriterion("DUSER_ID between", value1, value2, "duserId");
            return (Criteria) this;
        }

        public Criteria andDuserIdNotBetween(String value1, String value2) {
            addCriterion("DUSER_ID not between", value1, value2, "duserId");
            return (Criteria) this;
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

        public Criteria andExpenseInfoIsNull() {
            addCriterion("EXPENSE_INFO is null");
            return (Criteria) this;
        }

        public Criteria andExpenseInfoIsNotNull() {
            addCriterion("EXPENSE_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseInfoEqualTo(String value) {
            addCriterion("EXPENSE_INFO =", value, "expenseInfo");
            return (Criteria) this;
        }

        public Criteria andExpenseInfoNotEqualTo(String value) {
            addCriterion("EXPENSE_INFO <>", value, "expenseInfo");
            return (Criteria) this;
        }

        public Criteria andExpenseInfoGreaterThan(String value) {
            addCriterion("EXPENSE_INFO >", value, "expenseInfo");
            return (Criteria) this;
        }

        public Criteria andExpenseInfoGreaterThanOrEqualTo(String value) {
            addCriterion("EXPENSE_INFO >=", value, "expenseInfo");
            return (Criteria) this;
        }

        public Criteria andExpenseInfoLessThan(String value) {
            addCriterion("EXPENSE_INFO <", value, "expenseInfo");
            return (Criteria) this;
        }

        public Criteria andExpenseInfoLessThanOrEqualTo(String value) {
            addCriterion("EXPENSE_INFO <=", value, "expenseInfo");
            return (Criteria) this;
        }

        public Criteria andExpenseInfoLike(String value) {
            addCriterion("EXPENSE_INFO like", value, "expenseInfo");
            return (Criteria) this;
        }

        public Criteria andExpenseInfoNotLike(String value) {
            addCriterion("EXPENSE_INFO not like", value, "expenseInfo");
            return (Criteria) this;
        }

        public Criteria andExpenseInfoIn(List<String> values) {
            addCriterion("EXPENSE_INFO in", values, "expenseInfo");
            return (Criteria) this;
        }

        public Criteria andExpenseInfoNotIn(List<String> values) {
            addCriterion("EXPENSE_INFO not in", values, "expenseInfo");
            return (Criteria) this;
        }

        public Criteria andExpenseInfoBetween(String value1, String value2) {
            addCriterion("EXPENSE_INFO between", value1, value2, "expenseInfo");
            return (Criteria) this;
        }

        public Criteria andExpenseInfoNotBetween(String value1, String value2) {
            addCriterion("EXPENSE_INFO not between", value1, value2, "expenseInfo");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyIsNull() {
            addCriterion("EXPENSE_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyIsNotNull() {
            addCriterion("EXPENSE_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyEqualTo(Integer value) {
            addCriterion("EXPENSE_MONEY =", value, "expenseMoney");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyNotEqualTo(Integer value) {
            addCriterion("EXPENSE_MONEY <>", value, "expenseMoney");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyGreaterThan(Integer value) {
            addCriterion("EXPENSE_MONEY >", value, "expenseMoney");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXPENSE_MONEY >=", value, "expenseMoney");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyLessThan(Integer value) {
            addCriterion("EXPENSE_MONEY <", value, "expenseMoney");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("EXPENSE_MONEY <=", value, "expenseMoney");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyIn(List<Integer> values) {
            addCriterion("EXPENSE_MONEY in", values, "expenseMoney");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyNotIn(List<Integer> values) {
            addCriterion("EXPENSE_MONEY not in", values, "expenseMoney");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyBetween(Integer value1, Integer value2) {
            addCriterion("EXPENSE_MONEY between", value1, value2, "expenseMoney");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("EXPENSE_MONEY not between", value1, value2, "expenseMoney");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeIsNull() {
            addCriterion("EXPENSE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeIsNotNull() {
            addCriterion("EXPENSE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeEqualTo(Date value) {
            addCriterion("EXPENSE_TIME =", value, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeNotEqualTo(Date value) {
            addCriterion("EXPENSE_TIME <>", value, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeGreaterThan(Date value) {
            addCriterion("EXPENSE_TIME >", value, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPENSE_TIME >=", value, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeLessThan(Date value) {
            addCriterion("EXPENSE_TIME <", value, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeLessThanOrEqualTo(Date value) {
            addCriterion("EXPENSE_TIME <=", value, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeIn(List<Date> values) {
            addCriterion("EXPENSE_TIME in", values, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeNotIn(List<Date> values) {
            addCriterion("EXPENSE_TIME not in", values, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeBetween(Date value1, Date value2) {
            addCriterion("EXPENSE_TIME between", value1, value2, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeNotBetween(Date value1, Date value2) {
            addCriterion("EXPENSE_TIME not between", value1, value2, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpensePasstimeIsNull() {
            addCriterion("EXPENSE_PASSTIME is null");
            return (Criteria) this;
        }

        public Criteria andExpensePasstimeIsNotNull() {
            addCriterion("EXPENSE_PASSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andExpensePasstimeEqualTo(Date value) {
            addCriterion("EXPENSE_PASSTIME =", value, "expensePasstime");
            return (Criteria) this;
        }

        public Criteria andExpensePasstimeNotEqualTo(Date value) {
            addCriterion("EXPENSE_PASSTIME <>", value, "expensePasstime");
            return (Criteria) this;
        }

        public Criteria andExpensePasstimeGreaterThan(Date value) {
            addCriterion("EXPENSE_PASSTIME >", value, "expensePasstime");
            return (Criteria) this;
        }

        public Criteria andExpensePasstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPENSE_PASSTIME >=", value, "expensePasstime");
            return (Criteria) this;
        }

        public Criteria andExpensePasstimeLessThan(Date value) {
            addCriterion("EXPENSE_PASSTIME <", value, "expensePasstime");
            return (Criteria) this;
        }

        public Criteria andExpensePasstimeLessThanOrEqualTo(Date value) {
            addCriterion("EXPENSE_PASSTIME <=", value, "expensePasstime");
            return (Criteria) this;
        }

        public Criteria andExpensePasstimeIn(List<Date> values) {
            addCriterion("EXPENSE_PASSTIME in", values, "expensePasstime");
            return (Criteria) this;
        }

        public Criteria andExpensePasstimeNotIn(List<Date> values) {
            addCriterion("EXPENSE_PASSTIME not in", values, "expensePasstime");
            return (Criteria) this;
        }

        public Criteria andExpensePasstimeBetween(Date value1, Date value2) {
            addCriterion("EXPENSE_PASSTIME between", value1, value2, "expensePasstime");
            return (Criteria) this;
        }

        public Criteria andExpensePasstimeNotBetween(Date value1, Date value2) {
            addCriterion("EXPENSE_PASSTIME not between", value1, value2, "expensePasstime");
            return (Criteria) this;
        }

        public Criteria andExpensePassinfoIsNull() {
            addCriterion("EXPENSE_PASSINFO is null");
            return (Criteria) this;
        }

        public Criteria andExpensePassinfoIsNotNull() {
            addCriterion("EXPENSE_PASSINFO is not null");
            return (Criteria) this;
        }

        public Criteria andExpensePassinfoEqualTo(String value) {
            addCriterion("EXPENSE_PASSINFO =", value, "expensePassinfo");
            return (Criteria) this;
        }

        public Criteria andExpensePassinfoNotEqualTo(String value) {
            addCriterion("EXPENSE_PASSINFO <>", value, "expensePassinfo");
            return (Criteria) this;
        }

        public Criteria andExpensePassinfoGreaterThan(String value) {
            addCriterion("EXPENSE_PASSINFO >", value, "expensePassinfo");
            return (Criteria) this;
        }

        public Criteria andExpensePassinfoGreaterThanOrEqualTo(String value) {
            addCriterion("EXPENSE_PASSINFO >=", value, "expensePassinfo");
            return (Criteria) this;
        }

        public Criteria andExpensePassinfoLessThan(String value) {
            addCriterion("EXPENSE_PASSINFO <", value, "expensePassinfo");
            return (Criteria) this;
        }

        public Criteria andExpensePassinfoLessThanOrEqualTo(String value) {
            addCriterion("EXPENSE_PASSINFO <=", value, "expensePassinfo");
            return (Criteria) this;
        }

        public Criteria andExpensePassinfoLike(String value) {
            addCriterion("EXPENSE_PASSINFO like", value, "expensePassinfo");
            return (Criteria) this;
        }

        public Criteria andExpensePassinfoNotLike(String value) {
            addCriterion("EXPENSE_PASSINFO not like", value, "expensePassinfo");
            return (Criteria) this;
        }

        public Criteria andExpensePassinfoIn(List<String> values) {
            addCriterion("EXPENSE_PASSINFO in", values, "expensePassinfo");
            return (Criteria) this;
        }

        public Criteria andExpensePassinfoNotIn(List<String> values) {
            addCriterion("EXPENSE_PASSINFO not in", values, "expensePassinfo");
            return (Criteria) this;
        }

        public Criteria andExpensePassinfoBetween(String value1, String value2) {
            addCriterion("EXPENSE_PASSINFO between", value1, value2, "expensePassinfo");
            return (Criteria) this;
        }

        public Criteria andExpensePassinfoNotBetween(String value1, String value2) {
            addCriterion("EXPENSE_PASSINFO not between", value1, value2, "expensePassinfo");
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