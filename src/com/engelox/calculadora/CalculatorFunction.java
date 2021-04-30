package com.engelox.calculadora;

public enum CalculatorFunction {
<<<<<<< HEAD
	SUM(true), SUBTRACTION(true), DIVISION(true), MULTIPLCATION(true), SIN(false), COS(false), CIRCLE(false),
	SPHERE(false);

	private boolean multipleInput;

	CalculatorFunction(boolean multipleInput) {
		this.multipleInput = multipleInput;
	}

	public boolean isMultipleInput() {
		return this.multipleInput;
	}
=======
	SUM, SUBTRACTION, DIVISION, MULTIPLCATION, SIN, COS, CIRCLE, SPHERE;
>>>>>>> develop
}
