package com.engelox.calculadora.operations;

<<<<<<< HEAD
public class Sphere extends Geometry {
	public Sphere(double radius) {
		super(radius);
	}
=======
public class Sphere implements SingleInputOperation {
>>>>>>> develop

	@Override
	public double execute(double operand) {
		return (4 * Math.PI * Math.pow(operand, 3)) / 3;
	}
}
