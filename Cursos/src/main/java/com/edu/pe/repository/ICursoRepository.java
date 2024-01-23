package com.edu.pe.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.edu.pe.model.CursoModel;

@Repository
public interface ICursoRepository extends CrudRepository<CursoModel, Integer>{
	@Query("select count(c) from CursoModel c where c.nombre=:nombre and (c.id!=:id or :id=0)")
    public int CantCursos(String nombre , int id);
}
