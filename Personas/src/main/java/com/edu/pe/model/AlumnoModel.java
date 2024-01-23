package com.edu.pe.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "alumno")
public class AlumnoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_alumno")
	private Integer idAlumno;
	
	@Column(name = "dni", columnDefinition = "CHAR(8)")
	private String dni;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
	@Column(name = "fecha_nac")
    private Date fechaNac;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persona")
    private PersonaModel persona;
	
	@ManyToOne 
    @JoinColumn(name = "id_apoderado")
    private ApoderadoModel apoderado;

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

	public PersonaModel getPersona() {
		return persona;
	}

	public void setPersona(PersonaModel persona) {
		this.persona = persona;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public ApoderadoModel getApoderado() {
		return apoderado;
	}

	public void setApoderado(ApoderadoModel apoderado) {
		this.apoderado = apoderado;
	}
}
