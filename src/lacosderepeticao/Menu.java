package lacosderepeticao;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int menu = 0;
		
		while ( menu != 3) {
			System.out.println(" MENU: ");
			System.out.println(" 1. Calcular Imposto ");
			System.out.println(" 2. Depositar Salario ");
			System.out.println(" 3. Sair ");
			System.out.println(" Digite a opção desejada ");
			menu = leitor.nextInt();
		}if (menu == 3) {
			System.out.println(" Obrigado e volte sempre ! ");
		}

	}

}
