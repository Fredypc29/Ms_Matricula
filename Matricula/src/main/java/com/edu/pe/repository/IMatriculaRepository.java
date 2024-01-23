package com.edu.pe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edu.pe.model.MatriculaModel;

@Repository
public interface IMatriculaRepository extends CrudRepository<MatriculaModel, Integer>{

}
