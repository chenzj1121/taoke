package com.luoshi.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbBackgroundDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBackgroundDetailsExample() {
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andClickTimeIsNull() {
            addCriterion("click_time is null");
            return (Criteria) this;
        }

        public Criteria andClickTimeIsNotNull() {
            addCriterion("click_time is not null");
            return (Criteria) this;
        }

        public Criteria andClickTimeEqualTo(Date value) {
            addCriterion("click_time =", value, "clickTime");
            return (Criteria) this;
        }

        public Criteria andClickTimeNotEqualTo(Date value) {
            addCriterion("click_time <>", value, "clickTime");
            return (Criteria) this;
        }

        public Criteria andClickTimeGreaterThan(Date value) {
            addCriterion("click_time >", value, "clickTime");
            return (Criteria) this;
        }

        public Criteria andClickTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("click_time >=", value, "clickTime");
            return (Criteria) this;
        }

        public Criteria andClickTimeLessThan(Date value) {
            addCriterion("click_time <", value, "clickTime");
            return (Criteria) this;
        }

        public Criteria andClickTimeLessThanOrEqualTo(Date value) {
            addCriterion("click_time <=", value, "clickTime");
            return (Criteria) this;
        }

        public Criteria andClickTimeIn(List<Date> values) {
            addCriterion("click_time in", values, "clickTime");
            return (Criteria) this;
        }

        public Criteria andClickTimeNotIn(List<Date> values) {
            addCriterion("click_time not in", values, "clickTime");
            return (Criteria) this;
        }

        public Criteria andClickTimeBetween(Date value1, Date value2) {
            addCriterion("click_time between", value1, value2, "clickTime");
            return (Criteria) this;
        }

        public Criteria andClickTimeNotBetween(Date value1, Date value2) {
            addCriterion("click_time not between", value1, value2, "clickTime");
            return (Criteria) this;
        }

        public Criteria andShopMessageIsNull() {
            addCriterion("shop_message is null");
            return (Criteria) this;
        }

        public Criteria andShopMessageIsNotNull() {
            addCriterion("shop_message is not null");
            return (Criteria) this;
        }

        public Criteria andShopMessageEqualTo(String value) {
            addCriterion("shop_message =", value, "shopMessage");
            return (Criteria) this;
        }

        public Criteria andShopMessageNotEqualTo(String value) {
            addCriterion("shop_message <>", value, "shopMessage");
            return (Criteria) this;
        }

        public Criteria andShopMessageGreaterThan(String value) {
            addCriterion("shop_message >", value, "shopMessage");
            return (Criteria) this;
        }

        public Criteria andShopMessageGreaterThanOrEqualTo(String value) {
            addCriterion("shop_message >=", value, "shopMessage");
            return (Criteria) this;
        }

        public Criteria andShopMessageLessThan(String value) {
            addCriterion("shop_message <", value, "shopMessage");
            return (Criteria) this;
        }

        public Criteria andShopMessageLessThanOrEqualTo(String value) {
            addCriterion("shop_message <=", value, "shopMessage");
            return (Criteria) this;
        }

        public Criteria andShopMessageLike(String value) {
            addCriterion("shop_message like", value, "shopMessage");
            return (Criteria) this;
        }

        public Criteria andShopMessageNotLike(String value) {
            addCriterion("shop_message not like", value, "shopMessage");
            return (Criteria) this;
        }

        public Criteria andShopMessageIn(List<String> values) {
            addCriterion("shop_message in", values, "shopMessage");
            return (Criteria) this;
        }

        public Criteria andShopMessageNotIn(List<String> values) {
            addCriterion("shop_message not in", values, "shopMessage");
            return (Criteria) this;
        }

        public Criteria andShopMessageBetween(String value1, String value2) {
            addCriterion("shop_message between", value1, value2, "shopMessage");
            return (Criteria) this;
        }

        public Criteria andShopMessageNotBetween(String value1, String value2) {
            addCriterion("shop_message not between", value1, value2, "shopMessage");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andUseIdIsNull() {
            addCriterion("use_id is null");
            return (Criteria) this;
        }

        public Criteria andUseIdIsNotNull() {
            addCriterion("use_id is not null");
            return (Criteria) this;
        }

        public Criteria andUseIdEqualTo(Integer value) {
            addCriterion("use_id =", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdNotEqualTo(Integer value) {
            addCriterion("use_id <>", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdGreaterThan(Integer value) {
            addCriterion("use_id >", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_id >=", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdLessThan(Integer value) {
            addCriterion("use_id <", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdLessThanOrEqualTo(Integer value) {
            addCriterion("use_id <=", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdIn(List<Integer> values) {
            addCriterion("use_id in", values, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdNotIn(List<Integer> values) {
            addCriterion("use_id not in", values, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdBetween(Integer value1, Integer value2) {
            addCriterion("use_id between", value1, value2, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("use_id not between", value1, value2, "useId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Integer value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Integer value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Integer value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Integer value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Integer> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Integer> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Integer value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Integer value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Integer value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Integer value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Integer> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Integer> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andAliwangwangIsNull() {
            addCriterion("aliwangwang is null");
            return (Criteria) this;
        }

        public Criteria andAliwangwangIsNotNull() {
            addCriterion("aliwangwang is not null");
            return (Criteria) this;
        }

        public Criteria andAliwangwangEqualTo(String value) {
            addCriterion("aliwangwang =", value, "aliwangwang");
            return (Criteria) this;
        }

        public Criteria andAliwangwangNotEqualTo(String value) {
            addCriterion("aliwangwang <>", value, "aliwangwang");
            return (Criteria) this;
        }

        public Criteria andAliwangwangGreaterThan(String value) {
            addCriterion("aliwangwang >", value, "aliwangwang");
            return (Criteria) this;
        }

        public Criteria andAliwangwangGreaterThanOrEqualTo(String value) {
            addCriterion("aliwangwang >=", value, "aliwangwang");
            return (Criteria) this;
        }

        public Criteria andAliwangwangLessThan(String value) {
            addCriterion("aliwangwang <", value, "aliwangwang");
            return (Criteria) this;
        }

        public Criteria andAliwangwangLessThanOrEqualTo(String value) {
            addCriterion("aliwangwang <=", value, "aliwangwang");
            return (Criteria) this;
        }

        public Criteria andAliwangwangLike(String value) {
            addCriterion("aliwangwang like", value, "aliwangwang");
            return (Criteria) this;
        }

        public Criteria andAliwangwangNotLike(String value) {
            addCriterion("aliwangwang not like", value, "aliwangwang");
            return (Criteria) this;
        }

        public Criteria andAliwangwangIn(List<String> values) {
            addCriterion("aliwangwang in", values, "aliwangwang");
            return (Criteria) this;
        }

        public Criteria andAliwangwangNotIn(List<String> values) {
            addCriterion("aliwangwang not in", values, "aliwangwang");
            return (Criteria) this;
        }

        public Criteria andAliwangwangBetween(String value1, String value2) {
            addCriterion("aliwangwang between", value1, value2, "aliwangwang");
            return (Criteria) this;
        }

        public Criteria andAliwangwangNotBetween(String value1, String value2) {
            addCriterion("aliwangwang not between", value1, value2, "aliwangwang");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andGoodsCountsIsNull() {
            addCriterion("goods_counts is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountsIsNotNull() {
            addCriterion("goods_counts is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountsEqualTo(Integer value) {
            addCriterion("goods_counts =", value, "goodsCounts");
            return (Criteria) this;
        }

        public Criteria andGoodsCountsNotEqualTo(Integer value) {
            addCriterion("goods_counts <>", value, "goodsCounts");
            return (Criteria) this;
        }

        public Criteria andGoodsCountsGreaterThan(Integer value) {
            addCriterion("goods_counts >", value, "goodsCounts");
            return (Criteria) this;
        }

        public Criteria andGoodsCountsGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_counts >=", value, "goodsCounts");
            return (Criteria) this;
        }

        public Criteria andGoodsCountsLessThan(Integer value) {
            addCriterion("goods_counts <", value, "goodsCounts");
            return (Criteria) this;
        }

        public Criteria andGoodsCountsLessThanOrEqualTo(Integer value) {
            addCriterion("goods_counts <=", value, "goodsCounts");
            return (Criteria) this;
        }

        public Criteria andGoodsCountsIn(List<Integer> values) {
            addCriterion("goods_counts in", values, "goodsCounts");
            return (Criteria) this;
        }

        public Criteria andGoodsCountsNotIn(List<Integer> values) {
            addCriterion("goods_counts not in", values, "goodsCounts");
            return (Criteria) this;
        }

        public Criteria andGoodsCountsBetween(Integer value1, Integer value2) {
            addCriterion("goods_counts between", value1, value2, "goodsCounts");
            return (Criteria) this;
        }

        public Criteria andGoodsCountsNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_counts not between", value1, value2, "goodsCounts");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(Double value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(Double value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(Double value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(Double value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(Double value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<Double> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<Double> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(Double value1, Double value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(Double value1, Double value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeIsNull() {
            addCriterion("orders_type is null");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeIsNotNull() {
            addCriterion("orders_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeEqualTo(Integer value) {
            addCriterion("orders_type =", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeNotEqualTo(Integer value) {
            addCriterion("orders_type <>", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeGreaterThan(Integer value) {
            addCriterion("orders_type >", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_type >=", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeLessThan(Integer value) {
            addCriterion("orders_type <", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeLessThanOrEqualTo(Integer value) {
            addCriterion("orders_type <=", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeIn(List<Integer> values) {
            addCriterion("orders_type in", values, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeNotIn(List<Integer> values) {
            addCriterion("orders_type not in", values, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeBetween(Integer value1, Integer value2) {
            addCriterion("orders_type between", value1, value2, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_type not between", value1, value2, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersFlIsNull() {
            addCriterion("orders_fl is null");
            return (Criteria) this;
        }

        public Criteria andOrdersFlIsNotNull() {
            addCriterion("orders_fl is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersFlEqualTo(Double value) {
            addCriterion("orders_fl =", value, "ordersFl");
            return (Criteria) this;
        }

        public Criteria andOrdersFlNotEqualTo(Double value) {
            addCriterion("orders_fl <>", value, "ordersFl");
            return (Criteria) this;
        }

        public Criteria andOrdersFlGreaterThan(Double value) {
            addCriterion("orders_fl >", value, "ordersFl");
            return (Criteria) this;
        }

        public Criteria andOrdersFlGreaterThanOrEqualTo(Double value) {
            addCriterion("orders_fl >=", value, "ordersFl");
            return (Criteria) this;
        }

        public Criteria andOrdersFlLessThan(Double value) {
            addCriterion("orders_fl <", value, "ordersFl");
            return (Criteria) this;
        }

        public Criteria andOrdersFlLessThanOrEqualTo(Double value) {
            addCriterion("orders_fl <=", value, "ordersFl");
            return (Criteria) this;
        }

        public Criteria andOrdersFlIn(List<Double> values) {
            addCriterion("orders_fl in", values, "ordersFl");
            return (Criteria) this;
        }

        public Criteria andOrdersFlNotIn(List<Double> values) {
            addCriterion("orders_fl not in", values, "ordersFl");
            return (Criteria) this;
        }

        public Criteria andOrdersFlBetween(Double value1, Double value2) {
            addCriterion("orders_fl between", value1, value2, "ordersFl");
            return (Criteria) this;
        }

        public Criteria andOrdersFlNotBetween(Double value1, Double value2) {
            addCriterion("orders_fl not between", value1, value2, "ordersFl");
            return (Criteria) this;
        }

        public Criteria andPayIsNull() {
            addCriterion("pay is null");
            return (Criteria) this;
        }

        public Criteria andPayIsNotNull() {
            addCriterion("pay is not null");
            return (Criteria) this;
        }

        public Criteria andPayEqualTo(Double value) {
            addCriterion("pay =", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotEqualTo(Double value) {
            addCriterion("pay <>", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThan(Double value) {
            addCriterion("pay >", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThanOrEqualTo(Double value) {
            addCriterion("pay >=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThan(Double value) {
            addCriterion("pay <", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThanOrEqualTo(Double value) {
            addCriterion("pay <=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayIn(List<Double> values) {
            addCriterion("pay in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotIn(List<Double> values) {
            addCriterion("pay not in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayBetween(Double value1, Double value2) {
            addCriterion("pay between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotBetween(Double value1, Double value2) {
            addCriterion("pay not between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andPayAboutIsNull() {
            addCriterion("pay_about is null");
            return (Criteria) this;
        }

        public Criteria andPayAboutIsNotNull() {
            addCriterion("pay_about is not null");
            return (Criteria) this;
        }

        public Criteria andPayAboutEqualTo(Double value) {
            addCriterion("pay_about =", value, "payAbout");
            return (Criteria) this;
        }

        public Criteria andPayAboutNotEqualTo(Double value) {
            addCriterion("pay_about <>", value, "payAbout");
            return (Criteria) this;
        }

        public Criteria andPayAboutGreaterThan(Double value) {
            addCriterion("pay_about >", value, "payAbout");
            return (Criteria) this;
        }

        public Criteria andPayAboutGreaterThanOrEqualTo(Double value) {
            addCriterion("pay_about >=", value, "payAbout");
            return (Criteria) this;
        }

        public Criteria andPayAboutLessThan(Double value) {
            addCriterion("pay_about <", value, "payAbout");
            return (Criteria) this;
        }

        public Criteria andPayAboutLessThanOrEqualTo(Double value) {
            addCriterion("pay_about <=", value, "payAbout");
            return (Criteria) this;
        }

        public Criteria andPayAboutIn(List<Double> values) {
            addCriterion("pay_about in", values, "payAbout");
            return (Criteria) this;
        }

        public Criteria andPayAboutNotIn(List<Double> values) {
            addCriterion("pay_about not in", values, "payAbout");
            return (Criteria) this;
        }

        public Criteria andPayAboutBetween(Double value1, Double value2) {
            addCriterion("pay_about between", value1, value2, "payAbout");
            return (Criteria) this;
        }

        public Criteria andPayAboutNotBetween(Double value1, Double value2) {
            addCriterion("pay_about not between", value1, value2, "payAbout");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIsNull() {
            addCriterion("pay_money is null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIsNotNull() {
            addCriterion("pay_money is not null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyEqualTo(Double value) {
            addCriterion("pay_money =", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotEqualTo(Double value) {
            addCriterion("pay_money <>", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyGreaterThan(Double value) {
            addCriterion("pay_money >", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("pay_money >=", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLessThan(Double value) {
            addCriterion("pay_money <", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLessThanOrEqualTo(Double value) {
            addCriterion("pay_money <=", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIn(List<Double> values) {
            addCriterion("pay_money in", values, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotIn(List<Double> values) {
            addCriterion("pay_money not in", values, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyBetween(Double value1, Double value2) {
            addCriterion("pay_money between", value1, value2, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotBetween(Double value1, Double value2) {
            addCriterion("pay_money not between", value1, value2, "payMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyAboutIsNull() {
            addCriterion("money_about is null");
            return (Criteria) this;
        }

        public Criteria andMoneyAboutIsNotNull() {
            addCriterion("money_about is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyAboutEqualTo(Double value) {
            addCriterion("money_about =", value, "moneyAbout");
            return (Criteria) this;
        }

        public Criteria andMoneyAboutNotEqualTo(Double value) {
            addCriterion("money_about <>", value, "moneyAbout");
            return (Criteria) this;
        }

        public Criteria andMoneyAboutGreaterThan(Double value) {
            addCriterion("money_about >", value, "moneyAbout");
            return (Criteria) this;
        }

        public Criteria andMoneyAboutGreaterThanOrEqualTo(Double value) {
            addCriterion("money_about >=", value, "moneyAbout");
            return (Criteria) this;
        }

        public Criteria andMoneyAboutLessThan(Double value) {
            addCriterion("money_about <", value, "moneyAbout");
            return (Criteria) this;
        }

        public Criteria andMoneyAboutLessThanOrEqualTo(Double value) {
            addCriterion("money_about <=", value, "moneyAbout");
            return (Criteria) this;
        }

        public Criteria andMoneyAboutIn(List<Double> values) {
            addCriterion("money_about in", values, "moneyAbout");
            return (Criteria) this;
        }

        public Criteria andMoneyAboutNotIn(List<Double> values) {
            addCriterion("money_about not in", values, "moneyAbout");
            return (Criteria) this;
        }

        public Criteria andMoneyAboutBetween(Double value1, Double value2) {
            addCriterion("money_about between", value1, value2, "moneyAbout");
            return (Criteria) this;
        }

        public Criteria andMoneyAboutNotBetween(Double value1, Double value2) {
            addCriterion("money_about not between", value1, value2, "moneyAbout");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andGdIdIsNull() {
            addCriterion("gd_id is null");
            return (Criteria) this;
        }

        public Criteria andGdIdIsNotNull() {
            addCriterion("gd_id is not null");
            return (Criteria) this;
        }

        public Criteria andGdIdEqualTo(Long value) {
            addCriterion("gd_id =", value, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdNotEqualTo(Long value) {
            addCriterion("gd_id <>", value, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdGreaterThan(Long value) {
            addCriterion("gd_id >", value, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("gd_id >=", value, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdLessThan(Long value) {
            addCriterion("gd_id <", value, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdLessThanOrEqualTo(Long value) {
            addCriterion("gd_id <=", value, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdIn(List<Long> values) {
            addCriterion("gd_id in", values, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdNotIn(List<Long> values) {
            addCriterion("gd_id not in", values, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdBetween(Long value1, Long value2) {
            addCriterion("gd_id between", value1, value2, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdNotBetween(Long value1, Long value2) {
            addCriterion("gd_id not between", value1, value2, "gdId");
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