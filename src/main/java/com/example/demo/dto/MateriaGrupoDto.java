package com.example.demo.dto;

import java.util.List;

public class MateriaGrupoDto {

    private Long grupoId;
    private Long materiaId;
    private String modalidad;
    private Integer numeroGrupo;
    private String aula;
    private List<HorarioDto> horario;
    private String nombre;
    private Integer creditos;
    private String descripcion;

    public MateriaGrupoDto(Long grupoId, Long materiaId, String modalidad, Integer numeroGrupo, String aula,
            List<HorarioDto> horario, String nombre, Integer creditos, String descripcion) {
        this.grupoId = grupoId;
        this.materiaId = materiaId;
        this.modalidad = modalidad;
        this.numeroGrupo = numeroGrupo;
        this.aula = aula;
        this.horario = horario;
        this.nombre = nombre;
        this.creditos = creditos;
        this.descripcion = descripcion;
    }

    public Long getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(Long grupoId) {
        this.grupoId = grupoId;
    }

    public Long getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(Long materiaId) {
        this.materiaId = materiaId;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public Integer getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(Integer numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<HorarioDto> getHorario() {
        return horario;
    }

    public void setHorario(List<HorarioDto> horario) {
        this.horario = horario;
    }
}
