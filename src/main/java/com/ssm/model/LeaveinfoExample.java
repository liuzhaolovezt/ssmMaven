package com.ssm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LeaveinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeaveinfoExample() {
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

        public Criteria andLeaveIdIsNull() {
            addCriterion("LEAVE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLeaveIdIsNotNull() {
            addCriterion("LEAVE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveIdEqualTo(Integer value) {
            addCriterion("LEAVE_ID =", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotEqualTo(Integer value) {
            addCriterion("LEAVE_ID <>", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdGreaterThan(Integer value) {
            addCriterion("LEAVE_ID >", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEAVE_ID >=", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdLessThan(Integer value) {
            addCriterion("LEAVE_ID <", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdLessThanOrEqualTo(Integer value) {
            addCriterion("LEAVE_ID <=", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdIn(List<Integer> values) {
            addCriterion("LEAVE_ID in", values, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotIn(List<Integer> values) {
            addCriterion("LEAVE_ID not in", values, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdBetween(Integer value1, Integer value2) {
            addCriterion("LEAVE_ID between", value1, value2, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LEAVE_ID not between", value1, value2, "leaveId");
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

        public Criteria andLeaveStarttimeIsNull() {
            addCriterion("LEAVE_STARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andLeaveStarttimeIsNotNull() {
            addCriterion("LEAVE_STARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveStarttimeEqualTo(Date value) {
            addCriterion("LEAVE_STARTTIME =", value, "leaveStarttime");
            return (Criteria) this;
        }

        public Criteria andLeaveStarttimeNotEqualTo(Date value) {
            addCriterion("LEAVE_STARTTIME <>", value, "leaveStarttime");
            return (Criteria) this;
        }

        public Criteria andLeaveStarttimeGreaterThan(Date value) {
            addCriterion("LEAVE_STARTTIME >", value, "leaveStarttime");
            return (Criteria) this;
        }

        public Criteria andLeaveStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LEAVE_STARTTIME >=", value, "leaveStarttime");
            return (Criteria) this;
        }

        public Criteria andLeaveStarttimeLessThan(Date value) {
            addCriterion("LEAVE_STARTTIME <", value, "leaveStarttime");
            return (Criteria) this;
        }

        public Criteria andLeaveStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("LEAVE_STARTTIME <=", value, "leaveStarttime");
            return (Criteria) this;
        }

        public Criteria andLeaveStarttimeIn(List<Date> values) {
            addCriterion("LEAVE_STARTTIME in", values, "leaveStarttime");
            return (Criteria) this;
        }

        public Criteria andLeaveStarttimeNotIn(List<Date> values) {
            addCriterion("LEAVE_STARTTIME not in", values, "leaveStarttime");
            return (Criteria) this;
        }

        public Criteria andLeaveStarttimeBetween(Date value1, Date value2) {
            addCriterion("LEAVE_STARTTIME between", value1, value2, "leaveStarttime");
            return (Criteria) this;
        }

        public Criteria andLeaveStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("LEAVE_STARTTIME not between", value1, value2, "leaveStarttime");
            return (Criteria) this;
        }

        public Criteria andLeaveEndtimeIsNull() {
            addCriterion("LEAVE_ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andLeaveEndtimeIsNotNull() {
            addCriterion("LEAVE_ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveEndtimeEqualTo(Date value) {
            addCriterion("LEAVE_ENDTIME =", value, "leaveEndtime");
            return (Criteria) this;
        }

        public Criteria andLeaveEndtimeNotEqualTo(Date value) {
            addCriterion("LEAVE_ENDTIME <>", value, "leaveEndtime");
            return (Criteria) this;
        }

        public Criteria andLeaveEndtimeGreaterThan(Date value) {
            addCriterion("LEAVE_ENDTIME >", value, "leaveEndtime");
            return (Criteria) this;
        }

        public Criteria andLeaveEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LEAVE_ENDTIME >=", value, "leaveEndtime");
            return (Criteria) this;
        }

        public Criteria andLeaveEndtimeLessThan(Date value) {
            addCriterion("LEAVE_ENDTIME <", value, "leaveEndtime");
            return (Criteria) this;
        }

        public Criteria andLeaveEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("LEAVE_ENDTIME <=", value, "leaveEndtime");
            return (Criteria) this;
        }

        public Criteria andLeaveEndtimeIn(List<Date> values) {
            addCriterion("LEAVE_ENDTIME in", values, "leaveEndtime");
            return (Criteria) this;
        }

        public Criteria andLeaveEndtimeNotIn(List<Date> values) {
            addCriterion("LEAVE_ENDTIME not in", values, "leaveEndtime");
            return (Criteria) this;
        }

        public Criteria andLeaveEndtimeBetween(Date value1, Date value2) {
            addCriterion("LEAVE_ENDTIME between", value1, value2, "leaveEndtime");
            return (Criteria) this;
        }

        public Criteria andLeaveEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("LEAVE_ENDTIME not between", value1, value2, "leaveEndtime");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonIsNull() {
            addCriterion("LEAVE_REASON is null");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonIsNotNull() {
            addCriterion("LEAVE_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonEqualTo(String value) {
            addCriterion("LEAVE_REASON =", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonNotEqualTo(String value) {
            addCriterion("LEAVE_REASON <>", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonGreaterThan(String value) {
            addCriterion("LEAVE_REASON >", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonGreaterThanOrEqualTo(String value) {
            addCriterion("LEAVE_REASON >=", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonLessThan(String value) {
            addCriterion("LEAVE_REASON <", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonLessThanOrEqualTo(String value) {
            addCriterion("LEAVE_REASON <=", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonLike(String value) {
            addCriterion("LEAVE_REASON like", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonNotLike(String value) {
            addCriterion("LEAVE_REASON not like", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonIn(List<String> values) {
            addCriterion("LEAVE_REASON in", values, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonNotIn(List<String> values) {
            addCriterion("LEAVE_REASON not in", values, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonBetween(String value1, String value2) {
            addCriterion("LEAVE_REASON between", value1, value2, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonNotBetween(String value1, String value2) {
            addCriterion("LEAVE_REASON not between", value1, value2, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeavePasstimeIsNull() {
            addCriterion("LEAVE_PASSTIME is null");
            return (Criteria) this;
        }

        public Criteria andLeavePasstimeIsNotNull() {
            addCriterion("LEAVE_PASSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLeavePasstimeEqualTo(Date value) {
            addCriterion("LEAVE_PASSTIME =", value, "leavePasstime");
            return (Criteria) this;
        }

        public Criteria andLeavePasstimeNotEqualTo(Date value) {
            addCriterion("LEAVE_PASSTIME <>", value, "leavePasstime");
            return (Criteria) this;
        }

        public Criteria andLeavePasstimeGreaterThan(Date value) {
            addCriterion("LEAVE_PASSTIME >", value, "leavePasstime");
            return (Criteria) this;
        }

        public Criteria andLeavePasstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LEAVE_PASSTIME >=", value, "leavePasstime");
            return (Criteria) this;
        }

        public Criteria andLeavePasstimeLessThan(Date value) {
            addCriterion("LEAVE_PASSTIME <", value, "leavePasstime");
            return (Criteria) this;
        }

        public Criteria andLeavePasstimeLessThanOrEqualTo(Date value) {
            addCriterion("LEAVE_PASSTIME <=", value, "leavePasstime");
            return (Criteria) this;
        }

        public Criteria andLeavePasstimeIn(List<Date> values) {
            addCriterion("LEAVE_PASSTIME in", values, "leavePasstime");
            return (Criteria) this;
        }

        public Criteria andLeavePasstimeNotIn(List<Date> values) {
            addCriterion("LEAVE_PASSTIME not in", values, "leavePasstime");
            return (Criteria) this;
        }

        public Criteria andLeavePasstimeBetween(Date value1, Date value2) {
            addCriterion("LEAVE_PASSTIME between", value1, value2, "leavePasstime");
            return (Criteria) this;
        }

        public Criteria andLeavePasstimeNotBetween(Date value1, Date value2) {
            addCriterion("LEAVE_PASSTIME not between", value1, value2, "leavePasstime");
            return (Criteria) this;
        }

        public Criteria andLeavePasscontIsNull() {
            addCriterion("LEAVE_PASSCONT is null");
            return (Criteria) this;
        }

        public Criteria andLeavePasscontIsNotNull() {
            addCriterion("LEAVE_PASSCONT is not null");
            return (Criteria) this;
        }

        public Criteria andLeavePasscontEqualTo(String value) {
            addCriterion("LEAVE_PASSCONT =", value, "leavePasscont");
            return (Criteria) this;
        }

        public Criteria andLeavePasscontNotEqualTo(String value) {
            addCriterion("LEAVE_PASSCONT <>", value, "leavePasscont");
            return (Criteria) this;
        }

        public Criteria andLeavePasscontGreaterThan(String value) {
            addCriterion("LEAVE_PASSCONT >", value, "leavePasscont");
            return (Criteria) this;
        }

        public Criteria andLeavePasscontGreaterThanOrEqualTo(String value) {
            addCriterion("LEAVE_PASSCONT >=", value, "leavePasscont");
            return (Criteria) this;
        }

        public Criteria andLeavePasscontLessThan(String value) {
            addCriterion("LEAVE_PASSCONT <", value, "leavePasscont");
            return (Criteria) this;
        }

        public Criteria andLeavePasscontLessThanOrEqualTo(String value) {
            addCriterion("LEAVE_PASSCONT <=", value, "leavePasscont");
            return (Criteria) this;
        }

        public Criteria andLeavePasscontLike(String value) {
            addCriterion("LEAVE_PASSCONT like", value, "leavePasscont");
            return (Criteria) this;
        }

        public Criteria andLeavePasscontNotLike(String value) {
            addCriterion("LEAVE_PASSCONT not like", value, "leavePasscont");
            return (Criteria) this;
        }

        public Criteria andLeavePasscontIn(List<String> values) {
            addCriterion("LEAVE_PASSCONT in", values, "leavePasscont");
            return (Criteria) this;
        }

        public Criteria andLeavePasscontNotIn(List<String> values) {
            addCriterion("LEAVE_PASSCONT not in", values, "leavePasscont");
            return (Criteria) this;
        }

        public Criteria andLeavePasscontBetween(String value1, String value2) {
            addCriterion("LEAVE_PASSCONT between", value1, value2, "leavePasscont");
            return (Criteria) this;
        }

        public Criteria andLeavePasscontNotBetween(String value1, String value2) {
            addCriterion("LEAVE_PASSCONT not between", value1, value2, "leavePasscont");
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