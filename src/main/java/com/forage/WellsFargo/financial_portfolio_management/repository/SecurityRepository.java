package com.forage.WellsFargo.financial_portfolio_management.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.forage.WellsFargo.financial_portfolio_management.entity.Security;

public interface SecurityRepository extends JpaRepository<Security, Long> {
}

