package com.torch.model;

public class cup {
    private Integer id;

    private String cupName;

    private String cupSize;

    private String cupPrice;

    public cup(Integer id, String cupName, String cupSize, String cupPrice) {
        this.id = id;
        this.cupName = cupName;
        this.cupSize = cupSize;
        this.cupPrice = cupPrice;
    }

    public cup() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupName() {
        return cupName;
    }

    public void setCupName(String cupName) {
        this.cupName = cupName == null ? null : cupName.trim();
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize == null ? null : cupSize.trim();
    }

    public String getCupPrice() {
        return cupPrice;
    }

    public void setCupPrice(String cupPrice) {
        this.cupPrice = cupPrice == null ? null : cupPrice.trim();
    }
}