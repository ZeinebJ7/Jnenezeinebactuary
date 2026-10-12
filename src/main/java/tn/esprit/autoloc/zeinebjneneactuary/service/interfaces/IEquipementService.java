package tn.esprit.autoloc.zeinebjneneactuary.service.interfaces;

import tn.esprit.autoloc.zeinebjneneactuary.domain.Equipement;

import java.util.Set;

public interface IEquipementService {
    Set<Equipement> retrieveAllEquipements();
    Equipement retrieveEquipementById(Long id);
    Equipement addEquipement(Equipement equipement);
    Equipement updateEquipement(Equipement equipement);
    void deleteEquipement(Long id);
}
