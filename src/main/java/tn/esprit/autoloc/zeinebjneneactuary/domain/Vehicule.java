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
    private Agence agence;
//reservation howa l fils
    // Un véhicule peut avoir plusieurs maintenances
    @OneToMany(mappedBy = "vehicule")
    private Set<Maintenance> maintenances = new HashSet<>();

    // MANY TO MANY
    @ManyToMany()
    private Set<Equipement> equipements = new HashSet<>();
//Equipement howa fils
    // Un véhicule peut avoir plusieurs réservations
    //cascade all ma4ir 5tr fiha l merge mochkla (remove w persist w merge)
    @OneToMany(mappedBy = "vehicule")
    private Set<Reservation> reservations = new HashSet<>();
}