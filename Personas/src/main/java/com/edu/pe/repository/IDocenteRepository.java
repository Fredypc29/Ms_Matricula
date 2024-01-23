package com.edu.pe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edu.pe.model.DocenteModel;

@Repository
public interface IDocenteRepository extends CrudRepository<DocenteModel, Integer>{

}
