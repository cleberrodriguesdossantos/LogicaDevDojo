package ifselse;
import java.util.Scanner;

public class CadastroDeLogin {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	System.out.println(" Por favor infome o Login: ");
		String login = leitor.next();
		
	//isBlank quando é branco(quando se tem espaços por exemplo)
	//isEmpty quando é vazio (quando é somente aspas duplas).
		
		if(login.equalsIgnoreCase("admin") || login.equalsIgnoreCase("administrador")){
			System.out.println("test");
			
	}else if (login.isBlank()|| login.isEmpty()){
		System.out.println( " vazio ou em branco");
		
	}else {
		System.out.println(" outros nomes não permitido ");
	}

	
	}

}
