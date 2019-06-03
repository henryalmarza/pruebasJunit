package com.junit.pruebas.services;

import com.junit.pruebas.interfaces.ICalculadoraAvanzada;

public class CalculadoraAvanzada implements ICalculadoraAvanzada {

	private Calculadora calc;
	
	public Calculadora getCalc() {
		return calc;
	}

	public void setCalc(Calculadora calc) {
		this.calc = calc;
	}

	public int sumarMultiplicar(int op1, int op2, int op3) {
		int result = calc.sumar(op1, op2) * op3;
		return result;
	}

}
