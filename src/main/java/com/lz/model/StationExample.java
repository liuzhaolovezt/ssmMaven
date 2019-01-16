package com.lz.model;

import java.util.ArrayList;
import java.util.List;

public class StationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StationExample() {
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

        public Criteria andStationIdIsNull() {
            addCriterion("station_id is null");
            return (Criteria) this;
        }

        public Criteria andStationIdIsNotNull() {
            addCriterion("station_id is not null");
            return (Criteria) this;
        }

        public Criteria andStationIdEqualTo(Integer value) {
            addCriterion("station_id =", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotEqualTo(Integer value) {
            addCriterion("station_id <>", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThan(Integer value) {
            addCriterion("station_id >", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("station_id >=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThan(Integer value) {
            addCriterion("station_id <", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThanOrEqualTo(Integer value) {
            addCriterion("station_id <=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdIn(List<Integer> values) {
            addCriterion("station_id in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotIn(List<Integer> values) {
            addCriterion("station_id not in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdBetween(Integer value1, Integer value2) {
            addCriterion("station_id between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("station_id not between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andTrainnumIsNull() {
            addCriterion("trainNum is null");
            return (Criteria) this;
        }

        public Criteria andTrainnumIsNotNull() {
            addCriterion("trainNum is not null");
            return (Criteria) this;
        }

        public Criteria andTrainnumEqualTo(String value) {
            addCriterion("trainNum =", value, "trainnum");
            return (Criteria) this;
        }

        public Criteria andTrainnumNotEqualTo(String value) {
            addCriterion("trainNum <>", value, "trainnum");
            return (Criteria) this;
        }

        public Criteria andTrainnumGreaterThan(String value) {
            addCriterion("trainNum >", value, "trainnum");
            return (Criteria) this;
        }

        public Criteria andTrainnumGreaterThanOrEqualTo(String value) {
            addCriterion("trainNum >=", value, "trainnum");
            return (Criteria) this;
        }

        public Criteria andTrainnumLessThan(String value) {
            addCriterion("trainNum <", value, "trainnum");
            return (Criteria) this;
        }

        public Criteria andTrainnumLessThanOrEqualTo(String value) {
            addCriterion("trainNum <=", value, "trainnum");
            return (Criteria) this;
        }

        public Criteria andTrainnumLike(String value) {
            addCriterion("trainNum like", value, "trainnum");
            return (Criteria) this;
        }

        public Criteria andTrainnumNotLike(String value) {
            addCriterion("trainNum not like", value, "trainnum");
            return (Criteria) this;
        }

        public Criteria andTrainnumIn(List<String> values) {
            addCriterion("trainNum in", values, "trainnum");
            return (Criteria) this;
        }

        public Criteria andTrainnumNotIn(List<String> values) {
            addCriterion("trainNum not in", values, "trainnum");
            return (Criteria) this;
        }

        public Criteria andTrainnumBetween(String value1, String value2) {
            addCriterion("trainNum between", value1, value2, "trainnum");
            return (Criteria) this;
        }

        public Criteria andTrainnumNotBetween(String value1, String value2) {
            addCriterion("trainNum not between", value1, value2, "trainnum");
            return (Criteria) this;
        }

        public Criteria andStationIsNull() {
            addCriterion("station is null");
            return (Criteria) this;
        }

        public Criteria andStationIsNotNull() {
            addCriterion("station is not null");
            return (Criteria) this;
        }

        public Criteria andStationEqualTo(String value) {
            addCriterion("station =", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotEqualTo(String value) {
            addCriterion("station <>", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationGreaterThan(String value) {
            addCriterion("station >", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationGreaterThanOrEqualTo(String value) {
            addCriterion("station >=", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationLessThan(String value) {
            addCriterion("station <", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationLessThanOrEqualTo(String value) {
            addCriterion("station <=", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationLike(String value) {
            addCriterion("station like", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotLike(String value) {
            addCriterion("station not like", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationIn(List<String> values) {
            addCriterion("station in", values, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotIn(List<String> values) {
            addCriterion("station not in", values, "station");
            return (Criteria) this;
        }

        public Criteria andStationBetween(String value1, String value2) {
            addCriterion("station between", value1, value2, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotBetween(String value1, String value2) {
            addCriterion("station not between", value1, value2, "station");
            return (Criteria) this;
        }

        public Criteria andOuttimeIsNull() {
            addCriterion("outTime is null");
            return (Criteria) this;
        }

        public Criteria andOuttimeIsNotNull() {
            addCriterion("outTime is not null");
            return (Criteria) this;
        }

        public Criteria andOuttimeEqualTo(String value) {
            addCriterion("outTime =", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotEqualTo(String value) {
            addCriterion("outTime <>", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeGreaterThan(String value) {
            addCriterion("outTime >", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeGreaterThanOrEqualTo(String value) {
            addCriterion("outTime >=", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeLessThan(String value) {
            addCriterion("outTime <", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeLessThanOrEqualTo(String value) {
            addCriterion("outTime <=", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeLike(String value) {
            addCriterion("outTime like", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotLike(String value) {
            addCriterion("outTime not like", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeIn(List<String> values) {
            addCriterion("outTime in", values, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotIn(List<String> values) {
            addCriterion("outTime not in", values, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeBetween(String value1, String value2) {
            addCriterion("outTime between", value1, value2, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotBetween(String value1, String value2) {
            addCriterion("outTime not between", value1, value2, "outtime");
            return (Criteria) this;
        }

        public Criteria andDaytimeIsNull() {
            addCriterion("dayTime is null");
            return (Criteria) this;
        }

        public Criteria andDaytimeIsNotNull() {
            addCriterion("dayTime is not null");
            return (Criteria) this;
        }

        public Criteria andDaytimeEqualTo(Integer value) {
            addCriterion("dayTime =", value, "daytime");
            return (Criteria) this;
        }

        public Criteria andDaytimeNotEqualTo(Integer value) {
            addCriterion("dayTime <>", value, "daytime");
            return (Criteria) this;
        }

        public Criteria andDaytimeGreaterThan(Integer value) {
            addCriterion("dayTime >", value, "daytime");
            return (Criteria) this;
        }

        public Criteria andDaytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dayTime >=", value, "daytime");
            return (Criteria) this;
        }

        public Criteria andDaytimeLessThan(Integer value) {
            addCriterion("dayTime <", value, "daytime");
            return (Criteria) this;
        }

        public Criteria andDaytimeLessThanOrEqualTo(Integer value) {
            addCriterion("dayTime <=", value, "daytime");
            return (Criteria) this;
        }

        public Criteria andDaytimeIn(List<Integer> values) {
            addCriterion("dayTime in", values, "daytime");
            return (Criteria) this;
        }

        public Criteria andDaytimeNotIn(List<Integer> values) {
            addCriterion("dayTime not in", values, "daytime");
            return (Criteria) this;
        }

        public Criteria andDaytimeBetween(Integer value1, Integer value2) {
            addCriterion("dayTime between", value1, value2, "daytime");
            return (Criteria) this;
        }

        public Criteria andDaytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("dayTime not between", value1, value2, "daytime");
            return (Criteria) this;
        }

        public Criteria andStatipriceIsNull() {
            addCriterion("statiPrice is null");
            return (Criteria) this;
        }

        public Criteria andStatipriceIsNotNull() {
            addCriterion("statiPrice is not null");
            return (Criteria) this;
        }

        public Criteria andStatipriceEqualTo(Double value) {
            addCriterion("statiPrice =", value, "statiprice");
            return (Criteria) this;
        }

        public Criteria andStatipriceNotEqualTo(Double value) {
            addCriterion("statiPrice <>", value, "statiprice");
            return (Criteria) this;
        }

        public Criteria andStatipriceGreaterThan(Double value) {
            addCriterion("statiPrice >", value, "statiprice");
            return (Criteria) this;
        }

        public Criteria andStatipriceGreaterThanOrEqualTo(Double value) {
            addCriterion("statiPrice >=", value, "statiprice");
            return (Criteria) this;
        }

        public Criteria andStatipriceLessThan(Double value) {
            addCriterion("statiPrice <", value, "statiprice");
            return (Criteria) this;
        }

        public Criteria andStatipriceLessThanOrEqualTo(Double value) {
            addCriterion("statiPrice <=", value, "statiprice");
            return (Criteria) this;
        }

        public Criteria andStatipriceIn(List<Double> values) {
            addCriterion("statiPrice in", values, "statiprice");
            return (Criteria) this;
        }

        public Criteria andStatipriceNotIn(List<Double> values) {
            addCriterion("statiPrice not in", values, "statiprice");
            return (Criteria) this;
        }

        public Criteria andStatipriceBetween(Double value1, Double value2) {
            addCriterion("statiPrice between", value1, value2, "statiprice");
            return (Criteria) this;
        }

        public Criteria andStatipriceNotBetween(Double value1, Double value2) {
            addCriterion("statiPrice not between", value1, value2, "statiprice");
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