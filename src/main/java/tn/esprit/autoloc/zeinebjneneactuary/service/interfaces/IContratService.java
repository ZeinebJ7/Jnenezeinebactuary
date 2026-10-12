package tn.esprit.autoloc.zeinebjneneactuary.service.interfaces;
import tn.esprit.autoloc.zeinebjneneactuary.domain.Contrat;
import java.util.Set;

public interface IContratService {
    Set<Contrat> retrieveAllContrats();
    Contrat retrieveContratById(Long id);
    Contrat addContrat(Contrat contrat);
    Contrat updateContrat(Contrat contrat);
    void deleteContrat(Long id);
}
