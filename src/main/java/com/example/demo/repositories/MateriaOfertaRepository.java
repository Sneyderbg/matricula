package com.example.demo.repositories;

import com.example.demo.models.MateriaOfertaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MateriaOfertaRepository extends CrudRepository<MateriaOfertaModel, Long> {
    public List<MateriaOfertaModel> findByOfertasId(Long ofertasId);
}
