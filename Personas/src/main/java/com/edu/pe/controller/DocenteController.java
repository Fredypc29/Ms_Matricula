package com.edu.pe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.edu.pe.config.UtilsProperties;
import com.edu.pe.dto.DocenteDTO;
import com.edu.pe.model.DocenteModel;
import com.edu.pe.service.DocenteService;

@RestController
@RequestMapping("/api/docente")
public class DocenteController {
	private Logger logger = LoggerFactory.getLogger(DocenteController.class);

	@Autowired
	private DocenteService docenteService;
	
	@Autowired
	private UtilsProperties prop;
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAll() {
		Map<String, Object> salida = new HashMap<String, Object>();
		try {
			List<DocenteModel> lista = docenteService.findAll();

			List<DocenteDTO> listaDTO = lista.stream().map(x -> {
				ModelMapper m = new ModelMapper();
				return m.map(x, DocenteDTO.class);
			}).collect(Collectors.toList());
			
			salida.put("data", listaDTO);
			
			logger.info("GET[Response] {}", listaDTO);
			return new ResponseEntity<>(salida, HttpStatus.OK);
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			salida.put("msg", prop.MSG_ERROR_RECUPERAR);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(salida);
		}
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<?> getById(@PathVariable("id") int id) {
		Map<String, Object> salida = new HashMap<String, Object>();
		try {
			logger.info("GET[Request] getById {} ", id);
			
			ModelMapper m = new ModelMapper();
			DocenteModel obj = docenteService.findById(id);
			
			if(obj != null) {
				DocenteDTO dto = m.map(docenteService.findById(id), DocenteDTO.class);
				
				logger.info("GET[Response] {}", dto);
				salida.put("data", dto);
				return new ResponseEntity<>(salida, HttpStatus.OK);
			}else {
				salida.put("msg", prop.MSG_NO_ENCONTRADO);
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(salida);
			}
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			salida.put("msg", prop.MSG_ERROR_RECUPERAR);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(salida);
		}
	}
	
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody DocenteDTO request) {
		Map<String, Object> salida = new HashMap<String, Object>();
		try {
			logger.info("POST[Request] create {} ", request);
			
			ModelMapper m = new ModelMapper();
			DocenteModel obj = m.map(request, DocenteModel.class);
			
			salida.put("msg", prop.MSG_EXITO_GUARDAR);
			salida.put("data", docenteService.add(obj));
			
			return ResponseEntity.status(HttpStatus.OK).body(salida);
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			salida.put("msg", prop.MSG_ERROR_PROCESAR);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(salida);
		}
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody DocenteDTO request) {
		Map<String, Object> salida = new HashMap<String, Object>();
		try {
			logger.info("PUT[Request] create {} ", request);
			
			ModelMapper m = new ModelMapper();
			DocenteModel obj = m.map(request, DocenteModel.class);
			
			salida.put("msg", prop.MSG_EXITO_ACTUALIZAR);
			salida.put("data", docenteService.add(obj));
			
			return ResponseEntity.status(HttpStatus.OK).body(salida);
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			salida.put("msg", prop.MSG_ERROR_PROCESAR);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(salida);
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") int id) {
		Map<String, Object> salida = new HashMap<String, Object>();
		try {
			logger.info("DELETE[Request] delete {} ", id);
			
			DocenteModel obj = docenteService.findById(id);
			
			if(obj != null) {
				docenteService.deleteBydId(id);
				salida.put("msg", prop.MSG_EXITO_ELIMINAR);
				return ResponseEntity.status(HttpStatus.OK).body(salida);
			}else {
				salida.put("msg", prop.MSG_NO_ENCONTRADO);
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(salida);
			}
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			salida.put("msg", prop.MSG_ERROR_PROCESAR);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(salida);
		}
	}
}
