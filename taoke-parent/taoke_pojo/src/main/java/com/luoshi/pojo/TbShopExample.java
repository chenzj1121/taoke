package com.luoshi.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbShopExample() {
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

        public Criteria andWangwangaccountIsNull() {
            addCriterion("wangwangaccount is null");
            return (Criteria) this;
        }

        public Criteria andWangwangaccountIsNotNull() {
            addCriterion("wangwangaccount is not null");
            return (Criteria) this;
        }

        public Criteria andWangwangaccountEqualTo(String value) {
            addCriterion("wangwangaccount =", value, "wangwangaccount");
            return (Criteria) this;
        }

        public Criteria andWangwangaccountNotEqualTo(String value) {
            addCriterion("wangwangaccount <>", value, "wangwangaccount");
            return (Criteria) this;
        }

        public Criteria andWangwangaccountGreaterThan(String value) {
            addCriterion("wangwangaccount >", value, "wangwangaccount");
            return (Criteria) this;
        }

        public Criteria andWangwangaccountGreaterThanOrEqualTo(String value) {
            addCriterion("wangwangaccount >=", value, "wangwangaccount");
            return (Criteria) this;
        }

        public Criteria andWangwangaccountLessThan(String value) {
            addCriterion("wangwangaccount <", value, "wangwangaccount");
            return (Criteria) this;
        }

        public Criteria andWangwangaccountLessThanOrEqualTo(String value) {
            addCriterion("wangwangaccount <=", value, "wangwangaccount");
            return (Criteria) this;
        }

        public Criteria andWangwangaccountLike(String value) {
            addCriterion("wangwangaccount like", value, "wangwangaccount");
            return (Criteria) this;
        }

        public Criteria andWangwangaccountNotLike(String value) {
            addCriterion("wangwangaccount not like", value, "wangwangaccount");
            return (Criteria) this;
        }

        public Criteria andWangwangaccountIn(List<String> values) {
            addCriterion("wangwangaccount in", values, "wangwangaccount");
            return (Criteria) this;
        }

        public Criteria andWangwangaccountNotIn(List<String> values) {
            addCriterion("wangwangaccount not in", values, "wangwangaccount");
            return (Criteria) this;
        }

        public Criteria andWangwangaccountBetween(String value1, String value2) {
            addCriterion("wangwangaccount between", value1, value2, "wangwangaccount");
            return (Criteria) this;
        }

        public Criteria andWangwangaccountNotBetween(String value1, String value2) {
            addCriterion("wangwangaccount not between", value1, value2, "wangwangaccount");
            return (Criteria) this;
        }

        public Criteria andShopProductIsNull() {
            addCriterion("shop_product is null");
            return (Criteria) this;
        }

        public Criteria andShopProductIsNotNull() {
            addCriterion("shop_product is not null");
            return (Criteria) this;
        }

        public Criteria andShopProductEqualTo(String value) {
            addCriterion("shop_product =", value, "shopProduct");
            return (Criteria) this;
        }

        public Criteria andShopProductNotEqualTo(String value) {
            addCriterion("shop_product <>", value, "shopProduct");
            return (Criteria) this;
        }

        public Criteria andShopProductGreaterThan(String value) {
            addCriterion("shop_product >", value, "shopProduct");
            return (Criteria) this;
        }

        public Criteria andShopProductGreaterThanOrEqualTo(String value) {
            addCriterion("shop_product >=", value, "shopProduct");
            return (Criteria) this;
        }

        public Criteria andShopProductLessThan(String value) {
            addCriterion("shop_product <", value, "shopProduct");
            return (Criteria) this;
        }

        public Criteria andShopProductLessThanOrEqualTo(String value) {
            addCriterion("shop_product <=", value, "shopProduct");
            return (Criteria) this;
        }

        public Criteria andShopProductLike(String value) {
            addCriterion("shop_product like", value, "shopProduct");
            return (Criteria) this;
        }

        public Criteria andShopProductNotLike(String value) {
            addCriterion("shop_product not like", value, "shopProduct");
            return (Criteria) this;
        }

        public Criteria andShopProductIn(List<String> values) {
            addCriterion("shop_product in", values, "shopProduct");
            return (Criteria) this;
        }

        public Criteria andShopProductNotIn(List<String> values) {
            addCriterion("shop_product not in", values, "shopProduct");
            return (Criteria) this;
        }

        public Criteria andShopProductBetween(String value1, String value2) {
            addCriterion("shop_product between", value1, value2, "shopProduct");
            return (Criteria) this;
        }

        public Criteria andShopProductNotBetween(String value1, String value2) {
            addCriterion("shop_product not between", value1, value2, "shopProduct");
            return (Criteria) this;
        }

        public Criteria andShopUseIdIsNull() {
            addCriterion("shop_use_id is null");
            return (Criteria) this;
        }

        public Criteria andShopUseIdIsNotNull() {
            addCriterion("shop_use_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopUseIdEqualTo(Integer value) {
            addCriterion("shop_use_id =", value, "shopUseId");
            return (Criteria) this;
        }

        public Criteria andShopUseIdNotEqualTo(Integer value) {
            addCriterion("shop_use_id <>", value, "shopUseId");
            return (Criteria) this;
        }

        public Criteria andShopUseIdGreaterThan(Integer value) {
            addCriterion("shop_use_id >", value, "shopUseId");
            return (Criteria) this;
        }

        public Criteria andShopUseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_use_id >=", value, "shopUseId");
            return (Criteria) this;
        }

        public Criteria andShopUseIdLessThan(Integer value) {
            addCriterion("shop_use_id <", value, "shopUseId");
            return (Criteria) this;
        }

        public Criteria andShopUseIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_use_id <=", value, "shopUseId");
            return (Criteria) this;
        }

        public Criteria andShopUseIdIn(List<Integer> values) {
            addCriterion("shop_use_id in", values, "shopUseId");
            return (Criteria) this;
        }

        public Criteria andShopUseIdNotIn(List<Integer> values) {
            addCriterion("shop_use_id not in", values, "shopUseId");
            return (Criteria) this;
        }

        public Criteria andShopUseIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_use_id between", value1, value2, "shopUseId");
            return (Criteria) this;
        }

        public Criteria andShopUseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_use_id not between", value1, value2, "shopUseId");
            return (Criteria) this;
        }

        public Criteria andShopBossIsNull() {
            addCriterion("shop_boss is null");
            return (Criteria) this;
        }

        public Criteria andShopBossIsNotNull() {
            addCriterion("shop_boss is not null");
            return (Criteria) this;
        }

        public Criteria andShopBossEqualTo(String value) {
            addCriterion("shop_boss =", value, "shopBoss");
            return (Criteria) this;
        }

        public Criteria andShopBossNotEqualTo(String value) {
            addCriterion("shop_boss <>", value, "shopBoss");
            return (Criteria) this;
        }

        public Criteria andShopBossGreaterThan(String value) {
            addCriterion("shop_boss >", value, "shopBoss");
            return (Criteria) this;
        }

        public Criteria andShopBossGreaterThanOrEqualTo(String value) {
            addCriterion("shop_boss >=", value, "shopBoss");
            return (Criteria) this;
        }

        public Criteria andShopBossLessThan(String value) {
            addCriterion("shop_boss <", value, "shopBoss");
            return (Criteria) this;
        }

        public Criteria andShopBossLessThanOrEqualTo(String value) {
            addCriterion("shop_boss <=", value, "shopBoss");
            return (Criteria) this;
        }

        public Criteria andShopBossLike(String value) {
            addCriterion("shop_boss like", value, "shopBoss");
            return (Criteria) this;
        }

        public Criteria andShopBossNotLike(String value) {
            addCriterion("shop_boss not like", value, "shopBoss");
            return (Criteria) this;
        }

        public Criteria andShopBossIn(List<String> values) {
            addCriterion("shop_boss in", values, "shopBoss");
            return (Criteria) this;
        }

        public Criteria andShopBossNotIn(List<String> values) {
            addCriterion("shop_boss not in", values, "shopBoss");
            return (Criteria) this;
        }

        public Criteria andShopBossBetween(String value1, String value2) {
            addCriterion("shop_boss between", value1, value2, "shopBoss");
            return (Criteria) this;
        }

        public Criteria andShopBossNotBetween(String value1, String value2) {
            addCriterion("shop_boss not between", value1, value2, "shopBoss");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIsNull() {
            addCriterion("shop_phone is null");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIsNotNull() {
            addCriterion("shop_phone is not null");
            return (Criteria) this;
        }

        public Criteria andShopPhoneEqualTo(String value) {
            addCriterion("shop_phone =", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotEqualTo(String value) {
            addCriterion("shop_phone <>", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneGreaterThan(String value) {
            addCriterion("shop_phone >", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("shop_phone >=", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLessThan(String value) {
            addCriterion("shop_phone <", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLessThanOrEqualTo(String value) {
            addCriterion("shop_phone <=", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLike(String value) {
            addCriterion("shop_phone like", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotLike(String value) {
            addCriterion("shop_phone not like", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIn(List<String> values) {
            addCriterion("shop_phone in", values, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotIn(List<String> values) {
            addCriterion("shop_phone not in", values, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneBetween(String value1, String value2) {
            addCriterion("shop_phone between", value1, value2, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotBetween(String value1, String value2) {
            addCriterion("shop_phone not between", value1, value2, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopDeptIdIsNull() {
            addCriterion("shop_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andShopDeptIdIsNotNull() {
            addCriterion("shop_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopDeptIdEqualTo(Integer value) {
            addCriterion("shop_dept_id =", value, "shopDeptId");
            return (Criteria) this;
        }

        public Criteria andShopDeptIdNotEqualTo(Integer value) {
            addCriterion("shop_dept_id <>", value, "shopDeptId");
            return (Criteria) this;
        }

        public Criteria andShopDeptIdGreaterThan(Integer value) {
            addCriterion("shop_dept_id >", value, "shopDeptId");
            return (Criteria) this;
        }

        public Criteria andShopDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_dept_id >=", value, "shopDeptId");
            return (Criteria) this;
        }

        public Criteria andShopDeptIdLessThan(Integer value) {
            addCriterion("shop_dept_id <", value, "shopDeptId");
            return (Criteria) this;
        }

        public Criteria andShopDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_dept_id <=", value, "shopDeptId");
            return (Criteria) this;
        }

        public Criteria andShopDeptIdIn(List<Integer> values) {
            addCriterion("shop_dept_id in", values, "shopDeptId");
            return (Criteria) this;
        }

        public Criteria andShopDeptIdNotIn(List<Integer> values) {
            addCriterion("shop_dept_id not in", values, "shopDeptId");
            return (Criteria) this;
        }

        public Criteria andShopDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_dept_id between", value1, value2, "shopDeptId");
            return (Criteria) this;
        }

        public Criteria andShopDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_dept_id not between", value1, value2, "shopDeptId");
            return (Criteria) this;
        }

        public Criteria andShopUserId2IsNull() {
            addCriterion("shop_user_id2 is null");
            return (Criteria) this;
        }

        public Criteria andShopUserId2IsNotNull() {
            addCriterion("shop_user_id2 is not null");
            return (Criteria) this;
        }

        public Criteria andShopUserId2EqualTo(Integer value) {
            addCriterion("shop_user_id2 =", value, "shopUserId2");
            return (Criteria) this;
        }

        public Criteria andShopUserId2NotEqualTo(Integer value) {
            addCriterion("shop_user_id2 <>", value, "shopUserId2");
            return (Criteria) this;
        }

        public Criteria andShopUserId2GreaterThan(Integer value) {
            addCriterion("shop_user_id2 >", value, "shopUserId2");
            return (Criteria) this;
        }

        public Criteria andShopUserId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_user_id2 >=", value, "shopUserId2");
            return (Criteria) this;
        }

        public Criteria andShopUserId2LessThan(Integer value) {
            addCriterion("shop_user_id2 <", value, "shopUserId2");
            return (Criteria) this;
        }

        public Criteria andShopUserId2LessThanOrEqualTo(Integer value) {
            addCriterion("shop_user_id2 <=", value, "shopUserId2");
            return (Criteria) this;
        }

        public Criteria andShopUserId2In(List<Integer> values) {
            addCriterion("shop_user_id2 in", values, "shopUserId2");
            return (Criteria) this;
        }

        public Criteria andShopUserId2NotIn(List<Integer> values) {
            addCriterion("shop_user_id2 not in", values, "shopUserId2");
            return (Criteria) this;
        }

        public Criteria andShopUserId2Between(Integer value1, Integer value2) {
            addCriterion("shop_user_id2 between", value1, value2, "shopUserId2");
            return (Criteria) this;
        }

        public Criteria andShopUserId2NotBetween(Integer value1, Integer value2) {
            addCriterion("shop_user_id2 not between", value1, value2, "shopUserId2");
            return (Criteria) this;
        }

        public Criteria andShopQqIsNull() {
            addCriterion("shop_qq is null");
            return (Criteria) this;
        }

        public Criteria andShopQqIsNotNull() {
            addCriterion("shop_qq is not null");
            return (Criteria) this;
        }

        public Criteria andShopQqEqualTo(String value) {
            addCriterion("shop_qq =", value, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqNotEqualTo(String value) {
            addCriterion("shop_qq <>", value, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqGreaterThan(String value) {
            addCriterion("shop_qq >", value, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqGreaterThanOrEqualTo(String value) {
            addCriterion("shop_qq >=", value, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqLessThan(String value) {
            addCriterion("shop_qq <", value, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqLessThanOrEqualTo(String value) {
            addCriterion("shop_qq <=", value, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqLike(String value) {
            addCriterion("shop_qq like", value, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqNotLike(String value) {
            addCriterion("shop_qq not like", value, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqIn(List<String> values) {
            addCriterion("shop_qq in", values, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqNotIn(List<String> values) {
            addCriterion("shop_qq not in", values, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqBetween(String value1, String value2) {
            addCriterion("shop_qq between", value1, value2, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqNotBetween(String value1, String value2) {
            addCriterion("shop_qq not between", value1, value2, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopWxIsNull() {
            addCriterion("shop_wx is null");
            return (Criteria) this;
        }

        public Criteria andShopWxIsNotNull() {
            addCriterion("shop_wx is not null");
            return (Criteria) this;
        }

        public Criteria andShopWxEqualTo(String value) {
            addCriterion("shop_wx =", value, "shopWx");
            return (Criteria) this;
        }

        public Criteria andShopWxNotEqualTo(String value) {
            addCriterion("shop_wx <>", value, "shopWx");
            return (Criteria) this;
        }

        public Criteria andShopWxGreaterThan(String value) {
            addCriterion("shop_wx >", value, "shopWx");
            return (Criteria) this;
        }

        public Criteria andShopWxGreaterThanOrEqualTo(String value) {
            addCriterion("shop_wx >=", value, "shopWx");
            return (Criteria) this;
        }

        public Criteria andShopWxLessThan(String value) {
            addCriterion("shop_wx <", value, "shopWx");
            return (Criteria) this;
        }

        public Criteria andShopWxLessThanOrEqualTo(String value) {
            addCriterion("shop_wx <=", value, "shopWx");
            return (Criteria) this;
        }

        public Criteria andShopWxLike(String value) {
            addCriterion("shop_wx like", value, "shopWx");
            return (Criteria) this;
        }

        public Criteria andShopWxNotLike(String value) {
            addCriterion("shop_wx not like", value, "shopWx");
            return (Criteria) this;
        }

        public Criteria andShopWxIn(List<String> values) {
            addCriterion("shop_wx in", values, "shopWx");
            return (Criteria) this;
        }

        public Criteria andShopWxNotIn(List<String> values) {
            addCriterion("shop_wx not in", values, "shopWx");
            return (Criteria) this;
        }

        public Criteria andShopWxBetween(String value1, String value2) {
            addCriterion("shop_wx between", value1, value2, "shopWx");
            return (Criteria) this;
        }

        public Criteria andShopWxNotBetween(String value1, String value2) {
            addCriterion("shop_wx not between", value1, value2, "shopWx");
            return (Criteria) this;
        }

        public Criteria andShopOperatePhoneIsNull() {
            addCriterion("shop_operate_phone is null");
            return (Criteria) this;
        }

        public Criteria andShopOperatePhoneIsNotNull() {
            addCriterion("shop_operate_phone is not null");
            return (Criteria) this;
        }

        public Criteria andShopOperatePhoneEqualTo(String value) {
            addCriterion("shop_operate_phone =", value, "shopOperatePhone");
            return (Criteria) this;
        }

        public Criteria andShopOperatePhoneNotEqualTo(String value) {
            addCriterion("shop_operate_phone <>", value, "shopOperatePhone");
            return (Criteria) this;
        }

        public Criteria andShopOperatePhoneGreaterThan(String value) {
            addCriterion("shop_operate_phone >", value, "shopOperatePhone");
            return (Criteria) this;
        }

        public Criteria andShopOperatePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("shop_operate_phone >=", value, "shopOperatePhone");
            return (Criteria) this;
        }

        public Criteria andShopOperatePhoneLessThan(String value) {
            addCriterion("shop_operate_phone <", value, "shopOperatePhone");
            return (Criteria) this;
        }

        public Criteria andShopOperatePhoneLessThanOrEqualTo(String value) {
            addCriterion("shop_operate_phone <=", value, "shopOperatePhone");
            return (Criteria) this;
        }

        public Criteria andShopOperatePhoneLike(String value) {
            addCriterion("shop_operate_phone like", value, "shopOperatePhone");
            return (Criteria) this;
        }

        public Criteria andShopOperatePhoneNotLike(String value) {
            addCriterion("shop_operate_phone not like", value, "shopOperatePhone");
            return (Criteria) this;
        }

        public Criteria andShopOperatePhoneIn(List<String> values) {
            addCriterion("shop_operate_phone in", values, "shopOperatePhone");
            return (Criteria) this;
        }

        public Criteria andShopOperatePhoneNotIn(List<String> values) {
            addCriterion("shop_operate_phone not in", values, "shopOperatePhone");
            return (Criteria) this;
        }

        public Criteria andShopOperatePhoneBetween(String value1, String value2) {
            addCriterion("shop_operate_phone between", value1, value2, "shopOperatePhone");
            return (Criteria) this;
        }

        public Criteria andShopOperatePhoneNotBetween(String value1, String value2) {
            addCriterion("shop_operate_phone not between", value1, value2, "shopOperatePhone");
            return (Criteria) this;
        }

        public Criteria andShopUrlIsNull() {
            addCriterion("shop_url is null");
            return (Criteria) this;
        }

        public Criteria andShopUrlIsNotNull() {
            addCriterion("shop_url is not null");
            return (Criteria) this;
        }

        public Criteria andShopUrlEqualTo(String value) {
            addCriterion("shop_url =", value, "shopUrl");
            return (Criteria) this;
        }

        public Criteria andShopUrlNotEqualTo(String value) {
            addCriterion("shop_url <>", value, "shopUrl");
            return (Criteria) this;
        }

        public Criteria andShopUrlGreaterThan(String value) {
            addCriterion("shop_url >", value, "shopUrl");
            return (Criteria) this;
        }

        public Criteria andShopUrlGreaterThanOrEqualTo(String value) {
            addCriterion("shop_url >=", value, "shopUrl");
            return (Criteria) this;
        }

        public Criteria andShopUrlLessThan(String value) {
            addCriterion("shop_url <", value, "shopUrl");
            return (Criteria) this;
        }

        public Criteria andShopUrlLessThanOrEqualTo(String value) {
            addCriterion("shop_url <=", value, "shopUrl");
            return (Criteria) this;
        }

        public Criteria andShopUrlLike(String value) {
            addCriterion("shop_url like", value, "shopUrl");
            return (Criteria) this;
        }

        public Criteria andShopUrlNotLike(String value) {
            addCriterion("shop_url not like", value, "shopUrl");
            return (Criteria) this;
        }

        public Criteria andShopUrlIn(List<String> values) {
            addCriterion("shop_url in", values, "shopUrl");
            return (Criteria) this;
        }

        public Criteria andShopUrlNotIn(List<String> values) {
            addCriterion("shop_url not in", values, "shopUrl");
            return (Criteria) this;
        }

        public Criteria andShopUrlBetween(String value1, String value2) {
            addCriterion("shop_url between", value1, value2, "shopUrl");
            return (Criteria) this;
        }

        public Criteria andShopUrlNotBetween(String value1, String value2) {
            addCriterion("shop_url not between", value1, value2, "shopUrl");
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

        public Criteria andShopTypeIsNull() {
            addCriterion("shop_type is null");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNotNull() {
            addCriterion("shop_type is not null");
            return (Criteria) this;
        }

        public Criteria andShopTypeEqualTo(String value) {
            addCriterion("shop_type =", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotEqualTo(String value) {
            addCriterion("shop_type <>", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThan(String value) {
            addCriterion("shop_type >", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_type >=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThan(String value) {
            addCriterion("shop_type <", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThanOrEqualTo(String value) {
            addCriterion("shop_type <=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLike(String value) {
            addCriterion("shop_type like", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotLike(String value) {
            addCriterion("shop_type not like", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeIn(List<String> values) {
            addCriterion("shop_type in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotIn(List<String> values) {
            addCriterion("shop_type not in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeBetween(String value1, String value2) {
            addCriterion("shop_type between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotBetween(String value1, String value2) {
            addCriterion("shop_type not between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andMainOperateIsNull() {
            addCriterion("main_operate is null");
            return (Criteria) this;
        }

        public Criteria andMainOperateIsNotNull() {
            addCriterion("main_operate is not null");
            return (Criteria) this;
        }

        public Criteria andMainOperateEqualTo(String value) {
            addCriterion("main_operate =", value, "mainOperate");
            return (Criteria) this;
        }

        public Criteria andMainOperateNotEqualTo(String value) {
            addCriterion("main_operate <>", value, "mainOperate");
            return (Criteria) this;
        }

        public Criteria andMainOperateGreaterThan(String value) {
            addCriterion("main_operate >", value, "mainOperate");
            return (Criteria) this;
        }

        public Criteria andMainOperateGreaterThanOrEqualTo(String value) {
            addCriterion("main_operate >=", value, "mainOperate");
            return (Criteria) this;
        }

        public Criteria andMainOperateLessThan(String value) {
            addCriterion("main_operate <", value, "mainOperate");
            return (Criteria) this;
        }

        public Criteria andMainOperateLessThanOrEqualTo(String value) {
            addCriterion("main_operate <=", value, "mainOperate");
            return (Criteria) this;
        }

        public Criteria andMainOperateLike(String value) {
            addCriterion("main_operate like", value, "mainOperate");
            return (Criteria) this;
        }

        public Criteria andMainOperateNotLike(String value) {
            addCriterion("main_operate not like", value, "mainOperate");
            return (Criteria) this;
        }

        public Criteria andMainOperateIn(List<String> values) {
            addCriterion("main_operate in", values, "mainOperate");
            return (Criteria) this;
        }

        public Criteria andMainOperateNotIn(List<String> values) {
            addCriterion("main_operate not in", values, "mainOperate");
            return (Criteria) this;
        }

        public Criteria andMainOperateBetween(String value1, String value2) {
            addCriterion("main_operate between", value1, value2, "mainOperate");
            return (Criteria) this;
        }

        public Criteria andMainOperateNotBetween(String value1, String value2) {
            addCriterion("main_operate not between", value1, value2, "mainOperate");
            return (Criteria) this;
        }

        public Criteria andShopTbtypeIsNull() {
            addCriterion("shop_tbType is null");
            return (Criteria) this;
        }

        public Criteria andShopTbtypeIsNotNull() {
            addCriterion("shop_tbType is not null");
            return (Criteria) this;
        }

        public Criteria andShopTbtypeEqualTo(String value) {
            addCriterion("shop_tbType =", value, "shopTbtype");
            return (Criteria) this;
        }

        public Criteria andShopTbtypeNotEqualTo(String value) {
            addCriterion("shop_tbType <>", value, "shopTbtype");
            return (Criteria) this;
        }

        public Criteria andShopTbtypeGreaterThan(String value) {
            addCriterion("shop_tbType >", value, "shopTbtype");
            return (Criteria) this;
        }

        public Criteria andShopTbtypeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_tbType >=", value, "shopTbtype");
            return (Criteria) this;
        }

        public Criteria andShopTbtypeLessThan(String value) {
            addCriterion("shop_tbType <", value, "shopTbtype");
            return (Criteria) this;
        }

        public Criteria andShopTbtypeLessThanOrEqualTo(String value) {
            addCriterion("shop_tbType <=", value, "shopTbtype");
            return (Criteria) this;
        }

        public Criteria andShopTbtypeLike(String value) {
            addCriterion("shop_tbType like", value, "shopTbtype");
            return (Criteria) this;
        }

        public Criteria andShopTbtypeNotLike(String value) {
            addCriterion("shop_tbType not like", value, "shopTbtype");
            return (Criteria) this;
        }

        public Criteria andShopTbtypeIn(List<String> values) {
            addCriterion("shop_tbType in", values, "shopTbtype");
            return (Criteria) this;
        }

        public Criteria andShopTbtypeNotIn(List<String> values) {
            addCriterion("shop_tbType not in", values, "shopTbtype");
            return (Criteria) this;
        }

        public Criteria andShopTbtypeBetween(String value1, String value2) {
            addCriterion("shop_tbType between", value1, value2, "shopTbtype");
            return (Criteria) this;
        }

        public Criteria andShopTbtypeNotBetween(String value1, String value2) {
            addCriterion("shop_tbType not between", value1, value2, "shopTbtype");
            return (Criteria) this;
        }

        public Criteria andShopJstypeIsNull() {
            addCriterion("shop_jsType is null");
            return (Criteria) this;
        }

        public Criteria andShopJstypeIsNotNull() {
            addCriterion("shop_jsType is not null");
            return (Criteria) this;
        }

        public Criteria andShopJstypeEqualTo(String value) {
            addCriterion("shop_jsType =", value, "shopJstype");
            return (Criteria) this;
        }

        public Criteria andShopJstypeNotEqualTo(String value) {
            addCriterion("shop_jsType <>", value, "shopJstype");
            return (Criteria) this;
        }

        public Criteria andShopJstypeGreaterThan(String value) {
            addCriterion("shop_jsType >", value, "shopJstype");
            return (Criteria) this;
        }

        public Criteria andShopJstypeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_jsType >=", value, "shopJstype");
            return (Criteria) this;
        }

        public Criteria andShopJstypeLessThan(String value) {
            addCriterion("shop_jsType <", value, "shopJstype");
            return (Criteria) this;
        }

        public Criteria andShopJstypeLessThanOrEqualTo(String value) {
            addCriterion("shop_jsType <=", value, "shopJstype");
            return (Criteria) this;
        }

        public Criteria andShopJstypeLike(String value) {
            addCriterion("shop_jsType like", value, "shopJstype");
            return (Criteria) this;
        }

        public Criteria andShopJstypeNotLike(String value) {
            addCriterion("shop_jsType not like", value, "shopJstype");
            return (Criteria) this;
        }

        public Criteria andShopJstypeIn(List<String> values) {
            addCriterion("shop_jsType in", values, "shopJstype");
            return (Criteria) this;
        }

        public Criteria andShopJstypeNotIn(List<String> values) {
            addCriterion("shop_jsType not in", values, "shopJstype");
            return (Criteria) this;
        }

        public Criteria andShopJstypeBetween(String value1, String value2) {
            addCriterion("shop_jsType between", value1, value2, "shopJstype");
            return (Criteria) this;
        }

        public Criteria andShopJstypeNotBetween(String value1, String value2) {
            addCriterion("shop_jsType not between", value1, value2, "shopJstype");
            return (Criteria) this;
        }

        public Criteria andShopRealShootingIsNull() {
            addCriterion("shop_Real_shooting is null");
            return (Criteria) this;
        }

        public Criteria andShopRealShootingIsNotNull() {
            addCriterion("shop_Real_shooting is not null");
            return (Criteria) this;
        }

        public Criteria andShopRealShootingEqualTo(String value) {
            addCriterion("shop_Real_shooting =", value, "shopRealShooting");
            return (Criteria) this;
        }

        public Criteria andShopRealShootingNotEqualTo(String value) {
            addCriterion("shop_Real_shooting <>", value, "shopRealShooting");
            return (Criteria) this;
        }

        public Criteria andShopRealShootingGreaterThan(String value) {
            addCriterion("shop_Real_shooting >", value, "shopRealShooting");
            return (Criteria) this;
        }

        public Criteria andShopRealShootingGreaterThanOrEqualTo(String value) {
            addCriterion("shop_Real_shooting >=", value, "shopRealShooting");
            return (Criteria) this;
        }

        public Criteria andShopRealShootingLessThan(String value) {
            addCriterion("shop_Real_shooting <", value, "shopRealShooting");
            return (Criteria) this;
        }

        public Criteria andShopRealShootingLessThanOrEqualTo(String value) {
            addCriterion("shop_Real_shooting <=", value, "shopRealShooting");
            return (Criteria) this;
        }

        public Criteria andShopRealShootingLike(String value) {
            addCriterion("shop_Real_shooting like", value, "shopRealShooting");
            return (Criteria) this;
        }

        public Criteria andShopRealShootingNotLike(String value) {
            addCriterion("shop_Real_shooting not like", value, "shopRealShooting");
            return (Criteria) this;
        }

        public Criteria andShopRealShootingIn(List<String> values) {
            addCriterion("shop_Real_shooting in", values, "shopRealShooting");
            return (Criteria) this;
        }

        public Criteria andShopRealShootingNotIn(List<String> values) {
            addCriterion("shop_Real_shooting not in", values, "shopRealShooting");
            return (Criteria) this;
        }

        public Criteria andShopRealShootingBetween(String value1, String value2) {
            addCriterion("shop_Real_shooting between", value1, value2, "shopRealShooting");
            return (Criteria) this;
        }

        public Criteria andShopRealShootingNotBetween(String value1, String value2) {
            addCriterion("shop_Real_shooting not between", value1, value2, "shopRealShooting");
            return (Criteria) this;
        }

        public Criteria andOperatePhoneIsNull() {
            addCriterion("operate_phone is null");
            return (Criteria) this;
        }

        public Criteria andOperatePhoneIsNotNull() {
            addCriterion("operate_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOperatePhoneEqualTo(String value) {
            addCriterion("operate_phone =", value, "operatePhone");
            return (Criteria) this;
        }

        public Criteria andOperatePhoneNotEqualTo(String value) {
            addCriterion("operate_phone <>", value, "operatePhone");
            return (Criteria) this;
        }

        public Criteria andOperatePhoneGreaterThan(String value) {
            addCriterion("operate_phone >", value, "operatePhone");
            return (Criteria) this;
        }

        public Criteria andOperatePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("operate_phone >=", value, "operatePhone");
            return (Criteria) this;
        }

        public Criteria andOperatePhoneLessThan(String value) {
            addCriterion("operate_phone <", value, "operatePhone");
            return (Criteria) this;
        }

        public Criteria andOperatePhoneLessThanOrEqualTo(String value) {
            addCriterion("operate_phone <=", value, "operatePhone");
            return (Criteria) this;
        }

        public Criteria andOperatePhoneLike(String value) {
            addCriterion("operate_phone like", value, "operatePhone");
            return (Criteria) this;
        }

        public Criteria andOperatePhoneNotLike(String value) {
            addCriterion("operate_phone not like", value, "operatePhone");
            return (Criteria) this;
        }

        public Criteria andOperatePhoneIn(List<String> values) {
            addCriterion("operate_phone in", values, "operatePhone");
            return (Criteria) this;
        }

        public Criteria andOperatePhoneNotIn(List<String> values) {
            addCriterion("operate_phone not in", values, "operatePhone");
            return (Criteria) this;
        }

        public Criteria andOperatePhoneBetween(String value1, String value2) {
            addCriterion("operate_phone between", value1, value2, "operatePhone");
            return (Criteria) this;
        }

        public Criteria andOperatePhoneNotBetween(String value1, String value2) {
            addCriterion("operate_phone not between", value1, value2, "operatePhone");
            return (Criteria) this;
        }

        public Criteria andNextTimeIsNull() {
            addCriterion("next_time is null");
            return (Criteria) this;
        }

        public Criteria andNextTimeIsNotNull() {
            addCriterion("next_time is not null");
            return (Criteria) this;
        }

        public Criteria andNextTimeEqualTo(Date value) {
            addCriterion("next_time =", value, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeNotEqualTo(Date value) {
            addCriterion("next_time <>", value, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeGreaterThan(Date value) {
            addCriterion("next_time >", value, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("next_time >=", value, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeLessThan(Date value) {
            addCriterion("next_time <", value, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeLessThanOrEqualTo(Date value) {
            addCriterion("next_time <=", value, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeIn(List<Date> values) {
            addCriterion("next_time in", values, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeNotIn(List<Date> values) {
            addCriterion("next_time not in", values, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeBetween(Date value1, Date value2) {
            addCriterion("next_time between", value1, value2, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeNotBetween(Date value1, Date value2) {
            addCriterion("next_time not between", value1, value2, "nextTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIsNull() {
            addCriterion("follow_up_record is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIsNotNull() {
            addCriterion("follow_up_record is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordEqualTo(String value) {
            addCriterion("follow_up_record =", value, "followUpRecord");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordNotEqualTo(String value) {
            addCriterion("follow_up_record <>", value, "followUpRecord");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordGreaterThan(String value) {
            addCriterion("follow_up_record >", value, "followUpRecord");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordGreaterThanOrEqualTo(String value) {
            addCriterion("follow_up_record >=", value, "followUpRecord");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordLessThan(String value) {
            addCriterion("follow_up_record <", value, "followUpRecord");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordLessThanOrEqualTo(String value) {
            addCriterion("follow_up_record <=", value, "followUpRecord");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordLike(String value) {
            addCriterion("follow_up_record like", value, "followUpRecord");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordNotLike(String value) {
            addCriterion("follow_up_record not like", value, "followUpRecord");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIn(List<String> values) {
            addCriterion("follow_up_record in", values, "followUpRecord");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordNotIn(List<String> values) {
            addCriterion("follow_up_record not in", values, "followUpRecord");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordBetween(String value1, String value2) {
            addCriterion("follow_up_record between", value1, value2, "followUpRecord");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordNotBetween(String value1, String value2) {
            addCriterion("follow_up_record not between", value1, value2, "followUpRecord");
            return (Criteria) this;
        }

        public Criteria andRefundsTimeIsNull() {
            addCriterion("refunds_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundsTimeIsNotNull() {
            addCriterion("refunds_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundsTimeEqualTo(String value) {
            addCriterion("refunds_time =", value, "refundsTime");
            return (Criteria) this;
        }

        public Criteria andRefundsTimeNotEqualTo(String value) {
            addCriterion("refunds_time <>", value, "refundsTime");
            return (Criteria) this;
        }

        public Criteria andRefundsTimeGreaterThan(String value) {
            addCriterion("refunds_time >", value, "refundsTime");
            return (Criteria) this;
        }

        public Criteria andRefundsTimeGreaterThanOrEqualTo(String value) {
            addCriterion("refunds_time >=", value, "refundsTime");
            return (Criteria) this;
        }

        public Criteria andRefundsTimeLessThan(String value) {
            addCriterion("refunds_time <", value, "refundsTime");
            return (Criteria) this;
        }

        public Criteria andRefundsTimeLessThanOrEqualTo(String value) {
            addCriterion("refunds_time <=", value, "refundsTime");
            return (Criteria) this;
        }

        public Criteria andRefundsTimeLike(String value) {
            addCriterion("refunds_time like", value, "refundsTime");
            return (Criteria) this;
        }

        public Criteria andRefundsTimeNotLike(String value) {
            addCriterion("refunds_time not like", value, "refundsTime");
            return (Criteria) this;
        }

        public Criteria andRefundsTimeIn(List<String> values) {
            addCriterion("refunds_time in", values, "refundsTime");
            return (Criteria) this;
        }

        public Criteria andRefundsTimeNotIn(List<String> values) {
            addCriterion("refunds_time not in", values, "refundsTime");
            return (Criteria) this;
        }

        public Criteria andRefundsTimeBetween(String value1, String value2) {
            addCriterion("refunds_time between", value1, value2, "refundsTime");
            return (Criteria) this;
        }

        public Criteria andRefundsTimeNotBetween(String value1, String value2) {
            addCriterion("refunds_time not between", value1, value2, "refundsTime");
            return (Criteria) this;
        }

        public Criteria andRefundsMoneyIsNull() {
            addCriterion("refunds_money is null");
            return (Criteria) this;
        }

        public Criteria andRefundsMoneyIsNotNull() {
            addCriterion("refunds_money is not null");
            return (Criteria) this;
        }

        public Criteria andRefundsMoneyEqualTo(String value) {
            addCriterion("refunds_money =", value, "refundsMoney");
            return (Criteria) this;
        }

        public Criteria andRefundsMoneyNotEqualTo(String value) {
            addCriterion("refunds_money <>", value, "refundsMoney");
            return (Criteria) this;
        }

        public Criteria andRefundsMoneyGreaterThan(String value) {
            addCriterion("refunds_money >", value, "refundsMoney");
            return (Criteria) this;
        }

        public Criteria andRefundsMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("refunds_money >=", value, "refundsMoney");
            return (Criteria) this;
        }

        public Criteria andRefundsMoneyLessThan(String value) {
            addCriterion("refunds_money <", value, "refundsMoney");
            return (Criteria) this;
        }

        public Criteria andRefundsMoneyLessThanOrEqualTo(String value) {
            addCriterion("refunds_money <=", value, "refundsMoney");
            return (Criteria) this;
        }

        public Criteria andRefundsMoneyLike(String value) {
            addCriterion("refunds_money like", value, "refundsMoney");
            return (Criteria) this;
        }

        public Criteria andRefundsMoneyNotLike(String value) {
            addCriterion("refunds_money not like", value, "refundsMoney");
            return (Criteria) this;
        }

        public Criteria andRefundsMoneyIn(List<String> values) {
            addCriterion("refunds_money in", values, "refundsMoney");
            return (Criteria) this;
        }

        public Criteria andRefundsMoneyNotIn(List<String> values) {
            addCriterion("refunds_money not in", values, "refundsMoney");
            return (Criteria) this;
        }

        public Criteria andRefundsMoneyBetween(String value1, String value2) {
            addCriterion("refunds_money between", value1, value2, "refundsMoney");
            return (Criteria) this;
        }

        public Criteria andRefundsMoneyNotBetween(String value1, String value2) {
            addCriterion("refunds_money not between", value1, value2, "refundsMoney");
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

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("data_type is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("data_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("data_type =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("data_type <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("data_type >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("data_type >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(String value) {
            addCriterion("data_type <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("data_type <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLike(String value) {
            addCriterion("data_type like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotLike(String value) {
            addCriterion("data_type not like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<String> values) {
            addCriterion("data_type in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<String> values) {
            addCriterion("data_type not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("data_type between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("data_type not between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdIsNull() {
            addCriterion("operator_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdIsNotNull() {
            addCriterion("operator_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdEqualTo(Integer value) {
            addCriterion("operator_user_id =", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdNotEqualTo(Integer value) {
            addCriterion("operator_user_id <>", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdGreaterThan(Integer value) {
            addCriterion("operator_user_id >", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("operator_user_id >=", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdLessThan(Integer value) {
            addCriterion("operator_user_id <", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("operator_user_id <=", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdIn(List<Integer> values) {
            addCriterion("operator_user_id in", values, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdNotIn(List<Integer> values) {
            addCriterion("operator_user_id not in", values, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdBetween(Integer value1, Integer value2) {
            addCriterion("operator_user_id between", value1, value2, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("operator_user_id not between", value1, value2, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andExtensionIsNull() {
            addCriterion("Extension is null");
            return (Criteria) this;
        }

        public Criteria andExtensionIsNotNull() {
            addCriterion("Extension is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionEqualTo(Integer value) {
            addCriterion("Extension =", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotEqualTo(Integer value) {
            addCriterion("Extension <>", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionGreaterThan(Integer value) {
            addCriterion("Extension >", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionGreaterThanOrEqualTo(Integer value) {
            addCriterion("Extension >=", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionLessThan(Integer value) {
            addCriterion("Extension <", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionLessThanOrEqualTo(Integer value) {
            addCriterion("Extension <=", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionIn(List<Integer> values) {
            addCriterion("Extension in", values, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotIn(List<Integer> values) {
            addCriterion("Extension not in", values, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionBetween(Integer value1, Integer value2) {
            addCriterion("Extension between", value1, value2, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotBetween(Integer value1, Integer value2) {
            addCriterion("Extension not between", value1, value2, "extension");
            return (Criteria) this;
        }

        public Criteria andTaokeTypeIsNull() {
            addCriterion("taoke_type is null");
            return (Criteria) this;
        }

        public Criteria andTaokeTypeIsNotNull() {
            addCriterion("taoke_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaokeTypeEqualTo(String value) {
            addCriterion("taoke_type =", value, "taokeType");
            return (Criteria) this;
        }

        public Criteria andTaokeTypeNotEqualTo(String value) {
            addCriterion("taoke_type <>", value, "taokeType");
            return (Criteria) this;
        }

        public Criteria andTaokeTypeGreaterThan(String value) {
            addCriterion("taoke_type >", value, "taokeType");
            return (Criteria) this;
        }

        public Criteria andTaokeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("taoke_type >=", value, "taokeType");
            return (Criteria) this;
        }

        public Criteria andTaokeTypeLessThan(String value) {
            addCriterion("taoke_type <", value, "taokeType");
            return (Criteria) this;
        }

        public Criteria andTaokeTypeLessThanOrEqualTo(String value) {
            addCriterion("taoke_type <=", value, "taokeType");
            return (Criteria) this;
        }

        public Criteria andTaokeTypeLike(String value) {
            addCriterion("taoke_type like", value, "taokeType");
            return (Criteria) this;
        }

        public Criteria andTaokeTypeNotLike(String value) {
            addCriterion("taoke_type not like", value, "taokeType");
            return (Criteria) this;
        }

        public Criteria andTaokeTypeIn(List<String> values) {
            addCriterion("taoke_type in", values, "taokeType");
            return (Criteria) this;
        }

        public Criteria andTaokeTypeNotIn(List<String> values) {
            addCriterion("taoke_type not in", values, "taokeType");
            return (Criteria) this;
        }

        public Criteria andTaokeTypeBetween(String value1, String value2) {
            addCriterion("taoke_type between", value1, value2, "taokeType");
            return (Criteria) this;
        }

        public Criteria andTaokeTypeNotBetween(String value1, String value2) {
            addCriterion("taoke_type not between", value1, value2, "taokeType");
            return (Criteria) this;
        }

        public Criteria andCooperationIsNull() {
            addCriterion("cooperation is null");
            return (Criteria) this;
        }

        public Criteria andCooperationIsNotNull() {
            addCriterion("cooperation is not null");
            return (Criteria) this;
        }

        public Criteria andCooperationEqualTo(String value) {
            addCriterion("cooperation =", value, "cooperation");
            return (Criteria) this;
        }

        public Criteria andCooperationNotEqualTo(String value) {
            addCriterion("cooperation <>", value, "cooperation");
            return (Criteria) this;
        }

        public Criteria andCooperationGreaterThan(String value) {
            addCriterion("cooperation >", value, "cooperation");
            return (Criteria) this;
        }

        public Criteria andCooperationGreaterThanOrEqualTo(String value) {
            addCriterion("cooperation >=", value, "cooperation");
            return (Criteria) this;
        }

        public Criteria andCooperationLessThan(String value) {
            addCriterion("cooperation <", value, "cooperation");
            return (Criteria) this;
        }

        public Criteria andCooperationLessThanOrEqualTo(String value) {
            addCriterion("cooperation <=", value, "cooperation");
            return (Criteria) this;
        }

        public Criteria andCooperationLike(String value) {
            addCriterion("cooperation like", value, "cooperation");
            return (Criteria) this;
        }

        public Criteria andCooperationNotLike(String value) {
            addCriterion("cooperation not like", value, "cooperation");
            return (Criteria) this;
        }

        public Criteria andCooperationIn(List<String> values) {
            addCriterion("cooperation in", values, "cooperation");
            return (Criteria) this;
        }

        public Criteria andCooperationNotIn(List<String> values) {
            addCriterion("cooperation not in", values, "cooperation");
            return (Criteria) this;
        }

        public Criteria andCooperationBetween(String value1, String value2) {
            addCriterion("cooperation between", value1, value2, "cooperation");
            return (Criteria) this;
        }

        public Criteria andCooperationNotBetween(String value1, String value2) {
            addCriterion("cooperation not between", value1, value2, "cooperation");
            return (Criteria) this;
        }

        public Criteria andCooperationNumIsNull() {
            addCriterion("cooperation_num is null");
            return (Criteria) this;
        }

        public Criteria andCooperationNumIsNotNull() {
            addCriterion("cooperation_num is not null");
            return (Criteria) this;
        }

        public Criteria andCooperationNumEqualTo(Integer value) {
            addCriterion("cooperation_num =", value, "cooperationNum");
            return (Criteria) this;
        }

        public Criteria andCooperationNumNotEqualTo(Integer value) {
            addCriterion("cooperation_num <>", value, "cooperationNum");
            return (Criteria) this;
        }

        public Criteria andCooperationNumGreaterThan(Integer value) {
            addCriterion("cooperation_num >", value, "cooperationNum");
            return (Criteria) this;
        }

        public Criteria andCooperationNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cooperation_num >=", value, "cooperationNum");
            return (Criteria) this;
        }

        public Criteria andCooperationNumLessThan(Integer value) {
            addCriterion("cooperation_num <", value, "cooperationNum");
            return (Criteria) this;
        }

        public Criteria andCooperationNumLessThanOrEqualTo(Integer value) {
            addCriterion("cooperation_num <=", value, "cooperationNum");
            return (Criteria) this;
        }

        public Criteria andCooperationNumIn(List<Integer> values) {
            addCriterion("cooperation_num in", values, "cooperationNum");
            return (Criteria) this;
        }

        public Criteria andCooperationNumNotIn(List<Integer> values) {
            addCriterion("cooperation_num not in", values, "cooperationNum");
            return (Criteria) this;
        }

        public Criteria andCooperationNumBetween(Integer value1, Integer value2) {
            addCriterion("cooperation_num between", value1, value2, "cooperationNum");
            return (Criteria) this;
        }

        public Criteria andCooperationNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cooperation_num not between", value1, value2, "cooperationNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumIsNull() {
            addCriterion("entry_num is null");
            return (Criteria) this;
        }

        public Criteria andEntryNumIsNotNull() {
            addCriterion("entry_num is not null");
            return (Criteria) this;
        }

        public Criteria andEntryNumEqualTo(Integer value) {
            addCriterion("entry_num =", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumNotEqualTo(Integer value) {
            addCriterion("entry_num <>", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumGreaterThan(Integer value) {
            addCriterion("entry_num >", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("entry_num >=", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumLessThan(Integer value) {
            addCriterion("entry_num <", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumLessThanOrEqualTo(Integer value) {
            addCriterion("entry_num <=", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumIn(List<Integer> values) {
            addCriterion("entry_num in", values, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumNotIn(List<Integer> values) {
            addCriterion("entry_num not in", values, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumBetween(Integer value1, Integer value2) {
            addCriterion("entry_num between", value1, value2, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumNotBetween(Integer value1, Integer value2) {
            addCriterion("entry_num not between", value1, value2, "entryNum");
            return (Criteria) this;
        }

        public Criteria andSpareIsNull() {
            addCriterion("Spare is null");
            return (Criteria) this;
        }

        public Criteria andSpareIsNotNull() {
            addCriterion("Spare is not null");
            return (Criteria) this;
        }

        public Criteria andSpareEqualTo(String value) {
            addCriterion("Spare =", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareNotEqualTo(String value) {
            addCriterion("Spare <>", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareGreaterThan(String value) {
            addCriterion("Spare >", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareGreaterThanOrEqualTo(String value) {
            addCriterion("Spare >=", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareLessThan(String value) {
            addCriterion("Spare <", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareLessThanOrEqualTo(String value) {
            addCriterion("Spare <=", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareLike(String value) {
            addCriterion("Spare like", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareNotLike(String value) {
            addCriterion("Spare not like", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareIn(List<String> values) {
            addCriterion("Spare in", values, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareNotIn(List<String> values) {
            addCriterion("Spare not in", values, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareBetween(String value1, String value2) {
            addCriterion("Spare between", value1, value2, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareNotBetween(String value1, String value2) {
            addCriterion("Spare not between", value1, value2, "spare");
            return (Criteria) this;
        }

        public Criteria andPrivateTypeIsNull() {
            addCriterion("private_type is null");
            return (Criteria) this;
        }

        public Criteria andPrivateTypeIsNotNull() {
            addCriterion("private_type is not null");
            return (Criteria) this;
        }

        public Criteria andPrivateTypeEqualTo(String value) {
            addCriterion("private_type =", value, "privateType");
            return (Criteria) this;
        }

        public Criteria andPrivateTypeNotEqualTo(String value) {
            addCriterion("private_type <>", value, "privateType");
            return (Criteria) this;
        }

        public Criteria andPrivateTypeGreaterThan(String value) {
            addCriterion("private_type >", value, "privateType");
            return (Criteria) this;
        }

        public Criteria andPrivateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("private_type >=", value, "privateType");
            return (Criteria) this;
        }

        public Criteria andPrivateTypeLessThan(String value) {
            addCriterion("private_type <", value, "privateType");
            return (Criteria) this;
        }

        public Criteria andPrivateTypeLessThanOrEqualTo(String value) {
            addCriterion("private_type <=", value, "privateType");
            return (Criteria) this;
        }

        public Criteria andPrivateTypeLike(String value) {
            addCriterion("private_type like", value, "privateType");
            return (Criteria) this;
        }

        public Criteria andPrivateTypeNotLike(String value) {
            addCriterion("private_type not like", value, "privateType");
            return (Criteria) this;
        }

        public Criteria andPrivateTypeIn(List<String> values) {
            addCriterion("private_type in", values, "privateType");
            return (Criteria) this;
        }

        public Criteria andPrivateTypeNotIn(List<String> values) {
            addCriterion("private_type not in", values, "privateType");
            return (Criteria) this;
        }

        public Criteria andPrivateTypeBetween(String value1, String value2) {
            addCriterion("private_type between", value1, value2, "privateType");
            return (Criteria) this;
        }

        public Criteria andPrivateTypeNotBetween(String value1, String value2) {
            addCriterion("private_type not between", value1, value2, "privateType");
            return (Criteria) this;
        }

        public Criteria andPrivateUserIdIsNull() {
            addCriterion("private_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPrivateUserIdIsNotNull() {
            addCriterion("private_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrivateUserIdEqualTo(Integer value) {
            addCriterion("private_user_id =", value, "privateUserId");
            return (Criteria) this;
        }

        public Criteria andPrivateUserIdNotEqualTo(Integer value) {
            addCriterion("private_user_id <>", value, "privateUserId");
            return (Criteria) this;
        }

        public Criteria andPrivateUserIdGreaterThan(Integer value) {
            addCriterion("private_user_id >", value, "privateUserId");
            return (Criteria) this;
        }

        public Criteria andPrivateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("private_user_id >=", value, "privateUserId");
            return (Criteria) this;
        }

        public Criteria andPrivateUserIdLessThan(Integer value) {
            addCriterion("private_user_id <", value, "privateUserId");
            return (Criteria) this;
        }

        public Criteria andPrivateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("private_user_id <=", value, "privateUserId");
            return (Criteria) this;
        }

        public Criteria andPrivateUserIdIn(List<Integer> values) {
            addCriterion("private_user_id in", values, "privateUserId");
            return (Criteria) this;
        }

        public Criteria andPrivateUserIdNotIn(List<Integer> values) {
            addCriterion("private_user_id not in", values, "privateUserId");
            return (Criteria) this;
        }

        public Criteria andPrivateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("private_user_id between", value1, value2, "privateUserId");
            return (Criteria) this;
        }

        public Criteria andPrivateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("private_user_id not between", value1, value2, "privateUserId");
            return (Criteria) this;
        }

        public Criteria andShopBzIsNull() {
            addCriterion("shop_bz is null");
            return (Criteria) this;
        }

        public Criteria andShopBzIsNotNull() {
            addCriterion("shop_bz is not null");
            return (Criteria) this;
        }

        public Criteria andShopBzEqualTo(String value) {
            addCriterion("shop_bz =", value, "shopBz");
            return (Criteria) this;
        }

        public Criteria andShopBzNotEqualTo(String value) {
            addCriterion("shop_bz <>", value, "shopBz");
            return (Criteria) this;
        }

        public Criteria andShopBzGreaterThan(String value) {
            addCriterion("shop_bz >", value, "shopBz");
            return (Criteria) this;
        }

        public Criteria andShopBzGreaterThanOrEqualTo(String value) {
            addCriterion("shop_bz >=", value, "shopBz");
            return (Criteria) this;
        }

        public Criteria andShopBzLessThan(String value) {
            addCriterion("shop_bz <", value, "shopBz");
            return (Criteria) this;
        }

        public Criteria andShopBzLessThanOrEqualTo(String value) {
            addCriterion("shop_bz <=", value, "shopBz");
            return (Criteria) this;
        }

        public Criteria andShopBzLike(String value) {
            addCriterion("shop_bz like", value, "shopBz");
            return (Criteria) this;
        }

        public Criteria andShopBzNotLike(String value) {
            addCriterion("shop_bz not like", value, "shopBz");
            return (Criteria) this;
        }

        public Criteria andShopBzIn(List<String> values) {
            addCriterion("shop_bz in", values, "shopBz");
            return (Criteria) this;
        }

        public Criteria andShopBzNotIn(List<String> values) {
            addCriterion("shop_bz not in", values, "shopBz");
            return (Criteria) this;
        }

        public Criteria andShopBzBetween(String value1, String value2) {
            addCriterion("shop_bz between", value1, value2, "shopBz");
            return (Criteria) this;
        }

        public Criteria andShopBzNotBetween(String value1, String value2) {
            addCriterion("shop_bz not between", value1, value2, "shopBz");
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