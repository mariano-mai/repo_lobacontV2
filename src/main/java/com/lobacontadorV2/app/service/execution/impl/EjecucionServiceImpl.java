package com.lobacontadorV2.app.service.execution.impl;

import com.lobacontadorV2.app.service.execution.EjecucionService;
import com.lobacontadorV2.app.service.menu.impl.MenuDeOpcionesImpl;

public class EjecucionServiceImpl implements EjecucionService{
	
	public static EjecucionService ejecucion = new EjecucionServiceImpl();

	@Override
	public void ejecutar() {
		MenuDeOpcionesImpl.menu.mostrarMenu();
		
	}

	@Override
	public void terminarEjecucion() {
		System.out.println("Programa finalizado.");
		
	}

}
