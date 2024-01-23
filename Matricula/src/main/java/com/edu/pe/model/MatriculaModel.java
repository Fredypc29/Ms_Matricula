package com.edu.pe.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "matricula")
public class MatriculaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_matr")
	private Integer idMatricula;
	
	@Column(name = "id_alumno")
	private int idAlumno;
	
	@Column(name = "fecha_matr")
	private Date fechaMatr;
	
	private String periodo;
	
	private String grado;
	
	private String seccion;
	
	private double costoTotal;
	
	private String estado;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "matricula")
    @Column(name = "id_detalle_matr")
    private List<DetalleMatriculaModel> detallefactura = new ArrayList<>();

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
