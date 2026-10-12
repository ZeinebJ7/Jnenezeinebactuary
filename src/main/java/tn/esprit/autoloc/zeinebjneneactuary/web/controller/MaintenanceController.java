package tn.esprit.autoloc.zeinebjneneactuary.web.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.zeinebjneneactuary.domain.Maintenance;
import tn.esprit.autoloc.zeinebjneneactuary.service.interfaces.IMaintenanceService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceController {
    IMaintenanceService maintenanceService;

    @GetMapping("/retrieve-all-maintenances")
    public Set<Maintenance> getMaintenances() {
        return maintenanceService.retrieveAllMaintenances();
    }

    @GetMapping("/retrieve-maintenance/{id}")
    public Maintenance getMaintenanceById(@PathVariable Long id) {
        return maintenanceService.retrieveMaintenanceById(id);
    }

    @PostMapping("/add-maintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.addMaintenance(maintenance);
    }

    @PutMapping("/update-maintenance")
    public Maintenance updateMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.updateMaintenance(maintenance);
    }

    @DeleteMapping("/delete-maintenance/{id}")
    public void deleteMaintenance(@PathVariable Long id) {
        maintenanceService.deleteMaintenance(id);
    }
}
