package com.edu.pe.dto;

public class DetalleMatriculaDTO {
	private Integer idDetMatr;
	private int idCurso;
	
	@Override
	public String toString() {
		return "DetalleMatriculaDTO [idDetMatr=" + idDetMatr + ", idCurso=" + idCurso + "]";
	}
	public Integer getIdDetMatr() {
		return idDetMatr;
	}
	public void setIdDetMatr(Integer idDetMatr) {
		this.idDetMatr = idDetMatr;
	}
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	} 
}
