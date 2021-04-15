package com.engelox.calculadora;

import java.util.Scanner;

import com.engelox.calculadora.operations.Circle;
import com.engelox.calculadora.operations.Cosine;
import com.engelox.calculadora.operations.Sin;
import com.engelox.calculadora.operations.Sphere;

public class App {
	private MultipleInputsHandler handler = new MultipleInputsHandler();
	private Scanner input = new Scanner(System.in);

	public void execute(int option) {

		String[] operations = { new String("exit"), new String("sum"), new String("subtraction"),
				new String("multiplication"), new String("division"), new String("sin"), new String("cos"),
				new String("area"), new String("vol") };

		switch (operations[option]) {

		case "sum":
			double[] sumInput = multipleInputsReader();
			System.out.println("Total: " + this.handler.sum(sumInput));
			break;

		case "subtraction":
			double[] subtractionInput = multipleInputsReader();
			System.out.println("Total: " + this.handler.subtraction(subtractionInput));
			break;

		case "multiplication":

			double[] multiplicationInput = multipleInputsReader();
			System.out.println("Total: " + this.handler.multiplication(multiplicationInput));
			break;

		case "division":

			double[] divisionInput = multipleInputsReader();
			System.out.println("Total: " + this.handler.division(divisionInput));
			break;

		case "sin":
			System.out.println("Informe o angulo: ");
			double sinAngle = Double.parseDouble(this.input.nextLine());
			System.out.println("Total: " + Calculadora.calcular(new Sin(sinAngle)));
			break;

		case "cos":
			System.out.println("Informe o angulo: ");
			double cosAngle = Double.parseDouble(this.input.nextLine());
			System.out.println("Total: " + Calculadora.calcular(new Cosine(cosAngle)));
			break;

		case "vol":
			System.out.println("Informe o raio: ");
			double vol = Double.parseDouble(this.input.nextLine());
			System.out.println("Total: " + Calculadora.calcular(new Sphere(vol)));
			break;

		case "area":
			System.out.println("Informe o raio: ");
			double area = Double.parseDouble(this.input.nextLine());
			System.out.println("Total: " + Calculadora.calcular(new Circle(area)));
			break;
		}
	}

	private double[] multipleInputsReader() {
		try {

			int numberOfInputs;
			System.out.println("Informe a quantidade de numeros: ");
			numberOfInputs = Integer.parseInt(this.input.nextLine());

			double[] entries = new double[numberOfInputs];

			for (int i = 0; i < numberOfInputs; i++) {
				System.out.println("Informe o " + (i + 1) + "º numero:");
				entries[i] = Double.parseDouble(this.input.nextLine());
			}
			return entries;
		} catch (NumberFormatException e) {
			System.out.println("Por favor, use apenas numeros!");
			Main.main(null);
			return new double[0];
		}
	}

	public void close() {
		this.input.close();
	}
}
