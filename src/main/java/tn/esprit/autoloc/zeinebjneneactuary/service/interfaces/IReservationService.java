package tn.esprit.autoloc.zeinebjneneactuary.service.interfaces;

import tn.esprit.autoloc.zeinebjneneactuary.domain.Reservation;

import java.util.Set;

public interface IReservationService {
    Set<Reservation> retrieveAllReservations();
    Reservation retrieveReservationById(Long id);
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    void deleteReservation(Long id);
}
