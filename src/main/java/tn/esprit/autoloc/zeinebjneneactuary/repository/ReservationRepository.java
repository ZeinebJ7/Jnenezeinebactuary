package tn.esprit.autoloc.zeinebjneneactuary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.zeinebjneneactuary.domain.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
