package tn.esprit.autoloc.zeinebjneneactuary.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.zeinebjneneactuary.domain.Reservation;
import tn.esprit.autoloc.zeinebjneneactuary.repository.ReservationRepository;
import tn.esprit.autoloc.zeinebjneneactuary.service.interfaces.IReservationService;
import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {
    ReservationRepository reservationRepository;

    public Set<Reservation> retrieveAllReservations() {
        return new HashSet<>(reservationRepository.findAll());
    }

    public Reservation retrieveReservationById(Long id) {
        return reservationRepository.findById(id).get();
    }

    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}
