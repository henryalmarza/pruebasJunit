package com.junit.pruebas.services;

/**
 * Calculadora con funciones básicas
 * 
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 * @since 13/06/2019
 */

import com.junit.pruebas.interfaces.ICalculadora;

public class Calculadora implements ICalculadora {

	/**
	 * Suma 2 números
	 * 
	 * @param op1
	 * @param op2
	 * 
	 * @return int
	 */
	public int sumar(int op1, int op2) {
		int result = op1 + op2;
		return result;
	}

}
