package arraysMultidimensionais;

public class IntroducaoArraysMultidimensionais {

	public static void main(String[] args) {
		//para array multidimensional coloca dois ou mais colchetes
		int [][] arrayMultidimensional = new int [2][2];
		arrayMultidimensional[0][0]= 7;
		arrayMultidimensional[0][1]= 15;
		arrayMultidimensional[1][0]= 12;
		arrayMultidimensional[1][1]= 36;
		
		System.out.println(arrayMultidimensional[0][0]);
		System.out.println(arrayMultidimensional[0][1]);
		System.out.println(arrayMultidimensional[1][0]);
		System.out.println(arrayMultidimensional[1][1]);
	}

}
