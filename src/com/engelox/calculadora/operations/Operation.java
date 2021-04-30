package com.engelox.calculadora.operations;

public interface Operation {
	public abstract double execute(double operand);

	public abstract double execute(double operand, double operand2);
}
