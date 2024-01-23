package com.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edu.pe.model.AlumnoModel;
import com.edu.pe.model.ApoderadoModel;
import com.edu.pe.repository.IAlumnoRepository;
import com.edu.pe.repository.IApoderadoRepository;

@Service
public class ApoderadoService {
	@Autowired
	private IApoderadoRepository apoderadoRepository;
	
	public List<ApoderadoModel> findAll() {
	    return (List<ApoderadoModel>) apoderadoRepository.findAll();
    }
	
    public ApoderadoModel add(ApoderadoModel model) {
        return apoderadoRepository.save(model);
    }

    public boolean deleteBydId(int id) {        
    	try {
    		apoderadoRepository.deleteById(id);
            return true;
    	}catch(Exception ex) {
    		return false;
    	}
    }

    public ApoderadoModel findById(int id) {
        Optional<ApoderadoModel> model = apoderadoRepository.findById(id);
        if(model.isPresent()) {
        	return model.get();
        }else {
        	return null;
        }
    }
}
