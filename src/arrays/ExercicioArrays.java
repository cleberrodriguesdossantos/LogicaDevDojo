package arrays;

import java.util.Scanner;

public class ExercicioArrays {

	public static void main(String[] args) {
	// criacao dos arrays	
int [] array1 = new int [3];
int [] array2 = new int [3];
int [] array3 = new int [3];

Scanner leitor = new Scanner(System.in);

for (int i = 0; i < array1.length; i++) {
	System.out.println(" vetor 1, posição " + i + ": ");
	array1[i] = leitor.nextInt();
}
for (int i = 0; i < array2.length; i++) {
	System.out.println(" vetor 2, posição " + i + ": ");
	array2[i] = leitor.nextInt();
}
for (int i = 0; i < array3.length; i++) {
	array3[i] = array1[i] * array2[i];
	System.out.print(array3[i]+ " ");
}
	}

}
