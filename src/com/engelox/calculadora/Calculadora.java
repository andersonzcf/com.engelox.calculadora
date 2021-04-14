package com.engelox.calculadora;

import com.engelox.calculadora.operations.Operation;

public interface Calculadora {
	public static double calcular(Operation operation) {
		return operation.execute();
	}
}
