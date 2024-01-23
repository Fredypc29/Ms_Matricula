package com.edu.pe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edu.pe.model.ApoderadoModel;

@Repository
public interface IApoderadoRepository extends CrudRepository<ApoderadoModel, Integer>{

}

