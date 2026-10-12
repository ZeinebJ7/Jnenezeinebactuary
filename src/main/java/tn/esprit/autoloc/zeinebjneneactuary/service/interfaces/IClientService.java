package tn.esprit.autoloc.zeinebjneneactuary.service.interfaces;

import tn.esprit.autoloc.zeinebjneneactuary.domain.Client;

import java.util.Set;

public interface IClientService {
    Set<Client> retrieveAllClients();
    Client retrieveClientById(Long id);
    Client addClient(Client client);
    Client updateClient(Client client);
    void deleteClient(Long id);
}
