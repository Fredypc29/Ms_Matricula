package com.edu.pe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edu.pe.model.DetalleMatriculaModel;

@Repository
public interface IDetalleMatriculaRepository extends CrudRepository<DetalleMatriculaModel, Integer> {

}
