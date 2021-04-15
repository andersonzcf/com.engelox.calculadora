package com.engelox.calculadora;

public class Main {

	public static void main(String[] args) {

		int opcao = 0;
		Menu menu = new Menu();
		App app = new App();

		do {
			opcao = menu.getOperation();
			app.execute(opcao);

		} while (opcao != 0);

		menu.close();
		app.close();
	}
}
