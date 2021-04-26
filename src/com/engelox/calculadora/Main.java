package com.engelox.calculadora;

public class Main {

	public static void main(String[] args) {

		int option = 0;
		Menu menu = new Menu();
		App app = new App();

		do {
			option = menu.getOperation();
			if (option >= 0) {
				app.execute(option);
			}

		} while (option != 0);

		menu.close();
		app.close();
	}
}
