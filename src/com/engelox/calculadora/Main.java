package com.engelox.calculadora;
import java.util.Scanner;

import com.engelox.calculadora.operations.Sum; 

import com.engelox.calculadora.operations.Sphere;

public class Main {
	
	public static void main(String[] args) {

		Scanner numInput = new Scanner(System.in);
		int opcao = 0;
		Menu menu = new Menu();
		
		do {
			opcao = menu.greetings();
			
			
			switch(opcao) {	
			
			case 1: // somar
				// Extrair para metodo generateInputArray
				int numberOfSums;
				System.out.println("Informe a quantidade de numeros que deseja somar: ");
				numberOfSums = Integer.parseInt(numInput.nextLine());
				
				double[] sumEntries = new double[numberOfSums];
				
				for (int i = 0; i < numberOfSums; i++) {
					System.out.println("Informe o " + (i + 1) + "º numero:");
					sumEntries[i] = Double.parseDouble(numInput.nextLine());
				}
				

				Calculate.calculate(new Sum(1.0, 2.0));

				//System.out.println(Calculadora.somaArray(entries))


				break;
				
			case 2: // subtrair
				// Extrair para metodo generateInputArray
				int numberOfSubtractions;
				System.out.println("Informe a quantidade de numeros que deseja subtrair: ");
				numberOfSubtractions = Integer.parseInt(numInput.nextLine());
				
				double[] subtractionEntries = new double[numberOfSubtractions];
				
				for (int i = 0; i < numberOfSubtractions; i++) {
					System.out.println("Informe o " + (i + 1) + "º numero:");
					subtractionEntries[i] = Double.parseDouble(numInput.nextLine());
				}
				
				// System.out.println(Calculadora.subtraiArray(entries)) 				
				break;
						
				
			}
			
			
		} while(opcao != 0);
		
		
		numInput.close();
		
	}
}
