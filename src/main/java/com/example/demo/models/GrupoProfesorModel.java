package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "grupoprofesor")
public class GrupoProfesorModel {

    @Id
    @Column(name = "GruposId")
    private Long gruposId;
    @Column(name = "ProfesoresId")
    private Long profesoresId;

    public Long getGruposId() {
        return gruposId;
    }

    public void setGruposId(Long gruposId) {
        this.gruposId = gruposId;
    }

    public Long getProfesoresId() {
        return profesoresId;
    }

    public void setProfesoresId(Long profesoresId) {
        this.profesoresId = profesoresId;
    }
}
