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
import com.edu.pe.dto.AlumnoDTO;
import com.edu.pe.dto.ApoderadoDTO;
import com.edu.pe.dto.DocenteDTO;
import com.edu.pe.model.AlumnoModel;
import com.edu.pe.model.ApoderadoModel;
import com.edu.pe.service.AlumnoService;
import com.edu.pe.service.ApoderadoService;

@RestController
@RequestMapping("/api/apoderado")
public class ApoderadoController {
	private Logger logger = LoggerFactory.getLogger(ApoderadoController.class);

	@Autowired
	private ApoderadoService alumnoService;
	
	@Autowired
	private UtilsProperties prop;
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAll() {
		Map<String, Object> salida = new HashMap<String, Object>();
		try {
			List<ApoderadoModel> lista = alumnoService.findAll();

			List<ApoderadoDTO> listaDTO = lista.stream().map(x -> {
				ModelMapper m = new ModelMapper();
				return m.map(x, ApoderadoDTO.class);
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
			ApoderadoModel obj = alumnoService.findById(id);
			
			if(obj != null) {
				ApoderadoDTO dto = m.map(alumnoService.findById(id), ApoderadoDTO.class);
				
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
	public ResponseEntity<?> create(@RequestBody ApoderadoDTO request) {
		Map<String, Object> salida = new HashMap<String, Object>();
		try {
			logger.info("POST[Request] create {} ", request);
			
			ModelMapper m = new ModelMapper();
			ApoderadoModel obj = m.map(request, ApoderadoModel.class);
			
			salida.put("msg", prop.MSG_EXITO_GUARDAR);
			salida.put("data", alumnoService.add(obj));
			
			return ResponseEntity.status(HttpStatus.OK).body(salida);
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			salida.put("msg", prop.MSG_ERROR_PROCESAR);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(salida);
		}
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody ApoderadoDTO request) {
		Map<String, Object> salida = new HashMap<String, Object>();
		try {
			logger.info("PUT[Request] create {} ", request);
			
			ModelMapper m = new ModelMapper();
			ApoderadoModel obj = m.map(request, ApoderadoModel.class);
			
			salida.put("msg", prop.MSG_EXITO_ACTUALIZAR);
			salida.put("data", alumnoService.add(obj));
			
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
			
			ApoderadoModel obj = alumnoService.findById(id);
			
			if(obj != null) {
				alumnoService.deleteBydId(id);
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
