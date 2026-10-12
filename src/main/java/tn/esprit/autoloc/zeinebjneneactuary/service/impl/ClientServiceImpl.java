package tn.esprit.autoloc.zeinebjneneactuary.service.impl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.zeinebjneneactuary.domain.Client;
import tn.esprit.autoloc.zeinebjneneactuary.repository.ClientRepository;
import tn.esprit.autoloc.zeinebjneneactuary.service.interfaces.IClientService;

import java.util.HashSet;
import java.util.Set;
@Service
@AllArgsConstructor
public class ClientServiceImpl implements IClientService {
    ClientRepository clientRepository;

    public Set<Client> retrieveAllClients() {
        return new HashSet<>(clientRepository.findAll());
    }

    public Client retrieveClientById(Long id) {
        return clientRepository.findById(id).get();
    }

    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
