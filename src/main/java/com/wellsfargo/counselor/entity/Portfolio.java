package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private LocalDate creationDate;

    @ManyToOne
    @JoinColumn(name="clientId", nullable = false) //Foreign Key
    private Client client;

    protected Portfolio() {}

    public Portfolio(Client client, LocalDate creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public LocalDate getCreationDate() {return creationDate;}

    public Client getClient() {return client;}

    public void setClient(Client client) {this.client = client;}

    public void setCreationDate(LocalDate creationDate) {this.creationDate = creationDate;}

}
