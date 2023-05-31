package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "horario")
public class HorarioEstModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "grupo")
    private Long grupo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "creditos")
    private Integer creditos;
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "horario")
    private String horario;
    @Column(name = "aula")
    private String aula;
    @Column(name = "profesor")
    private String profesor;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getGrupo() {
        return grupo;
    }
    public void setGrupo(Long grupo) {
        this.grupo = grupo;
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
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getAula() {
        return aula;
    }
    public void setAula(String aula) {
        this.aula = aula;
    }
    public String getProfesor() {
        return profesor;
    }
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    
    public HorarioEstModel(Long id, Long grupo, String nombre, Integer creditos, Integer codigo, String horario,
            String aula, String profesor) {
        this.id = id;
        this.grupo = grupo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.codigo = codigo;
        this.horario = horario;
        this.aula = aula;
        this.profesor = profesor;
    }

    
    
    
}
