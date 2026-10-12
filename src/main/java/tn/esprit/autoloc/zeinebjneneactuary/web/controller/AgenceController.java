package tn.esprit.autoloc.zeinebjneneactuary.web.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.zeinebjneneactuary.domain.Agence;
import tn.esprit.autoloc.zeinebjneneactuary.service.interfaces.IAgenceService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class AgenceController {



        IAgenceService agenceService;

        @GetMapping("/retrieve-all-agences")
        public Set<Agence> getAgences() {
            return agenceService.retrieveAllAgences();
        }



        // Retrieve agence by ID
        @GetMapping("/retrieve-agence/{id}")
        public Agence getAgenceById(@PathVariable Long id) {
            return agenceService.retrieveAgenceById(id);
        }

        // Add agence
        @PostMapping("/add-agence")
        public Agence addAgence(@RequestBody Agence agence) {
            return agenceService.addAgence(agence);
        }

        // Update agence
        @PutMapping("/update-agence")
        public Agence updateAgence(@RequestBody Agence agence) {
            return agenceService.updateAgence(agence);
        }

        // Delete agence
        @DeleteMapping("/delete-agence/{id}")
        public void deleteAgence(@PathVariable Long id) {
            agenceService.deleteAgence(id);
        }

}

