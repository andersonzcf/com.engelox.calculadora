package com.engelox.calculadora;

import java.util.Scanner;

import javax.management.OperationsException;

import com.engelox.calculadora.operations.Circle;
import com.engelox.calculadora.operations.Cosine;
import com.engelox.calculadora.operations.Operation;
import com.engelox.calculadora.operations.Sin;
import com.engelox.calculadora.operations.Sphere;

public class App {
	CalculadoraHandler handler = new CalculadoraHandler();
	private Scanner input = new Scanner(System.in);
	String[] operations = { new String("exit"), new String("sum"), new String("subtraction"),
			new String("multiplication"), new String("division"), new String("sin"), new String("cos"),
			new String("area"), new String("vol") };
	
	String[] message = {"Informe o angulo: ", "Informe o raio: "};

	public void execute(int option) {
		double result = 0;
		
		switch (operations[option]) {
			case "sum":
				result = handler.process(multipleInputsReader(), operations[option]);
				break;
	
			case "subtraction":
				result = handler.process(multipleInputsReader(), operations[option]);
				break;
	
			case "multiplication":
				result = handler.process(multipleInputsReader(), operations[option]);
				break;
	
			case "division":
				result = handler.process(multipleInputsReader(), operations[option]);
				if(result == -1) {
					return;
				}
				break;
	
			case "sin":
				result = handler.process(singleInputReader(message[0]), operations[option]);
				break;
	
			case "cos":
				result = handler.process(singleInputReader(message[0]), operations[option]);
				break;
	
			case "vol":
				result = handler.process(singleInputReader(message[1]), operations[option]);
				break;
	
			case "area":
				result = handler.process(singleInputReader(message[1]), operations[option]);
				break;
			}
		
		System.out.printf("Total: %.2f\n",result);
	}

	
	private double singleInputReader(String message) {
		System.out.println(message);
		double sinAngle = Double.parseDouble(this.input.nextLine());
		return sinAngle;
	}

	private double[] multipleInputsReader() {
		try {
			int numberOfInputs;
			while (true) {
			
			System.out.println("Informe a quantidade de numeros: ");
				numberOfInputs = Integer.parseInt(this.input.nextLine());
				if (numberOfInputs > 0) {
					break;
				}
				else {
					System.err.println("Quandtidade invalida. Digite novamente");
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
			Main.main(null);
			return new double[0];
		}
	}

	public void close() {
		this.input.close();
	}
}
