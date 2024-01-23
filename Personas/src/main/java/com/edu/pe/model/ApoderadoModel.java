package com.edu.pe.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "apoderado")
public class ApoderadoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_apoderado")
	private Integer idApoderado;
	
	@Column(name = "estado_civil", columnDefinition = "VARCHAR(50)")
	private String estadoCivil;
	
	@Column(name = "grado_instruccion", columnDefinition = "VARCHAR(100)")
	private String gradoInstruccion;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persona")
    private PersonaModel persona;
	
	@Override
	public String toString() {
		return "ApoderadoModel [idApoderado=" + idApoderado + ", estadoCivil=" + estadoCivil + ", gradoInstruccion="
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

	public PersonaModel getPersona() {
		return persona;
	}

	public void setPersona(PersonaModel persona) {
		this.persona = persona;
	}
}
