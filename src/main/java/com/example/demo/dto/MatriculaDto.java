package com.example.demo.dto;

import java.util.List;

public class MatriculaDto {
    private Long estudianteId;
    private String semestre;
    private List<Long> gruposId;

    public MatriculaDto(Long estudianteId, String semestre, List<Long> gruposId) {
        this.estudianteId = estudianteId;
        this.semestre = semestre;
        this.gruposId = gruposId;
    }

    public Long getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Long estudianteId) {
        this.estudianteId = estudianteId;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public List<Long> getGruposId() {
        return gruposId;
    }

    public void setGruposId(List<Long> gruposId) {
        this.gruposId = gruposId;
    }
}
