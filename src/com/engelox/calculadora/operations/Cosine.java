package com.engelox.calculadora.operations;

public class Cosine implements SingleInputOperation {

	@Override
	public double execute(double operand) {
		return Math.cos(Math.toRadians(operand));
	}
}
