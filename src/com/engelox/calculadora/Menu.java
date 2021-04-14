package com.engelox.calculadora;

import java.util.Scanner;

// TODO: handle invalid input

public class Menu {
	private Scanner input = new Scanner(System.in);
	private App app = new App();

	public int greetings() {

		System.out.println("Bem vindo a calculadora topzera da balada.");
		System.out.println("Informe o que deseja fazer: ");
		System.out.println("1 - Soma \n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao\n5 - "
				+ "Funcao Seno\n6 - Funcao Cosseno\n7 - Calcular area de um circulo"
				+ "\n8 - Calcular o volume de uma esfera" + "\n0 - Sair");
		int option = Integer.parseInt(input.nextLine());

		return option;
	}

	public void close() {
		this.input.close();
	}

	public void execute(int option) {
		// mudar as operacoes no greeting e aqui para dividirem o mesmo local?;

		String[] operations = { new String("exit"), new String("sum"), new String("subtraction"),
				new String("multiplication"), new String("division"), new String("sin"), new String("cos"),
				new String("vol"), new String("area") };

		switch (operations[option]) {

		case "sum":
			double[] sumInput = inputReader();
			System.out.println("Total: " + this.app.sum(sumInput));
			break;

		case "subtraction":
			double[] subtractionInput = inputReader();

			System.out.println("Total: " + this.app.subtraction(subtractionInput));
			break;

		case "multiplication":

			// TODO

			break;

		case "division":

			// TODO

			break;

		case "sin":

			// TODO

			break;

		case "cos":

			// TODO

			break;

		case "vol":

			// TODO

			break;

		case "area":

			// TODO

			break;
		}

	}

	private double[] inputReader() {
		int numberOfInputs;
		System.out.println("Informe a quantidade de numeros: ");
		numberOfInputs = Integer.parseInt(this.input.nextLine());

		double[] entries = new double[numberOfInputs];

		for (int i = 0; i < numberOfInputs; i++) {
			System.out.println("Informe o " + (i + 1) + "º numero:");
			entries[i] = Double.parseDouble(this.input.nextLine());
		}
		return entries;
	}
}
