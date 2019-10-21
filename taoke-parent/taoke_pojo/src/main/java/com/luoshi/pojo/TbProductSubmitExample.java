package com.luoshi.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbProductSubmitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbProductSubmitExample() {
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

        public Criteria andCustomNameIsNull() {
            addCriterion("custom_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomNameIsNotNull() {
            addCriterion("custom_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomNameEqualTo(String value) {
            addCriterion("custom_name =", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotEqualTo(String value) {
            addCriterion("custom_name <>", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameGreaterThan(String value) {
            addCriterion("custom_name >", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameGreaterThanOrEqualTo(String value) {
            addCriterion("custom_name >=", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLessThan(String value) {
            addCriterion("custom_name <", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLessThanOrEqualTo(String value) {
            addCriterion("custom_name <=", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLike(String value) {
            addCriterion("custom_name like", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotLike(String value) {
            addCriterion("custom_name not like", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameIn(List<String> values) {
            addCriterion("custom_name in", values, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotIn(List<String> values) {
            addCriterion("custom_name not in", values, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameBetween(String value1, String value2) {
            addCriterion("custom_name between", value1, value2, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotBetween(String value1, String value2) {
            addCriterion("custom_name not between", value1, value2, "customName");
            return (Criteria) this;
        }

        public Criteria andZeroSubmitIsNull() {
            addCriterion("zero_submit is null");
            return (Criteria) this;
        }

        public Criteria andZeroSubmitIsNotNull() {
            addCriterion("zero_submit is not null");
            return (Criteria) this;
        }

        public Criteria andZeroSubmitEqualTo(String value) {
            addCriterion("zero_submit =", value, "zeroSubmit");
            return (Criteria) this;
        }

        public Criteria andZeroSubmitNotEqualTo(String value) {
            addCriterion("zero_submit <>", value, "zeroSubmit");
            return (Criteria) this;
        }

        public Criteria andZeroSubmitGreaterThan(String value) {
            addCriterion("zero_submit >", value, "zeroSubmit");
            return (Criteria) this;
        }

        public Criteria andZeroSubmitGreaterThanOrEqualTo(String value) {
            addCriterion("zero_submit >=", value, "zeroSubmit");
            return (Criteria) this;
        }

        public Criteria andZeroSubmitLessThan(String value) {
            addCriterion("zero_submit <", value, "zeroSubmit");
            return (Criteria) this;
        }

        public Criteria andZeroSubmitLessThanOrEqualTo(String value) {
            addCriterion("zero_submit <=", value, "zeroSubmit");
            return (Criteria) this;
        }

        public Criteria andZeroSubmitLike(String value) {
            addCriterion("zero_submit like", value, "zeroSubmit");
            return (Criteria) this;
        }

        public Criteria andZeroSubmitNotLike(String value) {
            addCriterion("zero_submit not like", value, "zeroSubmit");
            return (Criteria) this;
        }

        public Criteria andZeroSubmitIn(List<String> values) {
            addCriterion("zero_submit in", values, "zeroSubmit");
            return (Criteria) this;
        }

        public Criteria andZeroSubmitNotIn(List<String> values) {
            addCriterion("zero_submit not in", values, "zeroSubmit");
            return (Criteria) this;
        }

        public Criteria andZeroSubmitBetween(String value1, String value2) {
            addCriterion("zero_submit between", value1, value2, "zeroSubmit");
            return (Criteria) this;
        }

        public Criteria andZeroSubmitNotBetween(String value1, String value2) {
            addCriterion("zero_submit not between", value1, value2, "zeroSubmit");
            return (Criteria) this;
        }

        public Criteria andShopTitleIsNull() {
            addCriterion("shop_title is null");
            return (Criteria) this;
        }

        public Criteria andShopTitleIsNotNull() {
            addCriterion("shop_title is not null");
            return (Criteria) this;
        }

        public Criteria andShopTitleEqualTo(String value) {
            addCriterion("shop_title =", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleNotEqualTo(String value) {
            addCriterion("shop_title <>", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleGreaterThan(String value) {
            addCriterion("shop_title >", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleGreaterThanOrEqualTo(String value) {
            addCriterion("shop_title >=", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleLessThan(String value) {
            addCriterion("shop_title <", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleLessThanOrEqualTo(String value) {
            addCriterion("shop_title <=", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleLike(String value) {
            addCriterion("shop_title like", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleNotLike(String value) {
            addCriterion("shop_title not like", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleIn(List<String> values) {
            addCriterion("shop_title in", values, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleNotIn(List<String> values) {
            addCriterion("shop_title not in", values, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleBetween(String value1, String value2) {
            addCriterion("shop_title between", value1, value2, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleNotBetween(String value1, String value2) {
            addCriterion("shop_title not between", value1, value2, "shopTitle");
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

        public Criteria andShopActiveIsNull() {
            addCriterion("shop_active is null");
            return (Criteria) this;
        }

        public Criteria andShopActiveIsNotNull() {
            addCriterion("shop_active is not null");
            return (Criteria) this;
        }

        public Criteria andShopActiveEqualTo(String value) {
            addCriterion("shop_active =", value, "shopActive");
            return (Criteria) this;
        }

        public Criteria andShopActiveNotEqualTo(String value) {
            addCriterion("shop_active <>", value, "shopActive");
            return (Criteria) this;
        }

        public Criteria andShopActiveGreaterThan(String value) {
            addCriterion("shop_active >", value, "shopActive");
            return (Criteria) this;
        }

        public Criteria andShopActiveGreaterThanOrEqualTo(String value) {
            addCriterion("shop_active >=", value, "shopActive");
            return (Criteria) this;
        }

        public Criteria andShopActiveLessThan(String value) {
            addCriterion("shop_active <", value, "shopActive");
            return (Criteria) this;
        }

        public Criteria andShopActiveLessThanOrEqualTo(String value) {
            addCriterion("shop_active <=", value, "shopActive");
            return (Criteria) this;
        }

        public Criteria andShopActiveLike(String value) {
            addCriterion("shop_active like", value, "shopActive");
            return (Criteria) this;
        }

        public Criteria andShopActiveNotLike(String value) {
            addCriterion("shop_active not like", value, "shopActive");
            return (Criteria) this;
        }

        public Criteria andShopActiveIn(List<String> values) {
            addCriterion("shop_active in", values, "shopActive");
            return (Criteria) this;
        }

        public Criteria andShopActiveNotIn(List<String> values) {
            addCriterion("shop_active not in", values, "shopActive");
            return (Criteria) this;
        }

        public Criteria andShopActiveBetween(String value1, String value2) {
            addCriterion("shop_active between", value1, value2, "shopActive");
            return (Criteria) this;
        }

        public Criteria andShopActiveNotBetween(String value1, String value2) {
            addCriterion("shop_active not between", value1, value2, "shopActive");
            return (Criteria) this;
        }

        public Criteria andShopItemIsNull() {
            addCriterion("shop_item is null");
            return (Criteria) this;
        }

        public Criteria andShopItemIsNotNull() {
            addCriterion("shop_item is not null");
            return (Criteria) this;
        }

        public Criteria andShopItemEqualTo(String value) {
            addCriterion("shop_item =", value, "shopItem");
            return (Criteria) this;
        }

        public Criteria andShopItemNotEqualTo(String value) {
            addCriterion("shop_item <>", value, "shopItem");
            return (Criteria) this;
        }

        public Criteria andShopItemGreaterThan(String value) {
            addCriterion("shop_item >", value, "shopItem");
            return (Criteria) this;
        }

        public Criteria andShopItemGreaterThanOrEqualTo(String value) {
            addCriterion("shop_item >=", value, "shopItem");
            return (Criteria) this;
        }

        public Criteria andShopItemLessThan(String value) {
            addCriterion("shop_item <", value, "shopItem");
            return (Criteria) this;
        }

        public Criteria andShopItemLessThanOrEqualTo(String value) {
            addCriterion("shop_item <=", value, "shopItem");
            return (Criteria) this;
        }

        public Criteria andShopItemLike(String value) {
            addCriterion("shop_item like", value, "shopItem");
            return (Criteria) this;
        }

        public Criteria andShopItemNotLike(String value) {
            addCriterion("shop_item not like", value, "shopItem");
            return (Criteria) this;
        }

        public Criteria andShopItemIn(List<String> values) {
            addCriterion("shop_item in", values, "shopItem");
            return (Criteria) this;
        }

        public Criteria andShopItemNotIn(List<String> values) {
            addCriterion("shop_item not in", values, "shopItem");
            return (Criteria) this;
        }

        public Criteria andShopItemBetween(String value1, String value2) {
            addCriterion("shop_item between", value1, value2, "shopItem");
            return (Criteria) this;
        }

        public Criteria andShopItemNotBetween(String value1, String value2) {
            addCriterion("shop_item not between", value1, value2, "shopItem");
            return (Criteria) this;
        }

        public Criteria andShopMainPicIsNull() {
            addCriterion("shop_main_pic is null");
            return (Criteria) this;
        }

        public Criteria andShopMainPicIsNotNull() {
            addCriterion("shop_main_pic is not null");
            return (Criteria) this;
        }

        public Criteria andShopMainPicEqualTo(String value) {
            addCriterion("shop_main_pic =", value, "shopMainPic");
            return (Criteria) this;
        }

        public Criteria andShopMainPicNotEqualTo(String value) {
            addCriterion("shop_main_pic <>", value, "shopMainPic");
            return (Criteria) this;
        }

        public Criteria andShopMainPicGreaterThan(String value) {
            addCriterion("shop_main_pic >", value, "shopMainPic");
            return (Criteria) this;
        }

        public Criteria andShopMainPicGreaterThanOrEqualTo(String value) {
            addCriterion("shop_main_pic >=", value, "shopMainPic");
            return (Criteria) this;
        }

        public Criteria andShopMainPicLessThan(String value) {
            addCriterion("shop_main_pic <", value, "shopMainPic");
            return (Criteria) this;
        }

        public Criteria andShopMainPicLessThanOrEqualTo(String value) {
            addCriterion("shop_main_pic <=", value, "shopMainPic");
            return (Criteria) this;
        }

        public Criteria andShopMainPicLike(String value) {
            addCriterion("shop_main_pic like", value, "shopMainPic");
            return (Criteria) this;
        }

        public Criteria andShopMainPicNotLike(String value) {
            addCriterion("shop_main_pic not like", value, "shopMainPic");
            return (Criteria) this;
        }

        public Criteria andShopMainPicIn(List<String> values) {
            addCriterion("shop_main_pic in", values, "shopMainPic");
            return (Criteria) this;
        }

        public Criteria andShopMainPicNotIn(List<String> values) {
            addCriterion("shop_main_pic not in", values, "shopMainPic");
            return (Criteria) this;
        }

        public Criteria andShopMainPicBetween(String value1, String value2) {
            addCriterion("shop_main_pic between", value1, value2, "shopMainPic");
            return (Criteria) this;
        }

        public Criteria andShopMainPicNotBetween(String value1, String value2) {
            addCriterion("shop_main_pic not between", value1, value2, "shopMainPic");
            return (Criteria) this;
        }

        public Criteria andShopMarketPicIsNull() {
            addCriterion("shop_market_pic is null");
            return (Criteria) this;
        }

        public Criteria andShopMarketPicIsNotNull() {
            addCriterion("shop_market_pic is not null");
            return (Criteria) this;
        }

        public Criteria andShopMarketPicEqualTo(String value) {
            addCriterion("shop_market_pic =", value, "shopMarketPic");
            return (Criteria) this;
        }

        public Criteria andShopMarketPicNotEqualTo(String value) {
            addCriterion("shop_market_pic <>", value, "shopMarketPic");
            return (Criteria) this;
        }

        public Criteria andShopMarketPicGreaterThan(String value) {
            addCriterion("shop_market_pic >", value, "shopMarketPic");
            return (Criteria) this;
        }

        public Criteria andShopMarketPicGreaterThanOrEqualTo(String value) {
            addCriterion("shop_market_pic >=", value, "shopMarketPic");
            return (Criteria) this;
        }

        public Criteria andShopMarketPicLessThan(String value) {
            addCriterion("shop_market_pic <", value, "shopMarketPic");
            return (Criteria) this;
        }

        public Criteria andShopMarketPicLessThanOrEqualTo(String value) {
            addCriterion("shop_market_pic <=", value, "shopMarketPic");
            return (Criteria) this;
        }

        public Criteria andShopMarketPicLike(String value) {
            addCriterion("shop_market_pic like", value, "shopMarketPic");
            return (Criteria) this;
        }

        public Criteria andShopMarketPicNotLike(String value) {
            addCriterion("shop_market_pic not like", value, "shopMarketPic");
            return (Criteria) this;
        }

        public Criteria andShopMarketPicIn(List<String> values) {
            addCriterion("shop_market_pic in", values, "shopMarketPic");
            return (Criteria) this;
        }

        public Criteria andShopMarketPicNotIn(List<String> values) {
            addCriterion("shop_market_pic not in", values, "shopMarketPic");
            return (Criteria) this;
        }

        public Criteria andShopMarketPicBetween(String value1, String value2) {
            addCriterion("shop_market_pic between", value1, value2, "shopMarketPic");
            return (Criteria) this;
        }

        public Criteria andShopMarketPicNotBetween(String value1, String value2) {
            addCriterion("shop_market_pic not between", value1, value2, "shopMarketPic");
            return (Criteria) this;
        }

        public Criteria andExtensionStrategyIsNull() {
            addCriterion("extension_strategy is null");
            return (Criteria) this;
        }

        public Criteria andExtensionStrategyIsNotNull() {
            addCriterion("extension_strategy is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionStrategyEqualTo(String value) {
            addCriterion("extension_strategy =", value, "extensionStrategy");
            return (Criteria) this;
        }

        public Criteria andExtensionStrategyNotEqualTo(String value) {
            addCriterion("extension_strategy <>", value, "extensionStrategy");
            return (Criteria) this;
        }

        public Criteria andExtensionStrategyGreaterThan(String value) {
            addCriterion("extension_strategy >", value, "extensionStrategy");
            return (Criteria) this;
        }

        public Criteria andExtensionStrategyGreaterThanOrEqualTo(String value) {
            addCriterion("extension_strategy >=", value, "extensionStrategy");
            return (Criteria) this;
        }

        public Criteria andExtensionStrategyLessThan(String value) {
            addCriterion("extension_strategy <", value, "extensionStrategy");
            return (Criteria) this;
        }

        public Criteria andExtensionStrategyLessThanOrEqualTo(String value) {
            addCriterion("extension_strategy <=", value, "extensionStrategy");
            return (Criteria) this;
        }

        public Criteria andExtensionStrategyLike(String value) {
            addCriterion("extension_strategy like", value, "extensionStrategy");
            return (Criteria) this;
        }

        public Criteria andExtensionStrategyNotLike(String value) {
            addCriterion("extension_strategy not like", value, "extensionStrategy");
            return (Criteria) this;
        }

        public Criteria andExtensionStrategyIn(List<String> values) {
            addCriterion("extension_strategy in", values, "extensionStrategy");
            return (Criteria) this;
        }

        public Criteria andExtensionStrategyNotIn(List<String> values) {
            addCriterion("extension_strategy not in", values, "extensionStrategy");
            return (Criteria) this;
        }

        public Criteria andExtensionStrategyBetween(String value1, String value2) {
            addCriterion("extension_strategy between", value1, value2, "extensionStrategy");
            return (Criteria) this;
        }

        public Criteria andExtensionStrategyNotBetween(String value1, String value2) {
            addCriterion("extension_strategy not between", value1, value2, "extensionStrategy");
            return (Criteria) this;
        }

        public Criteria andCharacteristicStrategyIsNull() {
            addCriterion("characteristic_strategy is null");
            return (Criteria) this;
        }

        public Criteria andCharacteristicStrategyIsNotNull() {
            addCriterion("characteristic_strategy is not null");
            return (Criteria) this;
        }

        public Criteria andCharacteristicStrategyEqualTo(String value) {
            addCriterion("characteristic_strategy =", value, "characteristicStrategy");
            return (Criteria) this;
        }

        public Criteria andCharacteristicStrategyNotEqualTo(String value) {
            addCriterion("characteristic_strategy <>", value, "characteristicStrategy");
            return (Criteria) this;
        }

        public Criteria andCharacteristicStrategyGreaterThan(String value) {
            addCriterion("characteristic_strategy >", value, "characteristicStrategy");
            return (Criteria) this;
        }

        public Criteria andCharacteristicStrategyGreaterThanOrEqualTo(String value) {
            addCriterion("characteristic_strategy >=", value, "characteristicStrategy");
            return (Criteria) this;
        }

        public Criteria andCharacteristicStrategyLessThan(String value) {
            addCriterion("characteristic_strategy <", value, "characteristicStrategy");
            return (Criteria) this;
        }

        public Criteria andCharacteristicStrategyLessThanOrEqualTo(String value) {
            addCriterion("characteristic_strategy <=", value, "characteristicStrategy");
            return (Criteria) this;
        }

        public Criteria andCharacteristicStrategyLike(String value) {
            addCriterion("characteristic_strategy like", value, "characteristicStrategy");
            return (Criteria) this;
        }

        public Criteria andCharacteristicStrategyNotLike(String value) {
            addCriterion("characteristic_strategy not like", value, "characteristicStrategy");
            return (Criteria) this;
        }

        public Criteria andCharacteristicStrategyIn(List<String> values) {
            addCriterion("characteristic_strategy in", values, "characteristicStrategy");
            return (Criteria) this;
        }

        public Criteria andCharacteristicStrategyNotIn(List<String> values) {
            addCriterion("characteristic_strategy not in", values, "characteristicStrategy");
            return (Criteria) this;
        }

        public Criteria andCharacteristicStrategyBetween(String value1, String value2) {
            addCriterion("characteristic_strategy between", value1, value2, "characteristicStrategy");
            return (Criteria) this;
        }

        public Criteria andCharacteristicStrategyNotBetween(String value1, String value2) {
            addCriterion("characteristic_strategy not between", value1, value2, "characteristicStrategy");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNull() {
            addCriterion("coupon_type is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNotNull() {
            addCriterion("coupon_type is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeEqualTo(String value) {
            addCriterion("coupon_type =", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotEqualTo(String value) {
            addCriterion("coupon_type <>", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThan(String value) {
            addCriterion("coupon_type >", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_type >=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThan(String value) {
            addCriterion("coupon_type <", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThanOrEqualTo(String value) {
            addCriterion("coupon_type <=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLike(String value) {
            addCriterion("coupon_type like", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotLike(String value) {
            addCriterion("coupon_type not like", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIn(List<String> values) {
            addCriterion("coupon_type in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotIn(List<String> values) {
            addCriterion("coupon_type not in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeBetween(String value1, String value2) {
            addCriterion("coupon_type between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotBetween(String value1, String value2) {
            addCriterion("coupon_type not between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNull() {
            addCriterion("coupon_name is null");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNotNull() {
            addCriterion("coupon_name is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNameEqualTo(String value) {
            addCriterion("coupon_name =", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotEqualTo(String value) {
            addCriterion("coupon_name <>", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThan(String value) {
            addCriterion("coupon_name >", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_name >=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThan(String value) {
            addCriterion("coupon_name <", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThanOrEqualTo(String value) {
            addCriterion("coupon_name <=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLike(String value) {
            addCriterion("coupon_name like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotLike(String value) {
            addCriterion("coupon_name not like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameIn(List<String> values) {
            addCriterion("coupon_name in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotIn(List<String> values) {
            addCriterion("coupon_name not in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameBetween(String value1, String value2) {
            addCriterion("coupon_name between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotBetween(String value1, String value2) {
            addCriterion("coupon_name not between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponUrlIsNull() {
            addCriterion("coupon_url is null");
            return (Criteria) this;
        }

        public Criteria andCouponUrlIsNotNull() {
            addCriterion("coupon_url is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUrlEqualTo(String value) {
            addCriterion("coupon_url =", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlNotEqualTo(String value) {
            addCriterion("coupon_url <>", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlGreaterThan(String value) {
            addCriterion("coupon_url >", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_url >=", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlLessThan(String value) {
            addCriterion("coupon_url <", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlLessThanOrEqualTo(String value) {
            addCriterion("coupon_url <=", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlLike(String value) {
            addCriterion("coupon_url like", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlNotLike(String value) {
            addCriterion("coupon_url not like", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlIn(List<String> values) {
            addCriterion("coupon_url in", values, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlNotIn(List<String> values) {
            addCriterion("coupon_url not in", values, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlBetween(String value1, String value2) {
            addCriterion("coupon_url between", value1, value2, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlNotBetween(String value1, String value2) {
            addCriterion("coupon_url not between", value1, value2, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponAfterPriceIsNull() {
            addCriterion("coupon_after_price is null");
            return (Criteria) this;
        }

        public Criteria andCouponAfterPriceIsNotNull() {
            addCriterion("coupon_after_price is not null");
            return (Criteria) this;
        }

        public Criteria andCouponAfterPriceEqualTo(Double value) {
            addCriterion("coupon_after_price =", value, "couponAfterPrice");
            return (Criteria) this;
        }

        public Criteria andCouponAfterPriceNotEqualTo(Double value) {
            addCriterion("coupon_after_price <>", value, "couponAfterPrice");
            return (Criteria) this;
        }

        public Criteria andCouponAfterPriceGreaterThan(Double value) {
            addCriterion("coupon_after_price >", value, "couponAfterPrice");
            return (Criteria) this;
        }

        public Criteria andCouponAfterPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("coupon_after_price >=", value, "couponAfterPrice");
            return (Criteria) this;
        }

        public Criteria andCouponAfterPriceLessThan(Double value) {
            addCriterion("coupon_after_price <", value, "couponAfterPrice");
            return (Criteria) this;
        }

        public Criteria andCouponAfterPriceLessThanOrEqualTo(Double value) {
            addCriterion("coupon_after_price <=", value, "couponAfterPrice");
            return (Criteria) this;
        }

        public Criteria andCouponAfterPriceIn(List<Double> values) {
            addCriterion("coupon_after_price in", values, "couponAfterPrice");
            return (Criteria) this;
        }

        public Criteria andCouponAfterPriceNotIn(List<Double> values) {
            addCriterion("coupon_after_price not in", values, "couponAfterPrice");
            return (Criteria) this;
        }

        public Criteria andCouponAfterPriceBetween(Double value1, Double value2) {
            addCriterion("coupon_after_price between", value1, value2, "couponAfterPrice");
            return (Criteria) this;
        }

        public Criteria andCouponAfterPriceNotBetween(Double value1, Double value2) {
            addCriterion("coupon_after_price not between", value1, value2, "couponAfterPrice");
            return (Criteria) this;
        }

        public Criteria andCouponCountIsNull() {
            addCriterion("coupon_count is null");
            return (Criteria) this;
        }

        public Criteria andCouponCountIsNotNull() {
            addCriterion("coupon_count is not null");
            return (Criteria) this;
        }

        public Criteria andCouponCountEqualTo(String value) {
            addCriterion("coupon_count =", value, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountNotEqualTo(String value) {
            addCriterion("coupon_count <>", value, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountGreaterThan(String value) {
            addCriterion("coupon_count >", value, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_count >=", value, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountLessThan(String value) {
            addCriterion("coupon_count <", value, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountLessThanOrEqualTo(String value) {
            addCriterion("coupon_count <=", value, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountLike(String value) {
            addCriterion("coupon_count like", value, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountNotLike(String value) {
            addCriterion("coupon_count not like", value, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountIn(List<String> values) {
            addCriterion("coupon_count in", values, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountNotIn(List<String> values) {
            addCriterion("coupon_count not in", values, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountBetween(String value1, String value2) {
            addCriterion("coupon_count between", value1, value2, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountNotBetween(String value1, String value2) {
            addCriterion("coupon_count not between", value1, value2, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIsNull() {
            addCriterion("coupon_price is null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIsNotNull() {
            addCriterion("coupon_price is not null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceEqualTo(String value) {
            addCriterion("coupon_price =", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotEqualTo(String value) {
            addCriterion("coupon_price <>", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThan(String value) {
            addCriterion("coupon_price >", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_price >=", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThan(String value) {
            addCriterion("coupon_price <", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThanOrEqualTo(String value) {
            addCriterion("coupon_price <=", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceLike(String value) {
            addCriterion("coupon_price like", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotLike(String value) {
            addCriterion("coupon_price not like", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIn(List<String> values) {
            addCriterion("coupon_price in", values, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotIn(List<String> values) {
            addCriterion("coupon_price not in", values, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBetween(String value1, String value2) {
            addCriterion("coupon_price between", value1, value2, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotBetween(String value1, String value2) {
            addCriterion("coupon_price not between", value1, value2, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceIsNull() {
            addCriterion("service_price is null");
            return (Criteria) this;
        }

        public Criteria andServicePriceIsNotNull() {
            addCriterion("service_price is not null");
            return (Criteria) this;
        }

        public Criteria andServicePriceEqualTo(String value) {
            addCriterion("service_price =", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotEqualTo(String value) {
            addCriterion("service_price <>", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceGreaterThan(String value) {
            addCriterion("service_price >", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceGreaterThanOrEqualTo(String value) {
            addCriterion("service_price >=", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceLessThan(String value) {
            addCriterion("service_price <", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceLessThanOrEqualTo(String value) {
            addCriterion("service_price <=", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceLike(String value) {
            addCriterion("service_price like", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotLike(String value) {
            addCriterion("service_price not like", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceIn(List<String> values) {
            addCriterion("service_price in", values, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotIn(List<String> values) {
            addCriterion("service_price not in", values, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceBetween(String value1, String value2) {
            addCriterion("service_price between", value1, value2, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotBetween(String value1, String value2) {
            addCriterion("service_price not between", value1, value2, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTimeIsNull() {
            addCriterion("return_money_time is null");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTimeIsNotNull() {
            addCriterion("return_money_time is not null");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTimeEqualTo(String value) {
            addCriterion("return_money_time =", value, "returnMoneyTime");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTimeNotEqualTo(String value) {
            addCriterion("return_money_time <>", value, "returnMoneyTime");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTimeGreaterThan(String value) {
            addCriterion("return_money_time >", value, "returnMoneyTime");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("return_money_time >=", value, "returnMoneyTime");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTimeLessThan(String value) {
            addCriterion("return_money_time <", value, "returnMoneyTime");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTimeLessThanOrEqualTo(String value) {
            addCriterion("return_money_time <=", value, "returnMoneyTime");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTimeLike(String value) {
            addCriterion("return_money_time like", value, "returnMoneyTime");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTimeNotLike(String value) {
            addCriterion("return_money_time not like", value, "returnMoneyTime");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTimeIn(List<String> values) {
            addCriterion("return_money_time in", values, "returnMoneyTime");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTimeNotIn(List<String> values) {
            addCriterion("return_money_time not in", values, "returnMoneyTime");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTimeBetween(String value1, String value2) {
            addCriterion("return_money_time between", value1, value2, "returnMoneyTime");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTimeNotBetween(String value1, String value2) {
            addCriterion("return_money_time not between", value1, value2, "returnMoneyTime");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andTaobaoPriceIsNull() {
            addCriterion("taobao_price is null");
            return (Criteria) this;
        }

        public Criteria andTaobaoPriceIsNotNull() {
            addCriterion("taobao_price is not null");
            return (Criteria) this;
        }

        public Criteria andTaobaoPriceEqualTo(String value) {
            addCriterion("taobao_price =", value, "taobaoPrice");
            return (Criteria) this;
        }

        public Criteria andTaobaoPriceNotEqualTo(String value) {
            addCriterion("taobao_price <>", value, "taobaoPrice");
            return (Criteria) this;
        }

        public Criteria andTaobaoPriceGreaterThan(String value) {
            addCriterion("taobao_price >", value, "taobaoPrice");
            return (Criteria) this;
        }

        public Criteria andTaobaoPriceGreaterThanOrEqualTo(String value) {
            addCriterion("taobao_price >=", value, "taobaoPrice");
            return (Criteria) this;
        }

        public Criteria andTaobaoPriceLessThan(String value) {
            addCriterion("taobao_price <", value, "taobaoPrice");
            return (Criteria) this;
        }

        public Criteria andTaobaoPriceLessThanOrEqualTo(String value) {
            addCriterion("taobao_price <=", value, "taobaoPrice");
            return (Criteria) this;
        }

        public Criteria andTaobaoPriceLike(String value) {
            addCriterion("taobao_price like", value, "taobaoPrice");
            return (Criteria) this;
        }

        public Criteria andTaobaoPriceNotLike(String value) {
            addCriterion("taobao_price not like", value, "taobaoPrice");
            return (Criteria) this;
        }

        public Criteria andTaobaoPriceIn(List<String> values) {
            addCriterion("taobao_price in", values, "taobaoPrice");
            return (Criteria) this;
        }

        public Criteria andTaobaoPriceNotIn(List<String> values) {
            addCriterion("taobao_price not in", values, "taobaoPrice");
            return (Criteria) this;
        }

        public Criteria andTaobaoPriceBetween(String value1, String value2) {
            addCriterion("taobao_price between", value1, value2, "taobaoPrice");
            return (Criteria) this;
        }

        public Criteria andTaobaoPriceNotBetween(String value1, String value2) {
            addCriterion("taobao_price not between", value1, value2, "taobaoPrice");
            return (Criteria) this;
        }

        public Criteria andBuyCountIsNull() {
            addCriterion("buy_count is null");
            return (Criteria) this;
        }

        public Criteria andBuyCountIsNotNull() {
            addCriterion("buy_count is not null");
            return (Criteria) this;
        }

        public Criteria andBuyCountEqualTo(String value) {
            addCriterion("buy_count =", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountNotEqualTo(String value) {
            addCriterion("buy_count <>", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountGreaterThan(String value) {
            addCriterion("buy_count >", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountGreaterThanOrEqualTo(String value) {
            addCriterion("buy_count >=", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountLessThan(String value) {
            addCriterion("buy_count <", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountLessThanOrEqualTo(String value) {
            addCriterion("buy_count <=", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountLike(String value) {
            addCriterion("buy_count like", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountNotLike(String value) {
            addCriterion("buy_count not like", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountIn(List<String> values) {
            addCriterion("buy_count in", values, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountNotIn(List<String> values) {
            addCriterion("buy_count not in", values, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountBetween(String value1, String value2) {
            addCriterion("buy_count between", value1, value2, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountNotBetween(String value1, String value2) {
            addCriterion("buy_count not between", value1, value2, "buyCount");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeIsNull() {
            addCriterion("settlement_type is null");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeIsNotNull() {
            addCriterion("settlement_type is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeEqualTo(String value) {
            addCriterion("settlement_type =", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotEqualTo(String value) {
            addCriterion("settlement_type <>", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeGreaterThan(String value) {
            addCriterion("settlement_type >", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_type >=", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLessThan(String value) {
            addCriterion("settlement_type <", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLessThanOrEqualTo(String value) {
            addCriterion("settlement_type <=", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLike(String value) {
            addCriterion("settlement_type like", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotLike(String value) {
            addCriterion("settlement_type not like", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeIn(List<String> values) {
            addCriterion("settlement_type in", values, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotIn(List<String> values) {
            addCriterion("settlement_type not in", values, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeBetween(String value1, String value2) {
            addCriterion("settlement_type between", value1, value2, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotBetween(String value1, String value2) {
            addCriterion("settlement_type not between", value1, value2, "settlementType");
            return (Criteria) this;
        }

        public Criteria andUploadPicIsNull() {
            addCriterion("upload_pic is null");
            return (Criteria) this;
        }

        public Criteria andUploadPicIsNotNull() {
            addCriterion("upload_pic is not null");
            return (Criteria) this;
        }

        public Criteria andUploadPicEqualTo(String value) {
            addCriterion("upload_pic =", value, "uploadPic");
            return (Criteria) this;
        }

        public Criteria andUploadPicNotEqualTo(String value) {
            addCriterion("upload_pic <>", value, "uploadPic");
            return (Criteria) this;
        }

        public Criteria andUploadPicGreaterThan(String value) {
            addCriterion("upload_pic >", value, "uploadPic");
            return (Criteria) this;
        }

        public Criteria andUploadPicGreaterThanOrEqualTo(String value) {
            addCriterion("upload_pic >=", value, "uploadPic");
            return (Criteria) this;
        }

        public Criteria andUploadPicLessThan(String value) {
            addCriterion("upload_pic <", value, "uploadPic");
            return (Criteria) this;
        }

        public Criteria andUploadPicLessThanOrEqualTo(String value) {
            addCriterion("upload_pic <=", value, "uploadPic");
            return (Criteria) this;
        }

        public Criteria andUploadPicLike(String value) {
            addCriterion("upload_pic like", value, "uploadPic");
            return (Criteria) this;
        }

        public Criteria andUploadPicNotLike(String value) {
            addCriterion("upload_pic not like", value, "uploadPic");
            return (Criteria) this;
        }

        public Criteria andUploadPicIn(List<String> values) {
            addCriterion("upload_pic in", values, "uploadPic");
            return (Criteria) this;
        }

        public Criteria andUploadPicNotIn(List<String> values) {
            addCriterion("upload_pic not in", values, "uploadPic");
            return (Criteria) this;
        }

        public Criteria andUploadPicBetween(String value1, String value2) {
            addCriterion("upload_pic between", value1, value2, "uploadPic");
            return (Criteria) this;
        }

        public Criteria andUploadPicNotBetween(String value1, String value2) {
            addCriterion("upload_pic not between", value1, value2, "uploadPic");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
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

        public Criteria andTbTypeIsNull() {
            addCriterion("tb_type is null");
            return (Criteria) this;
        }

        public Criteria andTbTypeIsNotNull() {
            addCriterion("tb_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbTypeEqualTo(String value) {
            addCriterion("tb_type =", value, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeNotEqualTo(String value) {
            addCriterion("tb_type <>", value, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeGreaterThan(String value) {
            addCriterion("tb_type >", value, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tb_type >=", value, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeLessThan(String value) {
            addCriterion("tb_type <", value, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeLessThanOrEqualTo(String value) {
            addCriterion("tb_type <=", value, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeLike(String value) {
            addCriterion("tb_type like", value, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeNotLike(String value) {
            addCriterion("tb_type not like", value, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeIn(List<String> values) {
            addCriterion("tb_type in", values, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeNotIn(List<String> values) {
            addCriterion("tb_type not in", values, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeBetween(String value1, String value2) {
            addCriterion("tb_type between", value1, value2, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeNotBetween(String value1, String value2) {
            addCriterion("tb_type not between", value1, value2, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTimeIsNull() {
            addCriterion("tb_time is null");
            return (Criteria) this;
        }

        public Criteria andTbTimeIsNotNull() {
            addCriterion("tb_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbTimeEqualTo(Date value) {
            addCriterion("tb_time =", value, "tbTime");
            return (Criteria) this;
        }

        public Criteria andTbTimeNotEqualTo(Date value) {
            addCriterion("tb_time <>", value, "tbTime");
            return (Criteria) this;
        }

        public Criteria andTbTimeGreaterThan(Date value) {
            addCriterion("tb_time >", value, "tbTime");
            return (Criteria) this;
        }

        public Criteria andTbTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tb_time >=", value, "tbTime");
            return (Criteria) this;
        }

        public Criteria andTbTimeLessThan(Date value) {
            addCriterion("tb_time <", value, "tbTime");
            return (Criteria) this;
        }

        public Criteria andTbTimeLessThanOrEqualTo(Date value) {
            addCriterion("tb_time <=", value, "tbTime");
            return (Criteria) this;
        }

        public Criteria andTbTimeIn(List<Date> values) {
            addCriterion("tb_time in", values, "tbTime");
            return (Criteria) this;
        }

        public Criteria andTbTimeNotIn(List<Date> values) {
            addCriterion("tb_time not in", values, "tbTime");
            return (Criteria) this;
        }

        public Criteria andTbTimeBetween(Date value1, Date value2) {
            addCriterion("tb_time between", value1, value2, "tbTime");
            return (Criteria) this;
        }

        public Criteria andTbTimeNotBetween(Date value1, Date value2) {
            addCriterion("tb_time not between", value1, value2, "tbTime");
            return (Criteria) this;
        }

        public Criteria andTbBzIsNull() {
            addCriterion("tb_bz is null");
            return (Criteria) this;
        }

        public Criteria andTbBzIsNotNull() {
            addCriterion("tb_bz is not null");
            return (Criteria) this;
        }

        public Criteria andTbBzEqualTo(String value) {
            addCriterion("tb_bz =", value, "tbBz");
            return (Criteria) this;
        }

        public Criteria andTbBzNotEqualTo(String value) {
            addCriterion("tb_bz <>", value, "tbBz");
            return (Criteria) this;
        }

        public Criteria andTbBzGreaterThan(String value) {
            addCriterion("tb_bz >", value, "tbBz");
            return (Criteria) this;
        }

        public Criteria andTbBzGreaterThanOrEqualTo(String value) {
            addCriterion("tb_bz >=", value, "tbBz");
            return (Criteria) this;
        }

        public Criteria andTbBzLessThan(String value) {
            addCriterion("tb_bz <", value, "tbBz");
            return (Criteria) this;
        }

        public Criteria andTbBzLessThanOrEqualTo(String value) {
            addCriterion("tb_bz <=", value, "tbBz");
            return (Criteria) this;
        }

        public Criteria andTbBzLike(String value) {
            addCriterion("tb_bz like", value, "tbBz");
            return (Criteria) this;
        }

        public Criteria andTbBzNotLike(String value) {
            addCriterion("tb_bz not like", value, "tbBz");
            return (Criteria) this;
        }

        public Criteria andTbBzIn(List<String> values) {
            addCriterion("tb_bz in", values, "tbBz");
            return (Criteria) this;
        }

        public Criteria andTbBzNotIn(List<String> values) {
            addCriterion("tb_bz not in", values, "tbBz");
            return (Criteria) this;
        }

        public Criteria andTbBzBetween(String value1, String value2) {
            addCriterion("tb_bz between", value1, value2, "tbBz");
            return (Criteria) this;
        }

        public Criteria andTbBzNotBetween(String value1, String value2) {
            addCriterion("tb_bz not between", value1, value2, "tbBz");
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