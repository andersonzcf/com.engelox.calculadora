package com.engelox.calculadora.operations;

public class Sphere implements SingleInputOperation {

	@Override
	public double execute(double operand) {
		return (4 * Math.PI * Math.pow(operand, 3)) / 3;
	}

}
