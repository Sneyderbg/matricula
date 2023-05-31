package com.example.demo.repositories;

import com.example.demo.models.HorarioEstModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioEstRepository extends CrudRepository<HorarioEstModel, Long>{
    
}
