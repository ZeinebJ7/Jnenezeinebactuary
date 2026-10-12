package tn.esprit.autoloc.zeinebjneneactuary.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.zeinebjneneactuary.domain.Paiement;
import tn.esprit.autoloc.zeinebjneneactuary.repository.PaiementRepository;
import tn.esprit.autoloc.zeinebjneneactuary.service.interfaces.IPaiementService;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor


public class PaiementServiceImpl implements IPaiementService {
    PaiementRepository paiementRepository;

    public Set<Paiement> retrieveAllPaiements() {
        return new HashSet<>(paiementRepository.findAll());
    }

    public Paiement retrievePaiementById(Long id) {
        return paiementRepository.findById(id).get();
    }

    public Paiement addPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    public Paiement updatePaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    public void deletePaiement(Long id) {
        paiementRepository.deleteById(id);
    }}
