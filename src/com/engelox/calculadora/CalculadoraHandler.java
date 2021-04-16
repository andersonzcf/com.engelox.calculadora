package com.engelox.calculadora;

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
	
	public double process(double value, CalculadoraFunction function) {
		operationHandler(value, function);
		return Calculadora.calcular(this.operation);
		
	}
	
	public double process(double[]values, CalculadoraFunction function) {
		return arrayHandler(values, function);		
	}

	private void operationHandler(double value, CalculadoraFunction function) {		
		switch (function) {
		case SIN:
			this.operation = new Sin(value);
			break;

		case COS:
			this.operation = new Cosine(value);
			break;

		case SPHERE:
			this.operation = new Sphere(value);
			break;

		case CIRCLE:
			this.operation = new Circle(value);
			break;
		}
		
	}	
	
	
	private void operationHandler(double value1, double value2, CalculadoraFunction function) {
		switch (function) {

		case SUM:
			this.operation = new Sum(value1, value2);
			break;

		case SUBTRACTION:
			this.operation = new Subtraction(value1, value2);
			break;

		case MULTIPLCATION:
			this.operation = new Multiplication(value1, value2);
			break;

		case DIVISION:
			this.operation = new Division(value1, value2);
			break;
		}
	}
	
	private double arrayHandler(double[] data, CalculadoraFunction function) {
		double output = data[0];
		for (int i = 1; i < data.length; i++) {
			operationHandler(output, data[i], function);
			output = Calculadora.calcular(this.operation);
		}

		return output;
	}

}
