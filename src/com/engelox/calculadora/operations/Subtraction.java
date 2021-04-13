package com.engelox.calculadora.operations;

public class Subtraction extends Algebra{

	Subtraction(double operand1, double operand2) {
		super(operand1, operand2);
	}

	@Override
	public double execute() {
		return operand1 - operand2;
	}

	
}
