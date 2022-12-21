package switchcase;

import java.util.Scanner;

public class TipoDeConta {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	System.out.println(" Por favor, informe o tipo de conta:");
	System.out.println(" Conta poupança digite 1 ");
	System.out.println(" Conta corrente digite 2 ");
	System.out.println(" conta investimento digite 3 ");
	
	int tipoConta = leitor.nextInt();
	
	switch(tipoConta) {
	case 1:
		System.out.println(" O juros para conta Poupança é de : 0.05% ");
		break;
	case 2:
		System.out.println(" O juros para conta Corrente é de : 0.02% ");
		break;
	case 3:
		System.out.println(" O juros para conta Investimento é de : 0.1% ");
		break;
	default :
		System.out.println(" Alternativa invalida, por favor verefique as opções. ");
	}

	}

}
