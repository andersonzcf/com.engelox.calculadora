package com.engelox.calculadora.operations;

public abstract class Trigonometry implements Operation{
	protected double angle;
	
	public Trigonometry(double angle) {
		this.angle = angle;
	}
	
	public abstract double execute();
}
