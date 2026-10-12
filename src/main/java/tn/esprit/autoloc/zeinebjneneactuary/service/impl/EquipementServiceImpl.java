package tn.esprit.autoloc.zeinebjneneactuary.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.zeinebjneneactuary.domain.Equipement;
import tn.esprit.autoloc.zeinebjneneactuary.repository.EquipementRepository;

import tn.esprit.autoloc.zeinebjneneactuary.service.interfaces.IEquipementService;
import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class EquipementServiceImpl implements IEquipementService {
    EquipementRepository equipementRepository;

    public Set<Equipement> retrieveAllEquipements() {
        return new HashSet<>(equipementRepository.findAll());
    }

    public Equipement retrieveEquipementById(Long id) {
        return equipementRepository.findById(id).get();
    }

    public Equipement addEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    public Equipement updateEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    public void deleteEquipement(Long id) {
        equipementRepository.deleteById(id);
    }
}
