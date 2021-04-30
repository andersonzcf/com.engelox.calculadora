package com.engelox.calculadora.operations;

<<<<<<< HEAD
public class Subtraction extends Algebra {
	public Subtraction(double operand1, double operand2) {
		super(operand1, operand2);
	}
=======
public class Subtraction implements MultipleInputOperation {
>>>>>>> develop

	@Override
	public double execute(double operand1, double operand2) {
		return operand1 - operand2;
	}
}
