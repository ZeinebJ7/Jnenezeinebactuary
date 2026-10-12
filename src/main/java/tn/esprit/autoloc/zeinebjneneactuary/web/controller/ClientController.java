package tn.esprit.autoloc.zeinebjneneactuary.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.zeinebjneneactuary.domain.Client;
import tn.esprit.autoloc.zeinebjneneactuary.service.interfaces.IClientService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientController {
    IClientService clientService;

    @GetMapping("/retrieve-all-clients")
    public Set<Client> getClients() {
        return clientService.retrieveAllClients();
    }

    @GetMapping("/retrieve-client/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.retrieveClientById(id);
    }

    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @PutMapping("/update-client")
    public Client updateClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }

    @DeleteMapping("/delete-client/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }
}
