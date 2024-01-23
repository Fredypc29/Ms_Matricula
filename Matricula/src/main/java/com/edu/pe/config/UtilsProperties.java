package com.edu.pe.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UtilsProperties {

	@Value("${prop.MS_MNT_GUARDAR}")
	public String MSG_EXITO_GUARDAR;
	
	@Value("${prop.MS_MNT_MODIFICAR}")
	public String MSG_EXITO_ACTUALIZAR;
	
	@Value("${prop.MS_MNT_ELIMINAR}")
	public String MSG_EXITO_ELIMINAR;
	
	@Value("${prop.MS_NO_ENCONTRO}")
	public String MSG_NO_ENCONTRADO;
	
	@Value("${prop.MS_ERROR_REGISTRO}")
	public String MSG_ERROR_RECUPERAR;  

	@Value("${prop.MS_ERROR_PROCESO}")
	public String MSG_ERROR_PROCESAR;  
	
	@Value("${prop.MS_MATR_NO_CURSOS_ASIG}")
	public String MS_MATR_NO_CURSOS_ASIG;  
	
	@Value("${prop.PAGO_CURSO}")
	public String PAGO_CURSO;  
}
