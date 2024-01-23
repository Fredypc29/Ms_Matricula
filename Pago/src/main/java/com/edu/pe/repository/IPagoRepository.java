package com.edu.pe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.edu.pe.model.PagoModel;

@Repository
public interface IPagoRepository extends CrudRepository<PagoModel, Integer> {

}
