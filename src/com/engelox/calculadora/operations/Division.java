package com.engelox.calculadora.operations;

public class Division extends Algebra {

	public Division(double operand1, double operand2) {
		super(operand1, operand2);
	}

	@Override
	public double execute() {
		if (this.getOperandOne() != 0) {
			return this.getOperandOne() / this.getOperandTwo();
		}
		return 0;
	}

}
