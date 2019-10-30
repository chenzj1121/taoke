package com.luoshi.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbGoodsExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsStarttimeIsNull() {
            addCriterion("goods_starttime is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStarttimeIsNotNull() {
            addCriterion("goods_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStarttimeEqualTo(Date value) {
            addCriterion("goods_starttime =", value, "goodsStarttime");
            return (Criteria) this;
        }

        public Criteria andGoodsStarttimeNotEqualTo(Date value) {
            addCriterion("goods_starttime <>", value, "goodsStarttime");
            return (Criteria) this;
        }

        public Criteria andGoodsStarttimeGreaterThan(Date value) {
            addCriterion("goods_starttime >", value, "goodsStarttime");
            return (Criteria) this;
        }

        public Criteria andGoodsStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goods_starttime >=", value, "goodsStarttime");
            return (Criteria) this;
        }

        public Criteria andGoodsStarttimeLessThan(Date value) {
            addCriterion("goods_starttime <", value, "goodsStarttime");
            return (Criteria) this;
        }

        public Criteria andGoodsStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("goods_starttime <=", value, "goodsStarttime");
            return (Criteria) this;
        }

        public Criteria andGoodsStarttimeIn(List<Date> values) {
            addCriterion("goods_starttime in", values, "goodsStarttime");
            return (Criteria) this;
        }

        public Criteria andGoodsStarttimeNotIn(List<Date> values) {
            addCriterion("goods_starttime not in", values, "goodsStarttime");
            return (Criteria) this;
        }

        public Criteria andGoodsStarttimeBetween(Date value1, Date value2) {
            addCriterion("goods_starttime between", value1, value2, "goodsStarttime");
            return (Criteria) this;
        }

        public Criteria andGoodsStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("goods_starttime not between", value1, value2, "goodsStarttime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeIsNull() {
            addCriterion("goods_endtime is null");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeIsNotNull() {
            addCriterion("goods_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeEqualTo(Date value) {
            addCriterion("goods_endtime =", value, "goodsEndtime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeNotEqualTo(Date value) {
            addCriterion("goods_endtime <>", value, "goodsEndtime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeGreaterThan(Date value) {
            addCriterion("goods_endtime >", value, "goodsEndtime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goods_endtime >=", value, "goodsEndtime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeLessThan(Date value) {
            addCriterion("goods_endtime <", value, "goodsEndtime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("goods_endtime <=", value, "goodsEndtime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeIn(List<Date> values) {
            addCriterion("goods_endtime in", values, "goodsEndtime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeNotIn(List<Date> values) {
            addCriterion("goods_endtime not in", values, "goodsEndtime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeBetween(Date value1, Date value2) {
            addCriterion("goods_endtime between", value1, value2, "goodsEndtime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("goods_endtime not between", value1, value2, "goodsEndtime");
            return (Criteria) this;
        }

        public Criteria andGoodsYhqNameIsNull() {
            addCriterion("goods_yhq_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsYhqNameIsNotNull() {
            addCriterion("goods_yhq_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsYhqNameEqualTo(String value) {
            addCriterion("goods_yhq_name =", value, "goodsYhqName");
            return (Criteria) this;
        }

        public Criteria andGoodsYhqNameNotEqualTo(String value) {
            addCriterion("goods_yhq_name <>", value, "goodsYhqName");
            return (Criteria) this;
        }

        public Criteria andGoodsYhqNameGreaterThan(String value) {
            addCriterion("goods_yhq_name >", value, "goodsYhqName");
            return (Criteria) this;
        }

        public Criteria andGoodsYhqNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_yhq_name >=", value, "goodsYhqName");
            return (Criteria) this;
        }

        public Criteria andGoodsYhqNameLessThan(String value) {
            addCriterion("goods_yhq_name <", value, "goodsYhqName");
            return (Criteria) this;
        }

        public Criteria andGoodsYhqNameLessThanOrEqualTo(String value) {
            addCriterion("goods_yhq_name <=", value, "goodsYhqName");
            return (Criteria) this;
        }

        public Criteria andGoodsYhqNameLike(String value) {
            addCriterion("goods_yhq_name like", value, "goodsYhqName");
            return (Criteria) this;
        }

        public Criteria andGoodsYhqNameNotLike(String value) {
            addCriterion("goods_yhq_name not like", value, "goodsYhqName");
            return (Criteria) this;
        }

        public Criteria andGoodsYhqNameIn(List<String> values) {
            addCriterion("goods_yhq_name in", values, "goodsYhqName");
            return (Criteria) this;
        }

        public Criteria andGoodsYhqNameNotIn(List<String> values) {
            addCriterion("goods_yhq_name not in", values, "goodsYhqName");
            return (Criteria) this;
        }

        public Criteria andGoodsYhqNameBetween(String value1, String value2) {
            addCriterion("goods_yhq_name between", value1, value2, "goodsYhqName");
            return (Criteria) this;
        }

        public Criteria andGoodsYhqNameNotBetween(String value1, String value2) {
            addCriterion("goods_yhq_name not between", value1, value2, "goodsYhqName");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsIsNull() {
            addCriterion("goods_nums is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsIsNotNull() {
            addCriterion("goods_nums is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsEqualTo(Integer value) {
            addCriterion("goods_nums =", value, "goodsNums");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsNotEqualTo(Integer value) {
            addCriterion("goods_nums <>", value, "goodsNums");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsGreaterThan(Integer value) {
            addCriterion("goods_nums >", value, "goodsNums");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_nums >=", value, "goodsNums");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsLessThan(Integer value) {
            addCriterion("goods_nums <", value, "goodsNums");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsLessThanOrEqualTo(Integer value) {
            addCriterion("goods_nums <=", value, "goodsNums");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsIn(List<Integer> values) {
            addCriterion("goods_nums in", values, "goodsNums");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsNotIn(List<Integer> values) {
            addCriterion("goods_nums not in", values, "goodsNums");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsBetween(Integer value1, Integer value2) {
            addCriterion("goods_nums between", value1, value2, "goodsNums");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_nums not between", value1, value2, "goodsNums");
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

        public Criteria andGoodsServiceIsNull() {
            addCriterion("goods_service is null");
            return (Criteria) this;
        }

        public Criteria andGoodsServiceIsNotNull() {
            addCriterion("goods_service is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsServiceEqualTo(Double value) {
            addCriterion("goods_service =", value, "goodsService");
            return (Criteria) this;
        }

        public Criteria andGoodsServiceNotEqualTo(Double value) {
            addCriterion("goods_service <>", value, "goodsService");
            return (Criteria) this;
        }

        public Criteria andGoodsServiceGreaterThan(Double value) {
            addCriterion("goods_service >", value, "goodsService");
            return (Criteria) this;
        }

        public Criteria andGoodsServiceGreaterThanOrEqualTo(Double value) {
            addCriterion("goods_service >=", value, "goodsService");
            return (Criteria) this;
        }

        public Criteria andGoodsServiceLessThan(Double value) {
            addCriterion("goods_service <", value, "goodsService");
            return (Criteria) this;
        }

        public Criteria andGoodsServiceLessThanOrEqualTo(Double value) {
            addCriterion("goods_service <=", value, "goodsService");
            return (Criteria) this;
        }

        public Criteria andGoodsServiceIn(List<Double> values) {
            addCriterion("goods_service in", values, "goodsService");
            return (Criteria) this;
        }

        public Criteria andGoodsServiceNotIn(List<Double> values) {
            addCriterion("goods_service not in", values, "goodsService");
            return (Criteria) this;
        }

        public Criteria andGoodsServiceBetween(Double value1, Double value2) {
            addCriterion("goods_service between", value1, value2, "goodsService");
            return (Criteria) this;
        }

        public Criteria andGoodsServiceNotBetween(Double value1, Double value2) {
            addCriterion("goods_service not between", value1, value2, "goodsService");
            return (Criteria) this;
        }

        public Criteria andGoodsPayMoneyIsNull() {
            addCriterion("goods_pay_money is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPayMoneyIsNotNull() {
            addCriterion("goods_pay_money is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPayMoneyEqualTo(Double value) {
            addCriterion("goods_pay_money =", value, "goodsPayMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsPayMoneyNotEqualTo(Double value) {
            addCriterion("goods_pay_money <>", value, "goodsPayMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsPayMoneyGreaterThan(Double value) {
            addCriterion("goods_pay_money >", value, "goodsPayMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsPayMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("goods_pay_money >=", value, "goodsPayMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsPayMoneyLessThan(Double value) {
            addCriterion("goods_pay_money <", value, "goodsPayMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsPayMoneyLessThanOrEqualTo(Double value) {
            addCriterion("goods_pay_money <=", value, "goodsPayMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsPayMoneyIn(List<Double> values) {
            addCriterion("goods_pay_money in", values, "goodsPayMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsPayMoneyNotIn(List<Double> values) {
            addCriterion("goods_pay_money not in", values, "goodsPayMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsPayMoneyBetween(Double value1, Double value2) {
            addCriterion("goods_pay_money between", value1, value2, "goodsPayMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsPayMoneyNotBetween(Double value1, Double value2) {
            addCriterion("goods_pay_money not between", value1, value2, "goodsPayMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsShopIdIsNull() {
            addCriterion("goods_shop_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsShopIdIsNotNull() {
            addCriterion("goods_shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsShopIdEqualTo(Integer value) {
            addCriterion("goods_shop_id =", value, "goodsShopId");
            return (Criteria) this;
        }

        public Criteria andGoodsShopIdNotEqualTo(Integer value) {
            addCriterion("goods_shop_id <>", value, "goodsShopId");
            return (Criteria) this;
        }

        public Criteria andGoodsShopIdGreaterThan(Integer value) {
            addCriterion("goods_shop_id >", value, "goodsShopId");
            return (Criteria) this;
        }

        public Criteria andGoodsShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_shop_id >=", value, "goodsShopId");
            return (Criteria) this;
        }

        public Criteria andGoodsShopIdLessThan(Integer value) {
            addCriterion("goods_shop_id <", value, "goodsShopId");
            return (Criteria) this;
        }

        public Criteria andGoodsShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_shop_id <=", value, "goodsShopId");
            return (Criteria) this;
        }

        public Criteria andGoodsShopIdIn(List<Integer> values) {
            addCriterion("goods_shop_id in", values, "goodsShopId");
            return (Criteria) this;
        }

        public Criteria andGoodsShopIdNotIn(List<Integer> values) {
            addCriterion("goods_shop_id not in", values, "goodsShopId");
            return (Criteria) this;
        }

        public Criteria andGoodsShopIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_shop_id between", value1, value2, "goodsShopId");
            return (Criteria) this;
        }

        public Criteria andGoodsShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_shop_id not between", value1, value2, "goodsShopId");
            return (Criteria) this;
        }

        public Criteria andGoodsDeptIdIsNull() {
            addCriterion("goods_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDeptIdIsNotNull() {
            addCriterion("goods_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDeptIdEqualTo(Integer value) {
            addCriterion("goods_dept_id =", value, "goodsDeptId");
            return (Criteria) this;
        }

        public Criteria andGoodsDeptIdNotEqualTo(Integer value) {
            addCriterion("goods_dept_id <>", value, "goodsDeptId");
            return (Criteria) this;
        }

        public Criteria andGoodsDeptIdGreaterThan(Integer value) {
            addCriterion("goods_dept_id >", value, "goodsDeptId");
            return (Criteria) this;
        }

        public Criteria andGoodsDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_dept_id >=", value, "goodsDeptId");
            return (Criteria) this;
        }

        public Criteria andGoodsDeptIdLessThan(Integer value) {
            addCriterion("goods_dept_id <", value, "goodsDeptId");
            return (Criteria) this;
        }

        public Criteria andGoodsDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_dept_id <=", value, "goodsDeptId");
            return (Criteria) this;
        }

        public Criteria andGoodsDeptIdIn(List<Integer> values) {
            addCriterion("goods_dept_id in", values, "goodsDeptId");
            return (Criteria) this;
        }

        public Criteria andGoodsDeptIdNotIn(List<Integer> values) {
            addCriterion("goods_dept_id not in", values, "goodsDeptId");
            return (Criteria) this;
        }

        public Criteria andGoodsDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_dept_id between", value1, value2, "goodsDeptId");
            return (Criteria) this;
        }

        public Criteria andGoodsDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_dept_id not between", value1, value2, "goodsDeptId");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupIdIsNull() {
            addCriterion("goods_group_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupIdIsNotNull() {
            addCriterion("goods_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupIdEqualTo(Integer value) {
            addCriterion("goods_group_id =", value, "goodsGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupIdNotEqualTo(Integer value) {
            addCriterion("goods_group_id <>", value, "goodsGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupIdGreaterThan(Integer value) {
            addCriterion("goods_group_id >", value, "goodsGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_group_id >=", value, "goodsGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupIdLessThan(Integer value) {
            addCriterion("goods_group_id <", value, "goodsGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_group_id <=", value, "goodsGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupIdIn(List<Integer> values) {
            addCriterion("goods_group_id in", values, "goodsGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupIdNotIn(List<Integer> values) {
            addCriterion("goods_group_id not in", values, "goodsGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_group_id between", value1, value2, "goodsGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_group_id not between", value1, value2, "goodsGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsUserIdIsNull() {
            addCriterion("goods_user_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUserIdIsNotNull() {
            addCriterion("goods_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUserIdEqualTo(Integer value) {
            addCriterion("goods_user_id =", value, "goodsUserId");
            return (Criteria) this;
        }

        public Criteria andGoodsUserIdNotEqualTo(Integer value) {
            addCriterion("goods_user_id <>", value, "goodsUserId");
            return (Criteria) this;
        }

        public Criteria andGoodsUserIdGreaterThan(Integer value) {
            addCriterion("goods_user_id >", value, "goodsUserId");
            return (Criteria) this;
        }

        public Criteria andGoodsUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_user_id >=", value, "goodsUserId");
            return (Criteria) this;
        }

        public Criteria andGoodsUserIdLessThan(Integer value) {
            addCriterion("goods_user_id <", value, "goodsUserId");
            return (Criteria) this;
        }

        public Criteria andGoodsUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_user_id <=", value, "goodsUserId");
            return (Criteria) this;
        }

        public Criteria andGoodsUserIdIn(List<Integer> values) {
            addCriterion("goods_user_id in", values, "goodsUserId");
            return (Criteria) this;
        }

        public Criteria andGoodsUserIdNotIn(List<Integer> values) {
            addCriterion("goods_user_id not in", values, "goodsUserId");
            return (Criteria) this;
        }

        public Criteria andGoodsUserIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_user_id between", value1, value2, "goodsUserId");
            return (Criteria) this;
        }

        public Criteria andGoodsUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_user_id not between", value1, value2, "goodsUserId");
            return (Criteria) this;
        }

        public Criteria andGoodsFidIsNull() {
            addCriterion("goods_FID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsFidIsNotNull() {
            addCriterion("goods_FID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsFidEqualTo(Long value) {
            addCriterion("goods_FID =", value, "goodsFid");
            return (Criteria) this;
        }

        public Criteria andGoodsFidNotEqualTo(Long value) {
            addCriterion("goods_FID <>", value, "goodsFid");
            return (Criteria) this;
        }

        public Criteria andGoodsFidGreaterThan(Long value) {
            addCriterion("goods_FID >", value, "goodsFid");
            return (Criteria) this;
        }

        public Criteria andGoodsFidGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_FID >=", value, "goodsFid");
            return (Criteria) this;
        }

        public Criteria andGoodsFidLessThan(Long value) {
            addCriterion("goods_FID <", value, "goodsFid");
            return (Criteria) this;
        }

        public Criteria andGoodsFidLessThanOrEqualTo(Long value) {
            addCriterion("goods_FID <=", value, "goodsFid");
            return (Criteria) this;
        }

        public Criteria andGoodsFidIn(List<Long> values) {
            addCriterion("goods_FID in", values, "goodsFid");
            return (Criteria) this;
        }

        public Criteria andGoodsFidNotIn(List<Long> values) {
            addCriterion("goods_FID not in", values, "goodsFid");
            return (Criteria) this;
        }

        public Criteria andGoodsFidBetween(Long value1, Long value2) {
            addCriterion("goods_FID between", value1, value2, "goodsFid");
            return (Criteria) this;
        }

        public Criteria andGoodsFidNotBetween(Long value1, Long value2) {
            addCriterion("goods_FID not between", value1, value2, "goodsFid");
            return (Criteria) this;
        }

        public Criteria andGoodsShopNameIsNull() {
            addCriterion("goods_shop_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsShopNameIsNotNull() {
            addCriterion("goods_shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsShopNameEqualTo(String value) {
            addCriterion("goods_shop_name =", value, "goodsShopName");
            return (Criteria) this;
        }

        public Criteria andGoodsShopNameNotEqualTo(String value) {
            addCriterion("goods_shop_name <>", value, "goodsShopName");
            return (Criteria) this;
        }

        public Criteria andGoodsShopNameGreaterThan(String value) {
            addCriterion("goods_shop_name >", value, "goodsShopName");
            return (Criteria) this;
        }

        public Criteria andGoodsShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_shop_name >=", value, "goodsShopName");
            return (Criteria) this;
        }

        public Criteria andGoodsShopNameLessThan(String value) {
            addCriterion("goods_shop_name <", value, "goodsShopName");
            return (Criteria) this;
        }

        public Criteria andGoodsShopNameLessThanOrEqualTo(String value) {
            addCriterion("goods_shop_name <=", value, "goodsShopName");
            return (Criteria) this;
        }

        public Criteria andGoodsShopNameLike(String value) {
            addCriterion("goods_shop_name like", value, "goodsShopName");
            return (Criteria) this;
        }

        public Criteria andGoodsShopNameNotLike(String value) {
            addCriterion("goods_shop_name not like", value, "goodsShopName");
            return (Criteria) this;
        }

        public Criteria andGoodsShopNameIn(List<String> values) {
            addCriterion("goods_shop_name in", values, "goodsShopName");
            return (Criteria) this;
        }

        public Criteria andGoodsShopNameNotIn(List<String> values) {
            addCriterion("goods_shop_name not in", values, "goodsShopName");
            return (Criteria) this;
        }

        public Criteria andGoodsShopNameBetween(String value1, String value2) {
            addCriterion("goods_shop_name between", value1, value2, "goodsShopName");
            return (Criteria) this;
        }

        public Criteria andGoodsShopNameNotBetween(String value1, String value2) {
            addCriterion("goods_shop_name not between", value1, value2, "goodsShopName");
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