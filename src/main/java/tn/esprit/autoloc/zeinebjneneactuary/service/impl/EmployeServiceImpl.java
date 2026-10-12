package tn.esprit.autoloc.zeinebjneneactuary.service.impl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.zeinebjneneactuary.domain.Employe;
import tn.esprit.autoloc.zeinebjneneactuary.repository.EmployeRepository;
import tn.esprit.autoloc.zeinebjneneactuary.service.interfaces.IEmployeService;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class EmployeServiceImpl implements IEmployeService {
    EmployeRepository employeRepository;

    public Set<Employe> retrieveAllEmployes() {
        return new HashSet<>(employeRepository.findAll());
    }

    public Employe retrieveEmployeById(Long id) {
        return employeRepository.findById(id).get();
    }

    public Employe addEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    public Employe updateEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    public void deleteEmploye(Long id) {
        employeRepository.deleteById(id);
    }
}
