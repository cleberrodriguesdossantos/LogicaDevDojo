package ifselse;
import java.util.Scanner;

public class TorneioDeNatacaoComLeituraTeclado {

	public static void main(String[] args) {
	
		Scanner leitura = new Scanner(System.in);
		System.out.println(" Por favor informe nome:");
		String nome = leitura.next();
		
		System.out.println(" Informe sua Idade: ");
		int idade = leitura.nextInt();
		
		if (idade <= 10) {
			System.out.println(nome + " Participa da categoria Infantil");
		}else if(idade >= 11 && idade <= 15){
			System.out.println(nome + " Participa da categoria Juvenil");
		}else if(idade >= 16 && idade <= 19) {
			System.out.println(nome + " Participa da categoria Pré Adulto");
		}else {
			System.out.println(nome + " Participa da categoria Adulto ");
		}
		
	}

}
