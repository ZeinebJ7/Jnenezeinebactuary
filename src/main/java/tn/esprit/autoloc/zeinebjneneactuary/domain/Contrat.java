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
    //n7ot type wrapper
    private Long idContrat;

    private LocalDate dateSignature;

    private BigDecimal montantTotal;

    private Boolean valide;

    // One To One avec Reservation
    @OneToOne
    private Reservation reservation;

    // One To One avec Paiement
    @OneToOne(mappedBy = "contrat", cascade = CascadeType.PERSIST)
    private Paiement paiement;

}
