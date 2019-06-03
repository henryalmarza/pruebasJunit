package com.junit.pruebas.services;

import com.junit.pruebas.interfaces.ICalculadora;

public class Calculadora implements ICalculadora {

	public int sumar(int op1, int op2) {
		int result = op1 + op2;
		return result;
	}

}
