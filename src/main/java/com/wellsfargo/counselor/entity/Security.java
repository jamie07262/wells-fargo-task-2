package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private int purchasePrice;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false)
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "portfolioId", nullable = false)
    private Portfolio portfolio;

    protected Security() {}

    public Security(String name, String category, int purchasePrice, LocalDate purchaseDate, Portfolio portfolio) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.portfolio = portfolio;
    }

    public long getSecurityId() {return securityId;}
    public String getName() {return name;}
    public String getCategory() {return category;}
    public int getPurchasePrice() {return purchasePrice;}
    public LocalDate getPurchaseDate() {return purchaseDate;}
    public int getQuantity() {return quantity;}
    public Portfolio getPortfolio() {return portfolio;}


    public void setSecurityId(long securityId) {this.securityId = securityId;}
    public void setName(String name) {this.name = name;}
    public void setCategory(String category) {this.category = category;}
    public void setPurchasePrice(int purchasePrice) {this.purchasePrice = purchasePrice;}
    public void setPurchaseDate(LocalDate purchaseDate) {this.purchaseDate = purchaseDate;}
    public void setQuantity(int quantity) {this.quantity = quantity;}
    public void setPortfolio(Portfolio portfolio) {this.portfolio = portfolio;}

}
