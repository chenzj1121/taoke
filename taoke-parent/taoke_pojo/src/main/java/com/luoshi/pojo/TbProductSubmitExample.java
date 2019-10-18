package com.luoshi.pojo;

import java.util.ArrayList;
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