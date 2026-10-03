package tn.esprit.autoloc.zeinebjneneactuary.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    private LocalDate dateSignature;

    private BigDecimal montantTotal;

    private Boolean valide;

    // One To One avec Reservation
    @OneToOne
    @JoinColumn(name = "id_reservation")
    private Reservation reservation;

    // One To One avec Paiement
    @OneToOne(mappedBy = "contrat", cascade = CascadeType.ALL)
    private Paiement paiement;

}
