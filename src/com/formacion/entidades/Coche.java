package com.formacion.entidades;

public class Coche {

	private String modelo;
	private String color;
	private boolean metalizada;
	private String matricula;
	private String sector;
	private int anyoFabricacion;
	private String seguro;

	@Override
	public String toString() {
		return "El coche de matricula " + matricula + " (modelo " + modelo + ")" + " es de color " + color;
	}

	public Coche(String modelo, String matricula) {
		super();
		this.modelo = modelo;
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isMetalizada() {
		return metalizada;
	}

	public void setMetalizada(boolean metalizada) {
		this.metalizada = metalizada;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public int getAnyoFabricacion() {
		return anyoFabricacion;
	}

	public void setAnyoFabricacion(int anyoFabricacion) {
		this.anyoFabricacion = anyoFabricacion;
	}

	public String getSeguro() {
		return seguro;
	}

	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMatricula() {
		return matricula;
	}
}
