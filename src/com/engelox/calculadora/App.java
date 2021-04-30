package com.engelox.calculadora;

import java.util.Scanner;

import com.engelox.calculadora.operations.SingleInputOperation;

public class App {
<<<<<<< HEAD
	CalculatorHandler handler = new CalculatorHandler();
	private Scanner input = new Scanner(System.in);
=======
	private Scanner scan = new Scanner(System.in);
>>>>>>> develop
	CalculatorFunction[] functions = { CalculatorFunction.SUM, CalculatorFunction.SUBTRACTION,
			CalculatorFunction.MULTIPLCATION, CalculatorFunction.DIVISION, CalculatorFunction.SIN,
			CalculatorFunction.COS, CalculatorFunction.CIRCLE, CalculatorFunction.SPHERE };

	public void execute(int option) {
		final double RESULT;
		CalculatorFunction function = this.functions[option - 1];

<<<<<<< HEAD
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
=======
		Calculator calculator = new Calculator(function);

		if (calculator instanceof SingleInputOperation) {
			double input = singleInputReader();
			RESULT = calculator.calculate(input);
		} else {
			double[] input = multipleInputsReader();
			RESULT = arrayHandler(input, calculator);
		}

		System.out.printf("Total: %.2f%n", RESULT);
	}

	private double singleInputReader() {
		System.out.println("Informe o numero: ");
		return Double.parseDouble(scan.nextLine());
>>>>>>> develop
	}

	private double[] multipleInputsReader() {
		try {
			int numberOfInputs;
			while (true) {
				System.out.println("Informe a quantidade de numeros: ");
<<<<<<< HEAD
				numberOfInputs = Integer.parseInt(this.input.nextLine());
				if (numberOfInputs > 0) {
					break;
				} else {
					System.err.println("Quantidade invalida. Digite novamente");
=======
				numberOfInputs = Integer.parseInt(scan.nextLine());
				if (numberOfInputs > 0) {
					break;
				} else {
					System.err.println("Quandtidade invalida. Digite novamente");
>>>>>>> develop
				}
			}
			double[] entries = new double[numberOfInputs];

			for (int i = 0; i < numberOfInputs; i++) {
<<<<<<< HEAD
				System.out.println("Informe o " + (i + 1) + "º numero:");
				entries[i] = Double.parseDouble(this.input.nextLine());
=======
				System.out.println("Informe o " + (i + 1) + "ï¿½ numero:");
				entries[i] = Double.parseDouble(scan.nextLine());
>>>>>>> develop
			}
			return entries;
		} catch (NumberFormatException e) {
			System.out.println("Por favor, use apenas numeros!");
			Main.main(new String[0]);
			return new double[0];
		}
	}

	private double arrayHandler(double[] data, Calculator calculator) {
		double output = data[0];
		for (int i = 1; i < data.length; i++) {
			output = calculator.calculate(output, data[i]);
		}

		return output;
	}

	public void close() {
<<<<<<< HEAD
		this.input.close();
=======
		scan.close();
>>>>>>> develop
		System.out.println("Calculadora finalizada com sucesso.");
	}
}
