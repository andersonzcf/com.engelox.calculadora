package com.engelox.calculadora.operations;

public class Sin implements SingleInputOperation {

	@Override
	public double execute(double operand) {
		return Math.sin(Math.toRadians(operand));
	}

}
