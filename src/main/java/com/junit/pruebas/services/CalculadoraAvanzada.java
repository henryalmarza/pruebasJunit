package com.junit.pruebas.services;

/**
 * Calculadora con funciones avanzadas
 * 
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 * @since 13/06/2019
 */

import com.junit.pruebas.interfaces.ICalculadoraAvanzada;

public class CalculadoraAvanzada implements ICalculadoraAvanzada {

	private Calculadora calc;
	
	/**
	 * 
	 * @return Calculadora
	 */
	public Calculadora getCalc() {
		return calc;
	}

	/**
	 * 
	 * @param calc
	 */
	public void setCalc(Calculadora calc) {
		this.calc = calc;
	}

	/**
	 * @param op1
	 * @param op2
	 * @param op3
	 * 
	 * @return int
	 */
	public int sumarMultiplicar(int op1, int op2, int op3) {
		int result = calc.sumar(op1, op2) * op3;
		return result;
	}

}
