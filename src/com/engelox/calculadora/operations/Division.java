package com.engelox.calculadora.operations;

public class Division extends Algebra {

	public Division(double operand1, double operand2) {
		super(operand1, operand2);
	}

	@Override
	public double execute() {
		if (operand2 != 0) {
			return operand1/ operand2;
		}
		System.err.println("Divisao por zero!");
		return -1;
	}

}
