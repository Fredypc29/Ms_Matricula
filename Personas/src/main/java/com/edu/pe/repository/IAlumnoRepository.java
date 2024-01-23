package com.edu.pe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edu.pe.model.AlumnoModel;

@Repository
public interface IAlumnoRepository extends CrudRepository<AlumnoModel, Integer>{

}
