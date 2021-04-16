package com.engelox.calculadora;

import java.util.Scanner;

import com.engelox.calculadora.operations.Algebra;
import com.engelox.calculadora.operations.Circle;
import com.engelox.calculadora.operations.Cosine;
import com.engelox.calculadora.operations.Division;
import com.engelox.calculadora.operations.Multiplication;
import com.engelox.calculadora.operations.Operation;
import com.engelox.calculadora.operations.Sin;
import com.engelox.calculadora.operations.Sphere;
import com.engelox.calculadora.operations.Subtraction;
import com.engelox.calculadora.operations.Sum;

public class CalculadoraHandler {
	Operation operation;

	private double arrayHandler(double[] data, String operation) {
		double output = data[0];
		for (int i = 1; i < data.length; i++) {
			operationHandler(operation, output, data[i]);
			output = Calculadora.calcular(this.operation);
		}

		return output;
	}
	
	public double process(double value, String operation) {
		operationHandler(operation, value);
		return Calculadora.calcular(this.operation);
		
	}
	
	public double process(double[]values, String operation) {
		return arrayHandler(values, operation);		
	}

	private void operationHandler(String operation, double value) {		
		switch (operation) {
		case "sin":
			this.operation = new Sin(value);
			break;

		case "cos":
			this.operation = new Cosine(value);
			break;

		case "vol":
			this.operation = new Sphere(value);
			break;

		case "area":
			this.operation = new Circle(value);
			break;
		}
		
	}	
	
	
	private void operationHandler(String operation, double value1, double value2) {
		switch (operation) {

		case "sum":
			this.operation = new Sum(value1, value2);
			break;

		case "subtraction":
			this.operation = new Subtraction(value1, value2);
			break;

		case "multiplication":
			this.operation = new Multiplication(value1, value2);
			break;

		case "division":
			this.operation = new Division(value1, value2);
			break;
		}
	}

}
