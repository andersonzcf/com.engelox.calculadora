package com.engelox.calculadora.operations;

public class Division extends Algebra{

	Division(double operand1, double operand2) {
		super(operand1, operand2);
	}

	@Override
	public double execute() {
		if (operand1 != 0) {
			return operand1 / operand2;
		}
		return 0;
	}

}
