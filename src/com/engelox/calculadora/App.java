package com.engelox.calculadora;

import java.util.Scanner;

public class App {
	CalculatorHandler handler = new CalculatorHandler();
	private Scanner input = new Scanner(System.in);
	CalculatorFunction[] functions = { CalculatorFunction.SUM, CalculatorFunction.SUBTRACTION,
			CalculatorFunction.MULTIPLCATION, CalculatorFunction.DIVISION, CalculatorFunction.SIN,
			CalculatorFunction.COS, CalculatorFunction.CIRCLE, CalculatorFunction.SPHERE };

	public void execute(int option) {
		final double RESULT;
		CalculatorFunction function = this.functions[option - 1];

		if (function.isMultipleInput()) {
			double[] input = multipleInputsReader();
			RESULT = handler.process(input, function);
		} else {
			double input = function == CalculatorFunction.SIN || function == CalculatorFunction.COS
					? singleInputReader(0)
					: singleInputReader(1);
			RESULT = handler.process(input, function);
		}

		System.out.printf("Total: %.2f\n", RESULT);
	}

	private double singleInputReader(int messageOption) {
		String[] message = { "Informe o angulo: ", "Informe o raio: " };
		System.out.println(message[messageOption]);
		double angle = Double.parseDouble(this.input.nextLine());
		return angle;
	}

	private double[] multipleInputsReader() {
		try {
			int numberOfInputs;
			while (true) {
				System.out.println("Informe a quantidade de numeros: ");
				numberOfInputs = Integer.parseInt(this.input.nextLine());
				if (numberOfInputs > 0) {
					break;
				} else {
					System.err.println("Quantidade invalida. Digite novamente");
				}
			}
			double[] entries = new double[numberOfInputs];

			for (int i = 0; i < numberOfInputs; i++) {
				System.out.println("Informe o " + (i + 1) + "º numero:");
				entries[i] = Double.parseDouble(this.input.nextLine());
			}
			return entries;
		} catch (NumberFormatException e) {
			System.out.println("Por favor, use apenas numeros!");
			Main.main(new String[0]);
			return new double[0];
		}
	}

	public void close() {
		this.input.close();
		System.out.println("Calculadora finalizada com sucesso.");
	}
}
