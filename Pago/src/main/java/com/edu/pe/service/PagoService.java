package com.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edu.pe.model.PagoModel;
import com.edu.pe.repository.IPagoRepository;

@Service
public class PagoService {
	@Autowired
	private IPagoRepository pagoRepository;
	
	public List<PagoModel> findAll() {
	    return (List<PagoModel>) pagoRepository.findAll();
    }
	
    public PagoModel add(PagoModel model) {
        return pagoRepository.save(model);
    }
    
    public PagoModel findById(int id) {
        Optional<PagoModel> model = pagoRepository.findById(id);
        if(model.isPresent()) {
        	return model.get();
        }else {
        	return null;
        }
    }
}
