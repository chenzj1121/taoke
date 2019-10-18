package com.luoshi.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbFollowUpRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbFollowUpRecordExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRecordIsNull() {
            addCriterion("record is null");
            return (Criteria) this;
        }

        public Criteria andRecordIsNotNull() {
            addCriterion("record is not null");
            return (Criteria) this;
        }

        public Criteria andRecordEqualTo(String value) {
            addCriterion("record =", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotEqualTo(String value) {
            addCriterion("record <>", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThan(String value) {
            addCriterion("record >", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThanOrEqualTo(String value) {
            addCriterion("record >=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThan(String value) {
            addCriterion("record <", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThanOrEqualTo(String value) {
            addCriterion("record <=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLike(String value) {
            addCriterion("record like", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotLike(String value) {
            addCriterion("record not like", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordIn(List<String> values) {
            addCriterion("record in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotIn(List<String> values) {
            addCriterion("record not in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordBetween(String value1, String value2) {
            addCriterion("record between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotBetween(String value1, String value2) {
            addCriterion("record not between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andFollowUpTimeIsNull() {
            addCriterion("follow_up_time is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpTimeIsNotNull() {
            addCriterion("follow_up_time is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpTimeEqualTo(Date value) {
            addCriterion("follow_up_time =", value, "followUpTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpTimeNotEqualTo(Date value) {
            addCriterion("follow_up_time <>", value, "followUpTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpTimeGreaterThan(Date value) {
            addCriterion("follow_up_time >", value, "followUpTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("follow_up_time >=", value, "followUpTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpTimeLessThan(Date value) {
            addCriterion("follow_up_time <", value, "followUpTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpTimeLessThanOrEqualTo(Date value) {
            addCriterion("follow_up_time <=", value, "followUpTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpTimeIn(List<Date> values) {
            addCriterion("follow_up_time in", values, "followUpTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpTimeNotIn(List<Date> values) {
            addCriterion("follow_up_time not in", values, "followUpTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpTimeBetween(Date value1, Date value2) {
            addCriterion("follow_up_time between", value1, value2, "followUpTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpTimeNotBetween(Date value1, Date value2) {
            addCriterion("follow_up_time not between", value1, value2, "followUpTime");
            return (Criteria) this;
        }

        public Criteria andMaturityIsNull() {
            addCriterion("maturity is null");
            return (Criteria) this;
        }

        public Criteria andMaturityIsNotNull() {
            addCriterion("maturity is not null");
            return (Criteria) this;
        }

        public Criteria andMaturityEqualTo(String value) {
            addCriterion("maturity =", value, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityNotEqualTo(String value) {
            addCriterion("maturity <>", value, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityGreaterThan(String value) {
            addCriterion("maturity >", value, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityGreaterThanOrEqualTo(String value) {
            addCriterion("maturity >=", value, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityLessThan(String value) {
            addCriterion("maturity <", value, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityLessThanOrEqualTo(String value) {
            addCriterion("maturity <=", value, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityLike(String value) {
            addCriterion("maturity like", value, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityNotLike(String value) {
            addCriterion("maturity not like", value, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityIn(List<String> values) {
            addCriterion("maturity in", values, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityNotIn(List<String> values) {
            addCriterion("maturity not in", values, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityBetween(String value1, String value2) {
            addCriterion("maturity between", value1, value2, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityNotBetween(String value1, String value2) {
            addCriterion("maturity not between", value1, value2, "maturity");
            return (Criteria) this;
        }

        public Criteria andProductSubmitIdIsNull() {
            addCriterion("product_submit_id is null");
            return (Criteria) this;
        }

        public Criteria andProductSubmitIdIsNotNull() {
            addCriterion("product_submit_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductSubmitIdEqualTo(Integer value) {
            addCriterion("product_submit_id =", value, "productSubmitId");
            return (Criteria) this;
        }

        public Criteria andProductSubmitIdNotEqualTo(Integer value) {
            addCriterion("product_submit_id <>", value, "productSubmitId");
            return (Criteria) this;
        }

        public Criteria andProductSubmitIdGreaterThan(Integer value) {
            addCriterion("product_submit_id >", value, "productSubmitId");
            return (Criteria) this;
        }

        public Criteria andProductSubmitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_submit_id >=", value, "productSubmitId");
            return (Criteria) this;
        }

        public Criteria andProductSubmitIdLessThan(Integer value) {
            addCriterion("product_submit_id <", value, "productSubmitId");
            return (Criteria) this;
        }

        public Criteria andProductSubmitIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_submit_id <=", value, "productSubmitId");
            return (Criteria) this;
        }

        public Criteria andProductSubmitIdIn(List<Integer> values) {
            addCriterion("product_submit_id in", values, "productSubmitId");
            return (Criteria) this;
        }

        public Criteria andProductSubmitIdNotIn(List<Integer> values) {
            addCriterion("product_submit_id not in", values, "productSubmitId");
            return (Criteria) this;
        }

        public Criteria andProductSubmitIdBetween(Integer value1, Integer value2) {
            addCriterion("product_submit_id between", value1, value2, "productSubmitId");
            return (Criteria) this;
        }

        public Criteria andProductSubmitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_submit_id not between", value1, value2, "productSubmitId");
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