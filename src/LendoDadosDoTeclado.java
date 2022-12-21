import java.util.Scanner;// sempre importar para o funcionamento do Scanner

public class LendoDadosDoTeclado {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);//Scanner faz a leitura do teclado
		
		System.out.println(" Por favor, informe o nome: ");
		String nome = leitura.next();
		
		System.out.println(" Informe a idade: ");
		int idade = leitura.nextInt();
		
		System.out.println(" Seu nome é " + nome + " e sua idade é de " + idade);

	}

}
