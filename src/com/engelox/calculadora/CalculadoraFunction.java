package com.engelox.calculadora;

public enum CalculadoraFunction {
	SUM(true),
	SUBTRACTION(true),
	DIVISION(true),
	MULTIPLCATION(true),
	SIN(false),
	COS(false),
	CIRCLE(false),
	SPHERE(false);
	
	private boolean multipleInput;
	
	CalculadoraFunction (boolean multipleInput) {
		this.multipleInput = multipleInput;
	}
	
	public boolean isMultipleInput() {
		return this.multipleInput;
	}
}
