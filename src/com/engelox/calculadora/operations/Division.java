package com.engelox.calculadora.operations;

<<<<<<< HEAD
public class Division extends Algebra {
	public Division(double operand1, double operand2) {
		super(operand1, operand2);
	}

	@Override
	public double execute() {
		if (operand2 != 0) {
			return operand1 / operand2;
=======
public class Division implements MultipleInputOperation {

	@Override
	public double execute(double operand1, double operand2) {
		if (operand2 == 0) {
			System.err.println("Divisao por zero!");
			return -1;
>>>>>>> develop
		}
		return operand1 / operand2;
	}
}
