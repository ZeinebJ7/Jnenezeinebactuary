package tn.esprit.autoloc.zeinebjneneactuary.web.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.zeinebjneneactuary.domain.Paiement;
import tn.esprit.autoloc.zeinebjneneactuary.service.interfaces.IPaiementService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/paiement")
public class PaiementController {
    IPaiementService paiementService;

    @GetMapping("/retrieve-all-paiements")
    public Set<Paiement> getPaiements() {
        return paiementService.retrieveAllPaiements();
    }

    @GetMapping("/retrieve-paiement/{id}")
    public Paiement getPaiementById(@PathVariable Long id) {
        return paiementService.retrievePaiementById(id);
    }

    @PostMapping("/add-paiement")
    public Paiement addPaiement(@RequestBody Paiement paiement) {
        return paiementService.addPaiement(paiement);
    }

    @PutMapping("/update-paiement")
    public Paiement updatePaiement(@RequestBody Paiement paiement) {
        return paiementService.updatePaiement(paiement);
    }

    @DeleteMapping("/delete-paiement/{id}")
    public void deletePaiement(@PathVariable Long id) {
        paiementService.deletePaiement(id);
    }
}
