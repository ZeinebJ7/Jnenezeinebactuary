package tn.esprit.autoloc.zeinebjneneactuary.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    private StatutReservation statut;

    // Plusieurs réservations pour un client
    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    // Plusieurs réservations pour un véhicule
    @ManyToOne
    @JoinColumn(name = "id_vehicule")
    private Vehicule vehicule;

    // One To One avec Contrat
    @OneToOne(mappedBy = "reservation", cascade = CascadeType.ALL)
    private Contrat contrat;
}
