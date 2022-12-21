package ifselse;

import java.util.Scanner;

public class TorneioDeNatacao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println(" Informe seu nome: ");
		String nome = leitor.next();
		System.out.println(" Informe a idade: ");
		int idade = leitor.nextInt();
		
		if (idade <= 10) {
			System.out.println( nome + " Participará da categoria Infantil ");
		} else if ( idade >= 11 && idade <= 15){
			System.out.println( nome + " Parcicipará da categoria Juvenil ");
			}else if (idade >= 16 && idade <=19) {
				System.out.println( nome + " Parcicipará da categoria Pré Adulto ");
			}else {
				System.out.println( nome + " Parcicipará da categoria Adulto ");
			}
	}

}
