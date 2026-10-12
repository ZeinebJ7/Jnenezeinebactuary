package tn.esprit.autoloc.zeinebjneneactuary.service.impl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.zeinebjneneactuary.domain.Contrat;
import tn.esprit.autoloc.zeinebjneneactuary.repository.ContratRepository;

import tn.esprit.autoloc.zeinebjneneactuary.service.interfaces.IContratService;
import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class ContartServiceImpl implements IContratService {
    ContratRepository contratRepository;

    public Set<Contrat> retrieveAllContrats() {
        return new HashSet<>(contratRepository.findAll());
    }

    public Contrat retrieveContratById(Long id) {
        return contratRepository.findById(id).get();
    }

    public Contrat addContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    public Contrat updateContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    public void deleteContrat(Long id) {
        contratRepository.deleteById(id);
    }
}
