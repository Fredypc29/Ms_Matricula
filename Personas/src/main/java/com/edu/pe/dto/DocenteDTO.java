package com.edu.pe.dto;

public class DocenteDTO {
	private Integer idDocente;
	private String dni;
	private String email;
    private PersonaDTO persona;
    
	@Override
	public String toString() {
		return "DocenteDTO [idDocente=" + idDocente + ", dni=" + dni + ", email=" + email + ", persona=" + persona
				+ "]";
	}

	public Integer getIdDocente() {
		return idDocente;
	}

	public void setIdDocente(Integer idDocente) {
		this.idDocente = idDocente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PersonaDTO getPersona() {
		return persona;
	}

	public void setPersona(PersonaDTO persona) {
		this.persona = persona;
	}
    
    
}
