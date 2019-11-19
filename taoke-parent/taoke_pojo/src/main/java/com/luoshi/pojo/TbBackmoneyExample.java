package com.luoshi.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbBackmoneyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBackmoneyExample() {
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

        public Criteria andBmIdIsNull() {
            addCriterion("bm_id is null");
            return (Criteria) this;
        }

        public Criteria andBmIdIsNotNull() {
            addCriterion("bm_id is not null");
            return (Criteria) this;
        }

        public Criteria andBmIdEqualTo(Integer value) {
            addCriterion("bm_id =", value, "bmId");
            return (Criteria) this;
        }

        public Criteria andBmIdNotEqualTo(Integer value) {
            addCriterion("bm_id <>", value, "bmId");
            return (Criteria) this;
        }

        public Criteria andBmIdGreaterThan(Integer value) {
            addCriterion("bm_id >", value, "bmId");
            return (Criteria) this;
        }

        public Criteria andBmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bm_id >=", value, "bmId");
            return (Criteria) this;
        }

        public Criteria andBmIdLessThan(Integer value) {
            addCriterion("bm_id <", value, "bmId");
            return (Criteria) this;
        }

        public Criteria andBmIdLessThanOrEqualTo(Integer value) {
            addCriterion("bm_id <=", value, "bmId");
            return (Criteria) this;
        }

        public Criteria andBmIdIn(List<Integer> values) {
            addCriterion("bm_id in", values, "bmId");
            return (Criteria) this;
        }

        public Criteria andBmIdNotIn(List<Integer> values) {
            addCriterion("bm_id not in", values, "bmId");
            return (Criteria) this;
        }

        public Criteria andBmIdBetween(Integer value1, Integer value2) {
            addCriterion("bm_id between", value1, value2, "bmId");
            return (Criteria) this;
        }

        public Criteria andBmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bm_id not between", value1, value2, "bmId");
            return (Criteria) this;
        }

        public Criteria andBmDeptIdIsNull() {
            addCriterion("bm_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andBmDeptIdIsNotNull() {
            addCriterion("bm_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andBmDeptIdEqualTo(Integer value) {
            addCriterion("bm_dept_id =", value, "bmDeptId");
            return (Criteria) this;
        }

        public Criteria andBmDeptIdNotEqualTo(Integer value) {
            addCriterion("bm_dept_id <>", value, "bmDeptId");
            return (Criteria) this;
        }

        public Criteria andBmDeptIdGreaterThan(Integer value) {
            addCriterion("bm_dept_id >", value, "bmDeptId");
            return (Criteria) this;
        }

        public Criteria andBmDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bm_dept_id >=", value, "bmDeptId");
            return (Criteria) this;
        }

        public Criteria andBmDeptIdLessThan(Integer value) {
            addCriterion("bm_dept_id <", value, "bmDeptId");
            return (Criteria) this;
        }

        public Criteria andBmDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("bm_dept_id <=", value, "bmDeptId");
            return (Criteria) this;
        }

        public Criteria andBmDeptIdIn(List<Integer> values) {
            addCriterion("bm_dept_id in", values, "bmDeptId");
            return (Criteria) this;
        }

        public Criteria andBmDeptIdNotIn(List<Integer> values) {
            addCriterion("bm_dept_id not in", values, "bmDeptId");
            return (Criteria) this;
        }

        public Criteria andBmDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("bm_dept_id between", value1, value2, "bmDeptId");
            return (Criteria) this;
        }

        public Criteria andBmDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bm_dept_id not between", value1, value2, "bmDeptId");
            return (Criteria) this;
        }

        public Criteria andBmGroupIdIsNull() {
            addCriterion("bm_group_id is null");
            return (Criteria) this;
        }

        public Criteria andBmGroupIdIsNotNull() {
            addCriterion("bm_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andBmGroupIdEqualTo(Integer value) {
            addCriterion("bm_group_id =", value, "bmGroupId");
            return (Criteria) this;
        }

        public Criteria andBmGroupIdNotEqualTo(Integer value) {
            addCriterion("bm_group_id <>", value, "bmGroupId");
            return (Criteria) this;
        }

        public Criteria andBmGroupIdGreaterThan(Integer value) {
            addCriterion("bm_group_id >", value, "bmGroupId");
            return (Criteria) this;
        }

        public Criteria andBmGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bm_group_id >=", value, "bmGroupId");
            return (Criteria) this;
        }

        public Criteria andBmGroupIdLessThan(Integer value) {
            addCriterion("bm_group_id <", value, "bmGroupId");
            return (Criteria) this;
        }

        public Criteria andBmGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("bm_group_id <=", value, "bmGroupId");
            return (Criteria) this;
        }

        public Criteria andBmGroupIdIn(List<Integer> values) {
            addCriterion("bm_group_id in", values, "bmGroupId");
            return (Criteria) this;
        }

        public Criteria andBmGroupIdNotIn(List<Integer> values) {
            addCriterion("bm_group_id not in", values, "bmGroupId");
            return (Criteria) this;
        }

        public Criteria andBmGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("bm_group_id between", value1, value2, "bmGroupId");
            return (Criteria) this;
        }

        public Criteria andBmGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bm_group_id not between", value1, value2, "bmGroupId");
            return (Criteria) this;
        }

        public Criteria andBmUserIdIsNull() {
            addCriterion("bm_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBmUserIdIsNotNull() {
            addCriterion("bm_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBmUserIdEqualTo(Integer value) {
            addCriterion("bm_user_id =", value, "bmUserId");
            return (Criteria) this;
        }

        public Criteria andBmUserIdNotEqualTo(Integer value) {
            addCriterion("bm_user_id <>", value, "bmUserId");
            return (Criteria) this;
        }

        public Criteria andBmUserIdGreaterThan(Integer value) {
            addCriterion("bm_user_id >", value, "bmUserId");
            return (Criteria) this;
        }

        public Criteria andBmUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bm_user_id >=", value, "bmUserId");
            return (Criteria) this;
        }

        public Criteria andBmUserIdLessThan(Integer value) {
            addCriterion("bm_user_id <", value, "bmUserId");
            return (Criteria) this;
        }

        public Criteria andBmUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("bm_user_id <=", value, "bmUserId");
            return (Criteria) this;
        }

        public Criteria andBmUserIdIn(List<Integer> values) {
            addCriterion("bm_user_id in", values, "bmUserId");
            return (Criteria) this;
        }

        public Criteria andBmUserIdNotIn(List<Integer> values) {
            addCriterion("bm_user_id not in", values, "bmUserId");
            return (Criteria) this;
        }

        public Criteria andBmUserIdBetween(Integer value1, Integer value2) {
            addCriterion("bm_user_id between", value1, value2, "bmUserId");
            return (Criteria) this;
        }

        public Criteria andBmUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bm_user_id not between", value1, value2, "bmUserId");
            return (Criteria) this;
        }

        public Criteria andBmShopNameIsNull() {
            addCriterion("bm_shop_name is null");
            return (Criteria) this;
        }

        public Criteria andBmShopNameIsNotNull() {
            addCriterion("bm_shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andBmShopNameEqualTo(String value) {
            addCriterion("bm_shop_name =", value, "bmShopName");
            return (Criteria) this;
        }

        public Criteria andBmShopNameNotEqualTo(String value) {
            addCriterion("bm_shop_name <>", value, "bmShopName");
            return (Criteria) this;
        }

        public Criteria andBmShopNameGreaterThan(String value) {
            addCriterion("bm_shop_name >", value, "bmShopName");
            return (Criteria) this;
        }

        public Criteria andBmShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("bm_shop_name >=", value, "bmShopName");
            return (Criteria) this;
        }

        public Criteria andBmShopNameLessThan(String value) {
            addCriterion("bm_shop_name <", value, "bmShopName");
            return (Criteria) this;
        }

        public Criteria andBmShopNameLessThanOrEqualTo(String value) {
            addCriterion("bm_shop_name <=", value, "bmShopName");
            return (Criteria) this;
        }

        public Criteria andBmShopNameLike(String value) {
            addCriterion("bm_shop_name like", value, "bmShopName");
            return (Criteria) this;
        }

        public Criteria andBmShopNameNotLike(String value) {
            addCriterion("bm_shop_name not like", value, "bmShopName");
            return (Criteria) this;
        }

        public Criteria andBmShopNameIn(List<String> values) {
            addCriterion("bm_shop_name in", values, "bmShopName");
            return (Criteria) this;
        }

        public Criteria andBmShopNameNotIn(List<String> values) {
            addCriterion("bm_shop_name not in", values, "bmShopName");
            return (Criteria) this;
        }

        public Criteria andBmShopNameBetween(String value1, String value2) {
            addCriterion("bm_shop_name between", value1, value2, "bmShopName");
            return (Criteria) this;
        }

        public Criteria andBmShopNameNotBetween(String value1, String value2) {
            addCriterion("bm_shop_name not between", value1, value2, "bmShopName");
            return (Criteria) this;
        }

        public Criteria andBmGoodsIdIsNull() {
            addCriterion("bm_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andBmGoodsIdIsNotNull() {
            addCriterion("bm_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andBmGoodsIdEqualTo(Integer value) {
            addCriterion("bm_goods_id =", value, "bmGoodsId");
            return (Criteria) this;
        }

        public Criteria andBmGoodsIdNotEqualTo(Integer value) {
            addCriterion("bm_goods_id <>", value, "bmGoodsId");
            return (Criteria) this;
        }

        public Criteria andBmGoodsIdGreaterThan(Integer value) {
            addCriterion("bm_goods_id >", value, "bmGoodsId");
            return (Criteria) this;
        }

        public Criteria andBmGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bm_goods_id >=", value, "bmGoodsId");
            return (Criteria) this;
        }

        public Criteria andBmGoodsIdLessThan(Integer value) {
            addCriterion("bm_goods_id <", value, "bmGoodsId");
            return (Criteria) this;
        }

        public Criteria andBmGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("bm_goods_id <=", value, "bmGoodsId");
            return (Criteria) this;
        }

        public Criteria andBmGoodsIdIn(List<Integer> values) {
            addCriterion("bm_goods_id in", values, "bmGoodsId");
            return (Criteria) this;
        }

        public Criteria andBmGoodsIdNotIn(List<Integer> values) {
            addCriterion("bm_goods_id not in", values, "bmGoodsId");
            return (Criteria) this;
        }

        public Criteria andBmGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("bm_goods_id between", value1, value2, "bmGoodsId");
            return (Criteria) this;
        }

        public Criteria andBmGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bm_goods_id not between", value1, value2, "bmGoodsId");
            return (Criteria) this;
        }

        public Criteria andBmYhqNameIsNull() {
            addCriterion("bm_yhq_name is null");
            return (Criteria) this;
        }

        public Criteria andBmYhqNameIsNotNull() {
            addCriterion("bm_yhq_name is not null");
            return (Criteria) this;
        }

        public Criteria andBmYhqNameEqualTo(String value) {
            addCriterion("bm_yhq_name =", value, "bmYhqName");
            return (Criteria) this;
        }

        public Criteria andBmYhqNameNotEqualTo(String value) {
            addCriterion("bm_yhq_name <>", value, "bmYhqName");
            return (Criteria) this;
        }

        public Criteria andBmYhqNameGreaterThan(String value) {
            addCriterion("bm_yhq_name >", value, "bmYhqName");
            return (Criteria) this;
        }

        public Criteria andBmYhqNameGreaterThanOrEqualTo(String value) {
            addCriterion("bm_yhq_name >=", value, "bmYhqName");
            return (Criteria) this;
        }

        public Criteria andBmYhqNameLessThan(String value) {
            addCriterion("bm_yhq_name <", value, "bmYhqName");
            return (Criteria) this;
        }

        public Criteria andBmYhqNameLessThanOrEqualTo(String value) {
            addCriterion("bm_yhq_name <=", value, "bmYhqName");
            return (Criteria) this;
        }

        public Criteria andBmYhqNameLike(String value) {
            addCriterion("bm_yhq_name like", value, "bmYhqName");
            return (Criteria) this;
        }

        public Criteria andBmYhqNameNotLike(String value) {
            addCriterion("bm_yhq_name not like", value, "bmYhqName");
            return (Criteria) this;
        }

        public Criteria andBmYhqNameIn(List<String> values) {
            addCriterion("bm_yhq_name in", values, "bmYhqName");
            return (Criteria) this;
        }

        public Criteria andBmYhqNameNotIn(List<String> values) {
            addCriterion("bm_yhq_name not in", values, "bmYhqName");
            return (Criteria) this;
        }

        public Criteria andBmYhqNameBetween(String value1, String value2) {
            addCriterion("bm_yhq_name between", value1, value2, "bmYhqName");
            return (Criteria) this;
        }

        public Criteria andBmYhqNameNotBetween(String value1, String value2) {
            addCriterion("bm_yhq_name not between", value1, value2, "bmYhqName");
            return (Criteria) this;
        }

        public Criteria andBmOnlineTimeIsNull() {
            addCriterion("bm_online_time is null");
            return (Criteria) this;
        }

        public Criteria andBmOnlineTimeIsNotNull() {
            addCriterion("bm_online_time is not null");
            return (Criteria) this;
        }

        public Criteria andBmOnlineTimeEqualTo(Date value) {
            addCriterion("bm_online_time =", value, "bmOnlineTime");
            return (Criteria) this;
        }

        public Criteria andBmOnlineTimeNotEqualTo(Date value) {
            addCriterion("bm_online_time <>", value, "bmOnlineTime");
            return (Criteria) this;
        }

        public Criteria andBmOnlineTimeGreaterThan(Date value) {
            addCriterion("bm_online_time >", value, "bmOnlineTime");
            return (Criteria) this;
        }

        public Criteria andBmOnlineTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bm_online_time >=", value, "bmOnlineTime");
            return (Criteria) this;
        }

        public Criteria andBmOnlineTimeLessThan(Date value) {
            addCriterion("bm_online_time <", value, "bmOnlineTime");
            return (Criteria) this;
        }

        public Criteria andBmOnlineTimeLessThanOrEqualTo(Date value) {
            addCriterion("bm_online_time <=", value, "bmOnlineTime");
            return (Criteria) this;
        }

        public Criteria andBmOnlineTimeIn(List<Date> values) {
            addCriterion("bm_online_time in", values, "bmOnlineTime");
            return (Criteria) this;
        }

        public Criteria andBmOnlineTimeNotIn(List<Date> values) {
            addCriterion("bm_online_time not in", values, "bmOnlineTime");
            return (Criteria) this;
        }

        public Criteria andBmOnlineTimeBetween(Date value1, Date value2) {
            addCriterion("bm_online_time between", value1, value2, "bmOnlineTime");
            return (Criteria) this;
        }

        public Criteria andBmOnlineTimeNotBetween(Date value1, Date value2) {
            addCriterion("bm_online_time not between", value1, value2, "bmOnlineTime");
            return (Criteria) this;
        }

        public Criteria andBmOfflineTimeIsNull() {
            addCriterion("bm_offline_time is null");
            return (Criteria) this;
        }

        public Criteria andBmOfflineTimeIsNotNull() {
            addCriterion("bm_offline_time is not null");
            return (Criteria) this;
        }

        public Criteria andBmOfflineTimeEqualTo(Date value) {
            addCriterion("bm_offline_time =", value, "bmOfflineTime");
            return (Criteria) this;
        }

        public Criteria andBmOfflineTimeNotEqualTo(Date value) {
            addCriterion("bm_offline_time <>", value, "bmOfflineTime");
            return (Criteria) this;
        }

        public Criteria andBmOfflineTimeGreaterThan(Date value) {
            addCriterion("bm_offline_time >", value, "bmOfflineTime");
            return (Criteria) this;
        }

        public Criteria andBmOfflineTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bm_offline_time >=", value, "bmOfflineTime");
            return (Criteria) this;
        }

        public Criteria andBmOfflineTimeLessThan(Date value) {
            addCriterion("bm_offline_time <", value, "bmOfflineTime");
            return (Criteria) this;
        }

        public Criteria andBmOfflineTimeLessThanOrEqualTo(Date value) {
            addCriterion("bm_offline_time <=", value, "bmOfflineTime");
            return (Criteria) this;
        }

        public Criteria andBmOfflineTimeIn(List<Date> values) {
            addCriterion("bm_offline_time in", values, "bmOfflineTime");
            return (Criteria) this;
        }

        public Criteria andBmOfflineTimeNotIn(List<Date> values) {
            addCriterion("bm_offline_time not in", values, "bmOfflineTime");
            return (Criteria) this;
        }

        public Criteria andBmOfflineTimeBetween(Date value1, Date value2) {
            addCriterion("bm_offline_time between", value1, value2, "bmOfflineTime");
            return (Criteria) this;
        }

        public Criteria andBmOfflineTimeNotBetween(Date value1, Date value2) {
            addCriterion("bm_offline_time not between", value1, value2, "bmOfflineTime");
            return (Criteria) this;
        }

        public Criteria andBmTypeIsNull() {
            addCriterion("bm_type is null");
            return (Criteria) this;
        }

        public Criteria andBmTypeIsNotNull() {
            addCriterion("bm_type is not null");
            return (Criteria) this;
        }

        public Criteria andBmTypeEqualTo(String value) {
            addCriterion("bm_type =", value, "bmType");
            return (Criteria) this;
        }

        public Criteria andBmTypeNotEqualTo(String value) {
            addCriterion("bm_type <>", value, "bmType");
            return (Criteria) this;
        }

        public Criteria andBmTypeGreaterThan(String value) {
            addCriterion("bm_type >", value, "bmType");
            return (Criteria) this;
        }

        public Criteria andBmTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bm_type >=", value, "bmType");
            return (Criteria) this;
        }

        public Criteria andBmTypeLessThan(String value) {
            addCriterion("bm_type <", value, "bmType");
            return (Criteria) this;
        }

        public Criteria andBmTypeLessThanOrEqualTo(String value) {
            addCriterion("bm_type <=", value, "bmType");
            return (Criteria) this;
        }

        public Criteria andBmTypeLike(String value) {
            addCriterion("bm_type like", value, "bmType");
            return (Criteria) this;
        }

        public Criteria andBmTypeNotLike(String value) {
            addCriterion("bm_type not like", value, "bmType");
            return (Criteria) this;
        }

        public Criteria andBmTypeIn(List<String> values) {
            addCriterion("bm_type in", values, "bmType");
            return (Criteria) this;
        }

        public Criteria andBmTypeNotIn(List<String> values) {
            addCriterion("bm_type not in", values, "bmType");
            return (Criteria) this;
        }

        public Criteria andBmTypeBetween(String value1, String value2) {
            addCriterion("bm_type between", value1, value2, "bmType");
            return (Criteria) this;
        }

        public Criteria andBmTypeNotBetween(String value1, String value2) {
            addCriterion("bm_type not between", value1, value2, "bmType");
            return (Criteria) this;
        }

        public Criteria andBmMakeMoneyIsNull() {
            addCriterion("bm_make_money is null");
            return (Criteria) this;
        }

        public Criteria andBmMakeMoneyIsNotNull() {
            addCriterion("bm_make_money is not null");
            return (Criteria) this;
        }

        public Criteria andBmMakeMoneyEqualTo(Double value) {
            addCriterion("bm_make_money =", value, "bmMakeMoney");
            return (Criteria) this;
        }

        public Criteria andBmMakeMoneyNotEqualTo(Double value) {
            addCriterion("bm_make_money <>", value, "bmMakeMoney");
            return (Criteria) this;
        }

        public Criteria andBmMakeMoneyGreaterThan(Double value) {
            addCriterion("bm_make_money >", value, "bmMakeMoney");
            return (Criteria) this;
        }

        public Criteria andBmMakeMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("bm_make_money >=", value, "bmMakeMoney");
            return (Criteria) this;
        }

        public Criteria andBmMakeMoneyLessThan(Double value) {
            addCriterion("bm_make_money <", value, "bmMakeMoney");
            return (Criteria) this;
        }

        public Criteria andBmMakeMoneyLessThanOrEqualTo(Double value) {
            addCriterion("bm_make_money <=", value, "bmMakeMoney");
            return (Criteria) this;
        }

        public Criteria andBmMakeMoneyIn(List<Double> values) {
            addCriterion("bm_make_money in", values, "bmMakeMoney");
            return (Criteria) this;
        }

        public Criteria andBmMakeMoneyNotIn(List<Double> values) {
            addCriterion("bm_make_money not in", values, "bmMakeMoney");
            return (Criteria) this;
        }

        public Criteria andBmMakeMoneyBetween(Double value1, Double value2) {
            addCriterion("bm_make_money between", value1, value2, "bmMakeMoney");
            return (Criteria) this;
        }

        public Criteria andBmMakeMoneyNotBetween(Double value1, Double value2) {
            addCriterion("bm_make_money not between", value1, value2, "bmMakeMoney");
            return (Criteria) this;
        }

        public Criteria andBmBackMoneyIsNull() {
            addCriterion("bm_back_money is null");
            return (Criteria) this;
        }

        public Criteria andBmBackMoneyIsNotNull() {
            addCriterion("bm_back_money is not null");
            return (Criteria) this;
        }

        public Criteria andBmBackMoneyEqualTo(Double value) {
            addCriterion("bm_back_money =", value, "bmBackMoney");
            return (Criteria) this;
        }

        public Criteria andBmBackMoneyNotEqualTo(Double value) {
            addCriterion("bm_back_money <>", value, "bmBackMoney");
            return (Criteria) this;
        }

        public Criteria andBmBackMoneyGreaterThan(Double value) {
            addCriterion("bm_back_money >", value, "bmBackMoney");
            return (Criteria) this;
        }

        public Criteria andBmBackMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("bm_back_money >=", value, "bmBackMoney");
            return (Criteria) this;
        }

        public Criteria andBmBackMoneyLessThan(Double value) {
            addCriterion("bm_back_money <", value, "bmBackMoney");
            return (Criteria) this;
        }

        public Criteria andBmBackMoneyLessThanOrEqualTo(Double value) {
            addCriterion("bm_back_money <=", value, "bmBackMoney");
            return (Criteria) this;
        }

        public Criteria andBmBackMoneyIn(List<Double> values) {
            addCriterion("bm_back_money in", values, "bmBackMoney");
            return (Criteria) this;
        }

        public Criteria andBmBackMoneyNotIn(List<Double> values) {
            addCriterion("bm_back_money not in", values, "bmBackMoney");
            return (Criteria) this;
        }

        public Criteria andBmBackMoneyBetween(Double value1, Double value2) {
            addCriterion("bm_back_money between", value1, value2, "bmBackMoney");
            return (Criteria) this;
        }

        public Criteria andBmBackMoneyNotBetween(Double value1, Double value2) {
            addCriterion("bm_back_money not between", value1, value2, "bmBackMoney");
            return (Criteria) this;
        }

        public Criteria andBmSurplusIsNull() {
            addCriterion("bm_surplus is null");
            return (Criteria) this;
        }

        public Criteria andBmSurplusIsNotNull() {
            addCriterion("bm_surplus is not null");
            return (Criteria) this;
        }

        public Criteria andBmSurplusEqualTo(Double value) {
            addCriterion("bm_surplus =", value, "bmSurplus");
            return (Criteria) this;
        }

        public Criteria andBmSurplusNotEqualTo(Double value) {
            addCriterion("bm_surplus <>", value, "bmSurplus");
            return (Criteria) this;
        }

        public Criteria andBmSurplusGreaterThan(Double value) {
            addCriterion("bm_surplus >", value, "bmSurplus");
            return (Criteria) this;
        }

        public Criteria andBmSurplusGreaterThanOrEqualTo(Double value) {
            addCriterion("bm_surplus >=", value, "bmSurplus");
            return (Criteria) this;
        }

        public Criteria andBmSurplusLessThan(Double value) {
            addCriterion("bm_surplus <", value, "bmSurplus");
            return (Criteria) this;
        }

        public Criteria andBmSurplusLessThanOrEqualTo(Double value) {
            addCriterion("bm_surplus <=", value, "bmSurplus");
            return (Criteria) this;
        }

        public Criteria andBmSurplusIn(List<Double> values) {
            addCriterion("bm_surplus in", values, "bmSurplus");
            return (Criteria) this;
        }

        public Criteria andBmSurplusNotIn(List<Double> values) {
            addCriterion("bm_surplus not in", values, "bmSurplus");
            return (Criteria) this;
        }

        public Criteria andBmSurplusBetween(Double value1, Double value2) {
            addCriterion("bm_surplus between", value1, value2, "bmSurplus");
            return (Criteria) this;
        }

        public Criteria andBmSurplusNotBetween(Double value1, Double value2) {
            addCriterion("bm_surplus not between", value1, value2, "bmSurplus");
            return (Criteria) this;
        }

        public Criteria andBmMakeAccountIsNull() {
            addCriterion("bm_make_account is null");
            return (Criteria) this;
        }

        public Criteria andBmMakeAccountIsNotNull() {
            addCriterion("bm_make_account is not null");
            return (Criteria) this;
        }

        public Criteria andBmMakeAccountEqualTo(String value) {
            addCriterion("bm_make_account =", value, "bmMakeAccount");
            return (Criteria) this;
        }

        public Criteria andBmMakeAccountNotEqualTo(String value) {
            addCriterion("bm_make_account <>", value, "bmMakeAccount");
            return (Criteria) this;
        }

        public Criteria andBmMakeAccountGreaterThan(String value) {
            addCriterion("bm_make_account >", value, "bmMakeAccount");
            return (Criteria) this;
        }

        public Criteria andBmMakeAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bm_make_account >=", value, "bmMakeAccount");
            return (Criteria) this;
        }

        public Criteria andBmMakeAccountLessThan(String value) {
            addCriterion("bm_make_account <", value, "bmMakeAccount");
            return (Criteria) this;
        }

        public Criteria andBmMakeAccountLessThanOrEqualTo(String value) {
            addCriterion("bm_make_account <=", value, "bmMakeAccount");
            return (Criteria) this;
        }

        public Criteria andBmMakeAccountLike(String value) {
            addCriterion("bm_make_account like", value, "bmMakeAccount");
            return (Criteria) this;
        }

        public Criteria andBmMakeAccountNotLike(String value) {
            addCriterion("bm_make_account not like", value, "bmMakeAccount");
            return (Criteria) this;
        }

        public Criteria andBmMakeAccountIn(List<String> values) {
            addCriterion("bm_make_account in", values, "bmMakeAccount");
            return (Criteria) this;
        }

        public Criteria andBmMakeAccountNotIn(List<String> values) {
            addCriterion("bm_make_account not in", values, "bmMakeAccount");
            return (Criteria) this;
        }

        public Criteria andBmMakeAccountBetween(String value1, String value2) {
            addCriterion("bm_make_account between", value1, value2, "bmMakeAccount");
            return (Criteria) this;
        }

        public Criteria andBmMakeAccountNotBetween(String value1, String value2) {
            addCriterion("bm_make_account not between", value1, value2, "bmMakeAccount");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeIsNull() {
            addCriterion("bm_make_time is null");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeIsNotNull() {
            addCriterion("bm_make_time is not null");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeEqualTo(Date value) {
            addCriterion("bm_make_time =", value, "bmMakeTime");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeNotEqualTo(Date value) {
            addCriterion("bm_make_time <>", value, "bmMakeTime");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeGreaterThan(Date value) {
            addCriterion("bm_make_time >", value, "bmMakeTime");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bm_make_time >=", value, "bmMakeTime");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeLessThan(Date value) {
            addCriterion("bm_make_time <", value, "bmMakeTime");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeLessThanOrEqualTo(Date value) {
            addCriterion("bm_make_time <=", value, "bmMakeTime");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeIn(List<Date> values) {
            addCriterion("bm_make_time in", values, "bmMakeTime");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeNotIn(List<Date> values) {
            addCriterion("bm_make_time not in", values, "bmMakeTime");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeBetween(Date value1, Date value2) {
            addCriterion("bm_make_time between", value1, value2, "bmMakeTime");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeNotBetween(Date value1, Date value2) {
            addCriterion("bm_make_time not between", value1, value2, "bmMakeTime");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeIsNull() {
            addCriterion("bm_create_time is null");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeIsNotNull() {
            addCriterion("bm_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeEqualTo(Date value) {
            addCriterion("bm_create_time =", value, "bmCreateTime");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeNotEqualTo(Date value) {
            addCriterion("bm_create_time <>", value, "bmCreateTime");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeGreaterThan(Date value) {
            addCriterion("bm_create_time >", value, "bmCreateTime");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bm_create_time >=", value, "bmCreateTime");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeLessThan(Date value) {
            addCriterion("bm_create_time <", value, "bmCreateTime");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("bm_create_time <=", value, "bmCreateTime");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeIn(List<Date> values) {
            addCriterion("bm_create_time in", values, "bmCreateTime");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeNotIn(List<Date> values) {
            addCriterion("bm_create_time not in", values, "bmCreateTime");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeBetween(Date value1, Date value2) {
            addCriterion("bm_create_time between", value1, value2, "bmCreateTime");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("bm_create_time not between", value1, value2, "bmCreateTime");
            return (Criteria) this;
        }

        public Criteria andBmTextIsNull() {
            addCriterion("bm_text is null");
            return (Criteria) this;
        }

        public Criteria andBmTextIsNotNull() {
            addCriterion("bm_text is not null");
            return (Criteria) this;
        }

        public Criteria andBmTextEqualTo(String value) {
            addCriterion("bm_text =", value, "bmText");
            return (Criteria) this;
        }

        public Criteria andBmTextNotEqualTo(String value) {
            addCriterion("bm_text <>", value, "bmText");
            return (Criteria) this;
        }

        public Criteria andBmTextGreaterThan(String value) {
            addCriterion("bm_text >", value, "bmText");
            return (Criteria) this;
        }

        public Criteria andBmTextGreaterThanOrEqualTo(String value) {
            addCriterion("bm_text >=", value, "bmText");
            return (Criteria) this;
        }

        public Criteria andBmTextLessThan(String value) {
            addCriterion("bm_text <", value, "bmText");
            return (Criteria) this;
        }

        public Criteria andBmTextLessThanOrEqualTo(String value) {
            addCriterion("bm_text <=", value, "bmText");
            return (Criteria) this;
        }

        public Criteria andBmTextLike(String value) {
            addCriterion("bm_text like", value, "bmText");
            return (Criteria) this;
        }

        public Criteria andBmTextNotLike(String value) {
            addCriterion("bm_text not like", value, "bmText");
            return (Criteria) this;
        }

        public Criteria andBmTextIn(List<String> values) {
            addCriterion("bm_text in", values, "bmText");
            return (Criteria) this;
        }

        public Criteria andBmTextNotIn(List<String> values) {
            addCriterion("bm_text not in", values, "bmText");
            return (Criteria) this;
        }

        public Criteria andBmTextBetween(String value1, String value2) {
            addCriterion("bm_text between", value1, value2, "bmText");
            return (Criteria) this;
        }

        public Criteria andBmTextNotBetween(String value1, String value2) {
            addCriterion("bm_text not between", value1, value2, "bmText");
            return (Criteria) this;
        }

        public Criteria andBmYhqPhotoIsNull() {
            addCriterion("bm_yhq_photo is null");
            return (Criteria) this;
        }

        public Criteria andBmYhqPhotoIsNotNull() {
            addCriterion("bm_yhq_photo is not null");
            return (Criteria) this;
        }

        public Criteria andBmYhqPhotoEqualTo(String value) {
            addCriterion("bm_yhq_photo =", value, "bmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andBmYhqPhotoNotEqualTo(String value) {
            addCriterion("bm_yhq_photo <>", value, "bmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andBmYhqPhotoGreaterThan(String value) {
            addCriterion("bm_yhq_photo >", value, "bmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andBmYhqPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("bm_yhq_photo >=", value, "bmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andBmYhqPhotoLessThan(String value) {
            addCriterion("bm_yhq_photo <", value, "bmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andBmYhqPhotoLessThanOrEqualTo(String value) {
            addCriterion("bm_yhq_photo <=", value, "bmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andBmYhqPhotoLike(String value) {
            addCriterion("bm_yhq_photo like", value, "bmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andBmYhqPhotoNotLike(String value) {
            addCriterion("bm_yhq_photo not like", value, "bmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andBmYhqPhotoIn(List<String> values) {
            addCriterion("bm_yhq_photo in", values, "bmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andBmYhqPhotoNotIn(List<String> values) {
            addCriterion("bm_yhq_photo not in", values, "bmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andBmYhqPhotoBetween(String value1, String value2) {
            addCriterion("bm_yhq_photo between", value1, value2, "bmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andBmYhqPhotoNotBetween(String value1, String value2) {
            addCriterion("bm_yhq_photo not between", value1, value2, "bmYhqPhoto");
            return (Criteria) this;
        }

        public Criteria andBmConfirmTypeIsNull() {
            addCriterion("bm_confirm_type is null");
            return (Criteria) this;
        }

        public Criteria andBmConfirmTypeIsNotNull() {
            addCriterion("bm_confirm_type is not null");
            return (Criteria) this;
        }

        public Criteria andBmConfirmTypeEqualTo(String value) {
            addCriterion("bm_confirm_type =", value, "bmConfirmType");
            return (Criteria) this;
        }

        public Criteria andBmConfirmTypeNotEqualTo(String value) {
            addCriterion("bm_confirm_type <>", value, "bmConfirmType");
            return (Criteria) this;
        }

        public Criteria andBmConfirmTypeGreaterThan(String value) {
            addCriterion("bm_confirm_type >", value, "bmConfirmType");
            return (Criteria) this;
        }

        public Criteria andBmConfirmTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bm_confirm_type >=", value, "bmConfirmType");
            return (Criteria) this;
        }

        public Criteria andBmConfirmTypeLessThan(String value) {
            addCriterion("bm_confirm_type <", value, "bmConfirmType");
            return (Criteria) this;
        }

        public Criteria andBmConfirmTypeLessThanOrEqualTo(String value) {
            addCriterion("bm_confirm_type <=", value, "bmConfirmType");
            return (Criteria) this;
        }

        public Criteria andBmConfirmTypeLike(String value) {
            addCriterion("bm_confirm_type like", value, "bmConfirmType");
            return (Criteria) this;
        }

        public Criteria andBmConfirmTypeNotLike(String value) {
            addCriterion("bm_confirm_type not like", value, "bmConfirmType");
            return (Criteria) this;
        }

        public Criteria andBmConfirmTypeIn(List<String> values) {
            addCriterion("bm_confirm_type in", values, "bmConfirmType");
            return (Criteria) this;
        }

        public Criteria andBmConfirmTypeNotIn(List<String> values) {
            addCriterion("bm_confirm_type not in", values, "bmConfirmType");
            return (Criteria) this;
        }

        public Criteria andBmConfirmTypeBetween(String value1, String value2) {
            addCriterion("bm_confirm_type between", value1, value2, "bmConfirmType");
            return (Criteria) this;
        }

        public Criteria andBmConfirmTypeNotBetween(String value1, String value2) {
            addCriterion("bm_confirm_type not between", value1, value2, "bmConfirmType");
            return (Criteria) this;
        }

        public Criteria andBmMakePhotoIsNull() {
            addCriterion("bm_make_photo is null");
            return (Criteria) this;
        }

        public Criteria andBmMakePhotoIsNotNull() {
            addCriterion("bm_make_photo is not null");
            return (Criteria) this;
        }

        public Criteria andBmMakePhotoEqualTo(String value) {
            addCriterion("bm_make_photo =", value, "bmMakePhoto");
            return (Criteria) this;
        }

        public Criteria andBmMakePhotoNotEqualTo(String value) {
            addCriterion("bm_make_photo <>", value, "bmMakePhoto");
            return (Criteria) this;
        }

        public Criteria andBmMakePhotoGreaterThan(String value) {
            addCriterion("bm_make_photo >", value, "bmMakePhoto");
            return (Criteria) this;
        }

        public Criteria andBmMakePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("bm_make_photo >=", value, "bmMakePhoto");
            return (Criteria) this;
        }

        public Criteria andBmMakePhotoLessThan(String value) {
            addCriterion("bm_make_photo <", value, "bmMakePhoto");
            return (Criteria) this;
        }

        public Criteria andBmMakePhotoLessThanOrEqualTo(String value) {
            addCriterion("bm_make_photo <=", value, "bmMakePhoto");
            return (Criteria) this;
        }

        public Criteria andBmMakePhotoLike(String value) {
            addCriterion("bm_make_photo like", value, "bmMakePhoto");
            return (Criteria) this;
        }

        public Criteria andBmMakePhotoNotLike(String value) {
            addCriterion("bm_make_photo not like", value, "bmMakePhoto");
            return (Criteria) this;
        }

        public Criteria andBmMakePhotoIn(List<String> values) {
            addCriterion("bm_make_photo in", values, "bmMakePhoto");
            return (Criteria) this;
        }

        public Criteria andBmMakePhotoNotIn(List<String> values) {
            addCriterion("bm_make_photo not in", values, "bmMakePhoto");
            return (Criteria) this;
        }

        public Criteria andBmMakePhotoBetween(String value1, String value2) {
            addCriterion("bm_make_photo between", value1, value2, "bmMakePhoto");
            return (Criteria) this;
        }

        public Criteria andBmMakePhotoNotBetween(String value1, String value2) {
            addCriterion("bm_make_photo not between", value1, value2, "bmMakePhoto");
            return (Criteria) this;
        }

        public Criteria andBmByzdIsNull() {
            addCriterion("bm_byzd is null");
            return (Criteria) this;
        }

        public Criteria andBmByzdIsNotNull() {
            addCriterion("bm_byzd is not null");
            return (Criteria) this;
        }

        public Criteria andBmByzdEqualTo(String value) {
            addCriterion("bm_byzd =", value, "bmByzd");
            return (Criteria) this;
        }

        public Criteria andBmByzdNotEqualTo(String value) {
            addCriterion("bm_byzd <>", value, "bmByzd");
            return (Criteria) this;
        }

        public Criteria andBmByzdGreaterThan(String value) {
            addCriterion("bm_byzd >", value, "bmByzd");
            return (Criteria) this;
        }

        public Criteria andBmByzdGreaterThanOrEqualTo(String value) {
            addCriterion("bm_byzd >=", value, "bmByzd");
            return (Criteria) this;
        }

        public Criteria andBmByzdLessThan(String value) {
            addCriterion("bm_byzd <", value, "bmByzd");
            return (Criteria) this;
        }

        public Criteria andBmByzdLessThanOrEqualTo(String value) {
            addCriterion("bm_byzd <=", value, "bmByzd");
            return (Criteria) this;
        }

        public Criteria andBmByzdLike(String value) {
            addCriterion("bm_byzd like", value, "bmByzd");
            return (Criteria) this;
        }

        public Criteria andBmByzdNotLike(String value) {
            addCriterion("bm_byzd not like", value, "bmByzd");
            return (Criteria) this;
        }

        public Criteria andBmByzdIn(List<String> values) {
            addCriterion("bm_byzd in", values, "bmByzd");
            return (Criteria) this;
        }

        public Criteria andBmByzdNotIn(List<String> values) {
            addCriterion("bm_byzd not in", values, "bmByzd");
            return (Criteria) this;
        }

        public Criteria andBmByzdBetween(String value1, String value2) {
            addCriterion("bm_byzd between", value1, value2, "bmByzd");
            return (Criteria) this;
        }

        public Criteria andBmByzdNotBetween(String value1, String value2) {
            addCriterion("bm_byzd not between", value1, value2, "bmByzd");
            return (Criteria) this;
        }

        public Criteria andBmBackTypeIsNull() {
            addCriterion("bm_back_type is null");
            return (Criteria) this;
        }

        public Criteria andBmBackTypeIsNotNull() {
            addCriterion("bm_back_type is not null");
            return (Criteria) this;
        }

        public Criteria andBmBackTypeEqualTo(String value) {
            addCriterion("bm_back_type =", value, "bmBackType");
            return (Criteria) this;
        }

        public Criteria andBmBackTypeNotEqualTo(String value) {
            addCriterion("bm_back_type <>", value, "bmBackType");
            return (Criteria) this;
        }

        public Criteria andBmBackTypeGreaterThan(String value) {
            addCriterion("bm_back_type >", value, "bmBackType");
            return (Criteria) this;
        }

        public Criteria andBmBackTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bm_back_type >=", value, "bmBackType");
            return (Criteria) this;
        }

        public Criteria andBmBackTypeLessThan(String value) {
            addCriterion("bm_back_type <", value, "bmBackType");
            return (Criteria) this;
        }

        public Criteria andBmBackTypeLessThanOrEqualTo(String value) {
            addCriterion("bm_back_type <=", value, "bmBackType");
            return (Criteria) this;
        }

        public Criteria andBmBackTypeLike(String value) {
            addCriterion("bm_back_type like", value, "bmBackType");
            return (Criteria) this;
        }

        public Criteria andBmBackTypeNotLike(String value) {
            addCriterion("bm_back_type not like", value, "bmBackType");
            return (Criteria) this;
        }

        public Criteria andBmBackTypeIn(List<String> values) {
            addCriterion("bm_back_type in", values, "bmBackType");
            return (Criteria) this;
        }

        public Criteria andBmBackTypeNotIn(List<String> values) {
            addCriterion("bm_back_type not in", values, "bmBackType");
            return (Criteria) this;
        }

        public Criteria andBmBackTypeBetween(String value1, String value2) {
            addCriterion("bm_back_type between", value1, value2, "bmBackType");
            return (Criteria) this;
        }

        public Criteria andBmBackTypeNotBetween(String value1, String value2) {
            addCriterion("bm_back_type not between", value1, value2, "bmBackType");
            return (Criteria) this;
        }

        public Criteria andBmUserNameIsNull() {
            addCriterion("bm_user_name is null");
            return (Criteria) this;
        }

        public Criteria andBmUserNameIsNotNull() {
            addCriterion("bm_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andBmUserNameEqualTo(String value) {
            addCriterion("bm_user_name =", value, "bmUserName");
            return (Criteria) this;
        }

        public Criteria andBmUserNameNotEqualTo(String value) {
            addCriterion("bm_user_name <>", value, "bmUserName");
            return (Criteria) this;
        }

        public Criteria andBmUserNameGreaterThan(String value) {
            addCriterion("bm_user_name >", value, "bmUserName");
            return (Criteria) this;
        }

        public Criteria andBmUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("bm_user_name >=", value, "bmUserName");
            return (Criteria) this;
        }

        public Criteria andBmUserNameLessThan(String value) {
            addCriterion("bm_user_name <", value, "bmUserName");
            return (Criteria) this;
        }

        public Criteria andBmUserNameLessThanOrEqualTo(String value) {
            addCriterion("bm_user_name <=", value, "bmUserName");
            return (Criteria) this;
        }

        public Criteria andBmUserNameLike(String value) {
            addCriterion("bm_user_name like", value, "bmUserName");
            return (Criteria) this;
        }

        public Criteria andBmUserNameNotLike(String value) {
            addCriterion("bm_user_name not like", value, "bmUserName");
            return (Criteria) this;
        }

        public Criteria andBmUserNameIn(List<String> values) {
            addCriterion("bm_user_name in", values, "bmUserName");
            return (Criteria) this;
        }

        public Criteria andBmUserNameNotIn(List<String> values) {
            addCriterion("bm_user_name not in", values, "bmUserName");
            return (Criteria) this;
        }

        public Criteria andBmUserNameBetween(String value1, String value2) {
            addCriterion("bm_user_name between", value1, value2, "bmUserName");
            return (Criteria) this;
        }

        public Criteria andBmUserNameNotBetween(String value1, String value2) {
            addCriterion("bm_user_name not between", value1, value2, "bmUserName");
            return (Criteria) this;
        }

        public Criteria andBmBackBlIsNull() {
            addCriterion("bm_back_bl is null");
            return (Criteria) this;
        }

        public Criteria andBmBackBlIsNotNull() {
            addCriterion("bm_back_bl is not null");
            return (Criteria) this;
        }

        public Criteria andBmBackBlEqualTo(String value) {
            addCriterion("bm_back_bl =", value, "bmBackBl");
            return (Criteria) this;
        }

        public Criteria andBmBackBlNotEqualTo(String value) {
            addCriterion("bm_back_bl <>", value, "bmBackBl");
            return (Criteria) this;
        }

        public Criteria andBmBackBlGreaterThan(String value) {
            addCriterion("bm_back_bl >", value, "bmBackBl");
            return (Criteria) this;
        }

        public Criteria andBmBackBlGreaterThanOrEqualTo(String value) {
            addCriterion("bm_back_bl >=", value, "bmBackBl");
            return (Criteria) this;
        }

        public Criteria andBmBackBlLessThan(String value) {
            addCriterion("bm_back_bl <", value, "bmBackBl");
            return (Criteria) this;
        }

        public Criteria andBmBackBlLessThanOrEqualTo(String value) {
            addCriterion("bm_back_bl <=", value, "bmBackBl");
            return (Criteria) this;
        }

        public Criteria andBmBackBlLike(String value) {
            addCriterion("bm_back_bl like", value, "bmBackBl");
            return (Criteria) this;
        }

        public Criteria andBmBackBlNotLike(String value) {
            addCriterion("bm_back_bl not like", value, "bmBackBl");
            return (Criteria) this;
        }

        public Criteria andBmBackBlIn(List<String> values) {
            addCriterion("bm_back_bl in", values, "bmBackBl");
            return (Criteria) this;
        }

        public Criteria andBmBackBlNotIn(List<String> values) {
            addCriterion("bm_back_bl not in", values, "bmBackBl");
            return (Criteria) this;
        }

        public Criteria andBmBackBlBetween(String value1, String value2) {
            addCriterion("bm_back_bl between", value1, value2, "bmBackBl");
            return (Criteria) this;
        }

        public Criteria andBmBackBlNotBetween(String value1, String value2) {
            addCriterion("bm_back_bl not between", value1, value2, "bmBackBl");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountIsNull() {
            addCriterion("bm_back_account is null");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountIsNotNull() {
            addCriterion("bm_back_account is not null");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountEqualTo(String value) {
            addCriterion("bm_back_account =", value, "bmBackAccount");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountNotEqualTo(String value) {
            addCriterion("bm_back_account <>", value, "bmBackAccount");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountGreaterThan(String value) {
            addCriterion("bm_back_account >", value, "bmBackAccount");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bm_back_account >=", value, "bmBackAccount");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountLessThan(String value) {
            addCriterion("bm_back_account <", value, "bmBackAccount");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountLessThanOrEqualTo(String value) {
            addCriterion("bm_back_account <=", value, "bmBackAccount");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountLike(String value) {
            addCriterion("bm_back_account like", value, "bmBackAccount");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountNotLike(String value) {
            addCriterion("bm_back_account not like", value, "bmBackAccount");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountIn(List<String> values) {
            addCriterion("bm_back_account in", values, "bmBackAccount");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountNotIn(List<String> values) {
            addCriterion("bm_back_account not in", values, "bmBackAccount");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountBetween(String value1, String value2) {
            addCriterion("bm_back_account between", value1, value2, "bmBackAccount");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountNotBetween(String value1, String value2) {
            addCriterion("bm_back_account not between", value1, value2, "bmBackAccount");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountNumberIsNull() {
            addCriterion("bm_back_account_number is null");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountNumberIsNotNull() {
            addCriterion("bm_back_account_number is not null");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountNumberEqualTo(String value) {
            addCriterion("bm_back_account_number =", value, "bmBackAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountNumberNotEqualTo(String value) {
            addCriterion("bm_back_account_number <>", value, "bmBackAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountNumberGreaterThan(String value) {
            addCriterion("bm_back_account_number >", value, "bmBackAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("bm_back_account_number >=", value, "bmBackAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountNumberLessThan(String value) {
            addCriterion("bm_back_account_number <", value, "bmBackAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("bm_back_account_number <=", value, "bmBackAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountNumberLike(String value) {
            addCriterion("bm_back_account_number like", value, "bmBackAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountNumberNotLike(String value) {
            addCriterion("bm_back_account_number not like", value, "bmBackAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountNumberIn(List<String> values) {
            addCriterion("bm_back_account_number in", values, "bmBackAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountNumberNotIn(List<String> values) {
            addCriterion("bm_back_account_number not in", values, "bmBackAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountNumberBetween(String value1, String value2) {
            addCriterion("bm_back_account_number between", value1, value2, "bmBackAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBmBackAccountNumberNotBetween(String value1, String value2) {
            addCriterion("bm_back_account_number not between", value1, value2, "bmBackAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBmDingdanTypeIsNull() {
            addCriterion("bm_dingdan_type is null");
            return (Criteria) this;
        }

        public Criteria andBmDingdanTypeIsNotNull() {
            addCriterion("bm_dingdan_type is not null");
            return (Criteria) this;
        }

        public Criteria andBmDingdanTypeEqualTo(String value) {
            addCriterion("bm_dingdan_type =", value, "bmDingdanType");
            return (Criteria) this;
        }

        public Criteria andBmDingdanTypeNotEqualTo(String value) {
            addCriterion("bm_dingdan_type <>", value, "bmDingdanType");
            return (Criteria) this;
        }

        public Criteria andBmDingdanTypeGreaterThan(String value) {
            addCriterion("bm_dingdan_type >", value, "bmDingdanType");
            return (Criteria) this;
        }

        public Criteria andBmDingdanTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bm_dingdan_type >=", value, "bmDingdanType");
            return (Criteria) this;
        }

        public Criteria andBmDingdanTypeLessThan(String value) {
            addCriterion("bm_dingdan_type <", value, "bmDingdanType");
            return (Criteria) this;
        }

        public Criteria andBmDingdanTypeLessThanOrEqualTo(String value) {
            addCriterion("bm_dingdan_type <=", value, "bmDingdanType");
            return (Criteria) this;
        }

        public Criteria andBmDingdanTypeLike(String value) {
            addCriterion("bm_dingdan_type like", value, "bmDingdanType");
            return (Criteria) this;
        }

        public Criteria andBmDingdanTypeNotLike(String value) {
            addCriterion("bm_dingdan_type not like", value, "bmDingdanType");
            return (Criteria) this;
        }

        public Criteria andBmDingdanTypeIn(List<String> values) {
            addCriterion("bm_dingdan_type in", values, "bmDingdanType");
            return (Criteria) this;
        }

        public Criteria andBmDingdanTypeNotIn(List<String> values) {
            addCriterion("bm_dingdan_type not in", values, "bmDingdanType");
            return (Criteria) this;
        }

        public Criteria andBmDingdanTypeBetween(String value1, String value2) {
            addCriterion("bm_dingdan_type between", value1, value2, "bmDingdanType");
            return (Criteria) this;
        }

        public Criteria andBmDingdanTypeNotBetween(String value1, String value2) {
            addCriterion("bm_dingdan_type not between", value1, value2, "bmDingdanType");
            return (Criteria) this;
        }

        public Criteria andBmShopIdIsNull() {
            addCriterion("bm_shop_id is null");
            return (Criteria) this;
        }

        public Criteria andBmShopIdIsNotNull() {
            addCriterion("bm_shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andBmShopIdEqualTo(Integer value) {
            addCriterion("bm_shop_id =", value, "bmShopId");
            return (Criteria) this;
        }

        public Criteria andBmShopIdNotEqualTo(Integer value) {
            addCriterion("bm_shop_id <>", value, "bmShopId");
            return (Criteria) this;
        }

        public Criteria andBmShopIdGreaterThan(Integer value) {
            addCriterion("bm_shop_id >", value, "bmShopId");
            return (Criteria) this;
        }

        public Criteria andBmShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bm_shop_id >=", value, "bmShopId");
            return (Criteria) this;
        }

        public Criteria andBmShopIdLessThan(Integer value) {
            addCriterion("bm_shop_id <", value, "bmShopId");
            return (Criteria) this;
        }

        public Criteria andBmShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("bm_shop_id <=", value, "bmShopId");
            return (Criteria) this;
        }

        public Criteria andBmShopIdIn(List<Integer> values) {
            addCriterion("bm_shop_id in", values, "bmShopId");
            return (Criteria) this;
        }

        public Criteria andBmShopIdNotIn(List<Integer> values) {
            addCriterion("bm_shop_id not in", values, "bmShopId");
            return (Criteria) this;
        }

        public Criteria andBmShopIdBetween(Integer value1, Integer value2) {
            addCriterion("bm_shop_id between", value1, value2, "bmShopId");
            return (Criteria) this;
        }

        public Criteria andBmShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bm_shop_id not between", value1, value2, "bmShopId");
            return (Criteria) this;
        }

        public Criteria andBmTimeidIsNull() {
            addCriterion("bm_timeId is null");
            return (Criteria) this;
        }

        public Criteria andBmTimeidIsNotNull() {
            addCriterion("bm_timeId is not null");
            return (Criteria) this;
        }

        public Criteria andBmTimeidEqualTo(Long value) {
            addCriterion("bm_timeId =", value, "bmTimeid");
            return (Criteria) this;
        }

        public Criteria andBmTimeidNotEqualTo(Long value) {
            addCriterion("bm_timeId <>", value, "bmTimeid");
            return (Criteria) this;
        }

        public Criteria andBmTimeidGreaterThan(Long value) {
            addCriterion("bm_timeId >", value, "bmTimeid");
            return (Criteria) this;
        }

        public Criteria andBmTimeidGreaterThanOrEqualTo(Long value) {
            addCriterion("bm_timeId >=", value, "bmTimeid");
            return (Criteria) this;
        }

        public Criteria andBmTimeidLessThan(Long value) {
            addCriterion("bm_timeId <", value, "bmTimeid");
            return (Criteria) this;
        }

        public Criteria andBmTimeidLessThanOrEqualTo(Long value) {
            addCriterion("bm_timeId <=", value, "bmTimeid");
            return (Criteria) this;
        }

        public Criteria andBmTimeidIn(List<Long> values) {
            addCriterion("bm_timeId in", values, "bmTimeid");
            return (Criteria) this;
        }

        public Criteria andBmTimeidNotIn(List<Long> values) {
            addCriterion("bm_timeId not in", values, "bmTimeid");
            return (Criteria) this;
        }

        public Criteria andBmTimeidBetween(Long value1, Long value2) {
            addCriterion("bm_timeId between", value1, value2, "bmTimeid");
            return (Criteria) this;
        }

        public Criteria andBmTimeidNotBetween(Long value1, Long value2) {
            addCriterion("bm_timeId not between", value1, value2, "bmTimeid");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeEndIsNull() {
            addCriterion("bm_make_time_end is null");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeEndIsNotNull() {
            addCriterion("bm_make_time_end is not null");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeEndEqualTo(Date value) {
            addCriterion("bm_make_time_end =", value, "bmMakeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeEndNotEqualTo(Date value) {
            addCriterion("bm_make_time_end <>", value, "bmMakeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeEndGreaterThan(Date value) {
            addCriterion("bm_make_time_end >", value, "bmMakeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeEndGreaterThanOrEqualTo(Date value) {
            addCriterion("bm_make_time_end >=", value, "bmMakeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeEndLessThan(Date value) {
            addCriterion("bm_make_time_end <", value, "bmMakeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeEndLessThanOrEqualTo(Date value) {
            addCriterion("bm_make_time_end <=", value, "bmMakeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeEndIn(List<Date> values) {
            addCriterion("bm_make_time_end in", values, "bmMakeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeEndNotIn(List<Date> values) {
            addCriterion("bm_make_time_end not in", values, "bmMakeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeEndBetween(Date value1, Date value2) {
            addCriterion("bm_make_time_end between", value1, value2, "bmMakeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andBmMakeTimeEndNotBetween(Date value1, Date value2) {
            addCriterion("bm_make_time_end not between", value1, value2, "bmMakeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeEndIsNull() {
            addCriterion("bm_create_time_end is null");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeEndIsNotNull() {
            addCriterion("bm_create_time_end is not null");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeEndEqualTo(Date value) {
            addCriterion("bm_create_time_end =", value, "bmCreateTimeEnd");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeEndNotEqualTo(Date value) {
            addCriterion("bm_create_time_end <>", value, "bmCreateTimeEnd");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeEndGreaterThan(Date value) {
            addCriterion("bm_create_time_end >", value, "bmCreateTimeEnd");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeEndGreaterThanOrEqualTo(Date value) {
            addCriterion("bm_create_time_end >=", value, "bmCreateTimeEnd");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeEndLessThan(Date value) {
            addCriterion("bm_create_time_end <", value, "bmCreateTimeEnd");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeEndLessThanOrEqualTo(Date value) {
            addCriterion("bm_create_time_end <=", value, "bmCreateTimeEnd");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeEndIn(List<Date> values) {
            addCriterion("bm_create_time_end in", values, "bmCreateTimeEnd");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeEndNotIn(List<Date> values) {
            addCriterion("bm_create_time_end not in", values, "bmCreateTimeEnd");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeEndBetween(Date value1, Date value2) {
            addCriterion("bm_create_time_end between", value1, value2, "bmCreateTimeEnd");
            return (Criteria) this;
        }

        public Criteria andBmCreateTimeEndNotBetween(Date value1, Date value2) {
            addCriterion("bm_create_time_end not between", value1, value2, "bmCreateTimeEnd");
            return (Criteria) this;
        }

        public Criteria andBmShPhotoIsNull() {
            addCriterion("bm_sh_photo is null");
            return (Criteria) this;
        }

        public Criteria andBmShPhotoIsNotNull() {
            addCriterion("bm_sh_photo is not null");
            return (Criteria) this;
        }

        public Criteria andBmShPhotoEqualTo(String value) {
            addCriterion("bm_sh_photo =", value, "bmShPhoto");
            return (Criteria) this;
        }

        public Criteria andBmShPhotoNotEqualTo(String value) {
            addCriterion("bm_sh_photo <>", value, "bmShPhoto");
            return (Criteria) this;
        }

        public Criteria andBmShPhotoGreaterThan(String value) {
            addCriterion("bm_sh_photo >", value, "bmShPhoto");
            return (Criteria) this;
        }

        public Criteria andBmShPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("bm_sh_photo >=", value, "bmShPhoto");
            return (Criteria) this;
        }

        public Criteria andBmShPhotoLessThan(String value) {
            addCriterion("bm_sh_photo <", value, "bmShPhoto");
            return (Criteria) this;
        }

        public Criteria andBmShPhotoLessThanOrEqualTo(String value) {
            addCriterion("bm_sh_photo <=", value, "bmShPhoto");
            return (Criteria) this;
        }

        public Criteria andBmShPhotoLike(String value) {
            addCriterion("bm_sh_photo like", value, "bmShPhoto");
            return (Criteria) this;
        }

        public Criteria andBmShPhotoNotLike(String value) {
            addCriterion("bm_sh_photo not like", value, "bmShPhoto");
            return (Criteria) this;
        }

        public Criteria andBmShPhotoIn(List<String> values) {
            addCriterion("bm_sh_photo in", values, "bmShPhoto");
            return (Criteria) this;
        }

        public Criteria andBmShPhotoNotIn(List<String> values) {
            addCriterion("bm_sh_photo not in", values, "bmShPhoto");
            return (Criteria) this;
        }

        public Criteria andBmShPhotoBetween(String value1, String value2) {
            addCriterion("bm_sh_photo between", value1, value2, "bmShPhoto");
            return (Criteria) this;
        }

        public Criteria andBmShPhotoNotBetween(String value1, String value2) {
            addCriterion("bm_sh_photo not between", value1, value2, "bmShPhoto");
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