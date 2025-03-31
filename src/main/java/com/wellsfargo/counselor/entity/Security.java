package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private Long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Float purchasePrice;

    @Column(nullable = false)
    private Float purchaseDate;

    @Column(nullable = false)
    private Float quantity;

    protected Security(){}

    public Security(Long portfolioId, String name, String category, Float purchasePrice, Float purchaseDate, Float quantity){
        this.portfolioId=portfolioId;
        this.name=name;
        this.category=category;
        this.purchasePrice=purchasePrice;
        this.purchaseDate=purchaseDate;
        this.quantity=quantity;
    }

    public Long getSecurityId() {
        return securityId;
    }
    
    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getName() {
        return name;
    }

    public void setFirstName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Float getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Float purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }
}
