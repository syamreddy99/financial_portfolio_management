package com.forage.WellsFargo.financial_portfolio_management.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forage.WellsFargo.financial_portfolio_management.entity.Security;
import com.forage.WellsFargo.financial_portfolio_management.repository.SecurityRepository;

import java.util.List;

@Service
public class SecurityService {
    @Autowired
    private SecurityRepository securityRepository;

    public List<Security> getAllSecurities() {
        return securityRepository.findAll();
    }

    public Security getSecurityById(Long id) {
        return securityRepository.findById(id).orElse(null);
    }

    public Security createSecurity(Security security) {
        return securityRepository.save(security);
    }

    public void deleteSecurity(Long id) {
        securityRepository.deleteById(id);
    }
}

