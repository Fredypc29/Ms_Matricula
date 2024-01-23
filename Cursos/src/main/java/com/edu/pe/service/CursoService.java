package com.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edu.pe.model.CursoModel;
import com.edu.pe.repository.ICursoRepository;

@Service
public class CursoService {
	@Autowired
	private ICursoRepository cursoRepository;
	
	public List<CursoModel> findAll() {
	    return (List<CursoModel>) cursoRepository.findAll();
    }
	
    public CursoModel add(CursoModel model) {
        return cursoRepository.save(model);
    }

    public boolean deleteBydId(int id) {        
        try {
        	cursoRepository.deleteById(id);
            return true;
    	}catch(Exception ex) {
    		return false;
    	}
    }

    public CursoModel findById(int id) {
        Optional<CursoModel> model = cursoRepository.findById(id);
        if(model.isPresent()) {
        	return model.get();
        }else {
        	return null;
        }
    }
    
    public boolean ExisteCurso(String nombre, int id) {
    	return cursoRepository.CantCursos(nombre, id) > 0;
    }
}
