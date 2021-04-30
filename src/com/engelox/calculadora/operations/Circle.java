package com.engelox.calculadora.operations;

public class Circle implements SingleInputOperation {

	@Override
	public double execute(double operand) {
		return Math.PI * Math.pow(operand, 2);
	}

}
