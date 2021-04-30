package com.engelox.calculadora.operations;

<<<<<<< HEAD
public class Sin extends Trigonometry {
	public Sin(double angle) {
		super(angle);
	}
=======
public class Sin implements SingleInputOperation {
>>>>>>> develop

	@Override
	public double execute(double operand) {
		return Math.sin(Math.toRadians(operand));
	}
<<<<<<< HEAD
=======

>>>>>>> develop
}
