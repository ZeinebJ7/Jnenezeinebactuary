package tn.esprit.autoloc.zeinebjneneactuary.service.interfaces;

import tn.esprit.autoloc.zeinebjneneactuary.domain.Maintenance;
import java.util.Set;
public interface IMaintenanceService {
    Set<Maintenance> retrieveAllMaintenances();
    Maintenance retrieveMaintenanceById(Long id);
    Maintenance addMaintenance(Maintenance maintenance);
    Maintenance updateMaintenance(Maintenance maintenance);
    void deleteMaintenance(Long id);
}
