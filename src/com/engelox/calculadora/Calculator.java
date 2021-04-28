package com.engelox.calculadora;

import com.engelox.calculadora.operations.Operation;

public class Calculator {
	public double calculate(Operation operation) {
		return operation.execute();
	}
}
