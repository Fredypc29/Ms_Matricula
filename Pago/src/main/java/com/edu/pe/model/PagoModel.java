package com.edu.pe.model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="pago")
public class PagoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pago")
	private Integer id;
	
    @Column(name = "id_matricula")
    private Integer idMatr;
    
	@Column(name = "fecha_pago")
	private Date fechaMatr;
	
	private double monto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdMatr() {
		return idMatr;
	}

	public void setIdMatr(Integer idMatr) {
		this.idMatr = idMatr;
	}

	public Date getFechaMatr() {
		return fechaMatr;
	}

	public void setFechaMatr(Date fechaMatr) {
		this.fechaMatr = fechaMatr;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
}
