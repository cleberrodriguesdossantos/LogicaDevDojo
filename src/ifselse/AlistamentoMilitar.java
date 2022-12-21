package ifselse;

//erro: esta aceitando numeros em vez de letras
//erro: esta aceitando letras em vez de numeros

import java.util.Scanner;

public class AlistamentoMilitar {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("informe sexo:");
		String sexo = leitor.next();
		
		System.out.println("informe idade:");
		int idade = leitor.nextInt(); 
		
		if( (sexo.equalsIgnoreCase("M") && idade <18)) {
			System.out.println("Alistamento não permitido");

		}else if(sexo.equalsIgnoreCase("M") && idade >=18) {
			System.out.println(" Alistamento obrigatório");
			
		}else if(sexo.equalsIgnoreCase("F") && idade >=18) {
			System.out.println("Alistamento opcional");
		}else {
			System.out.println("Para o sexo feminino menor que 18, não permitido.");
		}
		
	}
}

