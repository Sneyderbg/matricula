package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oferta")
public class OfertaModel {

    @Id
    @Column(name = "Id")
    private Long id;
    @Column(name = "TopeMaximoCreditos")
    private Integer topeMaximoCreditos;
    @Column(name = "ProgramaId")
    private Long programaId;
    @Column(name = "CreatedOn")
    private String fechaCreacion;
    @Column(name = "UpdatedOn")
    private String fechaActualizacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTopeMaximoCreditos() {
        return topeMaximoCreditos;
    }

    public void setTopeMaximoCreditos(Integer topeMaximoCreditos) {
        this.topeMaximoCreditos = topeMaximoCreditos;
    }

    public Long getProgramaId() {
        return programaId;
    }

    public void setProgramaId(Long programaId) {
        this.programaId = programaId;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}
