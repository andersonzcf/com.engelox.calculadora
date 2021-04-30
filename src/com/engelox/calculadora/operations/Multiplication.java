package com.engelox.calculadora.operations;

<<<<<<< HEAD
public class Multiplication extends Algebra {
	public Multiplication(double operand1, double operand2) {
		super(operand1, operand2);
	}
=======
public class Multiplication implements MultipleInputOperation {
>>>>>>> develop

	@Override
	public double execute(double operand1, double operand2) {
		return operand1 * operand2;
	}
}
