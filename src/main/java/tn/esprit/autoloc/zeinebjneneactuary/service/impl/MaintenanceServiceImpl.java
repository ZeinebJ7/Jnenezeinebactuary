package tn.esprit.autoloc.zeinebjneneactuary.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.zeinebjneneactuary.domain.Maintenance;
import tn.esprit.autoloc.zeinebjneneactuary.repository.MaintenanceRepository;
import tn.esprit.autoloc.zeinebjneneactuary.service.interfaces.IMaintenanceService;
import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class MaintenanceServiceImpl implements IMaintenanceService {
    MaintenanceRepository maintenanceRepository;

    public Set<Maintenance> retrieveAllMaintenances() {
        return new HashSet<>(maintenanceRepository.findAll());
    }

    public Maintenance retrieveMaintenanceById(Long id) {
        return maintenanceRepository.findById(id).get();
    }

    public Maintenance addMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    public Maintenance updateMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    public void deleteMaintenance(Long id) {
        maintenanceRepository.deleteById(id);
    }

}
