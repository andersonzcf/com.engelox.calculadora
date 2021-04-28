package com.engelox.calculadora;

public class Main {

	public static void main(String[] args) {

		Menu menu = new Menu();
		App app = new App();

		try {
			int option = 0;

			do {
				option = menu.getOperation();
				if (option >= 0) {
					app.execute(option);
				}

			} while (option != 0);

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {

			menu.close();
			app.close();
		}
	}
}
