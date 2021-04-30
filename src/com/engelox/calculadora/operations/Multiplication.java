package com.engelox.calculadora.operations;

public class Multiplication implements MultipleInputOperation {

	@Override
	public double execute(double operand1, double operand2) {
		return operand1 * operand2;
	}

}
