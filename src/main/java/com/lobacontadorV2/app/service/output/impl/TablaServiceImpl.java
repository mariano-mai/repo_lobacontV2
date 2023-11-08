package com.lobacontadorV2.app.service.output.impl;

import java.util.ArrayList;
import java.util.List;

import com.lobacontadorV2.app.domain.JugadorLoba;
import com.lobacontadorV2.app.service.mapeo.impl.MapeoServiceImpl;
import com.lobacontadorV2.app.service.output.TablaService;

public class TablaServiceImpl implements TablaService{
	
	public static TablaService tabla = new TablaServiceImpl();
	
	static String espaciado;
	static String linea;
	static int valor;
	static List<String> nombres;
	public static int valor2 = 1; //este valor tiene que aumentar cuando se vaya a agregar puntos, debe ser responsabilidad de otro método.

	@Override
	public void generarLinea(String texto) {
		if(texto.equalsIgnoreCase("linea")) {
			linea = "";
			for(int i=0; i<valor2; i++) {
				for(JugadorLoba jugador : MapeoServiceImpl.jugadoresMap.values()) {
					linea = linea + String.valueOf(jugador.getPuntos().get(i))+ajusteDeEspaciado(String.valueOf(jugador.getPuntos().get(i)));
				}
				System.out.println(linea);
			}
		}else if(texto.equalsIgnoreCase("totales")) {
			linea = "";
			for(JugadorLoba jugador : MapeoServiceImpl.jugadoresMap.values()) {
			int suma = 0;
				for(int punto : jugador.getPuntos()) {
					jugador.setTotal(suma=suma+punto);
				}
				linea = linea + "<" + String.valueOf(jugador.getTotal())+ ">" + ajusteDeEspaciado("<"+String.valueOf(jugador.getTotal())+">");
			}
			System.out.println(linea);
		}
	}

	@Override
	public void encabezado() {
		linea = "";
		if(MapeoServiceImpl.jugadoresMap.isEmpty()) {
			System.out.println("Agregue jugadores para empezar.");
		}else {
			for(String nombre : nombres()) {
				linea = linea + nombre + ajusteDeEspaciado(nombre);
			}
		}
		System.out.println(linea);
	}
	
	private List<String> nombres(){
		nombres = new ArrayList<>();
		for(JugadorLoba jugador : MapeoServiceImpl.jugadoresMap.values())
			nombres.add(jugador.getNombre());
		return nombres;
	}
	
	private String ajusteDeEspaciado(String texto) {
		espaciado = "";
		valor = 10 - texto.length();
		for(int i=0; i<valor; i++) {
			espaciado = espaciado + " ";
		}
		return espaciado;
	}

}
