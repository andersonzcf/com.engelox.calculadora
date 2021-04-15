package com.engelox.calculadora;

import com.engelox.calculadora.operations.Algebra;
import com.engelox.calculadora.operations.Division;
import com.engelox.calculadora.operations.Multiplication;
import com.engelox.calculadora.operations.Subtraction;
import com.engelox.calculadora.operations.Sum;

public class MultipleInputsHandler {
	public double sum(double[] data) {
		Algebra operation = new Sum(0, 0);
		return arrayHandler(data, operation);
	}

	public double subtraction(double[] data) {
		Algebra operation = new Subtraction(0, 0);
		return arrayHandler(data, operation);
	}

	public double multiplication(double[] data) {
		Algebra operation = new Multiplication(0, 0);
		return arrayHandler(data, operation);
	}

	public double division(double[] data) {
		Algebra operation = new Division(0, 0);
		return arrayHandler(data, operation);
	}

	private double arrayHandler(double[] data, Algebra operation) {
		double output = data[0];
		for (int i = 1; i < data.length; i++) {
			operation.setOperandOne(output);
			operation.setOperandTwo(data[i]);
			output = Calculadora.calcular(operation);
		}

		return output;
	}

}
