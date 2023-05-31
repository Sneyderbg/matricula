package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EstudianteDto;
import com.example.demo.services.EstudianteService;

@RestController
@CrossOrigin(origins = "http://localhost")
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    EstudianteService estudianteService;

    @GetMapping("/{id}")
    public EstudianteDto obtenerEstudiantePorIdentificacion(@PathVariable("id") Long id) {
        return estudianteService.obtenerPorIdentificacion(id);
    }
}
