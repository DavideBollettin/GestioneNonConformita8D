/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonConformita.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author FSEVERI\lucangeli3503
 */
@Entity
@Table(name = "Report")
public class Report implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codiceNC;
    @Column(name = "descrizioneProb", nullable = false)
    private String descrizioneProb;
    @Column(name = "dataInizio", nullable = false)
    private Date dataInizio;
    @Column(name = "dataFine")
    private Date dataFine;
    @Column(name = "stato", nullable = false)
    private Stato stato;
    @Column(name = "cause", nullable = false)
    private String cause;
    @Column(name = "teamOp", nullable = false)
    private String teamOp;
    @Column(name = "azioniCorrettive", nullable = false)
    private String azioniCorrettive;
    @Column(name = "efficaciaAC")
    private String efficaciaAC;
    @Column(name = "azioniContenitive", nullable = false)
    private String azioniContenitive;
    @Column(name = "prevenzione", nullable = false)
    private String prevenzione;
    @Column(name = "costo")
    private int costo;
    @Column(name = "revisioneFinale", nullable = false)
    private String revisioneF;

    @OneToMany(mappedBy = "report")
    private List<Report> report;

    @ManyToOne
    @JoinColumn(name = "pezzo")
    private Pezzi pezzo;

    @ManyToOne
    @JoinColumn(name = "tipoNC")
    private TipoNC tipoNC;

    @ManyToOne
    @JoinColumn(name = "fornitore")
    private Fornitori fornitore;

    @ManyToOne
    @JoinColumn(name = "reparto")
    private Reparti reparto;

    @ManyToOne
    @JoinColumn(name = "cliente")
    private Clienti cliente;

    public Report() {
    }
}
