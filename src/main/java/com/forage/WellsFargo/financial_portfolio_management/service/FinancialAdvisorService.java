package com.forage.WellsFargo.financial_portfolio_management.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forage.WellsFargo.financial_portfolio_management.entity.FinancialAdvisor;
import com.forage.WellsFargo.financial_portfolio_management.repository.FinancialAdvisorRepository;

import java.util.List;

@Service
public class FinancialAdvisorService {
    @Autowired
    private FinancialAdvisorRepository financialAdvisorRepository;

    public List<FinancialAdvisor> getAllFinancialAdvisors() {
        return financialAdvisorRepository.findAll();
    }

    public FinancialAdvisor getFinancialAdvisorById(Long id) {
        return financialAdvisorRepository.findById(id).orElse(null);
    }

    public FinancialAdvisor createFinancialAdvisor(FinancialAdvisor advisor) {
        return financialAdvisorRepository.save(advisor);
    }

    public void deleteFinancialAdvisor(Long id) {
        financialAdvisorRepository.deleteById(id);
    }
}

