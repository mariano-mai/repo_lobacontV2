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

	@Override
	public void generarLinea(String texto) {
		
		
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
