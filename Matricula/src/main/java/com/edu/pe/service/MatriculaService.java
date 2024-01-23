package com.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.pe.config.UtilsProperties;
import com.edu.pe.model.DetalleMatriculaModel;
import com.edu.pe.model.MatriculaModel;
import com.edu.pe.repository.IDetalleMatriculaRepository;
import com.edu.pe.repository.IMatriculaRepository;

@Service
public class MatriculaService {
	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	@Autowired
	private IDetalleMatriculaRepository detalleMatriculaRepository;
	
	@Autowired
	private UtilsProperties prop;
	
	public List<MatriculaModel> findAll() {
	    return (List<MatriculaModel>) matriculaRepository.findAll();
    }
	
    public MatriculaModel add(MatriculaModel model) throws Exception {
    	double total = 0;
    	if(model.getDetallefactura().size() > 0) {
    		total = Double.parseDouble(prop.PAGO_CURSO) * model.getDetallefactura().size() ;
    		model.setCostoTotal(total);
    		model = matriculaRepository.save(model);
    		if(model.getIdMatricula() != null || model.getIdMatricula() != 0) {
    			for(DetalleMatriculaModel det: model.getDetallefactura()) {
    				det.setMatricula(model);
    				detalleMatriculaRepository.save(det);
    			}
    			return model;
    		}else {
    			throw new Exception(prop.MSG_ERROR_PROCESAR);
    		}
    	}else {
    		throw new Exception(prop.MS_MATR_NO_CURSOS_ASIG);
    	}  
    }
    
    public boolean deleteBydId(int id) {        
        try {
        	matriculaRepository.deleteById(id);
            return true;
    	}catch(Exception ex) {
    		return false;
    	}
    }
    public MatriculaModel findById(int id) {
        Optional<MatriculaModel> model = matriculaRepository.findById(id);
        if(model.isPresent()) {
        	return model.get();
        }else {
        	return null;
        }
    }
}
