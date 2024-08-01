package com.forage.WellsFargo.financial_portfolio_management.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.forage.WellsFargo.financial_portfolio_management.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
	
}

