package com.luoshi.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbCoopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCoopExample() {
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

        public Criteria andCoopIdIsNull() {
            addCriterion("coop_id is null");
            return (Criteria) this;
        }

        public Criteria andCoopIdIsNotNull() {
            addCriterion("coop_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoopIdEqualTo(Integer value) {
            addCriterion("coop_id =", value, "coopId");
            return (Criteria) this;
        }

        public Criteria andCoopIdNotEqualTo(Integer value) {
            addCriterion("coop_id <>", value, "coopId");
            return (Criteria) this;
        }

        public Criteria andCoopIdGreaterThan(Integer value) {
            addCriterion("coop_id >", value, "coopId");
            return (Criteria) this;
        }

        public Criteria andCoopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coop_id >=", value, "coopId");
            return (Criteria) this;
        }

        public Criteria andCoopIdLessThan(Integer value) {
            addCriterion("coop_id <", value, "coopId");
            return (Criteria) this;
        }

        public Criteria andCoopIdLessThanOrEqualTo(Integer value) {
            addCriterion("coop_id <=", value, "coopId");
            return (Criteria) this;
        }

        public Criteria andCoopIdIn(List<Integer> values) {
            addCriterion("coop_id in", values, "coopId");
            return (Criteria) this;
        }

        public Criteria andCoopIdNotIn(List<Integer> values) {
            addCriterion("coop_id not in", values, "coopId");
            return (Criteria) this;
        }

        public Criteria andCoopIdBetween(Integer value1, Integer value2) {
            addCriterion("coop_id between", value1, value2, "coopId");
            return (Criteria) this;
        }

        public Criteria andCoopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coop_id not between", value1, value2, "coopId");
            return (Criteria) this;
        }

        public Criteria andCoopTypeIsNull() {
            addCriterion("coop_type is null");
            return (Criteria) this;
        }

        public Criteria andCoopTypeIsNotNull() {
            addCriterion("coop_type is not null");
            return (Criteria) this;
        }

        public Criteria andCoopTypeEqualTo(String value) {
            addCriterion("coop_type =", value, "coopType");
            return (Criteria) this;
        }

        public Criteria andCoopTypeNotEqualTo(String value) {
            addCriterion("coop_type <>", value, "coopType");
            return (Criteria) this;
        }

        public Criteria andCoopTypeGreaterThan(String value) {
            addCriterion("coop_type >", value, "coopType");
            return (Criteria) this;
        }

        public Criteria andCoopTypeGreaterThanOrEqualTo(String value) {
            addCriterion("coop_type >=", value, "coopType");
            return (Criteria) this;
        }

        public Criteria andCoopTypeLessThan(String value) {
            addCriterion("coop_type <", value, "coopType");
            return (Criteria) this;
        }

        public Criteria andCoopTypeLessThanOrEqualTo(String value) {
            addCriterion("coop_type <=", value, "coopType");
            return (Criteria) this;
        }

        public Criteria andCoopTypeLike(String value) {
            addCriterion("coop_type like", value, "coopType");
            return (Criteria) this;
        }

        public Criteria andCoopTypeNotLike(String value) {
            addCriterion("coop_type not like", value, "coopType");
            return (Criteria) this;
        }

        public Criteria andCoopTypeIn(List<String> values) {
            addCriterion("coop_type in", values, "coopType");
            return (Criteria) this;
        }

        public Criteria andCoopTypeNotIn(List<String> values) {
            addCriterion("coop_type not in", values, "coopType");
            return (Criteria) this;
        }

        public Criteria andCoopTypeBetween(String value1, String value2) {
            addCriterion("coop_type between", value1, value2, "coopType");
            return (Criteria) this;
        }

        public Criteria andCoopTypeNotBetween(String value1, String value2) {
            addCriterion("coop_type not between", value1, value2, "coopType");
            return (Criteria) this;
        }

        public Criteria andCoopPttypeIsNull() {
            addCriterion("coop_ptType is null");
            return (Criteria) this;
        }

        public Criteria andCoopPttypeIsNotNull() {
            addCriterion("coop_ptType is not null");
            return (Criteria) this;
        }

        public Criteria andCoopPttypeEqualTo(String value) {
            addCriterion("coop_ptType =", value, "coopPttype");
            return (Criteria) this;
        }

        public Criteria andCoopPttypeNotEqualTo(String value) {
            addCriterion("coop_ptType <>", value, "coopPttype");
            return (Criteria) this;
        }

        public Criteria andCoopPttypeGreaterThan(String value) {
            addCriterion("coop_ptType >", value, "coopPttype");
            return (Criteria) this;
        }

        public Criteria andCoopPttypeGreaterThanOrEqualTo(String value) {
            addCriterion("coop_ptType >=", value, "coopPttype");
            return (Criteria) this;
        }

        public Criteria andCoopPttypeLessThan(String value) {
            addCriterion("coop_ptType <", value, "coopPttype");
            return (Criteria) this;
        }

        public Criteria andCoopPttypeLessThanOrEqualTo(String value) {
            addCriterion("coop_ptType <=", value, "coopPttype");
            return (Criteria) this;
        }

        public Criteria andCoopPttypeLike(String value) {
            addCriterion("coop_ptType like", value, "coopPttype");
            return (Criteria) this;
        }

        public Criteria andCoopPttypeNotLike(String value) {
            addCriterion("coop_ptType not like", value, "coopPttype");
            return (Criteria) this;
        }

        public Criteria andCoopPttypeIn(List<String> values) {
            addCriterion("coop_ptType in", values, "coopPttype");
            return (Criteria) this;
        }

        public Criteria andCoopPttypeNotIn(List<String> values) {
            addCriterion("coop_ptType not in", values, "coopPttype");
            return (Criteria) this;
        }

        public Criteria andCoopPttypeBetween(String value1, String value2) {
            addCriterion("coop_ptType between", value1, value2, "coopPttype");
            return (Criteria) this;
        }

        public Criteria andCoopPttypeNotBetween(String value1, String value2) {
            addCriterion("coop_ptType not between", value1, value2, "coopPttype");
            return (Criteria) this;
        }

        public Criteria andCoopXdwtypeIsNull() {
            addCriterion("coop_xdwType is null");
            return (Criteria) this;
        }

        public Criteria andCoopXdwtypeIsNotNull() {
            addCriterion("coop_xdwType is not null");
            return (Criteria) this;
        }

        public Criteria andCoopXdwtypeEqualTo(String value) {
            addCriterion("coop_xdwType =", value, "coopXdwtype");
            return (Criteria) this;
        }

        public Criteria andCoopXdwtypeNotEqualTo(String value) {
            addCriterion("coop_xdwType <>", value, "coopXdwtype");
            return (Criteria) this;
        }

        public Criteria andCoopXdwtypeGreaterThan(String value) {
            addCriterion("coop_xdwType >", value, "coopXdwtype");
            return (Criteria) this;
        }

        public Criteria andCoopXdwtypeGreaterThanOrEqualTo(String value) {
            addCriterion("coop_xdwType >=", value, "coopXdwtype");
            return (Criteria) this;
        }

        public Criteria andCoopXdwtypeLessThan(String value) {
            addCriterion("coop_xdwType <", value, "coopXdwtype");
            return (Criteria) this;
        }

        public Criteria andCoopXdwtypeLessThanOrEqualTo(String value) {
            addCriterion("coop_xdwType <=", value, "coopXdwtype");
            return (Criteria) this;
        }

        public Criteria andCoopXdwtypeLike(String value) {
            addCriterion("coop_xdwType like", value, "coopXdwtype");
            return (Criteria) this;
        }

        public Criteria andCoopXdwtypeNotLike(String value) {
            addCriterion("coop_xdwType not like", value, "coopXdwtype");
            return (Criteria) this;
        }

        public Criteria andCoopXdwtypeIn(List<String> values) {
            addCriterion("coop_xdwType in", values, "coopXdwtype");
            return (Criteria) this;
        }

        public Criteria andCoopXdwtypeNotIn(List<String> values) {
            addCriterion("coop_xdwType not in", values, "coopXdwtype");
            return (Criteria) this;
        }

        public Criteria andCoopXdwtypeBetween(String value1, String value2) {
            addCriterion("coop_xdwType between", value1, value2, "coopXdwtype");
            return (Criteria) this;
        }

        public Criteria andCoopXdwtypeNotBetween(String value1, String value2) {
            addCriterion("coop_xdwType not between", value1, value2, "coopXdwtype");
            return (Criteria) this;
        }

        public Criteria andCoopCustomerIsNull() {
            addCriterion("coop_customer is null");
            return (Criteria) this;
        }

        public Criteria andCoopCustomerIsNotNull() {
            addCriterion("coop_customer is not null");
            return (Criteria) this;
        }

        public Criteria andCoopCustomerEqualTo(String value) {
            addCriterion("coop_customer =", value, "coopCustomer");
            return (Criteria) this;
        }

        public Criteria andCoopCustomerNotEqualTo(String value) {
            addCriterion("coop_customer <>", value, "coopCustomer");
            return (Criteria) this;
        }

        public Criteria andCoopCustomerGreaterThan(String value) {
            addCriterion("coop_customer >", value, "coopCustomer");
            return (Criteria) this;
        }

        public Criteria andCoopCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("coop_customer >=", value, "coopCustomer");
            return (Criteria) this;
        }

        public Criteria andCoopCustomerLessThan(String value) {
            addCriterion("coop_customer <", value, "coopCustomer");
            return (Criteria) this;
        }

        public Criteria andCoopCustomerLessThanOrEqualTo(String value) {
            addCriterion("coop_customer <=", value, "coopCustomer");
            return (Criteria) this;
        }

        public Criteria andCoopCustomerLike(String value) {
            addCriterion("coop_customer like", value, "coopCustomer");
            return (Criteria) this;
        }

        public Criteria andCoopCustomerNotLike(String value) {
            addCriterion("coop_customer not like", value, "coopCustomer");
            return (Criteria) this;
        }

        public Criteria andCoopCustomerIn(List<String> values) {
            addCriterion("coop_customer in", values, "coopCustomer");
            return (Criteria) this;
        }

        public Criteria andCoopCustomerNotIn(List<String> values) {
            addCriterion("coop_customer not in", values, "coopCustomer");
            return (Criteria) this;
        }

        public Criteria andCoopCustomerBetween(String value1, String value2) {
            addCriterion("coop_customer between", value1, value2, "coopCustomer");
            return (Criteria) this;
        }

        public Criteria andCoopCustomerNotBetween(String value1, String value2) {
            addCriterion("coop_customer not between", value1, value2, "coopCustomer");
            return (Criteria) this;
        }

        public Criteria andCoopMainpictureIsNull() {
            addCriterion("coop_mainPicture is null");
            return (Criteria) this;
        }

        public Criteria andCoopMainpictureIsNotNull() {
            addCriterion("coop_mainPicture is not null");
            return (Criteria) this;
        }

        public Criteria andCoopMainpictureEqualTo(String value) {
            addCriterion("coop_mainPicture =", value, "coopMainpicture");
            return (Criteria) this;
        }

        public Criteria andCoopMainpictureNotEqualTo(String value) {
            addCriterion("coop_mainPicture <>", value, "coopMainpicture");
            return (Criteria) this;
        }

        public Criteria andCoopMainpictureGreaterThan(String value) {
            addCriterion("coop_mainPicture >", value, "coopMainpicture");
            return (Criteria) this;
        }

        public Criteria andCoopMainpictureGreaterThanOrEqualTo(String value) {
            addCriterion("coop_mainPicture >=", value, "coopMainpicture");
            return (Criteria) this;
        }

        public Criteria andCoopMainpictureLessThan(String value) {
            addCriterion("coop_mainPicture <", value, "coopMainpicture");
            return (Criteria) this;
        }

        public Criteria andCoopMainpictureLessThanOrEqualTo(String value) {
            addCriterion("coop_mainPicture <=", value, "coopMainpicture");
            return (Criteria) this;
        }

        public Criteria andCoopMainpictureLike(String value) {
            addCriterion("coop_mainPicture like", value, "coopMainpicture");
            return (Criteria) this;
        }

        public Criteria andCoopMainpictureNotLike(String value) {
            addCriterion("coop_mainPicture not like", value, "coopMainpicture");
            return (Criteria) this;
        }

        public Criteria andCoopMainpictureIn(List<String> values) {
            addCriterion("coop_mainPicture in", values, "coopMainpicture");
            return (Criteria) this;
        }

        public Criteria andCoopMainpictureNotIn(List<String> values) {
            addCriterion("coop_mainPicture not in", values, "coopMainpicture");
            return (Criteria) this;
        }

        public Criteria andCoopMainpictureBetween(String value1, String value2) {
            addCriterion("coop_mainPicture between", value1, value2, "coopMainpicture");
            return (Criteria) this;
        }

        public Criteria andCoopMainpictureNotBetween(String value1, String value2) {
            addCriterion("coop_mainPicture not between", value1, value2, "coopMainpicture");
            return (Criteria) this;
        }

        public Criteria andCoopActivityIsNull() {
            addCriterion("coop_activity is null");
            return (Criteria) this;
        }

        public Criteria andCoopActivityIsNotNull() {
            addCriterion("coop_activity is not null");
            return (Criteria) this;
        }

        public Criteria andCoopActivityEqualTo(String value) {
            addCriterion("coop_activity =", value, "coopActivity");
            return (Criteria) this;
        }

        public Criteria andCoopActivityNotEqualTo(String value) {
            addCriterion("coop_activity <>", value, "coopActivity");
            return (Criteria) this;
        }

        public Criteria andCoopActivityGreaterThan(String value) {
            addCriterion("coop_activity >", value, "coopActivity");
            return (Criteria) this;
        }

        public Criteria andCoopActivityGreaterThanOrEqualTo(String value) {
            addCriterion("coop_activity >=", value, "coopActivity");
            return (Criteria) this;
        }

        public Criteria andCoopActivityLessThan(String value) {
            addCriterion("coop_activity <", value, "coopActivity");
            return (Criteria) this;
        }

        public Criteria andCoopActivityLessThanOrEqualTo(String value) {
            addCriterion("coop_activity <=", value, "coopActivity");
            return (Criteria) this;
        }

        public Criteria andCoopActivityLike(String value) {
            addCriterion("coop_activity like", value, "coopActivity");
            return (Criteria) this;
        }

        public Criteria andCoopActivityNotLike(String value) {
            addCriterion("coop_activity not like", value, "coopActivity");
            return (Criteria) this;
        }

        public Criteria andCoopActivityIn(List<String> values) {
            addCriterion("coop_activity in", values, "coopActivity");
            return (Criteria) this;
        }

        public Criteria andCoopActivityNotIn(List<String> values) {
            addCriterion("coop_activity not in", values, "coopActivity");
            return (Criteria) this;
        }

        public Criteria andCoopActivityBetween(String value1, String value2) {
            addCriterion("coop_activity between", value1, value2, "coopActivity");
            return (Criteria) this;
        }

        public Criteria andCoopActivityNotBetween(String value1, String value2) {
            addCriterion("coop_activity not between", value1, value2, "coopActivity");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsIdIsNull() {
            addCriterion("coop_goods_Id is null");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsIdIsNotNull() {
            addCriterion("coop_goods_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsIdEqualTo(Long value) {
            addCriterion("coop_goods_Id =", value, "coopGoodsId");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsIdNotEqualTo(Long value) {
            addCriterion("coop_goods_Id <>", value, "coopGoodsId");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsIdGreaterThan(Long value) {
            addCriterion("coop_goods_Id >", value, "coopGoodsId");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("coop_goods_Id >=", value, "coopGoodsId");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsIdLessThan(Long value) {
            addCriterion("coop_goods_Id <", value, "coopGoodsId");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("coop_goods_Id <=", value, "coopGoodsId");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsIdIn(List<Long> values) {
            addCriterion("coop_goods_Id in", values, "coopGoodsId");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsIdNotIn(List<Long> values) {
            addCriterion("coop_goods_Id not in", values, "coopGoodsId");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsIdBetween(Long value1, Long value2) {
            addCriterion("coop_goods_Id between", value1, value2, "coopGoodsId");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("coop_goods_Id not between", value1, value2, "coopGoodsId");
            return (Criteria) this;
        }

        public Criteria andCoopZeroIsNull() {
            addCriterion("coop_zero is null");
            return (Criteria) this;
        }

        public Criteria andCoopZeroIsNotNull() {
            addCriterion("coop_zero is not null");
            return (Criteria) this;
        }

        public Criteria andCoopZeroEqualTo(String value) {
            addCriterion("coop_zero =", value, "coopZero");
            return (Criteria) this;
        }

        public Criteria andCoopZeroNotEqualTo(String value) {
            addCriterion("coop_zero <>", value, "coopZero");
            return (Criteria) this;
        }

        public Criteria andCoopZeroGreaterThan(String value) {
            addCriterion("coop_zero >", value, "coopZero");
            return (Criteria) this;
        }

        public Criteria andCoopZeroGreaterThanOrEqualTo(String value) {
            addCriterion("coop_zero >=", value, "coopZero");
            return (Criteria) this;
        }

        public Criteria andCoopZeroLessThan(String value) {
            addCriterion("coop_zero <", value, "coopZero");
            return (Criteria) this;
        }

        public Criteria andCoopZeroLessThanOrEqualTo(String value) {
            addCriterion("coop_zero <=", value, "coopZero");
            return (Criteria) this;
        }

        public Criteria andCoopZeroLike(String value) {
            addCriterion("coop_zero like", value, "coopZero");
            return (Criteria) this;
        }

        public Criteria andCoopZeroNotLike(String value) {
            addCriterion("coop_zero not like", value, "coopZero");
            return (Criteria) this;
        }

        public Criteria andCoopZeroIn(List<String> values) {
            addCriterion("coop_zero in", values, "coopZero");
            return (Criteria) this;
        }

        public Criteria andCoopZeroNotIn(List<String> values) {
            addCriterion("coop_zero not in", values, "coopZero");
            return (Criteria) this;
        }

        public Criteria andCoopZeroBetween(String value1, String value2) {
            addCriterion("coop_zero between", value1, value2, "coopZero");
            return (Criteria) this;
        }

        public Criteria andCoopZeroNotBetween(String value1, String value2) {
            addCriterion("coop_zero not between", value1, value2, "coopZero");
            return (Criteria) this;
        }

        public Criteria andCoopAlterpriceIsNull() {
            addCriterion("coop_alterPrice is null");
            return (Criteria) this;
        }

        public Criteria andCoopAlterpriceIsNotNull() {
            addCriterion("coop_alterPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCoopAlterpriceEqualTo(Double value) {
            addCriterion("coop_alterPrice =", value, "coopAlterprice");
            return (Criteria) this;
        }

        public Criteria andCoopAlterpriceNotEqualTo(Double value) {
            addCriterion("coop_alterPrice <>", value, "coopAlterprice");
            return (Criteria) this;
        }

        public Criteria andCoopAlterpriceGreaterThan(Double value) {
            addCriterion("coop_alterPrice >", value, "coopAlterprice");
            return (Criteria) this;
        }

        public Criteria andCoopAlterpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("coop_alterPrice >=", value, "coopAlterprice");
            return (Criteria) this;
        }

        public Criteria andCoopAlterpriceLessThan(Double value) {
            addCriterion("coop_alterPrice <", value, "coopAlterprice");
            return (Criteria) this;
        }

        public Criteria andCoopAlterpriceLessThanOrEqualTo(Double value) {
            addCriterion("coop_alterPrice <=", value, "coopAlterprice");
            return (Criteria) this;
        }

        public Criteria andCoopAlterpriceIn(List<Double> values) {
            addCriterion("coop_alterPrice in", values, "coopAlterprice");
            return (Criteria) this;
        }

        public Criteria andCoopAlterpriceNotIn(List<Double> values) {
            addCriterion("coop_alterPrice not in", values, "coopAlterprice");
            return (Criteria) this;
        }

        public Criteria andCoopAlterpriceBetween(Double value1, Double value2) {
            addCriterion("coop_alterPrice between", value1, value2, "coopAlterprice");
            return (Criteria) this;
        }

        public Criteria andCoopAlterpriceNotBetween(Double value1, Double value2) {
            addCriterion("coop_alterPrice not between", value1, value2, "coopAlterprice");
            return (Criteria) this;
        }

        public Criteria andCoopYhqnumsIsNull() {
            addCriterion("coop_yhqNums is null");
            return (Criteria) this;
        }

        public Criteria andCoopYhqnumsIsNotNull() {
            addCriterion("coop_yhqNums is not null");
            return (Criteria) this;
        }

        public Criteria andCoopYhqnumsEqualTo(Integer value) {
            addCriterion("coop_yhqNums =", value, "coopYhqnums");
            return (Criteria) this;
        }

        public Criteria andCoopYhqnumsNotEqualTo(Integer value) {
            addCriterion("coop_yhqNums <>", value, "coopYhqnums");
            return (Criteria) this;
        }

        public Criteria andCoopYhqnumsGreaterThan(Integer value) {
            addCriterion("coop_yhqNums >", value, "coopYhqnums");
            return (Criteria) this;
        }

        public Criteria andCoopYhqnumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("coop_yhqNums >=", value, "coopYhqnums");
            return (Criteria) this;
        }

        public Criteria andCoopYhqnumsLessThan(Integer value) {
            addCriterion("coop_yhqNums <", value, "coopYhqnums");
            return (Criteria) this;
        }

        public Criteria andCoopYhqnumsLessThanOrEqualTo(Integer value) {
            addCriterion("coop_yhqNums <=", value, "coopYhqnums");
            return (Criteria) this;
        }

        public Criteria andCoopYhqnumsIn(List<Integer> values) {
            addCriterion("coop_yhqNums in", values, "coopYhqnums");
            return (Criteria) this;
        }

        public Criteria andCoopYhqnumsNotIn(List<Integer> values) {
            addCriterion("coop_yhqNums not in", values, "coopYhqnums");
            return (Criteria) this;
        }

        public Criteria andCoopYhqnumsBetween(Integer value1, Integer value2) {
            addCriterion("coop_yhqNums between", value1, value2, "coopYhqnums");
            return (Criteria) this;
        }

        public Criteria andCoopYhqnumsNotBetween(Integer value1, Integer value2) {
            addCriterion("coop_yhqNums not between", value1, value2, "coopYhqnums");
            return (Criteria) this;
        }

        public Criteria andCoopYjscaleIsNull() {
            addCriterion("coop_yjScale is null");
            return (Criteria) this;
        }

        public Criteria andCoopYjscaleIsNotNull() {
            addCriterion("coop_yjScale is not null");
            return (Criteria) this;
        }

        public Criteria andCoopYjscaleEqualTo(String value) {
            addCriterion("coop_yjScale =", value, "coopYjscale");
            return (Criteria) this;
        }

        public Criteria andCoopYjscaleNotEqualTo(String value) {
            addCriterion("coop_yjScale <>", value, "coopYjscale");
            return (Criteria) this;
        }

        public Criteria andCoopYjscaleGreaterThan(String value) {
            addCriterion("coop_yjScale >", value, "coopYjscale");
            return (Criteria) this;
        }

        public Criteria andCoopYjscaleGreaterThanOrEqualTo(String value) {
            addCriterion("coop_yjScale >=", value, "coopYjscale");
            return (Criteria) this;
        }

        public Criteria andCoopYjscaleLessThan(String value) {
            addCriterion("coop_yjScale <", value, "coopYjscale");
            return (Criteria) this;
        }

        public Criteria andCoopYjscaleLessThanOrEqualTo(String value) {
            addCriterion("coop_yjScale <=", value, "coopYjscale");
            return (Criteria) this;
        }

        public Criteria andCoopYjscaleLike(String value) {
            addCriterion("coop_yjScale like", value, "coopYjscale");
            return (Criteria) this;
        }

        public Criteria andCoopYjscaleNotLike(String value) {
            addCriterion("coop_yjScale not like", value, "coopYjscale");
            return (Criteria) this;
        }

        public Criteria andCoopYjscaleIn(List<String> values) {
            addCriterion("coop_yjScale in", values, "coopYjscale");
            return (Criteria) this;
        }

        public Criteria andCoopYjscaleNotIn(List<String> values) {
            addCriterion("coop_yjScale not in", values, "coopYjscale");
            return (Criteria) this;
        }

        public Criteria andCoopYjscaleBetween(String value1, String value2) {
            addCriterion("coop_yjScale between", value1, value2, "coopYjscale");
            return (Criteria) this;
        }

        public Criteria andCoopYjscaleNotBetween(String value1, String value2) {
            addCriterion("coop_yjScale not between", value1, value2, "coopYjscale");
            return (Criteria) this;
        }

        public Criteria andCoopTbtimeIsNull() {
            addCriterion("coop_tbTime is null");
            return (Criteria) this;
        }

        public Criteria andCoopTbtimeIsNotNull() {
            addCriterion("coop_tbTime is not null");
            return (Criteria) this;
        }

        public Criteria andCoopTbtimeEqualTo(Date value) {
            addCriterion("coop_tbTime =", value, "coopTbtime");
            return (Criteria) this;
        }

        public Criteria andCoopTbtimeNotEqualTo(Date value) {
            addCriterion("coop_tbTime <>", value, "coopTbtime");
            return (Criteria) this;
        }

        public Criteria andCoopTbtimeGreaterThan(Date value) {
            addCriterion("coop_tbTime >", value, "coopTbtime");
            return (Criteria) this;
        }

        public Criteria andCoopTbtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("coop_tbTime >=", value, "coopTbtime");
            return (Criteria) this;
        }

        public Criteria andCoopTbtimeLessThan(Date value) {
            addCriterion("coop_tbTime <", value, "coopTbtime");
            return (Criteria) this;
        }

        public Criteria andCoopTbtimeLessThanOrEqualTo(Date value) {
            addCriterion("coop_tbTime <=", value, "coopTbtime");
            return (Criteria) this;
        }

        public Criteria andCoopTbtimeIn(List<Date> values) {
            addCriterion("coop_tbTime in", values, "coopTbtime");
            return (Criteria) this;
        }

        public Criteria andCoopTbtimeNotIn(List<Date> values) {
            addCriterion("coop_tbTime not in", values, "coopTbtime");
            return (Criteria) this;
        }

        public Criteria andCoopTbtimeBetween(Date value1, Date value2) {
            addCriterion("coop_tbTime between", value1, value2, "coopTbtime");
            return (Criteria) this;
        }

        public Criteria andCoopTbtimeNotBetween(Date value1, Date value2) {
            addCriterion("coop_tbTime not between", value1, value2, "coopTbtime");
            return (Criteria) this;
        }

        public Criteria andCoopStarttimeIsNull() {
            addCriterion("coop_startTime is null");
            return (Criteria) this;
        }

        public Criteria andCoopStarttimeIsNotNull() {
            addCriterion("coop_startTime is not null");
            return (Criteria) this;
        }

        public Criteria andCoopStarttimeEqualTo(Date value) {
            addCriterion("coop_startTime =", value, "coopStarttime");
            return (Criteria) this;
        }

        public Criteria andCoopStarttimeNotEqualTo(Date value) {
            addCriterion("coop_startTime <>", value, "coopStarttime");
            return (Criteria) this;
        }

        public Criteria andCoopStarttimeGreaterThan(Date value) {
            addCriterion("coop_startTime >", value, "coopStarttime");
            return (Criteria) this;
        }

        public Criteria andCoopStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("coop_startTime >=", value, "coopStarttime");
            return (Criteria) this;
        }

        public Criteria andCoopStarttimeLessThan(Date value) {
            addCriterion("coop_startTime <", value, "coopStarttime");
            return (Criteria) this;
        }

        public Criteria andCoopStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("coop_startTime <=", value, "coopStarttime");
            return (Criteria) this;
        }

        public Criteria andCoopStarttimeIn(List<Date> values) {
            addCriterion("coop_startTime in", values, "coopStarttime");
            return (Criteria) this;
        }

        public Criteria andCoopStarttimeNotIn(List<Date> values) {
            addCriterion("coop_startTime not in", values, "coopStarttime");
            return (Criteria) this;
        }

        public Criteria andCoopStarttimeBetween(Date value1, Date value2) {
            addCriterion("coop_startTime between", value1, value2, "coopStarttime");
            return (Criteria) this;
        }

        public Criteria andCoopStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("coop_startTime not between", value1, value2, "coopStarttime");
            return (Criteria) this;
        }

        public Criteria andCoopEndtimeIsNull() {
            addCriterion("coop_endTime is null");
            return (Criteria) this;
        }

        public Criteria andCoopEndtimeIsNotNull() {
            addCriterion("coop_endTime is not null");
            return (Criteria) this;
        }

        public Criteria andCoopEndtimeEqualTo(Date value) {
            addCriterion("coop_endTime =", value, "coopEndtime");
            return (Criteria) this;
        }

        public Criteria andCoopEndtimeNotEqualTo(Date value) {
            addCriterion("coop_endTime <>", value, "coopEndtime");
            return (Criteria) this;
        }

        public Criteria andCoopEndtimeGreaterThan(Date value) {
            addCriterion("coop_endTime >", value, "coopEndtime");
            return (Criteria) this;
        }

        public Criteria andCoopEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("coop_endTime >=", value, "coopEndtime");
            return (Criteria) this;
        }

        public Criteria andCoopEndtimeLessThan(Date value) {
            addCriterion("coop_endTime <", value, "coopEndtime");
            return (Criteria) this;
        }

        public Criteria andCoopEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("coop_endTime <=", value, "coopEndtime");
            return (Criteria) this;
        }

        public Criteria andCoopEndtimeIn(List<Date> values) {
            addCriterion("coop_endTime in", values, "coopEndtime");
            return (Criteria) this;
        }

        public Criteria andCoopEndtimeNotIn(List<Date> values) {
            addCriterion("coop_endTime not in", values, "coopEndtime");
            return (Criteria) this;
        }

        public Criteria andCoopEndtimeBetween(Date value1, Date value2) {
            addCriterion("coop_endTime between", value1, value2, "coopEndtime");
            return (Criteria) this;
        }

        public Criteria andCoopEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("coop_endTime not between", value1, value2, "coopEndtime");
            return (Criteria) this;
        }

        public Criteria andCoopBackIsNull() {
            addCriterion("coop_back is null");
            return (Criteria) this;
        }

        public Criteria andCoopBackIsNotNull() {
            addCriterion("coop_back is not null");
            return (Criteria) this;
        }

        public Criteria andCoopBackEqualTo(Double value) {
            addCriterion("coop_back =", value, "coopBack");
            return (Criteria) this;
        }

        public Criteria andCoopBackNotEqualTo(Double value) {
            addCriterion("coop_back <>", value, "coopBack");
            return (Criteria) this;
        }

        public Criteria andCoopBackGreaterThan(Double value) {
            addCriterion("coop_back >", value, "coopBack");
            return (Criteria) this;
        }

        public Criteria andCoopBackGreaterThanOrEqualTo(Double value) {
            addCriterion("coop_back >=", value, "coopBack");
            return (Criteria) this;
        }

        public Criteria andCoopBackLessThan(Double value) {
            addCriterion("coop_back <", value, "coopBack");
            return (Criteria) this;
        }

        public Criteria andCoopBackLessThanOrEqualTo(Double value) {
            addCriterion("coop_back <=", value, "coopBack");
            return (Criteria) this;
        }

        public Criteria andCoopBackIn(List<Double> values) {
            addCriterion("coop_back in", values, "coopBack");
            return (Criteria) this;
        }

        public Criteria andCoopBackNotIn(List<Double> values) {
            addCriterion("coop_back not in", values, "coopBack");
            return (Criteria) this;
        }

        public Criteria andCoopBackBetween(Double value1, Double value2) {
            addCriterion("coop_back between", value1, value2, "coopBack");
            return (Criteria) this;
        }

        public Criteria andCoopBackNotBetween(Double value1, Double value2) {
            addCriterion("coop_back not between", value1, value2, "coopBack");
            return (Criteria) this;
        }

        public Criteria andCoopDeptIdIsNull() {
            addCriterion("coop_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andCoopDeptIdIsNotNull() {
            addCriterion("coop_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoopDeptIdEqualTo(Integer value) {
            addCriterion("coop_dept_id =", value, "coopDeptId");
            return (Criteria) this;
        }

        public Criteria andCoopDeptIdNotEqualTo(Integer value) {
            addCriterion("coop_dept_id <>", value, "coopDeptId");
            return (Criteria) this;
        }

        public Criteria andCoopDeptIdGreaterThan(Integer value) {
            addCriterion("coop_dept_id >", value, "coopDeptId");
            return (Criteria) this;
        }

        public Criteria andCoopDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coop_dept_id >=", value, "coopDeptId");
            return (Criteria) this;
        }

        public Criteria andCoopDeptIdLessThan(Integer value) {
            addCriterion("coop_dept_id <", value, "coopDeptId");
            return (Criteria) this;
        }

        public Criteria andCoopDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("coop_dept_id <=", value, "coopDeptId");
            return (Criteria) this;
        }

        public Criteria andCoopDeptIdIn(List<Integer> values) {
            addCriterion("coop_dept_id in", values, "coopDeptId");
            return (Criteria) this;
        }

        public Criteria andCoopDeptIdNotIn(List<Integer> values) {
            addCriterion("coop_dept_id not in", values, "coopDeptId");
            return (Criteria) this;
        }

        public Criteria andCoopDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("coop_dept_id between", value1, value2, "coopDeptId");
            return (Criteria) this;
        }

        public Criteria andCoopDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coop_dept_id not between", value1, value2, "coopDeptId");
            return (Criteria) this;
        }

        public Criteria andCoopUserIdIsNull() {
            addCriterion("coop_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCoopUserIdIsNotNull() {
            addCriterion("coop_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoopUserIdEqualTo(Integer value) {
            addCriterion("coop_user_id =", value, "coopUserId");
            return (Criteria) this;
        }

        public Criteria andCoopUserIdNotEqualTo(Integer value) {
            addCriterion("coop_user_id <>", value, "coopUserId");
            return (Criteria) this;
        }

        public Criteria andCoopUserIdGreaterThan(Integer value) {
            addCriterion("coop_user_id >", value, "coopUserId");
            return (Criteria) this;
        }

        public Criteria andCoopUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coop_user_id >=", value, "coopUserId");
            return (Criteria) this;
        }

        public Criteria andCoopUserIdLessThan(Integer value) {
            addCriterion("coop_user_id <", value, "coopUserId");
            return (Criteria) this;
        }

        public Criteria andCoopUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("coop_user_id <=", value, "coopUserId");
            return (Criteria) this;
        }

        public Criteria andCoopUserIdIn(List<Integer> values) {
            addCriterion("coop_user_id in", values, "coopUserId");
            return (Criteria) this;
        }

        public Criteria andCoopUserIdNotIn(List<Integer> values) {
            addCriterion("coop_user_id not in", values, "coopUserId");
            return (Criteria) this;
        }

        public Criteria andCoopUserIdBetween(Integer value1, Integer value2) {
            addCriterion("coop_user_id between", value1, value2, "coopUserId");
            return (Criteria) this;
        }

        public Criteria andCoopUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coop_user_id not between", value1, value2, "coopUserId");
            return (Criteria) this;
        }

        public Criteria andCoopYhqNameIsNull() {
            addCriterion("coop_yhq_name is null");
            return (Criteria) this;
        }

        public Criteria andCoopYhqNameIsNotNull() {
            addCriterion("coop_yhq_name is not null");
            return (Criteria) this;
        }

        public Criteria andCoopYhqNameEqualTo(String value) {
            addCriterion("coop_yhq_name =", value, "coopYhqName");
            return (Criteria) this;
        }

        public Criteria andCoopYhqNameNotEqualTo(String value) {
            addCriterion("coop_yhq_name <>", value, "coopYhqName");
            return (Criteria) this;
        }

        public Criteria andCoopYhqNameGreaterThan(String value) {
            addCriterion("coop_yhq_name >", value, "coopYhqName");
            return (Criteria) this;
        }

        public Criteria andCoopYhqNameGreaterThanOrEqualTo(String value) {
            addCriterion("coop_yhq_name >=", value, "coopYhqName");
            return (Criteria) this;
        }

        public Criteria andCoopYhqNameLessThan(String value) {
            addCriterion("coop_yhq_name <", value, "coopYhqName");
            return (Criteria) this;
        }

        public Criteria andCoopYhqNameLessThanOrEqualTo(String value) {
            addCriterion("coop_yhq_name <=", value, "coopYhqName");
            return (Criteria) this;
        }

        public Criteria andCoopYhqNameLike(String value) {
            addCriterion("coop_yhq_name like", value, "coopYhqName");
            return (Criteria) this;
        }

        public Criteria andCoopYhqNameNotLike(String value) {
            addCriterion("coop_yhq_name not like", value, "coopYhqName");
            return (Criteria) this;
        }

        public Criteria andCoopYhqNameIn(List<String> values) {
            addCriterion("coop_yhq_name in", values, "coopYhqName");
            return (Criteria) this;
        }

        public Criteria andCoopYhqNameNotIn(List<String> values) {
            addCriterion("coop_yhq_name not in", values, "coopYhqName");
            return (Criteria) this;
        }

        public Criteria andCoopYhqNameBetween(String value1, String value2) {
            addCriterion("coop_yhq_name between", value1, value2, "coopYhqName");
            return (Criteria) this;
        }

        public Criteria andCoopYhqNameNotBetween(String value1, String value2) {
            addCriterion("coop_yhq_name not between", value1, value2, "coopYhqName");
            return (Criteria) this;
        }

        public Criteria andCoopBossNameIsNull() {
            addCriterion("coop_boss_name is null");
            return (Criteria) this;
        }

        public Criteria andCoopBossNameIsNotNull() {
            addCriterion("coop_boss_name is not null");
            return (Criteria) this;
        }

        public Criteria andCoopBossNameEqualTo(String value) {
            addCriterion("coop_boss_name =", value, "coopBossName");
            return (Criteria) this;
        }

        public Criteria andCoopBossNameNotEqualTo(String value) {
            addCriterion("coop_boss_name <>", value, "coopBossName");
            return (Criteria) this;
        }

        public Criteria andCoopBossNameGreaterThan(String value) {
            addCriterion("coop_boss_name >", value, "coopBossName");
            return (Criteria) this;
        }

        public Criteria andCoopBossNameGreaterThanOrEqualTo(String value) {
            addCriterion("coop_boss_name >=", value, "coopBossName");
            return (Criteria) this;
        }

        public Criteria andCoopBossNameLessThan(String value) {
            addCriterion("coop_boss_name <", value, "coopBossName");
            return (Criteria) this;
        }

        public Criteria andCoopBossNameLessThanOrEqualTo(String value) {
            addCriterion("coop_boss_name <=", value, "coopBossName");
            return (Criteria) this;
        }

        public Criteria andCoopBossNameLike(String value) {
            addCriterion("coop_boss_name like", value, "coopBossName");
            return (Criteria) this;
        }

        public Criteria andCoopBossNameNotLike(String value) {
            addCriterion("coop_boss_name not like", value, "coopBossName");
            return (Criteria) this;
        }

        public Criteria andCoopBossNameIn(List<String> values) {
            addCriterion("coop_boss_name in", values, "coopBossName");
            return (Criteria) this;
        }

        public Criteria andCoopBossNameNotIn(List<String> values) {
            addCriterion("coop_boss_name not in", values, "coopBossName");
            return (Criteria) this;
        }

        public Criteria andCoopBossNameBetween(String value1, String value2) {
            addCriterion("coop_boss_name between", value1, value2, "coopBossName");
            return (Criteria) this;
        }

        public Criteria andCoopBossNameNotBetween(String value1, String value2) {
            addCriterion("coop_boss_name not between", value1, value2, "coopBossName");
            return (Criteria) this;
        }

        public Criteria andCoopMessageIsNull() {
            addCriterion("coop_message is null");
            return (Criteria) this;
        }

        public Criteria andCoopMessageIsNotNull() {
            addCriterion("coop_message is not null");
            return (Criteria) this;
        }

        public Criteria andCoopMessageEqualTo(String value) {
            addCriterion("coop_message =", value, "coopMessage");
            return (Criteria) this;
        }

        public Criteria andCoopMessageNotEqualTo(String value) {
            addCriterion("coop_message <>", value, "coopMessage");
            return (Criteria) this;
        }

        public Criteria andCoopMessageGreaterThan(String value) {
            addCriterion("coop_message >", value, "coopMessage");
            return (Criteria) this;
        }

        public Criteria andCoopMessageGreaterThanOrEqualTo(String value) {
            addCriterion("coop_message >=", value, "coopMessage");
            return (Criteria) this;
        }

        public Criteria andCoopMessageLessThan(String value) {
            addCriterion("coop_message <", value, "coopMessage");
            return (Criteria) this;
        }

        public Criteria andCoopMessageLessThanOrEqualTo(String value) {
            addCriterion("coop_message <=", value, "coopMessage");
            return (Criteria) this;
        }

        public Criteria andCoopMessageLike(String value) {
            addCriterion("coop_message like", value, "coopMessage");
            return (Criteria) this;
        }

        public Criteria andCoopMessageNotLike(String value) {
            addCriterion("coop_message not like", value, "coopMessage");
            return (Criteria) this;
        }

        public Criteria andCoopMessageIn(List<String> values) {
            addCriterion("coop_message in", values, "coopMessage");
            return (Criteria) this;
        }

        public Criteria andCoopMessageNotIn(List<String> values) {
            addCriterion("coop_message not in", values, "coopMessage");
            return (Criteria) this;
        }

        public Criteria andCoopMessageBetween(String value1, String value2) {
            addCriterion("coop_message between", value1, value2, "coopMessage");
            return (Criteria) this;
        }

        public Criteria andCoopMessageNotBetween(String value1, String value2) {
            addCriterion("coop_message not between", value1, value2, "coopMessage");
            return (Criteria) this;
        }

        public Criteria andCoopShopIsNull() {
            addCriterion("coop_shop is null");
            return (Criteria) this;
        }

        public Criteria andCoopShopIsNotNull() {
            addCriterion("coop_shop is not null");
            return (Criteria) this;
        }

        public Criteria andCoopShopEqualTo(String value) {
            addCriterion("coop_shop =", value, "coopShop");
            return (Criteria) this;
        }

        public Criteria andCoopShopNotEqualTo(String value) {
            addCriterion("coop_shop <>", value, "coopShop");
            return (Criteria) this;
        }

        public Criteria andCoopShopGreaterThan(String value) {
            addCriterion("coop_shop >", value, "coopShop");
            return (Criteria) this;
        }

        public Criteria andCoopShopGreaterThanOrEqualTo(String value) {
            addCriterion("coop_shop >=", value, "coopShop");
            return (Criteria) this;
        }

        public Criteria andCoopShopLessThan(String value) {
            addCriterion("coop_shop <", value, "coopShop");
            return (Criteria) this;
        }

        public Criteria andCoopShopLessThanOrEqualTo(String value) {
            addCriterion("coop_shop <=", value, "coopShop");
            return (Criteria) this;
        }

        public Criteria andCoopShopLike(String value) {
            addCriterion("coop_shop like", value, "coopShop");
            return (Criteria) this;
        }

        public Criteria andCoopShopNotLike(String value) {
            addCriterion("coop_shop not like", value, "coopShop");
            return (Criteria) this;
        }

        public Criteria andCoopShopIn(List<String> values) {
            addCriterion("coop_shop in", values, "coopShop");
            return (Criteria) this;
        }

        public Criteria andCoopShopNotIn(List<String> values) {
            addCriterion("coop_shop not in", values, "coopShop");
            return (Criteria) this;
        }

        public Criteria andCoopShopBetween(String value1, String value2) {
            addCriterion("coop_shop between", value1, value2, "coopShop");
            return (Criteria) this;
        }

        public Criteria andCoopShopNotBetween(String value1, String value2) {
            addCriterion("coop_shop not between", value1, value2, "coopShop");
            return (Criteria) this;
        }

        public Criteria andCoopTbmessageIsNull() {
            addCriterion("coop_tbMessage is null");
            return (Criteria) this;
        }

        public Criteria andCoopTbmessageIsNotNull() {
            addCriterion("coop_tbMessage is not null");
            return (Criteria) this;
        }

        public Criteria andCoopTbmessageEqualTo(String value) {
            addCriterion("coop_tbMessage =", value, "coopTbmessage");
            return (Criteria) this;
        }

        public Criteria andCoopTbmessageNotEqualTo(String value) {
            addCriterion("coop_tbMessage <>", value, "coopTbmessage");
            return (Criteria) this;
        }

        public Criteria andCoopTbmessageGreaterThan(String value) {
            addCriterion("coop_tbMessage >", value, "coopTbmessage");
            return (Criteria) this;
        }

        public Criteria andCoopTbmessageGreaterThanOrEqualTo(String value) {
            addCriterion("coop_tbMessage >=", value, "coopTbmessage");
            return (Criteria) this;
        }

        public Criteria andCoopTbmessageLessThan(String value) {
            addCriterion("coop_tbMessage <", value, "coopTbmessage");
            return (Criteria) this;
        }

        public Criteria andCoopTbmessageLessThanOrEqualTo(String value) {
            addCriterion("coop_tbMessage <=", value, "coopTbmessage");
            return (Criteria) this;
        }

        public Criteria andCoopTbmessageLike(String value) {
            addCriterion("coop_tbMessage like", value, "coopTbmessage");
            return (Criteria) this;
        }

        public Criteria andCoopTbmessageNotLike(String value) {
            addCriterion("coop_tbMessage not like", value, "coopTbmessage");
            return (Criteria) this;
        }

        public Criteria andCoopTbmessageIn(List<String> values) {
            addCriterion("coop_tbMessage in", values, "coopTbmessage");
            return (Criteria) this;
        }

        public Criteria andCoopTbmessageNotIn(List<String> values) {
            addCriterion("coop_tbMessage not in", values, "coopTbmessage");
            return (Criteria) this;
        }

        public Criteria andCoopTbmessageBetween(String value1, String value2) {
            addCriterion("coop_tbMessage between", value1, value2, "coopTbmessage");
            return (Criteria) this;
        }

        public Criteria andCoopTbmessageNotBetween(String value1, String value2) {
            addCriterion("coop_tbMessage not between", value1, value2, "coopTbmessage");
            return (Criteria) this;
        }

        public Criteria andCoopShopFlIsNull() {
            addCriterion("coop_shop_fl is null");
            return (Criteria) this;
        }

        public Criteria andCoopShopFlIsNotNull() {
            addCriterion("coop_shop_fl is not null");
            return (Criteria) this;
        }

        public Criteria andCoopShopFlEqualTo(Integer value) {
            addCriterion("coop_shop_fl =", value, "coopShopFl");
            return (Criteria) this;
        }

        public Criteria andCoopShopFlNotEqualTo(Integer value) {
            addCriterion("coop_shop_fl <>", value, "coopShopFl");
            return (Criteria) this;
        }

        public Criteria andCoopShopFlGreaterThan(Integer value) {
            addCriterion("coop_shop_fl >", value, "coopShopFl");
            return (Criteria) this;
        }

        public Criteria andCoopShopFlGreaterThanOrEqualTo(Integer value) {
            addCriterion("coop_shop_fl >=", value, "coopShopFl");
            return (Criteria) this;
        }

        public Criteria andCoopShopFlLessThan(Integer value) {
            addCriterion("coop_shop_fl <", value, "coopShopFl");
            return (Criteria) this;
        }

        public Criteria andCoopShopFlLessThanOrEqualTo(Integer value) {
            addCriterion("coop_shop_fl <=", value, "coopShopFl");
            return (Criteria) this;
        }

        public Criteria andCoopShopFlIn(List<Integer> values) {
            addCriterion("coop_shop_fl in", values, "coopShopFl");
            return (Criteria) this;
        }

        public Criteria andCoopShopFlNotIn(List<Integer> values) {
            addCriterion("coop_shop_fl not in", values, "coopShopFl");
            return (Criteria) this;
        }

        public Criteria andCoopShopFlBetween(Integer value1, Integer value2) {
            addCriterion("coop_shop_fl between", value1, value2, "coopShopFl");
            return (Criteria) this;
        }

        public Criteria andCoopShopFlNotBetween(Integer value1, Integer value2) {
            addCriterion("coop_shop_fl not between", value1, value2, "coopShopFl");
            return (Criteria) this;
        }

        public Criteria andCoopPictureIsNull() {
            addCriterion("coop_picture is null");
            return (Criteria) this;
        }

        public Criteria andCoopPictureIsNotNull() {
            addCriterion("coop_picture is not null");
            return (Criteria) this;
        }

        public Criteria andCoopPictureEqualTo(String value) {
            addCriterion("coop_picture =", value, "coopPicture");
            return (Criteria) this;
        }

        public Criteria andCoopPictureNotEqualTo(String value) {
            addCriterion("coop_picture <>", value, "coopPicture");
            return (Criteria) this;
        }

        public Criteria andCoopPictureGreaterThan(String value) {
            addCriterion("coop_picture >", value, "coopPicture");
            return (Criteria) this;
        }

        public Criteria andCoopPictureGreaterThanOrEqualTo(String value) {
            addCriterion("coop_picture >=", value, "coopPicture");
            return (Criteria) this;
        }

        public Criteria andCoopPictureLessThan(String value) {
            addCriterion("coop_picture <", value, "coopPicture");
            return (Criteria) this;
        }

        public Criteria andCoopPictureLessThanOrEqualTo(String value) {
            addCriterion("coop_picture <=", value, "coopPicture");
            return (Criteria) this;
        }

        public Criteria andCoopPictureLike(String value) {
            addCriterion("coop_picture like", value, "coopPicture");
            return (Criteria) this;
        }

        public Criteria andCoopPictureNotLike(String value) {
            addCriterion("coop_picture not like", value, "coopPicture");
            return (Criteria) this;
        }

        public Criteria andCoopPictureIn(List<String> values) {
            addCriterion("coop_picture in", values, "coopPicture");
            return (Criteria) this;
        }

        public Criteria andCoopPictureNotIn(List<String> values) {
            addCriterion("coop_picture not in", values, "coopPicture");
            return (Criteria) this;
        }

        public Criteria andCoopPictureBetween(String value1, String value2) {
            addCriterion("coop_picture between", value1, value2, "coopPicture");
            return (Criteria) this;
        }

        public Criteria andCoopPictureNotBetween(String value1, String value2) {
            addCriterion("coop_picture not between", value1, value2, "coopPicture");
            return (Criteria) this;
        }

        public Criteria andCoopPromotionIsNull() {
            addCriterion("coop_promotion is null");
            return (Criteria) this;
        }

        public Criteria andCoopPromotionIsNotNull() {
            addCriterion("coop_promotion is not null");
            return (Criteria) this;
        }

        public Criteria andCoopPromotionEqualTo(String value) {
            addCriterion("coop_promotion =", value, "coopPromotion");
            return (Criteria) this;
        }

        public Criteria andCoopPromotionNotEqualTo(String value) {
            addCriterion("coop_promotion <>", value, "coopPromotion");
            return (Criteria) this;
        }

        public Criteria andCoopPromotionGreaterThan(String value) {
            addCriterion("coop_promotion >", value, "coopPromotion");
            return (Criteria) this;
        }

        public Criteria andCoopPromotionGreaterThanOrEqualTo(String value) {
            addCriterion("coop_promotion >=", value, "coopPromotion");
            return (Criteria) this;
        }

        public Criteria andCoopPromotionLessThan(String value) {
            addCriterion("coop_promotion <", value, "coopPromotion");
            return (Criteria) this;
        }

        public Criteria andCoopPromotionLessThanOrEqualTo(String value) {
            addCriterion("coop_promotion <=", value, "coopPromotion");
            return (Criteria) this;
        }

        public Criteria andCoopPromotionLike(String value) {
            addCriterion("coop_promotion like", value, "coopPromotion");
            return (Criteria) this;
        }

        public Criteria andCoopPromotionNotLike(String value) {
            addCriterion("coop_promotion not like", value, "coopPromotion");
            return (Criteria) this;
        }

        public Criteria andCoopPromotionIn(List<String> values) {
            addCriterion("coop_promotion in", values, "coopPromotion");
            return (Criteria) this;
        }

        public Criteria andCoopPromotionNotIn(List<String> values) {
            addCriterion("coop_promotion not in", values, "coopPromotion");
            return (Criteria) this;
        }

        public Criteria andCoopPromotionBetween(String value1, String value2) {
            addCriterion("coop_promotion between", value1, value2, "coopPromotion");
            return (Criteria) this;
        }

        public Criteria andCoopPromotionNotBetween(String value1, String value2) {
            addCriterion("coop_promotion not between", value1, value2, "coopPromotion");
            return (Criteria) this;
        }

        public Criteria andCoopCouponIsNull() {
            addCriterion("coop_coupon is null");
            return (Criteria) this;
        }

        public Criteria andCoopCouponIsNotNull() {
            addCriterion("coop_coupon is not null");
            return (Criteria) this;
        }

        public Criteria andCoopCouponEqualTo(String value) {
            addCriterion("coop_coupon =", value, "coopCoupon");
            return (Criteria) this;
        }

        public Criteria andCoopCouponNotEqualTo(String value) {
            addCriterion("coop_coupon <>", value, "coopCoupon");
            return (Criteria) this;
        }

        public Criteria andCoopCouponGreaterThan(String value) {
            addCriterion("coop_coupon >", value, "coopCoupon");
            return (Criteria) this;
        }

        public Criteria andCoopCouponGreaterThanOrEqualTo(String value) {
            addCriterion("coop_coupon >=", value, "coopCoupon");
            return (Criteria) this;
        }

        public Criteria andCoopCouponLessThan(String value) {
            addCriterion("coop_coupon <", value, "coopCoupon");
            return (Criteria) this;
        }

        public Criteria andCoopCouponLessThanOrEqualTo(String value) {
            addCriterion("coop_coupon <=", value, "coopCoupon");
            return (Criteria) this;
        }

        public Criteria andCoopCouponLike(String value) {
            addCriterion("coop_coupon like", value, "coopCoupon");
            return (Criteria) this;
        }

        public Criteria andCoopCouponNotLike(String value) {
            addCriterion("coop_coupon not like", value, "coopCoupon");
            return (Criteria) this;
        }

        public Criteria andCoopCouponIn(List<String> values) {
            addCriterion("coop_coupon in", values, "coopCoupon");
            return (Criteria) this;
        }

        public Criteria andCoopCouponNotIn(List<String> values) {
            addCriterion("coop_coupon not in", values, "coopCoupon");
            return (Criteria) this;
        }

        public Criteria andCoopCouponBetween(String value1, String value2) {
            addCriterion("coop_coupon between", value1, value2, "coopCoupon");
            return (Criteria) this;
        }

        public Criteria andCoopCouponNotBetween(String value1, String value2) {
            addCriterion("coop_coupon not between", value1, value2, "coopCoupon");
            return (Criteria) this;
        }

        public Criteria andCoopColorIsNull() {
            addCriterion("coop_color is null");
            return (Criteria) this;
        }

        public Criteria andCoopColorIsNotNull() {
            addCriterion("coop_color is not null");
            return (Criteria) this;
        }

        public Criteria andCoopColorEqualTo(String value) {
            addCriterion("coop_color =", value, "coopColor");
            return (Criteria) this;
        }

        public Criteria andCoopColorNotEqualTo(String value) {
            addCriterion("coop_color <>", value, "coopColor");
            return (Criteria) this;
        }

        public Criteria andCoopColorGreaterThan(String value) {
            addCriterion("coop_color >", value, "coopColor");
            return (Criteria) this;
        }

        public Criteria andCoopColorGreaterThanOrEqualTo(String value) {
            addCriterion("coop_color >=", value, "coopColor");
            return (Criteria) this;
        }

        public Criteria andCoopColorLessThan(String value) {
            addCriterion("coop_color <", value, "coopColor");
            return (Criteria) this;
        }

        public Criteria andCoopColorLessThanOrEqualTo(String value) {
            addCriterion("coop_color <=", value, "coopColor");
            return (Criteria) this;
        }

        public Criteria andCoopColorLike(String value) {
            addCriterion("coop_color like", value, "coopColor");
            return (Criteria) this;
        }

        public Criteria andCoopColorNotLike(String value) {
            addCriterion("coop_color not like", value, "coopColor");
            return (Criteria) this;
        }

        public Criteria andCoopColorIn(List<String> values) {
            addCriterion("coop_color in", values, "coopColor");
            return (Criteria) this;
        }

        public Criteria andCoopColorNotIn(List<String> values) {
            addCriterion("coop_color not in", values, "coopColor");
            return (Criteria) this;
        }

        public Criteria andCoopColorBetween(String value1, String value2) {
            addCriterion("coop_color between", value1, value2, "coopColor");
            return (Criteria) this;
        }

        public Criteria andCoopColorNotBetween(String value1, String value2) {
            addCriterion("coop_color not between", value1, value2, "coopColor");
            return (Criteria) this;
        }

        public Criteria andCoopServiceFeeIsNull() {
            addCriterion("coop_service_fee is null");
            return (Criteria) this;
        }

        public Criteria andCoopServiceFeeIsNotNull() {
            addCriterion("coop_service_fee is not null");
            return (Criteria) this;
        }

        public Criteria andCoopServiceFeeEqualTo(Double value) {
            addCriterion("coop_service_fee =", value, "coopServiceFee");
            return (Criteria) this;
        }

        public Criteria andCoopServiceFeeNotEqualTo(Double value) {
            addCriterion("coop_service_fee <>", value, "coopServiceFee");
            return (Criteria) this;
        }

        public Criteria andCoopServiceFeeGreaterThan(Double value) {
            addCriterion("coop_service_fee >", value, "coopServiceFee");
            return (Criteria) this;
        }

        public Criteria andCoopServiceFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("coop_service_fee >=", value, "coopServiceFee");
            return (Criteria) this;
        }

        public Criteria andCoopServiceFeeLessThan(Double value) {
            addCriterion("coop_service_fee <", value, "coopServiceFee");
            return (Criteria) this;
        }

        public Criteria andCoopServiceFeeLessThanOrEqualTo(Double value) {
            addCriterion("coop_service_fee <=", value, "coopServiceFee");
            return (Criteria) this;
        }

        public Criteria andCoopServiceFeeIn(List<Double> values) {
            addCriterion("coop_service_fee in", values, "coopServiceFee");
            return (Criteria) this;
        }

        public Criteria andCoopServiceFeeNotIn(List<Double> values) {
            addCriterion("coop_service_fee not in", values, "coopServiceFee");
            return (Criteria) this;
        }

        public Criteria andCoopServiceFeeBetween(Double value1, Double value2) {
            addCriterion("coop_service_fee between", value1, value2, "coopServiceFee");
            return (Criteria) this;
        }

        public Criteria andCoopServiceFeeNotBetween(Double value1, Double value2) {
            addCriterion("coop_service_fee not between", value1, value2, "coopServiceFee");
            return (Criteria) this;
        }

        public Criteria andCoopPerTimeIsNull() {
            addCriterion("coop_per_time is null");
            return (Criteria) this;
        }

        public Criteria andCoopPerTimeIsNotNull() {
            addCriterion("coop_per_time is not null");
            return (Criteria) this;
        }

        public Criteria andCoopPerTimeEqualTo(Date value) {
            addCriterion("coop_per_time =", value, "coopPerTime");
            return (Criteria) this;
        }

        public Criteria andCoopPerTimeNotEqualTo(Date value) {
            addCriterion("coop_per_time <>", value, "coopPerTime");
            return (Criteria) this;
        }

        public Criteria andCoopPerTimeGreaterThan(Date value) {
            addCriterion("coop_per_time >", value, "coopPerTime");
            return (Criteria) this;
        }

        public Criteria andCoopPerTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("coop_per_time >=", value, "coopPerTime");
            return (Criteria) this;
        }

        public Criteria andCoopPerTimeLessThan(Date value) {
            addCriterion("coop_per_time <", value, "coopPerTime");
            return (Criteria) this;
        }

        public Criteria andCoopPerTimeLessThanOrEqualTo(Date value) {
            addCriterion("coop_per_time <=", value, "coopPerTime");
            return (Criteria) this;
        }

        public Criteria andCoopPerTimeIn(List<Date> values) {
            addCriterion("coop_per_time in", values, "coopPerTime");
            return (Criteria) this;
        }

        public Criteria andCoopPerTimeNotIn(List<Date> values) {
            addCriterion("coop_per_time not in", values, "coopPerTime");
            return (Criteria) this;
        }

        public Criteria andCoopPerTimeBetween(Date value1, Date value2) {
            addCriterion("coop_per_time between", value1, value2, "coopPerTime");
            return (Criteria) this;
        }

        public Criteria andCoopPerTimeNotBetween(Date value1, Date value2) {
            addCriterion("coop_per_time not between", value1, value2, "coopPerTime");
            return (Criteria) this;
        }

        public Criteria andCoopCouponNumIsNull() {
            addCriterion("coop_coupon_num is null");
            return (Criteria) this;
        }

        public Criteria andCoopCouponNumIsNotNull() {
            addCriterion("coop_coupon_num is not null");
            return (Criteria) this;
        }

        public Criteria andCoopCouponNumEqualTo(Double value) {
            addCriterion("coop_coupon_num =", value, "coopCouponNum");
            return (Criteria) this;
        }

        public Criteria andCoopCouponNumNotEqualTo(Double value) {
            addCriterion("coop_coupon_num <>", value, "coopCouponNum");
            return (Criteria) this;
        }

        public Criteria andCoopCouponNumGreaterThan(Double value) {
            addCriterion("coop_coupon_num >", value, "coopCouponNum");
            return (Criteria) this;
        }

        public Criteria andCoopCouponNumGreaterThanOrEqualTo(Double value) {
            addCriterion("coop_coupon_num >=", value, "coopCouponNum");
            return (Criteria) this;
        }

        public Criteria andCoopCouponNumLessThan(Double value) {
            addCriterion("coop_coupon_num <", value, "coopCouponNum");
            return (Criteria) this;
        }

        public Criteria andCoopCouponNumLessThanOrEqualTo(Double value) {
            addCriterion("coop_coupon_num <=", value, "coopCouponNum");
            return (Criteria) this;
        }

        public Criteria andCoopCouponNumIn(List<Double> values) {
            addCriterion("coop_coupon_num in", values, "coopCouponNum");
            return (Criteria) this;
        }

        public Criteria andCoopCouponNumNotIn(List<Double> values) {
            addCriterion("coop_coupon_num not in", values, "coopCouponNum");
            return (Criteria) this;
        }

        public Criteria andCoopCouponNumBetween(Double value1, Double value2) {
            addCriterion("coop_coupon_num between", value1, value2, "coopCouponNum");
            return (Criteria) this;
        }

        public Criteria andCoopCouponNumNotBetween(Double value1, Double value2) {
            addCriterion("coop_coupon_num not between", value1, value2, "coopCouponNum");
            return (Criteria) this;
        }

        public Criteria andCoopTapbaoPriceIsNull() {
            addCriterion("coop_tapbao_price is null");
            return (Criteria) this;
        }

        public Criteria andCoopTapbaoPriceIsNotNull() {
            addCriterion("coop_tapbao_price is not null");
            return (Criteria) this;
        }

        public Criteria andCoopTapbaoPriceEqualTo(Double value) {
            addCriterion("coop_tapbao_price =", value, "coopTapbaoPrice");
            return (Criteria) this;
        }

        public Criteria andCoopTapbaoPriceNotEqualTo(Double value) {
            addCriterion("coop_tapbao_price <>", value, "coopTapbaoPrice");
            return (Criteria) this;
        }

        public Criteria andCoopTapbaoPriceGreaterThan(Double value) {
            addCriterion("coop_tapbao_price >", value, "coopTapbaoPrice");
            return (Criteria) this;
        }

        public Criteria andCoopTapbaoPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("coop_tapbao_price >=", value, "coopTapbaoPrice");
            return (Criteria) this;
        }

        public Criteria andCoopTapbaoPriceLessThan(Double value) {
            addCriterion("coop_tapbao_price <", value, "coopTapbaoPrice");
            return (Criteria) this;
        }

        public Criteria andCoopTapbaoPriceLessThanOrEqualTo(Double value) {
            addCriterion("coop_tapbao_price <=", value, "coopTapbaoPrice");
            return (Criteria) this;
        }

        public Criteria andCoopTapbaoPriceIn(List<Double> values) {
            addCriterion("coop_tapbao_price in", values, "coopTapbaoPrice");
            return (Criteria) this;
        }

        public Criteria andCoopTapbaoPriceNotIn(List<Double> values) {
            addCriterion("coop_tapbao_price not in", values, "coopTapbaoPrice");
            return (Criteria) this;
        }

        public Criteria andCoopTapbaoPriceBetween(Double value1, Double value2) {
            addCriterion("coop_tapbao_price between", value1, value2, "coopTapbaoPrice");
            return (Criteria) this;
        }

        public Criteria andCoopTapbaoPriceNotBetween(Double value1, Double value2) {
            addCriterion("coop_tapbao_price not between", value1, value2, "coopTapbaoPrice");
            return (Criteria) this;
        }

        public Criteria andCoopPayNumIsNull() {
            addCriterion("coop_pay_num is null");
            return (Criteria) this;
        }

        public Criteria andCoopPayNumIsNotNull() {
            addCriterion("coop_pay_num is not null");
            return (Criteria) this;
        }

        public Criteria andCoopPayNumEqualTo(Integer value) {
            addCriterion("coop_pay_num =", value, "coopPayNum");
            return (Criteria) this;
        }

        public Criteria andCoopPayNumNotEqualTo(Integer value) {
            addCriterion("coop_pay_num <>", value, "coopPayNum");
            return (Criteria) this;
        }

        public Criteria andCoopPayNumGreaterThan(Integer value) {
            addCriterion("coop_pay_num >", value, "coopPayNum");
            return (Criteria) this;
        }

        public Criteria andCoopPayNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("coop_pay_num >=", value, "coopPayNum");
            return (Criteria) this;
        }

        public Criteria andCoopPayNumLessThan(Integer value) {
            addCriterion("coop_pay_num <", value, "coopPayNum");
            return (Criteria) this;
        }

        public Criteria andCoopPayNumLessThanOrEqualTo(Integer value) {
            addCriterion("coop_pay_num <=", value, "coopPayNum");
            return (Criteria) this;
        }

        public Criteria andCoopPayNumIn(List<Integer> values) {
            addCriterion("coop_pay_num in", values, "coopPayNum");
            return (Criteria) this;
        }

        public Criteria andCoopPayNumNotIn(List<Integer> values) {
            addCriterion("coop_pay_num not in", values, "coopPayNum");
            return (Criteria) this;
        }

        public Criteria andCoopPayNumBetween(Integer value1, Integer value2) {
            addCriterion("coop_pay_num between", value1, value2, "coopPayNum");
            return (Criteria) this;
        }

        public Criteria andCoopPayNumNotBetween(Integer value1, Integer value2) {
            addCriterion("coop_pay_num not between", value1, value2, "coopPayNum");
            return (Criteria) this;
        }

        public Criteria andCoopHeadIdIsNull() {
            addCriterion("coop_Head_id is null");
            return (Criteria) this;
        }

        public Criteria andCoopHeadIdIsNotNull() {
            addCriterion("coop_Head_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoopHeadIdEqualTo(Long value) {
            addCriterion("coop_Head_id =", value, "coopHeadId");
            return (Criteria) this;
        }

        public Criteria andCoopHeadIdNotEqualTo(Long value) {
            addCriterion("coop_Head_id <>", value, "coopHeadId");
            return (Criteria) this;
        }

        public Criteria andCoopHeadIdGreaterThan(Long value) {
            addCriterion("coop_Head_id >", value, "coopHeadId");
            return (Criteria) this;
        }

        public Criteria andCoopHeadIdGreaterThanOrEqualTo(Long value) {
            addCriterion("coop_Head_id >=", value, "coopHeadId");
            return (Criteria) this;
        }

        public Criteria andCoopHeadIdLessThan(Long value) {
            addCriterion("coop_Head_id <", value, "coopHeadId");
            return (Criteria) this;
        }

        public Criteria andCoopHeadIdLessThanOrEqualTo(Long value) {
            addCriterion("coop_Head_id <=", value, "coopHeadId");
            return (Criteria) this;
        }

        public Criteria andCoopHeadIdIn(List<Long> values) {
            addCriterion("coop_Head_id in", values, "coopHeadId");
            return (Criteria) this;
        }

        public Criteria andCoopHeadIdNotIn(List<Long> values) {
            addCriterion("coop_Head_id not in", values, "coopHeadId");
            return (Criteria) this;
        }

        public Criteria andCoopHeadIdBetween(Long value1, Long value2) {
            addCriterion("coop_Head_id between", value1, value2, "coopHeadId");
            return (Criteria) this;
        }

        public Criteria andCoopHeadIdNotBetween(Long value1, Long value2) {
            addCriterion("coop_Head_id not between", value1, value2, "coopHeadId");
            return (Criteria) this;
        }

        public Criteria andCoopRealShotIsNull() {
            addCriterion("coop_real_shot is null");
            return (Criteria) this;
        }

        public Criteria andCoopRealShotIsNotNull() {
            addCriterion("coop_real_shot is not null");
            return (Criteria) this;
        }

        public Criteria andCoopRealShotEqualTo(String value) {
            addCriterion("coop_real_shot =", value, "coopRealShot");
            return (Criteria) this;
        }

        public Criteria andCoopRealShotNotEqualTo(String value) {
            addCriterion("coop_real_shot <>", value, "coopRealShot");
            return (Criteria) this;
        }

        public Criteria andCoopRealShotGreaterThan(String value) {
            addCriterion("coop_real_shot >", value, "coopRealShot");
            return (Criteria) this;
        }

        public Criteria andCoopRealShotGreaterThanOrEqualTo(String value) {
            addCriterion("coop_real_shot >=", value, "coopRealShot");
            return (Criteria) this;
        }

        public Criteria andCoopRealShotLessThan(String value) {
            addCriterion("coop_real_shot <", value, "coopRealShot");
            return (Criteria) this;
        }

        public Criteria andCoopRealShotLessThanOrEqualTo(String value) {
            addCriterion("coop_real_shot <=", value, "coopRealShot");
            return (Criteria) this;
        }

        public Criteria andCoopRealShotLike(String value) {
            addCriterion("coop_real_shot like", value, "coopRealShot");
            return (Criteria) this;
        }

        public Criteria andCoopRealShotNotLike(String value) {
            addCriterion("coop_real_shot not like", value, "coopRealShot");
            return (Criteria) this;
        }

        public Criteria andCoopRealShotIn(List<String> values) {
            addCriterion("coop_real_shot in", values, "coopRealShot");
            return (Criteria) this;
        }

        public Criteria andCoopRealShotNotIn(List<String> values) {
            addCriterion("coop_real_shot not in", values, "coopRealShot");
            return (Criteria) this;
        }

        public Criteria andCoopRealShotBetween(String value1, String value2) {
            addCriterion("coop_real_shot between", value1, value2, "coopRealShot");
            return (Criteria) this;
        }

        public Criteria andCoopRealShotNotBetween(String value1, String value2) {
            addCriterion("coop_real_shot not between", value1, value2, "coopRealShot");
            return (Criteria) this;
        }

        public Criteria andCoopBossIdIsNull() {
            addCriterion("coop_boss_id is null");
            return (Criteria) this;
        }

        public Criteria andCoopBossIdIsNotNull() {
            addCriterion("coop_boss_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoopBossIdEqualTo(Integer value) {
            addCriterion("coop_boss_id =", value, "coopBossId");
            return (Criteria) this;
        }

        public Criteria andCoopBossIdNotEqualTo(Integer value) {
            addCriterion("coop_boss_id <>", value, "coopBossId");
            return (Criteria) this;
        }

        public Criteria andCoopBossIdGreaterThan(Integer value) {
            addCriterion("coop_boss_id >", value, "coopBossId");
            return (Criteria) this;
        }

        public Criteria andCoopBossIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coop_boss_id >=", value, "coopBossId");
            return (Criteria) this;
        }

        public Criteria andCoopBossIdLessThan(Integer value) {
            addCriterion("coop_boss_id <", value, "coopBossId");
            return (Criteria) this;
        }

        public Criteria andCoopBossIdLessThanOrEqualTo(Integer value) {
            addCriterion("coop_boss_id <=", value, "coopBossId");
            return (Criteria) this;
        }

        public Criteria andCoopBossIdIn(List<Integer> values) {
            addCriterion("coop_boss_id in", values, "coopBossId");
            return (Criteria) this;
        }

        public Criteria andCoopBossIdNotIn(List<Integer> values) {
            addCriterion("coop_boss_id not in", values, "coopBossId");
            return (Criteria) this;
        }

        public Criteria andCoopBossIdBetween(Integer value1, Integer value2) {
            addCriterion("coop_boss_id between", value1, value2, "coopBossId");
            return (Criteria) this;
        }

        public Criteria andCoopBossIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coop_boss_id not between", value1, value2, "coopBossId");
            return (Criteria) this;
        }

        public Criteria andCoopCheckMoneyIsNull() {
            addCriterion("coop_check_money is null");
            return (Criteria) this;
        }

        public Criteria andCoopCheckMoneyIsNotNull() {
            addCriterion("coop_check_money is not null");
            return (Criteria) this;
        }

        public Criteria andCoopCheckMoneyEqualTo(String value) {
            addCriterion("coop_check_money =", value, "coopCheckMoney");
            return (Criteria) this;
        }

        public Criteria andCoopCheckMoneyNotEqualTo(String value) {
            addCriterion("coop_check_money <>", value, "coopCheckMoney");
            return (Criteria) this;
        }

        public Criteria andCoopCheckMoneyGreaterThan(String value) {
            addCriterion("coop_check_money >", value, "coopCheckMoney");
            return (Criteria) this;
        }

        public Criteria andCoopCheckMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("coop_check_money >=", value, "coopCheckMoney");
            return (Criteria) this;
        }

        public Criteria andCoopCheckMoneyLessThan(String value) {
            addCriterion("coop_check_money <", value, "coopCheckMoney");
            return (Criteria) this;
        }

        public Criteria andCoopCheckMoneyLessThanOrEqualTo(String value) {
            addCriterion("coop_check_money <=", value, "coopCheckMoney");
            return (Criteria) this;
        }

        public Criteria andCoopCheckMoneyLike(String value) {
            addCriterion("coop_check_money like", value, "coopCheckMoney");
            return (Criteria) this;
        }

        public Criteria andCoopCheckMoneyNotLike(String value) {
            addCriterion("coop_check_money not like", value, "coopCheckMoney");
            return (Criteria) this;
        }

        public Criteria andCoopCheckMoneyIn(List<String> values) {
            addCriterion("coop_check_money in", values, "coopCheckMoney");
            return (Criteria) this;
        }

        public Criteria andCoopCheckMoneyNotIn(List<String> values) {
            addCriterion("coop_check_money not in", values, "coopCheckMoney");
            return (Criteria) this;
        }

        public Criteria andCoopCheckMoneyBetween(String value1, String value2) {
            addCriterion("coop_check_money between", value1, value2, "coopCheckMoney");
            return (Criteria) this;
        }

        public Criteria andCoopCheckMoneyNotBetween(String value1, String value2) {
            addCriterion("coop_check_money not between", value1, value2, "coopCheckMoney");
            return (Criteria) this;
        }

        public Criteria andCoopPayTypeIsNull() {
            addCriterion("coop_pay_type is null");
            return (Criteria) this;
        }

        public Criteria andCoopPayTypeIsNotNull() {
            addCriterion("coop_pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andCoopPayTypeEqualTo(String value) {
            addCriterion("coop_pay_type =", value, "coopPayType");
            return (Criteria) this;
        }

        public Criteria andCoopPayTypeNotEqualTo(String value) {
            addCriterion("coop_pay_type <>", value, "coopPayType");
            return (Criteria) this;
        }

        public Criteria andCoopPayTypeGreaterThan(String value) {
            addCriterion("coop_pay_type >", value, "coopPayType");
            return (Criteria) this;
        }

        public Criteria andCoopPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("coop_pay_type >=", value, "coopPayType");
            return (Criteria) this;
        }

        public Criteria andCoopPayTypeLessThan(String value) {
            addCriterion("coop_pay_type <", value, "coopPayType");
            return (Criteria) this;
        }

        public Criteria andCoopPayTypeLessThanOrEqualTo(String value) {
            addCriterion("coop_pay_type <=", value, "coopPayType");
            return (Criteria) this;
        }

        public Criteria andCoopPayTypeLike(String value) {
            addCriterion("coop_pay_type like", value, "coopPayType");
            return (Criteria) this;
        }

        public Criteria andCoopPayTypeNotLike(String value) {
            addCriterion("coop_pay_type not like", value, "coopPayType");
            return (Criteria) this;
        }

        public Criteria andCoopPayTypeIn(List<String> values) {
            addCriterion("coop_pay_type in", values, "coopPayType");
            return (Criteria) this;
        }

        public Criteria andCoopPayTypeNotIn(List<String> values) {
            addCriterion("coop_pay_type not in", values, "coopPayType");
            return (Criteria) this;
        }

        public Criteria andCoopPayTypeBetween(String value1, String value2) {
            addCriterion("coop_pay_type between", value1, value2, "coopPayType");
            return (Criteria) this;
        }

        public Criteria andCoopPayTypeNotBetween(String value1, String value2) {
            addCriterion("coop_pay_type not between", value1, value2, "coopPayType");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsTitleIsNull() {
            addCriterion("coop_goods_title is null");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsTitleIsNotNull() {
            addCriterion("coop_goods_title is not null");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsTitleEqualTo(String value) {
            addCriterion("coop_goods_title =", value, "coopGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsTitleNotEqualTo(String value) {
            addCriterion("coop_goods_title <>", value, "coopGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsTitleGreaterThan(String value) {
            addCriterion("coop_goods_title >", value, "coopGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("coop_goods_title >=", value, "coopGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsTitleLessThan(String value) {
            addCriterion("coop_goods_title <", value, "coopGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsTitleLessThanOrEqualTo(String value) {
            addCriterion("coop_goods_title <=", value, "coopGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsTitleLike(String value) {
            addCriterion("coop_goods_title like", value, "coopGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsTitleNotLike(String value) {
            addCriterion("coop_goods_title not like", value, "coopGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsTitleIn(List<String> values) {
            addCriterion("coop_goods_title in", values, "coopGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsTitleNotIn(List<String> values) {
            addCriterion("coop_goods_title not in", values, "coopGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsTitleBetween(String value1, String value2) {
            addCriterion("coop_goods_title between", value1, value2, "coopGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andCoopGoodsTitleNotBetween(String value1, String value2) {
            addCriterion("coop_goods_title not between", value1, value2, "coopGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andCoopBeiyongIsNull() {
            addCriterion("coop_beiyong is null");
            return (Criteria) this;
        }

        public Criteria andCoopBeiyongIsNotNull() {
            addCriterion("coop_beiyong is not null");
            return (Criteria) this;
        }

        public Criteria andCoopBeiyongEqualTo(String value) {
            addCriterion("coop_beiyong =", value, "coopBeiyong");
            return (Criteria) this;
        }

        public Criteria andCoopBeiyongNotEqualTo(String value) {
            addCriterion("coop_beiyong <>", value, "coopBeiyong");
            return (Criteria) this;
        }

        public Criteria andCoopBeiyongGreaterThan(String value) {
            addCriterion("coop_beiyong >", value, "coopBeiyong");
            return (Criteria) this;
        }

        public Criteria andCoopBeiyongGreaterThanOrEqualTo(String value) {
            addCriterion("coop_beiyong >=", value, "coopBeiyong");
            return (Criteria) this;
        }

        public Criteria andCoopBeiyongLessThan(String value) {
            addCriterion("coop_beiyong <", value, "coopBeiyong");
            return (Criteria) this;
        }

        public Criteria andCoopBeiyongLessThanOrEqualTo(String value) {
            addCriterion("coop_beiyong <=", value, "coopBeiyong");
            return (Criteria) this;
        }

        public Criteria andCoopBeiyongLike(String value) {
            addCriterion("coop_beiyong like", value, "coopBeiyong");
            return (Criteria) this;
        }

        public Criteria andCoopBeiyongNotLike(String value) {
            addCriterion("coop_beiyong not like", value, "coopBeiyong");
            return (Criteria) this;
        }

        public Criteria andCoopBeiyongIn(List<String> values) {
            addCriterion("coop_beiyong in", values, "coopBeiyong");
            return (Criteria) this;
        }

        public Criteria andCoopBeiyongNotIn(List<String> values) {
            addCriterion("coop_beiyong not in", values, "coopBeiyong");
            return (Criteria) this;
        }

        public Criteria andCoopBeiyongBetween(String value1, String value2) {
            addCriterion("coop_beiyong between", value1, value2, "coopBeiyong");
            return (Criteria) this;
        }

        public Criteria andCoopBeiyongNotBetween(String value1, String value2) {
            addCriterion("coop_beiyong not between", value1, value2, "coopBeiyong");
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