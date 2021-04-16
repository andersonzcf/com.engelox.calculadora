package com.engelox.calculadora;

import java.util.Scanner;

public class Menu {
	private Scanner input = new Scanner(System.in);

	public int getOperation() {

		System.out.println("Bem vindo a calculadora topzera da balada.");
		System.out.println("Informe o que deseja fazer: ");
		System.out.println("1 - Soma \n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao\n5 - "
				+ "Funcao Seno\n6 - Funcao Cosseno\n7 - Calcular area de um circulo"
				+ "\n8 - Calcular o volume de uma esfera" + "\n0 - Sair");
		try {
			int option = Integer.parseInt(input.nextLine());

			return option;
		} catch (Exception e) {
			System.err.println("Operacao invalida");
			return -1;
		}

	}

	public void close() {
		this.input.close();
	}

}
