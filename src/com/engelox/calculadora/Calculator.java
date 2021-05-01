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

public class Calculator {
	private Operation operation;

	public Calculator(CalculatorFunction function) {
		operationHandler(function);
	}

	public double calculate(double operand) {
		return operation.execute(operand);
	}

	public double calculate(double operand1, double operand2) {
		return operation.execute(operand1, operand2);
	}

	private void operationHandler(CalculatorFunction function) {
		switch (function) {
		case SIN:
			this.operation = new Sin();
			break;
		case COS:
			this.operation = new Cosine();
			break;
		case SPHERE:
			this.operation = new Sphere();
			break;
		case CIRCLE:
			this.operation = new Circle();
			break;
		case SUM:
			this.operation = new Sum();
			break;
		case SUBTRACTION:
			this.operation = new Subtraction();
			break;
		case MULTIPLCATION:
			this.operation = new Multiplication();
			break;
		case DIVISION:
			this.operation = new Division();
			break;
		}
	}

	public Operation getOperation() {
		return operation;
	}
}
