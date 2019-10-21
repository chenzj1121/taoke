package com.luoshi.pojo;

import java.util.Date;

public class TbBackgroundDetails {
    private Integer id;

    private Date createTime;

    private Date clickTime;

    private String shopMessage;

    private Integer goodsId;

    private Integer useId;

    private Integer deptId;

    private Integer groupId;

    private String aliwangwang;

    private String shopName;

    private Integer goodsCounts;

    private Double goodsPrice;

    private Integer ordersType;

    private Double ordersFl;

    private Double pay;

    private Double payAbout;

    private Date payTime;

    private Double payMoney;

    private Double moneyAbout;

    private Long orderId;

    private Long gdId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getClickTime() {
        return clickTime;
    }

    public void setClickTime(Date clickTime) {
        this.clickTime = clickTime;
    }

    public String getShopMessage() {
        return shopMessage;
    }

    public void setShopMessage(String shopMessage) {
        this.shopMessage = shopMessage == null ? null : shopMessage.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getUseId() {
        return useId;
    }

    public void setUseId(Integer useId) {
        this.useId = useId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getAliwangwang() {
        return aliwangwang;
    }

    public void setAliwangwang(String aliwangwang) {
        this.aliwangwang = aliwangwang == null ? null : aliwangwang.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public Integer getGoodsCounts() {
        return goodsCounts;
    }

    public void setGoodsCounts(Integer goodsCounts) {
        this.goodsCounts = goodsCounts;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getOrdersType() {
        return ordersType;
    }

    public void setOrdersType(Integer ordersType) {
        this.ordersType = ordersType;
    }

    public Double getOrdersFl() {
        return ordersFl;
    }

    public void setOrdersFl(Double ordersFl) {
        this.ordersFl = ordersFl;
    }

    public Double getPay() {
        return pay;
    }

    public void setPay(Double pay) {
        this.pay = pay;
    }

    public Double getPayAbout() {
        return payAbout;
    }

    public void setPayAbout(Double payAbout) {
        this.payAbout = payAbout;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    public Double getMoneyAbout() {
        return moneyAbout;
    }

    public void setMoneyAbout(Double moneyAbout) {
        this.moneyAbout = moneyAbout;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getGdId() {
        return gdId;
    }

    public void setGdId(Long gdId) {
        this.gdId = gdId;
    }
}