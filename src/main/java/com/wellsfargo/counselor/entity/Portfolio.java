package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {
    
    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private Long clientId;

    @Column(nullable = false)
    private Float creationDate;

    protected Portfolio() {}

    public Portfolio(Long clientId, Float creationDate){
        this.clientId=clientId;
        this.creationDate=creationDate;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }
    
    public Long getClientId() {
        return clientId;
    }

    public Float getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(Float creationDate) {
        this.creationDate = creationDate;
    }
}
