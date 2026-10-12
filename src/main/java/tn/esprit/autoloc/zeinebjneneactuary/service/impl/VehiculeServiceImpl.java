package tn.esprit.autoloc.zeinebjneneactuary.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.zeinebjneneactuary.domain.Vehicule;
import tn.esprit.autoloc.zeinebjneneactuary.repository.VehiculeRepository;
import tn.esprit.autoloc.zeinebjneneactuary.service.interfaces.IVehiculeService;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class VehiculeServiceImpl implements IVehiculeService {
    VehiculeRepository vehiculeRepository;

    public Set<Vehicule> retrieveAllVehicules() {
        return new HashSet<>(vehiculeRepository.findAll());
    }

    public Vehicule retrieveVehiculeById(Long id) {
        return vehiculeRepository.findById(id).get();
    }

    public Vehicule addVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    public Vehicule updateVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    public void deleteVehicule(Long id) {
        vehiculeRepository.deleteById(id);
    }
}
