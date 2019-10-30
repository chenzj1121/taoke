package com.luoshi.pojo;

import java.util.Date;

public class TbGoods {
    private Long goodsId;

    private Date goodsStarttime;

    private Date goodsEndtime;

    private String goodsYhqName;

    private Integer goodsNums;

    private Double goodsPrice;

    private Double goodsService;

    private Double goodsPayMoney;

    private Integer goodsShopId;

    private Integer goodsDeptId;

    private Integer goodsGroupId;

    private Integer goodsUserId;

    private Long goodsFid;

    private String goodsShopName;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Date getGoodsStarttime() {
        return goodsStarttime;
    }

    public void setGoodsStarttime(Date goodsStarttime) {
        this.goodsStarttime = goodsStarttime;
    }

    public Date getGoodsEndtime() {
        return goodsEndtime;
    }

    public void setGoodsEndtime(Date goodsEndtime) {
        this.goodsEndtime = goodsEndtime;
    }

    public String getGoodsYhqName() {
        return goodsYhqName;
    }

    public void setGoodsYhqName(String goodsYhqName) {
        this.goodsYhqName = goodsYhqName == null ? null : goodsYhqName.trim();
    }

    public Integer getGoodsNums() {
        return goodsNums;
    }

    public void setGoodsNums(Integer goodsNums) {
        this.goodsNums = goodsNums;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Double getGoodsService() {
        return goodsService;
    }

    public void setGoodsService(Double goodsService) {
        this.goodsService = goodsService;
    }

    public Double getGoodsPayMoney() {
        return goodsPayMoney;
    }

    public void setGoodsPayMoney(Double goodsPayMoney) {
        this.goodsPayMoney = goodsPayMoney;
    }

    public Integer getGoodsShopId() {
        return goodsShopId;
    }

    public void setGoodsShopId(Integer goodsShopId) {
        this.goodsShopId = goodsShopId;
    }

    public Integer getGoodsDeptId() {
        return goodsDeptId;
    }

    public void setGoodsDeptId(Integer goodsDeptId) {
        this.goodsDeptId = goodsDeptId;
    }

    public Integer getGoodsGroupId() {
        return goodsGroupId;
    }

    public void setGoodsGroupId(Integer goodsGroupId) {
        this.goodsGroupId = goodsGroupId;
    }

    public Integer getGoodsUserId() {
        return goodsUserId;
    }

    public void setGoodsUserId(Integer goodsUserId) {
        this.goodsUserId = goodsUserId;
    }

    public Long getGoodsFid() {
        return goodsFid;
    }

    public void setGoodsFid(Long goodsFid) {
        this.goodsFid = goodsFid;
    }

    public String getGoodsShopName() {
        return goodsShopName;
    }

    public void setGoodsShopName(String goodsShopName) {
        this.goodsShopName = goodsShopName == null ? null : goodsShopName.trim();
    }
}