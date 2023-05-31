package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudiantegrupo")
public class EstudianteGrupoModel {

    @Id
    @Column(name = "EstudiantesId")
    private Long estudiantesId;
    @Column(name = "GruposId")
    private Integer gruposId;

    public Long getEstudiantesId() {
        return estudiantesId;
    }

    public void setEstudiantesId(Long estudiantesId) {
        this.estudiantesId = estudiantesId;
    }

    public Integer getGruposId() {
        return gruposId;
    }

    public void setGruposId(Integer gruposId) {
        this.gruposId = gruposId;
    }
}
