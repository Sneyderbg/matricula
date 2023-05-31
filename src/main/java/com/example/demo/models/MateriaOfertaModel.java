package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "materiaoferta")
public class MateriaOfertaModel {

    @Id
    @Column(name = "MateriasId")
    private Long materiasId;
    @Column(name = "OfertasId")
    private Long ofertasId;

    public Long getMateriasId() {
        return materiasId;
    }

    public void setMateriasId(Long materiasId) {
        this.materiasId = materiasId;
    }

    public Long getOfertasId() {
        return ofertasId;
    }

    public void setOfertasId(Long ofertasId) {
        this.ofertasId = ofertasId;
    }
}
