package com.engelox.calculadora.operations;

<<<<<<< HEAD
public class Sum extends Algebra {
	public Sum(double operand1, double operand2) {
		super(operand1, operand2);
	}

	public double execute() {
=======
public class Sum implements MultipleInputOperation {

	@Override
	public double execute(double operand1, double operand2) {
>>>>>>> develop
		return operand1 + operand2;
	}
}
