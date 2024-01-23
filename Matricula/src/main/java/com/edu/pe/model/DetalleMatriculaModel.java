package com.edu.pe.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_matricula")
public class DetalleMatriculaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_detalle_matr")
	private Integer idDetMatr;
	
	@JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_matr")
    private MatriculaModel matricula;
	
	@Column(name = "id_curso")
	private int idCurso; 

	public Integer getIdDetMatr() {
		return idDetMatr;
	}

	public void setIdDetMatr(Integer idDetMatr) {
		this.idDetMatr = idDetMatr;
	}

	public MatriculaModel getMatricula() {
		return matricula;
	}

	public void setMatricula(MatriculaModel matricula) {
		this.matricula = matricula;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	
	
}
