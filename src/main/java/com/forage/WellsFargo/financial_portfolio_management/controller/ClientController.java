package com.forage.WellsFargo.financial_portfolio_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.forage.WellsFargo.financial_portfolio_management.entity.Client;
import com.forage.WellsFargo.financial_portfolio_management.service.ClientService;

import java.util.List;

/**
 * REST controller for managing clients.
 * Provides endpoints for CRUD operations on clients.
 * http://localhost:9988/api/clients
 */
@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    /**
     * Retrieves a list of all clients.
     *
     * @return List of all clients
     * @apiNote Endpoint: GET /api/clients
     * http://localhost:9988/api/clients
     */
    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    /**
     * Retrieves a client by its ID.
     *
     * @param id The ID of the client to retrieve
     * @return The client with the specified ID
     * @apiNote Endpoint: GET /api/clients/{id}
     * http://localhost:9988/api/clients/2
     */
    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    /**
     * Creates a new client.
     *
     * @param client The client object to be created
     * @return The created client
     * @apiNote Endpoint: POST /api/clients
     * http://localhost:9988/api/clients
     */
    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    /**
     * Deletes a client by its ID.
     *
     * @param id The ID of the client to delete
     * @apiNote Endpoint: DELETE /api/clients/Delete/{id}
     * http://localhost:9988/api/clients/Delete/1
     */
    @DeleteMapping("/Delete/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }
}
