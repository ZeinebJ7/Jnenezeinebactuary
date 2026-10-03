package tn.esprit.autoloc.zeinebjneneactuary.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;

    private String immatriculation;

    private String marque;

    private String modele;

    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;

    private BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;

    // Plusieurs véhicules appartiennent à une agence
    @ManyToOne
    @JoinColumn(name = "id_agence")
    private Agence agence;

    // Un véhicule peut avoir plusieurs maintenances
    @OneToMany(mappedBy = "vehicule", cascade = CascadeType.ALL)
    private Set<Maintenance> maintenances = new HashSet<>();

    // MANY TO MANY
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Equipement> equipements = new HashSet<>();

    // Un véhicule peut avoir plusieurs réservations
    @OneToMany(mappedBy = "vehicule", cascade = CascadeType.ALL)
    private Set<Reservation> reservations = new HashSet<>();
}