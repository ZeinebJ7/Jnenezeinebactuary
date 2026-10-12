package tn.esprit.autoloc.zeinebjneneactuary.web.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.zeinebjneneactuary.domain.Equipement;
import tn.esprit.autoloc.zeinebjneneactuary.service.interfaces.IEquipementService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class EquipementController {
    IEquipementService equipementService;

    @GetMapping("/retrieve-all-equipements")
    public Set<Equipement> getEquipements() {
        return equipementService.retrieveAllEquipements();
    }

    @GetMapping("/retrieve-equipement/{id}")
    public Equipement getEquipementById(@PathVariable Long id) {
        return equipementService.retrieveEquipementById(id);
    }

    @PostMapping("/add-equipement")
    public Equipement addEquipement(@RequestBody Equipement equipement) {
        return equipementService.addEquipement(equipement);
    }

    @PutMapping("/update-equipement")
    public Equipement updateEquipement(@RequestBody Equipement equipement) {
        return equipementService.updateEquipement(equipement);
    }

    @DeleteMapping("/delete-equipement/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        equipementService.deleteEquipement(id);
    }
}
