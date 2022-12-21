package switchcase;
import java.util.Scanner;

public class DiasDaSemanaCondicionais {
	
/*Aula 24 0 instrutor fez com if else, eu porem fiz com switch case.
 * Na aula 26 ele arrumou modificando para switch case*/
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println(" por favor informe um numero inteiro de 1 a 7 : ");
		int numero = leitor.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println(" Domingo ");
			break;
		case 2:
			System.out.println(" Segunda feira ");
			break;
		case 3:
			System.out.println(" terça feira ");
			break;
		case 4:
			System.out.println(" Quarta feira ");
			break;
		case 5:
			System.out.println(" Quinta feira ");
			break;
		case 6:
			System.out.println(" Sexta feira ");
			break;
		case 7:
			System.out.println(" Sabado ");
			break;
			default:
			System.out.println("Valor incorreto, por favor somente de 1 a 7.");
		}
		
	}

}
