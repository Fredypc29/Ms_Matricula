package com.edu.pe.dto;

public class PersonaDTO {
	private Integer idPers;
	private String nombres;
	private String apellidos;
	private String sexo;
	private String telefono;
	private String direccion;
	
	@Override
	public String toString() {
		return "PersonaDTO [idPers=" + idPers + ", nombres=" + nombres + ", apellidos=" + apellidos + ", sexo=" + sexo
				+ ", telefono=" + telefono + ", direccion=" + direccion + "]";
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getIdPers() {
		return idPers;
	}

	public void setIdPers(Integer idPers) {
		this.idPers = idPers;
	}
	
	
}
