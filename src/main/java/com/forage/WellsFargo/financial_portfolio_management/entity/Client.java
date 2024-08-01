package com.forage.WellsFargo.financial_portfolio_management.entity;


import jakarta.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "financialAdvisor_id")
    private FinancialAdvisor financialAdvisor;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private Portfolio portfolio;
    public Client (){}

    public Client(Long id , String name ,String email, String phoneNumber ,Portfolio portfolio , FinancialAdvisor financialAdvisor){
        this.email = email;
        this.id = id ;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.financialAdvisor = financialAdvisor;
        this.portfolio = portfolio;
    }


    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Client setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getName() {
        return name;
    }

    public Client setName(String name) {
        this.name = name;
        return this;
    }

    public Client setId(Long id) {
        this.id = id;
        return this;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public Client setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
        return this;
    }

    public FinancialAdvisor getFinancialAdvisor() {
        return financialAdvisor;
    }

    public Client setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
        this.financialAdvisor = financialAdvisor;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Client setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}

