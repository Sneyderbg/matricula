package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
public class EstudianteModel {

    @Id
    @Column(name = "Id")
    private Long id;
    @Column(name = "TandaId")
    private Long tandaId;
    @Column(name = "ProgramaId")
    private Long programaId;
    @Column(name = "OfertaId")
    private Long ofertaId;
    @Column(name = "NroPensum")
    private Integer nroPensum;
    @Column(name = "NroSemestre")
    private Integer nroSemestre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTandaId() {
        return tandaId;
    }

    public void setTandaId(Long tandaId) {
        this.tandaId = tandaId;
    }

    public Long getProgramaId() {
        return programaId;
    }

    public void setProgramaId(Long programaId) {
        this.programaId = programaId;
    }

    public Long getOfertaId() {
        return ofertaId;
    }

    public void setOfertaId(Long ofertaId) {
        this.ofertaId = ofertaId;
    }

    public Integer getNroPensum() {
        return nroPensum;
    }

    public void setNroPensum(Integer nroPensum) {
        this.nroPensum = nroPensum;
    }

    public Integer getNroSemestre() {
        return nroSemestre;
    }

    public void setNroSemestre(Integer nroSemestre) {
        this.nroSemestre = nroSemestre;
    }
}
