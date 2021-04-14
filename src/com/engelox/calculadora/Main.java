package com.engelox.calculadora;

public class Main {

	public static void main(String[] args) {

		int opcao = 0;
		Menu menu = new Menu();

		do {
			opcao = menu.greetings();
			menu.execute(opcao);

		} while (opcao != 0);

		menu.close();

	}
}
