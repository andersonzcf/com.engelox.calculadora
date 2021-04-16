package com.engelox.calculadora;

import java.util.Scanner;

import javax.management.OperationsException;
import javax.net.ssl.HandshakeCompletedListener;

import com.engelox.calculadora.operations.Circle;
import com.engelox.calculadora.operations.Cosine;
import com.engelox.calculadora.operations.Operation;
import com.engelox.calculadora.operations.Sin;
import com.engelox.calculadora.operations.Sphere;

public class App {
	CalculadoraHandler handler = new CalculadoraHandler();
	private Scanner input = new Scanner(System.in);
	CalculadoraFunction[] functions = {
			CalculadoraFunction.SUM, CalculadoraFunction.SUBTRACTION,
			CalculadoraFunction.MULTIPLCATION, CalculadoraFunction.DIVISION,
			CalculadoraFunction.SIN, CalculadoraFunction.COS,
			CalculadoraFunction.CIRCLE, CalculadoraFunction.SPHERE 
			
	};
	
	

	public void execute(int option) {
		double RESULT;
		CalculadoraFunction function = this.functions[option -1];
		
		if(function.isMultipleInput()) {
			double[] input = multipleInputsReader();
			RESULT = handler.process(input, function);
		} else {
			double input = function == CalculadoraFunction.SIN || function == CalculadoraFunction.COS ? 
					singleInputReader(0) : singleInputReader(1);
			RESULT = handler.process(input, function);
		}
		
		System.out.printf("Total: %.2f\n",RESULT);
	}

	
	private double singleInputReader(int messageOption) {
		String[] message = {"Informe o angulo: ", "Informe o raio: "};
		System.out.println(message[messageOption]);
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
