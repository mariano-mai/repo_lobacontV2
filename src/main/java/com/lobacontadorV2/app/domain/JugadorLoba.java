package com.lobacontadorV2.app.domain;

import java.util.ArrayList;
import java.util.List;

public class JugadorLoba {
	
	private String nombre;
	private List<Integer> puntos = new ArrayList<>();
	private int total = 0;
	
	public JugadorLoba() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Integer> getPuntos() {
		return puntos;
	}

	public void setPuntos(List<Integer> puntos) {
		this.puntos = puntos;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	

}
