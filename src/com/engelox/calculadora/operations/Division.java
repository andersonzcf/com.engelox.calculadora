package com.engelox.calculadora.operations;

public class Division implements MultipleInputOperation {

	@Override
	public double execute(double operand1, double operand2) {
		if (operand2 == 0) {
			System.err.println("Divisao por zero!");
			return -1;
		}
		return operand1 / operand2;
	}
}
