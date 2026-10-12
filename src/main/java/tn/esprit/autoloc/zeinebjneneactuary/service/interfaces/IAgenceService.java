package tn.esprit.autoloc.zeinebjneneactuary.service.interfaces;

import tn.esprit.autoloc.zeinebjneneactuary.domain.Agence;

import java.util.Set;

public interface IAgenceService {

    Set<Agence> retrieveAllAgences();

    Agence retrieveAgenceById(Long id);

    Agence addAgence(Agence agence);

    Agence updateAgence(Agence agence);

    void deleteAgence(Long id);

}
