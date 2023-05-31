package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MateriaGrupoDto;
import com.example.demo.services.MateriaService;

@RestController
@CrossOrigin(origins = "http://localhost")
@RequestMapping("/materia")
public class MateriaController {
    @Autowired
    MateriaService materiaService;

    @GetMapping()
    public List<MateriaGrupoDto> obtenerMateriaPorCodigo(@RequestParam("codigo") Long codigo) {
        return this.materiaService.obtenerPorCodigo(codigo);
    }

}