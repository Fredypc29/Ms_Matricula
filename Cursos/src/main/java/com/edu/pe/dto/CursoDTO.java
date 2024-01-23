package com.edu.pe.dto;

public class CursoDTO {
	private Integer id;
	private String nombre;
	private int horas;
	private int creditos;
	
	@Override
	public String toString() {
		return "CursoDTO [id=" + id + ", nombre=" + nombre + ", horas=" + horas + ", creditos=" + creditos + "]";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
}
