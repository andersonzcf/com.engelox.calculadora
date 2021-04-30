package com.engelox.calculadora.operations;

public interface MultipleInputOperation extends Operation {

	@Override
	default double execute(double operand) {
		return 0;
	}
}
