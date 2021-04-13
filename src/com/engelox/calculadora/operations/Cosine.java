package com.engelox.calculadora.operations;

public class Cosine extends Trigonometry {

	public Cosine(double angle) {
		super(angle);
	}

	@Override
	public double execute() {
		return Math.cos(Math.toRadians(angle));
	}

}
