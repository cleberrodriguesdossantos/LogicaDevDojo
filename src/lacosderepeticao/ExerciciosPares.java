package lacosderepeticao;

import java.util.Scanner;

public class ExerciciosPares {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println(" Por favor informe numero desejado : ");
		int numero = leitor.nextInt();
		int contador = 0;
		
		while ( contador <= numero) {
			if (contador % 2 == 0) {
				
				System.out.println(" O numero Par é " + contador );
			}
			contador = contador +1;
		}

	}

}
