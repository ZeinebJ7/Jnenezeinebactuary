package tn.esprit.autoloc.zeinebjneneactuary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.zeinebjneneactuary.domain.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
