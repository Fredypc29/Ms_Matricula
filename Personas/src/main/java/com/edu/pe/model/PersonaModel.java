package com.edu.pe.model;

import jakarta.persistence.*;

@Entity
@Table(name = "persona")
public class PersonaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_persona")
	private Integer idPers;

	private String nombres;

	private String apellidos;

	private String sexo;

	@Column(name = "telefono", columnDefinition = "CHAR(15)")
	private String telefono;

	private String direccion;

	public Integer getIdPers() {
		return idPers;
	}

	public void setIdPers(Integer idPers) {
		this.idPers = idPers;
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

	
}
