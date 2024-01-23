package com.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edu.pe.model.AlumnoModel;
import com.edu.pe.repository.IAlumnoRepository;

@Service
public class AlumnoService {
	@Autowired
	private IAlumnoRepository alumnoRepository;
	
	public List<AlumnoModel> findAll() {
	    return (List<AlumnoModel>) alumnoRepository.findAll();
    }
	
    public AlumnoModel add(AlumnoModel model) {
        return alumnoRepository.save(model);
    }

    public boolean deleteBydId(int id) {        
        try {
        	alumnoRepository.deleteById(id);
            return true;
    	}catch(Exception ex) {
    		return false;
    	}
    }

    public AlumnoModel findById(int id) {
        Optional<AlumnoModel> model = alumnoRepository.findById(id);
        if(model.isPresent()) {
        	return model.get();
        }else {
        	return null;
        }
    }
}
