package com.engelox.calculadora.operations;

<<<<<<< HEAD
public class Cosine extends Trigonometry {
	public Cosine(double angle) {
		super(angle);
	}
=======
public class Cosine implements SingleInputOperation {
>>>>>>> develop

	@Override
	public double execute(double operand) {
		return Math.cos(Math.toRadians(operand));
	}
}
