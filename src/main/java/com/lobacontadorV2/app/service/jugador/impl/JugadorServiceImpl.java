package com.lobacontadorV2.app.service.jugador.impl;

import java.util.ArrayList;
import java.util.List;

import com.lobacontadorV2.app.domain.JugadorLoba;
import com.lobacontadorV2.app.service.input.console.impl.EntradaPorScannerImpl;
import com.lobacontadorV2.app.service.jugador.JugadorService;
import com.lobacontadorV2.app.service.mapeo.impl.MapeoServiceImpl;

public class JugadorServiceImpl implements JugadorService{
	
	public static JugadorService jugador = new JugadorServiceImpl();
	
	static JugadorLoba newJugador;
	static int cantidad;
	static List<Integer> puntajeInicial = new ArrayList<>();

	@Override
	public void agregarJugador() {
		System.out.println("¿Cuántos jugadores desea agregar?");
		cantidad = EntradaPorScannerImpl.input.entero();
		for(int i=0; i<cantidad; i++) {
			crearJugador();
		}
	}

	@Override
	public void quitarJugador() {
		System.out.println("Ingrese el nombre del Jugador: ");
		String nombre = EntradaPorScannerImpl.input.texto();
		if(MapeoServiceImpl.jugadoresMap.containsKey(nombre)) {
			MapeoServiceImpl.jugadoresMap.remove(nombre);
		}else {
			System.out.println("El jugador "+nombre+" no existe. Pruebe de nuevo.");
		}
	}
	
	private void crearJugador() {
		newJugador = new JugadorLoba();
		System.out.println("Ingrese el nombre del Jugador: ");
		newJugador.setNombre(EntradaPorScannerImpl.input.texto());
		puntajeInicial.add(0);
		newJugador.setPuntos(puntajeInicial);
		MapeoServiceImpl.mapeo.mapearJugadores(newJugador);
	}

}
