package tn.esprit.autoloc.zeinebjneneactuary.service.interfaces;
import tn.esprit.autoloc.zeinebjneneactuary.domain.Paiement;
import java.util.Set;
public interface IPaiementService {
    Set<Paiement> retrieveAllPaiements();
    Paiement retrievePaiementById(Long id);
    Paiement addPaiement(Paiement paiement);
    Paiement updatePaiement(Paiement paiement);
    void deletePaiement(Long id);
}
