package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MatriculaDto;
import com.example.demo.services.MateriaService;
import com.example.demo.services.MatriculaService;

@RestController
@CrossOrigin(origins = "http://localhost")
@RequestMapping("/matricula")
public class MatriculaController {

    @Autowired
    MateriaService materiaService;

    @Autowired
    MatriculaService matriculaService;

    @PostMapping()
    public MatriculaDto matricularMateria(@RequestBody MatriculaDto matriculaDto) {
        return this.matriculaService.guardarMatricula(matriculaDto);
    }

    @GetMapping()
    public MatriculaDto obtenerMatricula(@RequestParam("id") Long id) {
        return this.matriculaService.obtenerMatricula(id);
    }

}
