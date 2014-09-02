package com.cl.purchase.model.purchase;

import java.math.BigDecimal;
import java.util.Date;

public class DeliverDetail {
    private String productNo;

    private String deliverNo;

    private Integer deliverQuality;

    private Integer storageQuality;

    private Integer storageNormalQuality;

    private Integer storageBrokenQuality;

    private BigDecimal purchasePrice;

    private String createPerson;

    private Date createDate;

    private String updatePerson;

    private Date updateDate;

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getDeliverNo() {
        return deliverNo;
    }

    public void setDeliverNo(String deliverNo) {
        this.deliverNo = deliverNo;
    }

    public Integer getDeliverQuality() {
        return deliverQuality;
    }

    public void setDeliverQuality(Integer deliverQuality) {
        this.deliverQuality = deliverQuality;
    }

    public Integer getStorageQuality() {
        return storageQuality;
    }

    public void setStorageQuality(Integer storageQuality) {
        this.storageQuality = storageQuality;
    }

    public Integer getStorageNormalQuality() {
        return storageNormalQuality;
    }

    public void setStorageNormalQuality(Integer storageNormalQuality) {
        this.storageNormalQuality = storageNormalQuality;
    }

    public Integer getStorageBrokenQuality() {
        return storageBrokenQuality;
    }

    public void setStorageBrokenQuality(Integer storageBrokenQuality) {
        this.storageBrokenQuality = storageBrokenQuality;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}