package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.OfertaDto;
import com.example.demo.services.OfertaService;

@RestController
@CrossOrigin(origins = "http://localhost")
@RequestMapping("/oferta")
public class OfertaController {

    @Autowired
    OfertaService ofertaService;

    @GetMapping()
    public OfertaDto obtenerOfertaPorId(@RequestParam("id") Long id) {
        return ofertaService.obtenerPorId(id);
    }
}
