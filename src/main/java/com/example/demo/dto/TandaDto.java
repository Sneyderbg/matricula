package com.example.demo.dto;

public class TandaDto {

    private Long id;
    private Integer numero;
    private String horario;

    public TandaDto(Long id, Integer numero, String horario) {
        this.id = id;
        this.numero = numero;
        this.horario = horario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
