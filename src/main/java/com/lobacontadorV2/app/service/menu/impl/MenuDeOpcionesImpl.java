package com.lobacontadorV2.app.service.menu.impl;

import com.lobacontadorV2.app.service.execution.impl.EjecucionServiceImpl;
import com.lobacontadorV2.app.service.input.console.impl.EntradaPorScannerImpl;
import com.lobacontadorV2.app.service.jugador.impl.JugadorServiceImpl;
import com.lobacontadorV2.app.service.menu.MenuDeOpciones;
import com.lobacontadorV2.app.service.menu.Retornar;
import com.lobacontadorV2.app.service.output.impl.TablaServiceImpl;

public class MenuDeOpcionesImpl implements MenuDeOpciones{
	
	public static MenuDeOpciones menu = new MenuDeOpcionesImpl();
	
	static int opcion;

	@Override
	public void mostrarMenu() {
		
		TablaServiceImpl.tabla.encabezado();
		TablaServiceImpl.tabla.generarLinea("linea");
		TablaServiceImpl.tabla.generarLinea("totales");
		
		System.out.println("Ingrese una opción: ");
		System.out.println("\t\n0- SALIR\t\n1- AGREGAR JUGADORES\t\n2- QUITAR JUGADOR");
		
		opcion = EntradaPorScannerImpl.input.entero();
		
		switch(opcion) {
		case 0:
			EjecucionServiceImpl.ejecucion.terminarEjecucion();
			break;
		case 1:
			JugadorServiceImpl.jugador.agregarJugador();
			Retornar.volverAMenu();
			break;
		case 2:
			JugadorServiceImpl.jugador.quitarJugador();
			Retornar.volverAMenu();
			break;
		}
		
	}

}
