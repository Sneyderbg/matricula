package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class GrupoMatriculaKey implements Serializable {

    @Column(name = "GruposId")
    private Long gruposId;
    @Column(name = "MatriculasId")
    private Long matriculasId;

    public GrupoMatriculaKey(Long gruposId, Long matriculasId) {
        this.gruposId = gruposId;
        this.matriculasId = matriculasId;
    }

    public GrupoMatriculaKey() {
    }

    public Long getGruposId() {
        return gruposId;
    }

    public void setGruposId(Long gruposId) {
        this.gruposId = gruposId;
    }

    public Long getMatriculasId() {
        return matriculasId;
    }

    public void setMatriculasId(Long matriculasId) {
        this.matriculasId = matriculasId;
    }
}

