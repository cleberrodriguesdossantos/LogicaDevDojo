package arrays;

import java.util.Scanner;

public class ExercicioArraysMelhorado {

	public static void main(String[] args) {
		// criacao dos arrays	
		int [] array1 = new int [3];
		int [] array2 = new int [3];
		int [] array3 = new int [3];

		Scanner leitor = new Scanner(System.in);
		String multiplicacaoArrays = "";
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println(" vetor 1, posição " + i + ": ");
			array1[i] = leitor.nextInt();
			System.out.println(" vetor 2, posição " + i + ": ");
			array2[i] = leitor.nextInt();
			array3[i] = array1[i] * array2[i];
			multiplicacaoArrays = multiplicacaoArrays + array3[i]+ " ";
			
		}
			System.out.println(multiplicacaoArrays);
			}

		}


	
