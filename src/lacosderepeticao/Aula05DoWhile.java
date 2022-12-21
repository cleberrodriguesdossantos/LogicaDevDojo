package lacosderepeticao;
//colocar regra que aceite somente numeros
import java.util.Scanner;

public class Aula05DoWhile {

	public static void main(String[] args) {
		int desejaContinuar = 1;
		Scanner leitor = new Scanner(System.in);
		
		do {
			System.out.println(" PLAYER 1: Digite um numero de 1 a 10 ");
			int num1 = leitor.nextInt();
			System.out.println(" PLAYER 2: Digite um numero de 1 a 10 ");
			int num2 = leitor.nextInt();
			if(num1 == num2) {
			System.out.println(" Acertou  ");
			}else {
				System.out.println(" Errou !!");
			}
			System.out.println("||---------||---------||---------||---------|| ");
			System.out.println(" Deseja continuar jogando ? ");
			System.out.println(" 1.Sim, to acertando mesmo ! ");
			System.out.println(" 2.Não, Cansei disso ! ");
			desejaContinuar = leitor.nextInt();
			}while (desejaContinuar == 1);
				
			

	}

}
