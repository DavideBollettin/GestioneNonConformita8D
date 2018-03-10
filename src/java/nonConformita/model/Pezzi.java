/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonConformita.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author FSEVERI\lucangeli3503
 */
@Entity
@Table(name = "Pezzi")
public class Pezzi   implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codice;
    
    @ManyToOne 
    @JoinColumn(name="categoria")
    private Categorie categoria;
    
    @OneToMany(mappedBy="pezzo")
    private List<Report>report;
}
