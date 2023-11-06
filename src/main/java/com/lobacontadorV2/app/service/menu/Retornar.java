package com.lobacontadorV2.app.service.menu;

import com.lobacontadorV2.app.service.menu.impl.MenuDeOpcionesImpl;

public class Retornar {
	
	public static void volverAMenu() {
		MenuDeOpcionesImpl.menu.mostrarMenu();
	}

}
