package com.engelox.calculadora;

import java.util.Scanner;

public class Menu {
	public int greetings() {
		
		Scanner opcaoInput = new Scanner(System.in);
		System.out.println("Bem vindo a calculadora topzera da balada.");
		System.out.println("Informe o que deseja fazer: ");
		System.out.println("1 - Soma \n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao\n5 - "
				+ "Funcao Seno\n6 - Funcao Cosseno\n7 - Calcular area de um circulo"
				+ "\n8 - Calcular o volume de uma esfera"
				+ "\n0 - Sair");
		int option = opcaoInput.nextInt();
		opcaoInput.close();
		return option;
	}
}