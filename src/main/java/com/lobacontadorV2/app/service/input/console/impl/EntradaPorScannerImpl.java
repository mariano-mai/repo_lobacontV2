package com.lobacontadorV2.app.service.input.console.impl;

import java.util.Scanner;

import com.lobacontadorV2.app.service.input.console.EntradaPorScanner;

public class EntradaPorScannerImpl implements EntradaPorScanner{
	
	public static EntradaPorScanner input = new EntradaPorScannerImpl();
	
	static Scanner entrada;

	@Override
	public String texto() {
		entrada = new Scanner(System.in);
		String texto = entrada.nextLine();
		return texto;
	}

	@Override
	public int entero() {
		entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		return numero;
	}

}
