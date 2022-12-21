package ifselse;
/*Dado um determinado salario
 * se o salario for maior que 4500 imprima 30% do valor
 * senão imprima 15% do valor
 * Desafio: Utilize apenas uma variavel para guardar o resultado e imprimir no final
 * Desafio2: diga se o resultado é 30% ou 15%
 */
public class CalculadoraImpostoComCondicional {

	public static void main(String[] args) {
		float salario = 4700.50F;
		float resultado = 0f;
		String porcento = "";
		
		if (salario > 4500.00) {
			resultado  = salario * 0.30F;
			
			porcento = "30%";
		}else {
			resultado = salario * 0.15F;
			porcento = "15%";
					
		}
		System.out.println(" O valor em porcentagem de "+ porcento+ " é de:" + resultado );

	}

}
