package com.engelox.calculadora;

import com.engelox.calculadora.operations.Subtraction;
import com.engelox.calculadora.operations.Sum;

public class App {
	public double sum(double[] data) {

		double output = 0.0;
		for (int i = 0; i < data.length; i++) {

			output = Calculadora.calcular(new Sum(output, data[i]));
		}

		return output;
	}

	public double subtraction(double[] data) {
		double output = 0.0;
		for (int i = 0; i < data.length; i++) {
			output = Calculadora.calcular(new Subtraction(output, data[i]));
		}
		return output;
	}
}
