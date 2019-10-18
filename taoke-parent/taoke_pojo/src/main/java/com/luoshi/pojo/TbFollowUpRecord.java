package com.luoshi.pojo;

import java.util.Date;

public class TbFollowUpRecord {
    private Integer id;

    private String record;

    private Date followUpTime;

    private String maturity;

    private Integer productSubmitId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record == null ? null : record.trim();
    }

    public Date getFollowUpTime() {
        return followUpTime;
    }

    public void setFollowUpTime(Date followUpTime) {
        this.followUpTime = followUpTime;
    }

    public String getMaturity() {
        return maturity;
    }

    public void setMaturity(String maturity) {
        this.maturity = maturity == null ? null : maturity.trim();
    }

    public Integer getProductSubmitId() {
        return productSubmitId;
    }

    public void setProductSubmitId(Integer productSubmitId) {
        this.productSubmitId = productSubmitId;
    }
}