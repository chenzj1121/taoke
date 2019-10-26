package com.luoshi.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbCheckmoneysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCheckmoneysExample() {
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

        public Criteria andCmIdIsNull() {
            addCriterion("cm_id is null");
            return (Criteria) this;
        }

        public Criteria andCmIdIsNotNull() {
            addCriterion("cm_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmIdEqualTo(Integer value) {
            addCriterion("cm_id =", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotEqualTo(Integer value) {
            addCriterion("cm_id <>", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThan(Integer value) {
            addCriterion("cm_id >", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_id >=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThan(Integer value) {
            addCriterion("cm_id <", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThanOrEqualTo(Integer value) {
            addCriterion("cm_id <=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdIn(List<Integer> values) {
            addCriterion("cm_id in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotIn(List<Integer> values) {
            addCriterion("cm_id not in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdBetween(Integer value1, Integer value2) {
            addCriterion("cm_id between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_id not between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmSellDeptIsNull() {
            addCriterion("cm_sell_dept is null");
            return (Criteria) this;
        }

        public Criteria andCmSellDeptIsNotNull() {
            addCriterion("cm_sell_dept is not null");
            return (Criteria) this;
        }

        public Criteria andCmSellDeptEqualTo(String value) {
            addCriterion("cm_sell_dept =", value, "cmSellDept");
            return (Criteria) this;
        }

        public Criteria andCmSellDeptNotEqualTo(String value) {
            addCriterion("cm_sell_dept <>", value, "cmSellDept");
            return (Criteria) this;
        }

        public Criteria andCmSellDeptGreaterThan(String value) {
            addCriterion("cm_sell_dept >", value, "cmSellDept");
            return (Criteria) this;
        }

        public Criteria andCmSellDeptGreaterThanOrEqualTo(String value) {
            addCriterion("cm_sell_dept >=", value, "cmSellDept");
            return (Criteria) this;
        }

        public Criteria andCmSellDeptLessThan(String value) {
            addCriterion("cm_sell_dept <", value, "cmSellDept");
            return (Criteria) this;
        }

        public Criteria andCmSellDeptLessThanOrEqualTo(String value) {
            addCriterion("cm_sell_dept <=", value, "cmSellDept");
            return (Criteria) this;
        }

        public Criteria andCmSellDeptLike(String value) {
            addCriterion("cm_sell_dept like", value, "cmSellDept");
            return (Criteria) this;
        }

        public Criteria andCmSellDeptNotLike(String value) {
            addCriterion("cm_sell_dept not like", value, "cmSellDept");
            return (Criteria) this;
        }

        public Criteria andCmSellDeptIn(List<String> values) {
            addCriterion("cm_sell_dept in", values, "cmSellDept");
            return (Criteria) this;
        }

        public Criteria andCmSellDeptNotIn(List<String> values) {
            addCriterion("cm_sell_dept not in", values, "cmSellDept");
            return (Criteria) this;
        }

        public Criteria andCmSellDeptBetween(String value1, String value2) {
            addCriterion("cm_sell_dept between", value1, value2, "cmSellDept");
            return (Criteria) this;
        }

        public Criteria andCmSellDeptNotBetween(String value1, String value2) {
            addCriterion("cm_sell_dept not between", value1, value2, "cmSellDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptIsNull() {
            addCriterion("cm_dept is null");
            return (Criteria) this;
        }

        public Criteria andCmDeptIsNotNull() {
            addCriterion("cm_dept is not null");
            return (Criteria) this;
        }

        public Criteria andCmDeptEqualTo(String value) {
            addCriterion("cm_dept =", value, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptNotEqualTo(String value) {
            addCriterion("cm_dept <>", value, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptGreaterThan(String value) {
            addCriterion("cm_dept >", value, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptGreaterThanOrEqualTo(String value) {
            addCriterion("cm_dept >=", value, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptLessThan(String value) {
            addCriterion("cm_dept <", value, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptLessThanOrEqualTo(String value) {
            addCriterion("cm_dept <=", value, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptLike(String value) {
            addCriterion("cm_dept like", value, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptNotLike(String value) {
            addCriterion("cm_dept not like", value, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptIn(List<String> values) {
            addCriterion("cm_dept in", values, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptNotIn(List<String> values) {
            addCriterion("cm_dept not in", values, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptBetween(String value1, String value2) {
            addCriterion("cm_dept between", value1, value2, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptNotBetween(String value1, String value2) {
            addCriterion("cm_dept not between", value1, value2, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmUserIdIsNull() {
            addCriterion("cm_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCmUserIdIsNotNull() {
            addCriterion("cm_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmUserIdEqualTo(Integer value) {
            addCriterion("cm_user_id =", value, "cmUserId");
            return (Criteria) this;
        }

        public Criteria andCmUserIdNotEqualTo(Integer value) {
            addCriterion("cm_user_id <>", value, "cmUserId");
            return (Criteria) this;
        }

        public Criteria andCmUserIdGreaterThan(Integer value) {
            addCriterion("cm_user_id >", value, "cmUserId");
            return (Criteria) this;
        }

        public Criteria andCmUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_user_id >=", value, "cmUserId");
            return (Criteria) this;
        }

        public Criteria andCmUserIdLessThan(Integer value) {
            addCriterion("cm_user_id <", value, "cmUserId");
            return (Criteria) this;
        }

        public Criteria andCmUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("cm_user_id <=", value, "cmUserId");
            return (Criteria) this;
        }

        public Criteria andCmUserIdIn(List<Integer> values) {
            addCriterion("cm_user_id in", values, "cmUserId");
            return (Criteria) this;
        }

        public Criteria andCmUserIdNotIn(List<Integer> values) {
            addCriterion("cm_user_id not in", values, "cmUserId");
            return (Criteria) this;
        }

        public Criteria andCmUserIdBetween(Integer value1, Integer value2) {
            addCriterion("cm_user_id between", value1, value2, "cmUserId");
            return (Criteria) this;
        }

        public Criteria andCmUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_user_id not between", value1, value2, "cmUserId");
            return (Criteria) this;
        }

        public Criteria andCmShopNameIsNull() {
            addCriterion("cm_shop_name is null");
            return (Criteria) this;
        }

        public Criteria andCmShopNameIsNotNull() {
            addCriterion("cm_shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andCmShopNameEqualTo(String value) {
            addCriterion("cm_shop_name =", value, "cmShopName");
            return (Criteria) this;
        }

        public Criteria andCmShopNameNotEqualTo(String value) {
            addCriterion("cm_shop_name <>", value, "cmShopName");
            return (Criteria) this;
        }

        public Criteria andCmShopNameGreaterThan(String value) {
            addCriterion("cm_shop_name >", value, "cmShopName");
            return (Criteria) this;
        }

        public Criteria andCmShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("cm_shop_name >=", value, "cmShopName");
            return (Criteria) this;
        }

        public Criteria andCmShopNameLessThan(String value) {
            addCriterion("cm_shop_name <", value, "cmShopName");
            return (Criteria) this;
        }

        public Criteria andCmShopNameLessThanOrEqualTo(String value) {
            addCriterion("cm_shop_name <=", value, "cmShopName");
            return (Criteria) this;
        }

        public Criteria andCmShopNameLike(String value) {
            addCriterion("cm_shop_name like", value, "cmShopName");
            return (Criteria) this;
        }

        public Criteria andCmShopNameNotLike(String value) {
            addCriterion("cm_shop_name not like", value, "cmShopName");
            return (Criteria) this;
        }

        public Criteria andCmShopNameIn(List<String> values) {
            addCriterion("cm_shop_name in", values, "cmShopName");
            return (Criteria) this;
        }

        public Criteria andCmShopNameNotIn(List<String> values) {
            addCriterion("cm_shop_name not in", values, "cmShopName");
            return (Criteria) this;
        }

        public Criteria andCmShopNameBetween(String value1, String value2) {
            addCriterion("cm_shop_name between", value1, value2, "cmShopName");
            return (Criteria) this;
        }

        public Criteria andCmShopNameNotBetween(String value1, String value2) {
            addCriterion("cm_shop_name not between", value1, value2, "cmShopName");
            return (Criteria) this;
        }

        public Criteria andCmShopTypeIsNull() {
            addCriterion("cm_shop_type is null");
            return (Criteria) this;
        }

        public Criteria andCmShopTypeIsNotNull() {
            addCriterion("cm_shop_type is not null");
            return (Criteria) this;
        }

        public Criteria andCmShopTypeEqualTo(String value) {
            addCriterion("cm_shop_type =", value, "cmShopType");
            return (Criteria) this;
        }

        public Criteria andCmShopTypeNotEqualTo(String value) {
            addCriterion("cm_shop_type <>", value, "cmShopType");
            return (Criteria) this;
        }

        public Criteria andCmShopTypeGreaterThan(String value) {
            addCriterion("cm_shop_type >", value, "cmShopType");
            return (Criteria) this;
        }

        public Criteria andCmShopTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cm_shop_type >=", value, "cmShopType");
            return (Criteria) this;
        }

        public Criteria andCmShopTypeLessThan(String value) {
            addCriterion("cm_shop_type <", value, "cmShopType");
            return (Criteria) this;
        }

        public Criteria andCmShopTypeLessThanOrEqualTo(String value) {
            addCriterion("cm_shop_type <=", value, "cmShopType");
            return (Criteria) this;
        }

        public Criteria andCmShopTypeLike(String value) {
            addCriterion("cm_shop_type like", value, "cmShopType");
            return (Criteria) this;
        }

        public Criteria andCmShopTypeNotLike(String value) {
            addCriterion("cm_shop_type not like", value, "cmShopType");
            return (Criteria) this;
        }

        public Criteria andCmShopTypeIn(List<String> values) {
            addCriterion("cm_shop_type in", values, "cmShopType");
            return (Criteria) this;
        }

        public Criteria andCmShopTypeNotIn(List<String> values) {
            addCriterion("cm_shop_type not in", values, "cmShopType");
            return (Criteria) this;
        }

        public Criteria andCmShopTypeBetween(String value1, String value2) {
            addCriterion("cm_shop_type between", value1, value2, "cmShopType");
            return (Criteria) this;
        }

        public Criteria andCmShopTypeNotBetween(String value1, String value2) {
            addCriterion("cm_shop_type not between", value1, value2, "cmShopType");
            return (Criteria) this;
        }

        public Criteria andCmJsMoneyIsNull() {
            addCriterion("cm_js_money is null");
            return (Criteria) this;
        }

        public Criteria andCmJsMoneyIsNotNull() {
            addCriterion("cm_js_money is not null");
            return (Criteria) this;
        }

        public Criteria andCmJsMoneyEqualTo(Double value) {
            addCriterion("cm_js_money =", value, "cmJsMoney");
            return (Criteria) this;
        }

        public Criteria andCmJsMoneyNotEqualTo(Double value) {
            addCriterion("cm_js_money <>", value, "cmJsMoney");
            return (Criteria) this;
        }

        public Criteria andCmJsMoneyGreaterThan(Double value) {
            addCriterion("cm_js_money >", value, "cmJsMoney");
            return (Criteria) this;
        }

        public Criteria andCmJsMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("cm_js_money >=", value, "cmJsMoney");
            return (Criteria) this;
        }

        public Criteria andCmJsMoneyLessThan(Double value) {
            addCriterion("cm_js_money <", value, "cmJsMoney");
            return (Criteria) this;
        }

        public Criteria andCmJsMoneyLessThanOrEqualTo(Double value) {
            addCriterion("cm_js_money <=", value, "cmJsMoney");
            return (Criteria) this;
        }

        public Criteria andCmJsMoneyIn(List<Double> values) {
            addCriterion("cm_js_money in", values, "cmJsMoney");
            return (Criteria) this;
        }

        public Criteria andCmJsMoneyNotIn(List<Double> values) {
            addCriterion("cm_js_money not in", values, "cmJsMoney");
            return (Criteria) this;
        }

        public Criteria andCmJsMoneyBetween(Double value1, Double value2) {
            addCriterion("cm_js_money between", value1, value2, "cmJsMoney");
            return (Criteria) this;
        }

        public Criteria andCmJsMoneyNotBetween(Double value1, Double value2) {
            addCriterion("cm_js_money not between", value1, value2, "cmJsMoney");
            return (Criteria) this;
        }

        public Criteria andCmFkMoneyIsNull() {
            addCriterion("cm_fk_money is null");
            return (Criteria) this;
        }

        public Criteria andCmFkMoneyIsNotNull() {
            addCriterion("cm_fk_money is not null");
            return (Criteria) this;
        }

        public Criteria andCmFkMoneyEqualTo(Double value) {
            addCriterion("cm_fk_money =", value, "cmFkMoney");
            return (Criteria) this;
        }

        public Criteria andCmFkMoneyNotEqualTo(Double value) {
            addCriterion("cm_fk_money <>", value, "cmFkMoney");
            return (Criteria) this;
        }

        public Criteria andCmFkMoneyGreaterThan(Double value) {
            addCriterion("cm_fk_money >", value, "cmFkMoney");
            return (Criteria) this;
        }

        public Criteria andCmFkMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("cm_fk_money >=", value, "cmFkMoney");
            return (Criteria) this;
        }

        public Criteria andCmFkMoneyLessThan(Double value) {
            addCriterion("cm_fk_money <", value, "cmFkMoney");
            return (Criteria) this;
        }

        public Criteria andCmFkMoneyLessThanOrEqualTo(Double value) {
            addCriterion("cm_fk_money <=", value, "cmFkMoney");
            return (Criteria) this;
        }

        public Criteria andCmFkMoneyIn(List<Double> values) {
            addCriterion("cm_fk_money in", values, "cmFkMoney");
            return (Criteria) this;
        }

        public Criteria andCmFkMoneyNotIn(List<Double> values) {
            addCriterion("cm_fk_money not in", values, "cmFkMoney");
            return (Criteria) this;
        }

        public Criteria andCmFkMoneyBetween(Double value1, Double value2) {
            addCriterion("cm_fk_money between", value1, value2, "cmFkMoney");
            return (Criteria) this;
        }

        public Criteria andCmFkMoneyNotBetween(Double value1, Double value2) {
            addCriterion("cm_fk_money not between", value1, value2, "cmFkMoney");
            return (Criteria) this;
        }

        public Criteria andCmSyMoneyIsNull() {
            addCriterion("cm_sy_money is null");
            return (Criteria) this;
        }

        public Criteria andCmSyMoneyIsNotNull() {
            addCriterion("cm_sy_money is not null");
            return (Criteria) this;
        }

        public Criteria andCmSyMoneyEqualTo(Double value) {
            addCriterion("cm_sy_money =", value, "cmSyMoney");
            return (Criteria) this;
        }

        public Criteria andCmSyMoneyNotEqualTo(Double value) {
            addCriterion("cm_sy_money <>", value, "cmSyMoney");
            return (Criteria) this;
        }

        public Criteria andCmSyMoneyGreaterThan(Double value) {
            addCriterion("cm_sy_money >", value, "cmSyMoney");
            return (Criteria) this;
        }

        public Criteria andCmSyMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("cm_sy_money >=", value, "cmSyMoney");
            return (Criteria) this;
        }

        public Criteria andCmSyMoneyLessThan(Double value) {
            addCriterion("cm_sy_money <", value, "cmSyMoney");
            return (Criteria) this;
        }

        public Criteria andCmSyMoneyLessThanOrEqualTo(Double value) {
            addCriterion("cm_sy_money <=", value, "cmSyMoney");
            return (Criteria) this;
        }

        public Criteria andCmSyMoneyIn(List<Double> values) {
            addCriterion("cm_sy_money in", values, "cmSyMoney");
            return (Criteria) this;
        }

        public Criteria andCmSyMoneyNotIn(List<Double> values) {
            addCriterion("cm_sy_money not in", values, "cmSyMoney");
            return (Criteria) this;
        }

        public Criteria andCmSyMoneyBetween(Double value1, Double value2) {
            addCriterion("cm_sy_money between", value1, value2, "cmSyMoney");
            return (Criteria) this;
        }

        public Criteria andCmSyMoneyNotBetween(Double value1, Double value2) {
            addCriterion("cm_sy_money not between", value1, value2, "cmSyMoney");
            return (Criteria) this;
        }

        public Criteria andCmJsNumsIsNull() {
            addCriterion("cm_js_nums is null");
            return (Criteria) this;
        }

        public Criteria andCmJsNumsIsNotNull() {
            addCriterion("cm_js_nums is not null");
            return (Criteria) this;
        }

        public Criteria andCmJsNumsEqualTo(Integer value) {
            addCriterion("cm_js_nums =", value, "cmJsNums");
            return (Criteria) this;
        }

        public Criteria andCmJsNumsNotEqualTo(Integer value) {
            addCriterion("cm_js_nums <>", value, "cmJsNums");
            return (Criteria) this;
        }

        public Criteria andCmJsNumsGreaterThan(Integer value) {
            addCriterion("cm_js_nums >", value, "cmJsNums");
            return (Criteria) this;
        }

        public Criteria andCmJsNumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_js_nums >=", value, "cmJsNums");
            return (Criteria) this;
        }

        public Criteria andCmJsNumsLessThan(Integer value) {
            addCriterion("cm_js_nums <", value, "cmJsNums");
            return (Criteria) this;
        }

        public Criteria andCmJsNumsLessThanOrEqualTo(Integer value) {
            addCriterion("cm_js_nums <=", value, "cmJsNums");
            return (Criteria) this;
        }

        public Criteria andCmJsNumsIn(List<Integer> values) {
            addCriterion("cm_js_nums in", values, "cmJsNums");
            return (Criteria) this;
        }

        public Criteria andCmJsNumsNotIn(List<Integer> values) {
            addCriterion("cm_js_nums not in", values, "cmJsNums");
            return (Criteria) this;
        }

        public Criteria andCmJsNumsBetween(Integer value1, Integer value2) {
            addCriterion("cm_js_nums between", value1, value2, "cmJsNums");
            return (Criteria) this;
        }

        public Criteria andCmJsNumsNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_js_nums not between", value1, value2, "cmJsNums");
            return (Criteria) this;
        }

        public Criteria andCmFwPriceIsNull() {
            addCriterion("cm_fw_price is null");
            return (Criteria) this;
        }

        public Criteria andCmFwPriceIsNotNull() {
            addCriterion("cm_fw_price is not null");
            return (Criteria) this;
        }

        public Criteria andCmFwPriceEqualTo(Double value) {
            addCriterion("cm_fw_price =", value, "cmFwPrice");
            return (Criteria) this;
        }

        public Criteria andCmFwPriceNotEqualTo(Double value) {
            addCriterion("cm_fw_price <>", value, "cmFwPrice");
            return (Criteria) this;
        }

        public Criteria andCmFwPriceGreaterThan(Double value) {
            addCriterion("cm_fw_price >", value, "cmFwPrice");
            return (Criteria) this;
        }

        public Criteria andCmFwPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("cm_fw_price >=", value, "cmFwPrice");
            return (Criteria) this;
        }

        public Criteria andCmFwPriceLessThan(Double value) {
            addCriterion("cm_fw_price <", value, "cmFwPrice");
            return (Criteria) this;
        }

        public Criteria andCmFwPriceLessThanOrEqualTo(Double value) {
            addCriterion("cm_fw_price <=", value, "cmFwPrice");
            return (Criteria) this;
        }

        public Criteria andCmFwPriceIn(List<Double> values) {
            addCriterion("cm_fw_price in", values, "cmFwPrice");
            return (Criteria) this;
        }

        public Criteria andCmFwPriceNotIn(List<Double> values) {
            addCriterion("cm_fw_price not in", values, "cmFwPrice");
            return (Criteria) this;
        }

        public Criteria andCmFwPriceBetween(Double value1, Double value2) {
            addCriterion("cm_fw_price between", value1, value2, "cmFwPrice");
            return (Criteria) this;
        }

        public Criteria andCmFwPriceNotBetween(Double value1, Double value2) {
            addCriterion("cm_fw_price not between", value1, value2, "cmFwPrice");
            return (Criteria) this;
        }

        public Criteria andCmYhqPhotoIsNull() {
            addCriterion("cm_yhq_photo is null");
            return (Criteria) this;
        }

        public Criteria andCmYhqPhotoIsNotNull() {
            addCriterion("cm_yhq_photo is not null");
            return (Criteria) this;
        }

        public Criteria andCmYhqPhotoEqualTo(String value) {
            addCriterion("cm_yhq_photo =", value, "cmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andCmYhqPhotoNotEqualTo(String value) {
            addCriterion("cm_yhq_photo <>", value, "cmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andCmYhqPhotoGreaterThan(String value) {
            addCriterion("cm_yhq_photo >", value, "cmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andCmYhqPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("cm_yhq_photo >=", value, "cmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andCmYhqPhotoLessThan(String value) {
            addCriterion("cm_yhq_photo <", value, "cmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andCmYhqPhotoLessThanOrEqualTo(String value) {
            addCriterion("cm_yhq_photo <=", value, "cmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andCmYhqPhotoLike(String value) {
            addCriterion("cm_yhq_photo like", value, "cmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andCmYhqPhotoNotLike(String value) {
            addCriterion("cm_yhq_photo not like", value, "cmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andCmYhqPhotoIn(List<String> values) {
            addCriterion("cm_yhq_photo in", values, "cmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andCmYhqPhotoNotIn(List<String> values) {
            addCriterion("cm_yhq_photo not in", values, "cmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andCmYhqPhotoBetween(String value1, String value2) {
            addCriterion("cm_yhq_photo between", value1, value2, "cmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andCmYhqPhotoNotBetween(String value1, String value2) {
            addCriterion("cm_yhq_photo not between", value1, value2, "cmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andCmLoadCustomerIsNull() {
            addCriterion("cm_load_customer is null");
            return (Criteria) this;
        }

        public Criteria andCmLoadCustomerIsNotNull() {
            addCriterion("cm_load_customer is not null");
            return (Criteria) this;
        }

        public Criteria andCmLoadCustomerEqualTo(String value) {
            addCriterion("cm_load_customer =", value, "cmLoadCustomer");
            return (Criteria) this;
        }

        public Criteria andCmLoadCustomerNotEqualTo(String value) {
            addCriterion("cm_load_customer <>", value, "cmLoadCustomer");
            return (Criteria) this;
        }

        public Criteria andCmLoadCustomerGreaterThan(String value) {
            addCriterion("cm_load_customer >", value, "cmLoadCustomer");
            return (Criteria) this;
        }

        public Criteria andCmLoadCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("cm_load_customer >=", value, "cmLoadCustomer");
            return (Criteria) this;
        }

        public Criteria andCmLoadCustomerLessThan(String value) {
            addCriterion("cm_load_customer <", value, "cmLoadCustomer");
            return (Criteria) this;
        }

        public Criteria andCmLoadCustomerLessThanOrEqualTo(String value) {
            addCriterion("cm_load_customer <=", value, "cmLoadCustomer");
            return (Criteria) this;
        }

        public Criteria andCmLoadCustomerLike(String value) {
            addCriterion("cm_load_customer like", value, "cmLoadCustomer");
            return (Criteria) this;
        }

        public Criteria andCmLoadCustomerNotLike(String value) {
            addCriterion("cm_load_customer not like", value, "cmLoadCustomer");
            return (Criteria) this;
        }

        public Criteria andCmLoadCustomerIn(List<String> values) {
            addCriterion("cm_load_customer in", values, "cmLoadCustomer");
            return (Criteria) this;
        }

        public Criteria andCmLoadCustomerNotIn(List<String> values) {
            addCriterion("cm_load_customer not in", values, "cmLoadCustomer");
            return (Criteria) this;
        }

        public Criteria andCmLoadCustomerBetween(String value1, String value2) {
            addCriterion("cm_load_customer between", value1, value2, "cmLoadCustomer");
            return (Criteria) this;
        }

        public Criteria andCmLoadCustomerNotBetween(String value1, String value2) {
            addCriterion("cm_load_customer not between", value1, value2, "cmLoadCustomer");
            return (Criteria) this;
        }

        public Criteria andCmApplyTimeIsNull() {
            addCriterion("cm_apply_time is null");
            return (Criteria) this;
        }

        public Criteria andCmApplyTimeIsNotNull() {
            addCriterion("cm_apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andCmApplyTimeEqualTo(Date value) {
            addCriterion("cm_apply_time =", value, "cmApplyTime");
            return (Criteria) this;
        }

        public Criteria andCmApplyTimeNotEqualTo(Date value) {
            addCriterion("cm_apply_time <>", value, "cmApplyTime");
            return (Criteria) this;
        }

        public Criteria andCmApplyTimeGreaterThan(Date value) {
            addCriterion("cm_apply_time >", value, "cmApplyTime");
            return (Criteria) this;
        }

        public Criteria andCmApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cm_apply_time >=", value, "cmApplyTime");
            return (Criteria) this;
        }

        public Criteria andCmApplyTimeLessThan(Date value) {
            addCriterion("cm_apply_time <", value, "cmApplyTime");
            return (Criteria) this;
        }

        public Criteria andCmApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("cm_apply_time <=", value, "cmApplyTime");
            return (Criteria) this;
        }

        public Criteria andCmApplyTimeIn(List<Date> values) {
            addCriterion("cm_apply_time in", values, "cmApplyTime");
            return (Criteria) this;
        }

        public Criteria andCmApplyTimeNotIn(List<Date> values) {
            addCriterion("cm_apply_time not in", values, "cmApplyTime");
            return (Criteria) this;
        }

        public Criteria andCmApplyTimeBetween(Date value1, Date value2) {
            addCriterion("cm_apply_time between", value1, value2, "cmApplyTime");
            return (Criteria) this;
        }

        public Criteria andCmApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("cm_apply_time not between", value1, value2, "cmApplyTime");
            return (Criteria) this;
        }

        public Criteria andCmTypeIsNull() {
            addCriterion("cm_type is null");
            return (Criteria) this;
        }

        public Criteria andCmTypeIsNotNull() {
            addCriterion("cm_type is not null");
            return (Criteria) this;
        }

        public Criteria andCmTypeEqualTo(String value) {
            addCriterion("cm_type =", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeNotEqualTo(String value) {
            addCriterion("cm_type <>", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeGreaterThan(String value) {
            addCriterion("cm_type >", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cm_type >=", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeLessThan(String value) {
            addCriterion("cm_type <", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeLessThanOrEqualTo(String value) {
            addCriterion("cm_type <=", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeLike(String value) {
            addCriterion("cm_type like", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeNotLike(String value) {
            addCriterion("cm_type not like", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeIn(List<String> values) {
            addCriterion("cm_type in", values, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeNotIn(List<String> values) {
            addCriterion("cm_type not in", values, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeBetween(String value1, String value2) {
            addCriterion("cm_type between", value1, value2, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeNotBetween(String value1, String value2) {
            addCriterion("cm_type not between", value1, value2, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmYhqNameIsNull() {
            addCriterion("cm_yhq_name is null");
            return (Criteria) this;
        }

        public Criteria andCmYhqNameIsNotNull() {
            addCriterion("cm_yhq_name is not null");
            return (Criteria) this;
        }

        public Criteria andCmYhqNameEqualTo(String value) {
            addCriterion("cm_yhq_name =", value, "cmYhqName");
            return (Criteria) this;
        }

        public Criteria andCmYhqNameNotEqualTo(String value) {
            addCriterion("cm_yhq_name <>", value, "cmYhqName");
            return (Criteria) this;
        }

        public Criteria andCmYhqNameGreaterThan(String value) {
            addCriterion("cm_yhq_name >", value, "cmYhqName");
            return (Criteria) this;
        }

        public Criteria andCmYhqNameGreaterThanOrEqualTo(String value) {
            addCriterion("cm_yhq_name >=", value, "cmYhqName");
            return (Criteria) this;
        }

        public Criteria andCmYhqNameLessThan(String value) {
            addCriterion("cm_yhq_name <", value, "cmYhqName");
            return (Criteria) this;
        }

        public Criteria andCmYhqNameLessThanOrEqualTo(String value) {
            addCriterion("cm_yhq_name <=", value, "cmYhqName");
            return (Criteria) this;
        }

        public Criteria andCmYhqNameLike(String value) {
            addCriterion("cm_yhq_name like", value, "cmYhqName");
            return (Criteria) this;
        }

        public Criteria andCmYhqNameNotLike(String value) {
            addCriterion("cm_yhq_name not like", value, "cmYhqName");
            return (Criteria) this;
        }

        public Criteria andCmYhqNameIn(List<String> values) {
            addCriterion("cm_yhq_name in", values, "cmYhqName");
            return (Criteria) this;
        }

        public Criteria andCmYhqNameNotIn(List<String> values) {
            addCriterion("cm_yhq_name not in", values, "cmYhqName");
            return (Criteria) this;
        }

        public Criteria andCmYhqNameBetween(String value1, String value2) {
            addCriterion("cm_yhq_name between", value1, value2, "cmYhqName");
            return (Criteria) this;
        }

        public Criteria andCmYhqNameNotBetween(String value1, String value2) {
            addCriterion("cm_yhq_name not between", value1, value2, "cmYhqName");
            return (Criteria) this;
        }

        public Criteria andCmBackTimeIsNull() {
            addCriterion("cm_back_time is null");
            return (Criteria) this;
        }

        public Criteria andCmBackTimeIsNotNull() {
            addCriterion("cm_back_time is not null");
            return (Criteria) this;
        }

        public Criteria andCmBackTimeEqualTo(Date value) {
            addCriterion("cm_back_time =", value, "cmBackTime");
            return (Criteria) this;
        }

        public Criteria andCmBackTimeNotEqualTo(Date value) {
            addCriterion("cm_back_time <>", value, "cmBackTime");
            return (Criteria) this;
        }

        public Criteria andCmBackTimeGreaterThan(Date value) {
            addCriterion("cm_back_time >", value, "cmBackTime");
            return (Criteria) this;
        }

        public Criteria andCmBackTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cm_back_time >=", value, "cmBackTime");
            return (Criteria) this;
        }

        public Criteria andCmBackTimeLessThan(Date value) {
            addCriterion("cm_back_time <", value, "cmBackTime");
            return (Criteria) this;
        }

        public Criteria andCmBackTimeLessThanOrEqualTo(Date value) {
            addCriterion("cm_back_time <=", value, "cmBackTime");
            return (Criteria) this;
        }

        public Criteria andCmBackTimeIn(List<Date> values) {
            addCriterion("cm_back_time in", values, "cmBackTime");
            return (Criteria) this;
        }

        public Criteria andCmBackTimeNotIn(List<Date> values) {
            addCriterion("cm_back_time not in", values, "cmBackTime");
            return (Criteria) this;
        }

        public Criteria andCmBackTimeBetween(Date value1, Date value2) {
            addCriterion("cm_back_time between", value1, value2, "cmBackTime");
            return (Criteria) this;
        }

        public Criteria andCmBackTimeNotBetween(Date value1, Date value2) {
            addCriterion("cm_back_time not between", value1, value2, "cmBackTime");
            return (Criteria) this;
        }

        public Criteria andCmTextIsNull() {
            addCriterion("cm_text is null");
            return (Criteria) this;
        }

        public Criteria andCmTextIsNotNull() {
            addCriterion("cm_text is not null");
            return (Criteria) this;
        }

        public Criteria andCmTextEqualTo(String value) {
            addCriterion("cm_text =", value, "cmText");
            return (Criteria) this;
        }

        public Criteria andCmTextNotEqualTo(String value) {
            addCriterion("cm_text <>", value, "cmText");
            return (Criteria) this;
        }

        public Criteria andCmTextGreaterThan(String value) {
            addCriterion("cm_text >", value, "cmText");
            return (Criteria) this;
        }

        public Criteria andCmTextGreaterThanOrEqualTo(String value) {
            addCriterion("cm_text >=", value, "cmText");
            return (Criteria) this;
        }

        public Criteria andCmTextLessThan(String value) {
            addCriterion("cm_text <", value, "cmText");
            return (Criteria) this;
        }

        public Criteria andCmTextLessThanOrEqualTo(String value) {
            addCriterion("cm_text <=", value, "cmText");
            return (Criteria) this;
        }

        public Criteria andCmTextLike(String value) {
            addCriterion("cm_text like", value, "cmText");
            return (Criteria) this;
        }

        public Criteria andCmTextNotLike(String value) {
            addCriterion("cm_text not like", value, "cmText");
            return (Criteria) this;
        }

        public Criteria andCmTextIn(List<String> values) {
            addCriterion("cm_text in", values, "cmText");
            return (Criteria) this;
        }

        public Criteria andCmTextNotIn(List<String> values) {
            addCriterion("cm_text not in", values, "cmText");
            return (Criteria) this;
        }

        public Criteria andCmTextBetween(String value1, String value2) {
            addCriterion("cm_text between", value1, value2, "cmText");
            return (Criteria) this;
        }

        public Criteria andCmTextNotBetween(String value1, String value2) {
            addCriterion("cm_text not between", value1, value2, "cmText");
            return (Criteria) this;
        }

        public Criteria andCmFcMoneyIsNull() {
            addCriterion("cm_fc_money is null");
            return (Criteria) this;
        }

        public Criteria andCmFcMoneyIsNotNull() {
            addCriterion("cm_fc_money is not null");
            return (Criteria) this;
        }

        public Criteria andCmFcMoneyEqualTo(Double value) {
            addCriterion("cm_fc_money =", value, "cmFcMoney");
            return (Criteria) this;
        }

        public Criteria andCmFcMoneyNotEqualTo(Double value) {
            addCriterion("cm_fc_money <>", value, "cmFcMoney");
            return (Criteria) this;
        }

        public Criteria andCmFcMoneyGreaterThan(Double value) {
            addCriterion("cm_fc_money >", value, "cmFcMoney");
            return (Criteria) this;
        }

        public Criteria andCmFcMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("cm_fc_money >=", value, "cmFcMoney");
            return (Criteria) this;
        }

        public Criteria andCmFcMoneyLessThan(Double value) {
            addCriterion("cm_fc_money <", value, "cmFcMoney");
            return (Criteria) this;
        }

        public Criteria andCmFcMoneyLessThanOrEqualTo(Double value) {
            addCriterion("cm_fc_money <=", value, "cmFcMoney");
            return (Criteria) this;
        }

        public Criteria andCmFcMoneyIn(List<Double> values) {
            addCriterion("cm_fc_money in", values, "cmFcMoney");
            return (Criteria) this;
        }

        public Criteria andCmFcMoneyNotIn(List<Double> values) {
            addCriterion("cm_fc_money not in", values, "cmFcMoney");
            return (Criteria) this;
        }

        public Criteria andCmFcMoneyBetween(Double value1, Double value2) {
            addCriterion("cm_fc_money between", value1, value2, "cmFcMoney");
            return (Criteria) this;
        }

        public Criteria andCmFcMoneyNotBetween(Double value1, Double value2) {
            addCriterion("cm_fc_money not between", value1, value2, "cmFcMoney");
            return (Criteria) this;
        }

        public Criteria andCmYhqTypeIsNull() {
            addCriterion("cm_yhq_type is null");
            return (Criteria) this;
        }

        public Criteria andCmYhqTypeIsNotNull() {
            addCriterion("cm_yhq_type is not null");
            return (Criteria) this;
        }

        public Criteria andCmYhqTypeEqualTo(String value) {
            addCriterion("cm_yhq_type =", value, "cmYhqType");
            return (Criteria) this;
        }

        public Criteria andCmYhqTypeNotEqualTo(String value) {
            addCriterion("cm_yhq_type <>", value, "cmYhqType");
            return (Criteria) this;
        }

        public Criteria andCmYhqTypeGreaterThan(String value) {
            addCriterion("cm_yhq_type >", value, "cmYhqType");
            return (Criteria) this;
        }

        public Criteria andCmYhqTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cm_yhq_type >=", value, "cmYhqType");
            return (Criteria) this;
        }

        public Criteria andCmYhqTypeLessThan(String value) {
            addCriterion("cm_yhq_type <", value, "cmYhqType");
            return (Criteria) this;
        }

        public Criteria andCmYhqTypeLessThanOrEqualTo(String value) {
            addCriterion("cm_yhq_type <=", value, "cmYhqType");
            return (Criteria) this;
        }

        public Criteria andCmYhqTypeLike(String value) {
            addCriterion("cm_yhq_type like", value, "cmYhqType");
            return (Criteria) this;
        }

        public Criteria andCmYhqTypeNotLike(String value) {
            addCriterion("cm_yhq_type not like", value, "cmYhqType");
            return (Criteria) this;
        }

        public Criteria andCmYhqTypeIn(List<String> values) {
            addCriterion("cm_yhq_type in", values, "cmYhqType");
            return (Criteria) this;
        }

        public Criteria andCmYhqTypeNotIn(List<String> values) {
            addCriterion("cm_yhq_type not in", values, "cmYhqType");
            return (Criteria) this;
        }

        public Criteria andCmYhqTypeBetween(String value1, String value2) {
            addCriterion("cm_yhq_type between", value1, value2, "cmYhqType");
            return (Criteria) this;
        }

        public Criteria andCmYhqTypeNotBetween(String value1, String value2) {
            addCriterion("cm_yhq_type not between", value1, value2, "cmYhqType");
            return (Criteria) this;
        }

        public Criteria andCmShopIdIsNull() {
            addCriterion("cm_shop_id is null");
            return (Criteria) this;
        }

        public Criteria andCmShopIdIsNotNull() {
            addCriterion("cm_shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmShopIdEqualTo(Integer value) {
            addCriterion("cm_shop_id =", value, "cmShopId");
            return (Criteria) this;
        }

        public Criteria andCmShopIdNotEqualTo(Integer value) {
            addCriterion("cm_shop_id <>", value, "cmShopId");
            return (Criteria) this;
        }

        public Criteria andCmShopIdGreaterThan(Integer value) {
            addCriterion("cm_shop_id >", value, "cmShopId");
            return (Criteria) this;
        }

        public Criteria andCmShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_shop_id >=", value, "cmShopId");
            return (Criteria) this;
        }

        public Criteria andCmShopIdLessThan(Integer value) {
            addCriterion("cm_shop_id <", value, "cmShopId");
            return (Criteria) this;
        }

        public Criteria andCmShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("cm_shop_id <=", value, "cmShopId");
            return (Criteria) this;
        }

        public Criteria andCmShopIdIn(List<Integer> values) {
            addCriterion("cm_shop_id in", values, "cmShopId");
            return (Criteria) this;
        }

        public Criteria andCmShopIdNotIn(List<Integer> values) {
            addCriterion("cm_shop_id not in", values, "cmShopId");
            return (Criteria) this;
        }

        public Criteria andCmShopIdBetween(Integer value1, Integer value2) {
            addCriterion("cm_shop_id between", value1, value2, "cmShopId");
            return (Criteria) this;
        }

        public Criteria andCmShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_shop_id not between", value1, value2, "cmShopId");
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