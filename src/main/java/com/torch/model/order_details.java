package com.torch.model;

public class order_details {
    private Integer id;

    private Integer orderNo;

    private String cupId;

    private Integer quantity;

    public order_details(Integer id, Integer orderNo, String cupId, Integer quantity) {
        this.id = id;
        this.orderNo = orderNo;
        this.cupId = cupId;
        this.quantity = quantity;
    }

    public order_details() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getCupId() {
        return cupId;
    }

    public void setCupId(String cupId) {
        this.cupId = cupId == null ? null : cupId.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}