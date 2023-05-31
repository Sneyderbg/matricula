package com.example.demo.repositories;

import com.example.demo.models.GrupoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface GrupoRepository extends CrudRepository<GrupoModel, Long>{
    public abstract ArrayList<GrupoModel> findByMateriaId(Long materiaId);
}
