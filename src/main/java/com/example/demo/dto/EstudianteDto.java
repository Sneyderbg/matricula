package com.example.demo.dto;

public class EstudianteDto {

    private Long id;
    private String nombres;
    private String apellidos;
    private Integer nroPensum;
    private Integer nroSemestre;
    private Long ofertaId;
    private ProgramaDto programa;
    private TandaDto tanda;

    public EstudianteDto(Long id, String nombres, String apellidos, Integer nroPensum, Integer nroSemestre,
            Long ofertaId, ProgramaDto programa, TandaDto tanda) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nroPensum = nroPensum;
        this.nroSemestre = nroSemestre;
        this.ofertaId = ofertaId;
        this.programa = programa;
        this.tanda = tanda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOfertaId() {
        return ofertaId;
    }

    public void setOfertaId(Long ofertaId) {
        this.ofertaId = ofertaId;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    public ProgramaDto getPrograma() {
        return programa;
    }

    public void setPrograma(ProgramaDto programa) {
        this.programa = programa;
    }

    public TandaDto getTanda() {
        return tanda;
    }

    public void setTanda(TandaDto tanda) {
        this.tanda = tanda;
    }
}
