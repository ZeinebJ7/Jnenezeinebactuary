package tn.esprit.autoloc.zeinebjneneactuary.service.interfaces;

import tn.esprit.autoloc.zeinebjneneactuary.domain.Vehicule;

import java.util.Set;

public interface IVehiculeService {
    Set<Vehicule> retrieveAllVehicules();
    Vehicule retrieveVehiculeById(Long id);
    Vehicule addVehicule(Vehicule vehicule);
    Vehicule updateVehicule(Vehicule vehicule);
    void deleteVehicule(Long id);
}
