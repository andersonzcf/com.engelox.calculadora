package com.engelox.calculadora.operations;

public abstract class Algebra implements Operation {

	private double operand1;
	private double operand2;

	Algebra(double operand1, double operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	public abstract double execute();

	public double getOperandOne() {
		return this.operand1;
	}

	public double getOperandTwo() {
		return this.operand2;
	}

	public void setOperandOne(double input) {
		this.operand1 = input;
	}

	public void setOperandTwo(double input) {
		this.operand2 = input;
	}
}
