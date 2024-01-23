package com.edu.pe.dto;

public class ApoderadoDTO {
	private Integer idApoderado;
	private String estadoCivil;
	private String gradoInstruccion;
    private PersonaDTO persona;
    
	@Override
	public String toString() {
		return "ApoderadoDTO [idApoderado=" + idApoderado + ", estadoCivil=" + estadoCivil + ", gradoInstruccion="
				+ gradoInstruccion + ", persona=" + persona + "]";
	}
	
	public Integer getIdApoderado() {
		return idApoderado;
	}
	public void setIdApoderado(Integer idApoderado) {
		this.idApoderado = idApoderado;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getGradoInstruccion() {
		return gradoInstruccion;
	}
	public void setGradoInstruccion(String gradoInstruccion) {
		this.gradoInstruccion = gradoInstruccion;
	}
	public PersonaDTO getPersona() {
		return persona;
	}
	public void setPersona(PersonaDTO persona) {
		this.persona = persona;
	}
}
