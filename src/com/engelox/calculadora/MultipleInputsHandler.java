package com.engelox.calculadora;

import com.engelox.calculadora.operations.Division;
import com.engelox.calculadora.operations.Multiplication;
import com.engelox.calculadora.operations.Subtraction;
import com.engelox.calculadora.operations.Sum;

public class MultipleInputsHandler {
	public double sum(double[] data) {

		double output = 0.0;
		for (int i = 0; i < data.length; i++) {

			output = Calculadora.calcular(new Sum(output, data[i]));
		}
		return output;

//		return arrayHandler(data, new Sum());
	}

	public double subtraction(double[] data) {
		double output = data[0];
		for (int i = 1; i < data.length; i++) {
			output = Calculadora.calcular(new Subtraction(output, data[i]));
		}
		return output;
	}

	public double multiplication(double[] data) {
		double output = data[0];
		for (int i = 1; i < data.length; i++) {
			output = Calculadora.calcular(new Multiplication(output, data[i]));
		}

		return output;
	}

	public double division(double[] data) {
		double output = data[0];
		for (int i = 1; i < data.length; i++) {
			output = Calculadora.calcular(new Division(output, data[i]));
		}
		return output;
	}

//	private double arrayHandler(double[] data, Algebra operation) {
//		double output = 0.0;
//		for (int i = 0; i < data.length; i++) {
//
//			output = Calculadora.calcular(operation(output, data[i]));
//		}
//
//		return output;
//	}

}
