package tn.esprit.autoloc.zeinebjneneactuary.service.interfaces;
import tn.esprit.autoloc.zeinebjneneactuary.domain.Employe;
import java.util.Set;
public interface IEmployeService {
    Set<Employe> retrieveAllEmployes();
    Employe retrieveEmployeById(Long id);
    Employe addEmploye(Employe employe);
    Employe updateEmploye(Employe employe);
    void deleteEmploye(Long id);
}
