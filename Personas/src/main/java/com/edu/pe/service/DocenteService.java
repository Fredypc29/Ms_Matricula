package com.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.pe.model.DocenteModel;
import com.edu.pe.repository.IDocenteRepository;

@Service
public class DocenteService {
	
	@Autowired
	private IDocenteRepository docenteRepository;
	
	public List<DocenteModel> findAll() {
	    return (List<DocenteModel>) docenteRepository.findAll();
    }
	
    public DocenteModel add(DocenteModel model) {
        return docenteRepository.save(model);
    }

    public boolean deleteBydId(int id) {        
        try {
        	docenteRepository.deleteById(id);
            return true;
    	}catch(Exception ex) {
    		return false;
    	}
    }

    public DocenteModel findById(int id) {
        Optional<DocenteModel> model = docenteRepository.findById(id);
        if(model.isPresent()) {
        	return model.get();
        }else {
        	return null;
        }
    }
}
