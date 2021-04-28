package com.engelox.calculadora.operations;

public class Circle extends Geometry {
	public Circle(double radius) {
		super(radius);
	}

	@Override
	public double execute() {
		return Math.PI * radius * radius;
	}
}
