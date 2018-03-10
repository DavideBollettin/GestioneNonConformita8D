/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonConformita.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author FSEVERI\lucangeli3503
 */
@Entity
@Table(name = "Dipendenti")
public class Dipendenti implements Serializable {

    @Id
    @Column(name = "matricola", nullable = false)
    private String matricola;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "cognome", nullable = false)
    private String cognome;
    @Column(name = "ruolo", nullable = false)
    private Ruolo ruolo;
     
    @OneToMany(mappedBy="dipendente")
    private List<Segnalazioni>segnalazioni;
    
    @OneToMany(mappedBy="dipendente")
    private List<Elaborazioni>elaborazioni;
    
    @ManyToOne
    @JoinColumn(name="reparto")
    private Reparti reparto;

    public Dipendenti() {
    }

}
