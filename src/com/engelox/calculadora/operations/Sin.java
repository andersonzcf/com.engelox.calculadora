package com.engelox.calculadora.operations;

public class Sin extends Trigonometry {

	public Sin(double angle) {
		super(angle);
	}

	@Override
	public double execute() {
		return Math.sin(Math.toRadians(angle));
	}
	
}
