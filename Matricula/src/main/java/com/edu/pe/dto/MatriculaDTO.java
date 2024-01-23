package com.edu.pe.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.edu.pe.model.DetalleMatriculaModel;

import jakarta.persistence.Column;

public class MatriculaDTO {
	private Integer idMatricula;
	private int idAlumno;
	private Date fechaMatr;
	private String periodo;
	private String grado;
	private String seccion;
	private double costoTotal;
	private String estado;
	private List<DetalleMatriculaModel> detallefactura = new ArrayList<>();
	
	@Override
	public String toString() {
		return "MatriculaDTO [idMatricula=" + idMatricula + ", idAlumno=" + idAlumno + ", fechaMatr=" + fechaMatr
				+ ", periodo=" + periodo + ", grado=" + grado + ", seccion=" + seccion + ", costoTotal=" + costoTotal
				+ ", estado=" + estado + ", detallefactura=" + detallefactura + "]";
	}
	public Integer getIdMatricula() {
		return idMatricula;
	}
	public void setIdMatricula(Integer idMatricula) {
		this.idMatricula = idMatricula;
	}
	public int getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	public Date getFechaMatr() {
		return fechaMatr;
	}
	public void setFechaMatr(Date fechaMatr) {
		this.fechaMatr = fechaMatr;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public double getCostoTotal() {
		return costoTotal;
	}
	public void setCostoTotal(double costoTotal) {
		this.costoTotal = costoTotal;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public List<DetalleMatriculaModel> getDetallefactura() {
		return detallefactura;
	}
	public void setDetallefactura(List<DetalleMatriculaModel> detallefactura) {
		this.detallefactura = detallefactura;
	}
	
	
}
