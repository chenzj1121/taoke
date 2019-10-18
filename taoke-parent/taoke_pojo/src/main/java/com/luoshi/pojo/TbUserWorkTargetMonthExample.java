package com.luoshi.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbUserWorkTargetMonthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserWorkTargetMonthExample() {
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

        public Criteria andFirstWeekIsNull() {
            addCriterion("first_week is null");
            return (Criteria) this;
        }

        public Criteria andFirstWeekIsNotNull() {
            addCriterion("first_week is not null");
            return (Criteria) this;
        }

        public Criteria andFirstWeekEqualTo(Double value) {
            addCriterion("first_week =", value, "firstWeek");
            return (Criteria) this;
        }

        public Criteria andFirstWeekNotEqualTo(Double value) {
            addCriterion("first_week <>", value, "firstWeek");
            return (Criteria) this;
        }

        public Criteria andFirstWeekGreaterThan(Double value) {
            addCriterion("first_week >", value, "firstWeek");
            return (Criteria) this;
        }

        public Criteria andFirstWeekGreaterThanOrEqualTo(Double value) {
            addCriterion("first_week >=", value, "firstWeek");
            return (Criteria) this;
        }

        public Criteria andFirstWeekLessThan(Double value) {
            addCriterion("first_week <", value, "firstWeek");
            return (Criteria) this;
        }

        public Criteria andFirstWeekLessThanOrEqualTo(Double value) {
            addCriterion("first_week <=", value, "firstWeek");
            return (Criteria) this;
        }

        public Criteria andFirstWeekIn(List<Double> values) {
            addCriterion("first_week in", values, "firstWeek");
            return (Criteria) this;
        }

        public Criteria andFirstWeekNotIn(List<Double> values) {
            addCriterion("first_week not in", values, "firstWeek");
            return (Criteria) this;
        }

        public Criteria andFirstWeekBetween(Double value1, Double value2) {
            addCriterion("first_week between", value1, value2, "firstWeek");
            return (Criteria) this;
        }

        public Criteria andFirstWeekNotBetween(Double value1, Double value2) {
            addCriterion("first_week not between", value1, value2, "firstWeek");
            return (Criteria) this;
        }

        public Criteria andSecondWeekIsNull() {
            addCriterion("second_week is null");
            return (Criteria) this;
        }

        public Criteria andSecondWeekIsNotNull() {
            addCriterion("second_week is not null");
            return (Criteria) this;
        }

        public Criteria andSecondWeekEqualTo(Double value) {
            addCriterion("second_week =", value, "secondWeek");
            return (Criteria) this;
        }

        public Criteria andSecondWeekNotEqualTo(Double value) {
            addCriterion("second_week <>", value, "secondWeek");
            return (Criteria) this;
        }

        public Criteria andSecondWeekGreaterThan(Double value) {
            addCriterion("second_week >", value, "secondWeek");
            return (Criteria) this;
        }

        public Criteria andSecondWeekGreaterThanOrEqualTo(Double value) {
            addCriterion("second_week >=", value, "secondWeek");
            return (Criteria) this;
        }

        public Criteria andSecondWeekLessThan(Double value) {
            addCriterion("second_week <", value, "secondWeek");
            return (Criteria) this;
        }

        public Criteria andSecondWeekLessThanOrEqualTo(Double value) {
            addCriterion("second_week <=", value, "secondWeek");
            return (Criteria) this;
        }

        public Criteria andSecondWeekIn(List<Double> values) {
            addCriterion("second_week in", values, "secondWeek");
            return (Criteria) this;
        }

        public Criteria andSecondWeekNotIn(List<Double> values) {
            addCriterion("second_week not in", values, "secondWeek");
            return (Criteria) this;
        }

        public Criteria andSecondWeekBetween(Double value1, Double value2) {
            addCriterion("second_week between", value1, value2, "secondWeek");
            return (Criteria) this;
        }

        public Criteria andSecondWeekNotBetween(Double value1, Double value2) {
            addCriterion("second_week not between", value1, value2, "secondWeek");
            return (Criteria) this;
        }

        public Criteria andThirdWeekIsNull() {
            addCriterion("third_week is null");
            return (Criteria) this;
        }

        public Criteria andThirdWeekIsNotNull() {
            addCriterion("third_week is not null");
            return (Criteria) this;
        }

        public Criteria andThirdWeekEqualTo(Double value) {
            addCriterion("third_week =", value, "thirdWeek");
            return (Criteria) this;
        }

        public Criteria andThirdWeekNotEqualTo(Double value) {
            addCriterion("third_week <>", value, "thirdWeek");
            return (Criteria) this;
        }

        public Criteria andThirdWeekGreaterThan(Double value) {
            addCriterion("third_week >", value, "thirdWeek");
            return (Criteria) this;
        }

        public Criteria andThirdWeekGreaterThanOrEqualTo(Double value) {
            addCriterion("third_week >=", value, "thirdWeek");
            return (Criteria) this;
        }

        public Criteria andThirdWeekLessThan(Double value) {
            addCriterion("third_week <", value, "thirdWeek");
            return (Criteria) this;
        }

        public Criteria andThirdWeekLessThanOrEqualTo(Double value) {
            addCriterion("third_week <=", value, "thirdWeek");
            return (Criteria) this;
        }

        public Criteria andThirdWeekIn(List<Double> values) {
            addCriterion("third_week in", values, "thirdWeek");
            return (Criteria) this;
        }

        public Criteria andThirdWeekNotIn(List<Double> values) {
            addCriterion("third_week not in", values, "thirdWeek");
            return (Criteria) this;
        }

        public Criteria andThirdWeekBetween(Double value1, Double value2) {
            addCriterion("third_week between", value1, value2, "thirdWeek");
            return (Criteria) this;
        }

        public Criteria andThirdWeekNotBetween(Double value1, Double value2) {
            addCriterion("third_week not between", value1, value2, "thirdWeek");
            return (Criteria) this;
        }

        public Criteria andFourthWeekIsNull() {
            addCriterion("fourth_week is null");
            return (Criteria) this;
        }

        public Criteria andFourthWeekIsNotNull() {
            addCriterion("fourth_week is not null");
            return (Criteria) this;
        }

        public Criteria andFourthWeekEqualTo(Double value) {
            addCriterion("fourth_week =", value, "fourthWeek");
            return (Criteria) this;
        }

        public Criteria andFourthWeekNotEqualTo(Double value) {
            addCriterion("fourth_week <>", value, "fourthWeek");
            return (Criteria) this;
        }

        public Criteria andFourthWeekGreaterThan(Double value) {
            addCriterion("fourth_week >", value, "fourthWeek");
            return (Criteria) this;
        }

        public Criteria andFourthWeekGreaterThanOrEqualTo(Double value) {
            addCriterion("fourth_week >=", value, "fourthWeek");
            return (Criteria) this;
        }

        public Criteria andFourthWeekLessThan(Double value) {
            addCriterion("fourth_week <", value, "fourthWeek");
            return (Criteria) this;
        }

        public Criteria andFourthWeekLessThanOrEqualTo(Double value) {
            addCriterion("fourth_week <=", value, "fourthWeek");
            return (Criteria) this;
        }

        public Criteria andFourthWeekIn(List<Double> values) {
            addCriterion("fourth_week in", values, "fourthWeek");
            return (Criteria) this;
        }

        public Criteria andFourthWeekNotIn(List<Double> values) {
            addCriterion("fourth_week not in", values, "fourthWeek");
            return (Criteria) this;
        }

        public Criteria andFourthWeekBetween(Double value1, Double value2) {
            addCriterion("fourth_week between", value1, value2, "fourthWeek");
            return (Criteria) this;
        }

        public Criteria andFourthWeekNotBetween(Double value1, Double value2) {
            addCriterion("fourth_week not between", value1, value2, "fourthWeek");
            return (Criteria) this;
        }

        public Criteria andFifthWeekIsNull() {
            addCriterion("fifth_week is null");
            return (Criteria) this;
        }

        public Criteria andFifthWeekIsNotNull() {
            addCriterion("fifth_week is not null");
            return (Criteria) this;
        }

        public Criteria andFifthWeekEqualTo(Double value) {
            addCriterion("fifth_week =", value, "fifthWeek");
            return (Criteria) this;
        }

        public Criteria andFifthWeekNotEqualTo(Double value) {
            addCriterion("fifth_week <>", value, "fifthWeek");
            return (Criteria) this;
        }

        public Criteria andFifthWeekGreaterThan(Double value) {
            addCriterion("fifth_week >", value, "fifthWeek");
            return (Criteria) this;
        }

        public Criteria andFifthWeekGreaterThanOrEqualTo(Double value) {
            addCriterion("fifth_week >=", value, "fifthWeek");
            return (Criteria) this;
        }

        public Criteria andFifthWeekLessThan(Double value) {
            addCriterion("fifth_week <", value, "fifthWeek");
            return (Criteria) this;
        }

        public Criteria andFifthWeekLessThanOrEqualTo(Double value) {
            addCriterion("fifth_week <=", value, "fifthWeek");
            return (Criteria) this;
        }

        public Criteria andFifthWeekIn(List<Double> values) {
            addCriterion("fifth_week in", values, "fifthWeek");
            return (Criteria) this;
        }

        public Criteria andFifthWeekNotIn(List<Double> values) {
            addCriterion("fifth_week not in", values, "fifthWeek");
            return (Criteria) this;
        }

        public Criteria andFifthWeekBetween(Double value1, Double value2) {
            addCriterion("fifth_week between", value1, value2, "fifthWeek");
            return (Criteria) this;
        }

        public Criteria andFifthWeekNotBetween(Double value1, Double value2) {
            addCriterion("fifth_week not between", value1, value2, "fifthWeek");
            return (Criteria) this;
        }

        public Criteria andWorkTargetIsNull() {
            addCriterion("work_target is null");
            return (Criteria) this;
        }

        public Criteria andWorkTargetIsNotNull() {
            addCriterion("work_target is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTargetEqualTo(Double value) {
            addCriterion("work_target =", value, "workTarget");
            return (Criteria) this;
        }

        public Criteria andWorkTargetNotEqualTo(Double value) {
            addCriterion("work_target <>", value, "workTarget");
            return (Criteria) this;
        }

        public Criteria andWorkTargetGreaterThan(Double value) {
            addCriterion("work_target >", value, "workTarget");
            return (Criteria) this;
        }

        public Criteria andWorkTargetGreaterThanOrEqualTo(Double value) {
            addCriterion("work_target >=", value, "workTarget");
            return (Criteria) this;
        }

        public Criteria andWorkTargetLessThan(Double value) {
            addCriterion("work_target <", value, "workTarget");
            return (Criteria) this;
        }

        public Criteria andWorkTargetLessThanOrEqualTo(Double value) {
            addCriterion("work_target <=", value, "workTarget");
            return (Criteria) this;
        }

        public Criteria andWorkTargetIn(List<Double> values) {
            addCriterion("work_target in", values, "workTarget");
            return (Criteria) this;
        }

        public Criteria andWorkTargetNotIn(List<Double> values) {
            addCriterion("work_target not in", values, "workTarget");
            return (Criteria) this;
        }

        public Criteria andWorkTargetBetween(Double value1, Double value2) {
            addCriterion("work_target between", value1, value2, "workTarget");
            return (Criteria) this;
        }

        public Criteria andWorkTargetNotBetween(Double value1, Double value2) {
            addCriterion("work_target not between", value1, value2, "workTarget");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(Integer value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(Integer value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(Integer value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(Integer value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(Integer value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<Integer> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<Integer> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(Integer value1, Integer value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andFirstWeekCustomIsNull() {
            addCriterion("first_week_custom is null");
            return (Criteria) this;
        }

        public Criteria andFirstWeekCustomIsNotNull() {
            addCriterion("first_week_custom is not null");
            return (Criteria) this;
        }

        public Criteria andFirstWeekCustomEqualTo(Double value) {
            addCriterion("first_week_custom =", value, "firstWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFirstWeekCustomNotEqualTo(Double value) {
            addCriterion("first_week_custom <>", value, "firstWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFirstWeekCustomGreaterThan(Double value) {
            addCriterion("first_week_custom >", value, "firstWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFirstWeekCustomGreaterThanOrEqualTo(Double value) {
            addCriterion("first_week_custom >=", value, "firstWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFirstWeekCustomLessThan(Double value) {
            addCriterion("first_week_custom <", value, "firstWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFirstWeekCustomLessThanOrEqualTo(Double value) {
            addCriterion("first_week_custom <=", value, "firstWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFirstWeekCustomIn(List<Double> values) {
            addCriterion("first_week_custom in", values, "firstWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFirstWeekCustomNotIn(List<Double> values) {
            addCriterion("first_week_custom not in", values, "firstWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFirstWeekCustomBetween(Double value1, Double value2) {
            addCriterion("first_week_custom between", value1, value2, "firstWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFirstWeekCustomNotBetween(Double value1, Double value2) {
            addCriterion("first_week_custom not between", value1, value2, "firstWeekCustom");
            return (Criteria) this;
        }

        public Criteria andSecondWeekCustomIsNull() {
            addCriterion("second_week_custom is null");
            return (Criteria) this;
        }

        public Criteria andSecondWeekCustomIsNotNull() {
            addCriterion("second_week_custom is not null");
            return (Criteria) this;
        }

        public Criteria andSecondWeekCustomEqualTo(Double value) {
            addCriterion("second_week_custom =", value, "secondWeekCustom");
            return (Criteria) this;
        }

        public Criteria andSecondWeekCustomNotEqualTo(Double value) {
            addCriterion("second_week_custom <>", value, "secondWeekCustom");
            return (Criteria) this;
        }

        public Criteria andSecondWeekCustomGreaterThan(Double value) {
            addCriterion("second_week_custom >", value, "secondWeekCustom");
            return (Criteria) this;
        }

        public Criteria andSecondWeekCustomGreaterThanOrEqualTo(Double value) {
            addCriterion("second_week_custom >=", value, "secondWeekCustom");
            return (Criteria) this;
        }

        public Criteria andSecondWeekCustomLessThan(Double value) {
            addCriterion("second_week_custom <", value, "secondWeekCustom");
            return (Criteria) this;
        }

        public Criteria andSecondWeekCustomLessThanOrEqualTo(Double value) {
            addCriterion("second_week_custom <=", value, "secondWeekCustom");
            return (Criteria) this;
        }

        public Criteria andSecondWeekCustomIn(List<Double> values) {
            addCriterion("second_week_custom in", values, "secondWeekCustom");
            return (Criteria) this;
        }

        public Criteria andSecondWeekCustomNotIn(List<Double> values) {
            addCriterion("second_week_custom not in", values, "secondWeekCustom");
            return (Criteria) this;
        }

        public Criteria andSecondWeekCustomBetween(Double value1, Double value2) {
            addCriterion("second_week_custom between", value1, value2, "secondWeekCustom");
            return (Criteria) this;
        }

        public Criteria andSecondWeekCustomNotBetween(Double value1, Double value2) {
            addCriterion("second_week_custom not between", value1, value2, "secondWeekCustom");
            return (Criteria) this;
        }

        public Criteria andThirdWeekCustomIsNull() {
            addCriterion("third_week_custom is null");
            return (Criteria) this;
        }

        public Criteria andThirdWeekCustomIsNotNull() {
            addCriterion("third_week_custom is not null");
            return (Criteria) this;
        }

        public Criteria andThirdWeekCustomEqualTo(Double value) {
            addCriterion("third_week_custom =", value, "thirdWeekCustom");
            return (Criteria) this;
        }

        public Criteria andThirdWeekCustomNotEqualTo(Double value) {
            addCriterion("third_week_custom <>", value, "thirdWeekCustom");
            return (Criteria) this;
        }

        public Criteria andThirdWeekCustomGreaterThan(Double value) {
            addCriterion("third_week_custom >", value, "thirdWeekCustom");
            return (Criteria) this;
        }

        public Criteria andThirdWeekCustomGreaterThanOrEqualTo(Double value) {
            addCriterion("third_week_custom >=", value, "thirdWeekCustom");
            return (Criteria) this;
        }

        public Criteria andThirdWeekCustomLessThan(Double value) {
            addCriterion("third_week_custom <", value, "thirdWeekCustom");
            return (Criteria) this;
        }

        public Criteria andThirdWeekCustomLessThanOrEqualTo(Double value) {
            addCriterion("third_week_custom <=", value, "thirdWeekCustom");
            return (Criteria) this;
        }

        public Criteria andThirdWeekCustomIn(List<Double> values) {
            addCriterion("third_week_custom in", values, "thirdWeekCustom");
            return (Criteria) this;
        }

        public Criteria andThirdWeekCustomNotIn(List<Double> values) {
            addCriterion("third_week_custom not in", values, "thirdWeekCustom");
            return (Criteria) this;
        }

        public Criteria andThirdWeekCustomBetween(Double value1, Double value2) {
            addCriterion("third_week_custom between", value1, value2, "thirdWeekCustom");
            return (Criteria) this;
        }

        public Criteria andThirdWeekCustomNotBetween(Double value1, Double value2) {
            addCriterion("third_week_custom not between", value1, value2, "thirdWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFourthWeekCustomIsNull() {
            addCriterion("fourth_week_custom is null");
            return (Criteria) this;
        }

        public Criteria andFourthWeekCustomIsNotNull() {
            addCriterion("fourth_week_custom is not null");
            return (Criteria) this;
        }

        public Criteria andFourthWeekCustomEqualTo(Double value) {
            addCriterion("fourth_week_custom =", value, "fourthWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFourthWeekCustomNotEqualTo(Double value) {
            addCriterion("fourth_week_custom <>", value, "fourthWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFourthWeekCustomGreaterThan(Double value) {
            addCriterion("fourth_week_custom >", value, "fourthWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFourthWeekCustomGreaterThanOrEqualTo(Double value) {
            addCriterion("fourth_week_custom >=", value, "fourthWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFourthWeekCustomLessThan(Double value) {
            addCriterion("fourth_week_custom <", value, "fourthWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFourthWeekCustomLessThanOrEqualTo(Double value) {
            addCriterion("fourth_week_custom <=", value, "fourthWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFourthWeekCustomIn(List<Double> values) {
            addCriterion("fourth_week_custom in", values, "fourthWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFourthWeekCustomNotIn(List<Double> values) {
            addCriterion("fourth_week_custom not in", values, "fourthWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFourthWeekCustomBetween(Double value1, Double value2) {
            addCriterion("fourth_week_custom between", value1, value2, "fourthWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFourthWeekCustomNotBetween(Double value1, Double value2) {
            addCriterion("fourth_week_custom not between", value1, value2, "fourthWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFifthWeekCustomIsNull() {
            addCriterion("fifth_week_custom is null");
            return (Criteria) this;
        }

        public Criteria andFifthWeekCustomIsNotNull() {
            addCriterion("fifth_week_custom is not null");
            return (Criteria) this;
        }

        public Criteria andFifthWeekCustomEqualTo(Double value) {
            addCriterion("fifth_week_custom =", value, "fifthWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFifthWeekCustomNotEqualTo(Double value) {
            addCriterion("fifth_week_custom <>", value, "fifthWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFifthWeekCustomGreaterThan(Double value) {
            addCriterion("fifth_week_custom >", value, "fifthWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFifthWeekCustomGreaterThanOrEqualTo(Double value) {
            addCriterion("fifth_week_custom >=", value, "fifthWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFifthWeekCustomLessThan(Double value) {
            addCriterion("fifth_week_custom <", value, "fifthWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFifthWeekCustomLessThanOrEqualTo(Double value) {
            addCriterion("fifth_week_custom <=", value, "fifthWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFifthWeekCustomIn(List<Double> values) {
            addCriterion("fifth_week_custom in", values, "fifthWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFifthWeekCustomNotIn(List<Double> values) {
            addCriterion("fifth_week_custom not in", values, "fifthWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFifthWeekCustomBetween(Double value1, Double value2) {
            addCriterion("fifth_week_custom between", value1, value2, "fifthWeekCustom");
            return (Criteria) this;
        }

        public Criteria andFifthWeekCustomNotBetween(Double value1, Double value2) {
            addCriterion("fifth_week_custom not between", value1, value2, "fifthWeekCustom");
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