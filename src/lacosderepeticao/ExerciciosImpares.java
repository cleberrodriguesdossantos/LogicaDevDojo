package lacosderepeticao;

import java.util.Scanner;

public class ExerciciosImpares {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println(" Informe o valor desejado: ");
		int valor = leitor.nextInt();
		int inicial = 0;
		
		while(inicial <= valor) {
			if (inicial % 2 != 0) {
				System.out.println(" numero impar é: " + inicial);
				
			}
			// o inicial = inicial + 1 tem que ser fora da primeira chave.
			inicial = inicial + 1;
		}
	}

}
