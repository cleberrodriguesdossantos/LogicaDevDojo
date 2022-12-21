package arrays;

import java.util.Scanner;

public class IntroducaoArrays {

	public static void main(String[] args) {
		/*inicia a posicao informando quantidade de espaco*/
		double[] notas = new double [4];
		Scanner leitor = new Scanner(System.in);
		//para pegar o tamanho do array por completo utilizar .length
		
		for(int i = 0; i < notas.length; i++) {
		System.out.println("Digite a nota " +(i+1));
		notas[i]= leitor.nextDouble();
	   }
		double media = 0;
		for(int i = 0; i < notas.length; i++) {
			media = media + notas[i];
			System.out.println("nota "+ (i + 1) + ": "+notas[i]);
		}
		media = media / notas.length;
		System.out.println("Media das notas é :" +media);
	}

}
