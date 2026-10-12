package tn.esprit.autoloc.zeinebjneneactuary.service.impl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.zeinebjneneactuary.domain.Agence;
import tn.esprit.autoloc.zeinebjneneactuary.repository.AgenceRepository;
import tn.esprit.autoloc.zeinebjneneactuary.service.interfaces.IAgenceService;


import java.util.HashSet;
import java.util.Set;
@Service
@AllArgsConstructor
public class AgenceServiceImpl implements IAgenceService {
    AgenceRepository agenceRepository;
    public Set<Agence> retrieveAllAgences() {
        return new HashSet<>(agenceRepository.findAll());
    }

  public Agence retrieveAgenceById(Long id) {
        return agenceRepository.findById(id).get();
  }
    public Agence addAgence(Agence agence) {
        return agenceRepository.save(agence);
    }
    public void deleteAgence(Long id) {
        agenceRepository.deleteById(id);
    }

    public Agence updateAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

}
