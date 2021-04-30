package com.engelox.calculadora.operations;

<<<<<<< HEAD
public class Circle extends Geometry {
	public Circle(double radius) {
		super(radius);
	}
=======
public class Circle implements SingleInputOperation {
>>>>>>> develop

	@Override
	public double execute(double operand) {
		return Math.PI * Math.pow(operand, 2);
	}
}
