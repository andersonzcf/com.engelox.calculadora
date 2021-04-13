package com.engelox.calculadora.operations;

public class Sum extends Algebra {

	Sum(double operand1, double operand2) {
		super(operand1, operand2);
	}
	
	public double execute() {
		return operand1 + operand2;
	}

}
