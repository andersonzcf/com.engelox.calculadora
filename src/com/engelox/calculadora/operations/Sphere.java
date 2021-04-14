package com.engelox.calculadora.operations;

public class Sphere extends Geometry {

	public Sphere(double radius) {
		super(radius);
	}

	@Override
	public double execute() {
		return (4 * Math.PI * radius * radius * radius) / 3;
	}

}
