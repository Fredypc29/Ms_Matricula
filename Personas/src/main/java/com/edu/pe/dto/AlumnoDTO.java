package com.edu.pe.dto;

import java.util.Date;

public class AlumnoDTO {
	private Integer idAlumno;
	private String dni;
	private Date fechaNac;
    private PersonaDTO persona;
    private ApoderadoDTO apoderado;
    
	@Override
	public String toString() {
		return "AlumnoDTO [idAlumno=" + idAlumno + ", dni=" + dni + ", fechaNac=" + fechaNac + ", persona=" + persona
				+ "]";
	}
	public Integer getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public PersonaDTO getPersona() {
		return persona;
	}
	public void setPersona(PersonaDTO persona) {
		this.persona = persona;
	}
	public ApoderadoDTO getApoderado() {
		return apoderado;
	}
	public void setApoderado(ApoderadoDTO apoderado) {
		this.apoderado = apoderado;
	}
    
	
}
