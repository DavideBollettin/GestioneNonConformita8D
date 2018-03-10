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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author FSEVERI\lucangeli3503
 */
@Entity
@Table(name = "tipoNC")
public class TipoNC  implements Serializable {

    @Id
    @Column(name = "nome")
    private String nome;
    @Column(name = "descrizione", nullable = false)
    private String descrizione;
    
    @OneToMany(mappedBy="tipoNC")
    private List<Report>report;
}
