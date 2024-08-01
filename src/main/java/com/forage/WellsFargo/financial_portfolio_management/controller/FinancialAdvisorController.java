package com.forage.WellsFargo.financial_portfolio_management.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forage.WellsFargo.financial_portfolio_management.entity.FinancialAdvisor;
import com.forage.WellsFargo.financial_portfolio_management.service.FinancialAdvisorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing financial advisors.
 * Provides endpoints for CRUD operations on financial advisors.
 * http://localhost:9988/api/advisors
 */
@RestController
@RequestMapping("/api/advisors")
public class FinancialAdvisorController {

	@Autowired
	private FinancialAdvisorService financialAdvisorService;

	/**
	 * Retrieves a list of all financial advisors.
	 *
	 * @return List of all financial advisors
	 * @apiNote Endpoint: GET /api/advisors
	 */
	@GetMapping
	public List<FinancialAdvisor> getAllFinancialAdvisors() {
		return financialAdvisorService.getAllFinancialAdvisors();
	}

	/**
	 * Retrieves a financial advisor by its ID.
	 *
	 * @param id The ID of the financial advisor to retrieve
	 * @return The financial advisor with the specified ID
	 * @apiNote Endpoint: GET /api/advisors/{id}
	 */
	@GetMapping("/{id}")
	public FinancialAdvisor getFinancialAdvisorById(@PathVariable Long id) {
		return financialAdvisorService.getFinancialAdvisorById(id);
	}

	/**
	 * Creates a new financial advisor.
	 *
	 * @param advisor The financial advisor object to be created
	 * @return The created financial advisor
	 * @apiNote Endpoint: POST /api/advisors
	 */
	@PostMapping
	public FinancialAdvisor createFinancialAdvisor(@RequestBody FinancialAdvisor advisor) {
		return financialAdvisorService.createFinancialAdvisor(advisor);
	}

	/**
	 * Deletes a financial advisor by its ID.
	 *
	 * @param id The ID of the financial advisor to delete
	 * @apiNote Endpoint: DELETE /api/advisors/{id}
	 */
	@DeleteMapping("/{id}")
	public void deleteFinancialAdvisor(@PathVariable Long id) {
		financialAdvisorService.deleteFinancialAdvisor(id);
	}
}
