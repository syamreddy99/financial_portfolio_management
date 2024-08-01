package com.forage.WellsFargo.financial_portfolio_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.forage.WellsFargo.financial_portfolio_management.entity.Portfolio;
import com.forage.WellsFargo.financial_portfolio_management.service.PortfolioService;

import java.util.List;

@RestController
@RequestMapping("/api/portfolios")
public class PortfolioController {
	@Autowired
	private PortfolioService portfolioService;

	@GetMapping
	public List<Portfolio> getAllPortfolios() {
		return portfolioService.getAllPortfolios();
	}

	@GetMapping("/{id}")
	public Portfolio getPortfolioById(@PathVariable Long id) {
		return portfolioService.getPortfolioById(id);
	}

	@PostMapping
	public Portfolio createPortfolio(@RequestBody Portfolio portfolio) {
		return portfolioService.createPortfolio(portfolio);
	}

	@DeleteMapping("/{id}")
	public void deletePortfolio(@PathVariable Long id) {
		portfolioService.deletePortfolio(id);
	}
}
