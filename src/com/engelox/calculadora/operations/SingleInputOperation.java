package com.engelox.calculadora.operations;

public interface SingleInputOperation extends Operation {

	@Override
	default double execute(double operand, double operand2) {
		return 0;
	}
}
