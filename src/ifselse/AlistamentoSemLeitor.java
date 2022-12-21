package ifselse;
import java.util.Scanner;

public class AlistamentoSemLeitor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String sexo = "F";
		int idade = 18;
		
		
		
		if( (sexo =="M" || sexo == "F")&& idade <18 ) {
			System.out.println("Alistamento não permitido");

		}else if(sexo == "M" && idade >=18) {
			System.out.println(" Alistamento obrigatório");
		}else if(sexo == "F" && idade >=18) {
			System.out.println("Alistamento opcional");
		}
		
	}

}
