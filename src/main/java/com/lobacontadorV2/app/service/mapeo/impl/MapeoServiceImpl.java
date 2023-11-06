package com.lobacontadorV2.app.service.mapeo.impl;

import java.util.HashMap;
import java.util.Map;

import com.lobacontadorV2.app.domain.JugadorLoba;
import com.lobacontadorV2.app.service.mapeo.MapeoService;

public class MapeoServiceImpl implements MapeoService{
	
	public static MapeoService mapeo = new MapeoServiceImpl();
	
	public static Map<String, JugadorLoba> jugadoresMap = new HashMap<>();

	@Override
	public void mapearJugadores(JugadorLoba jugador) {
		jugadoresMap.put(jugador.getNombre(), jugador);
	}

}
