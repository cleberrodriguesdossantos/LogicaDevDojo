package arraysMultidimensionais;

public class ExercicioArrayMultidimensional {

	public static void main(String[] args) {
		
		int [][] arrayMultidimensional = new int [3][3];
		arrayMultidimensional[0][0]= 22;
		arrayMultidimensional[0][1]= 11;
		arrayMultidimensional[0][2]= 4;
		arrayMultidimensional[1][0]= 44;
		arrayMultidimensional[1][1]= 55;
		arrayMultidimensional[1][2]= 9;
		arrayMultidimensional[2][0]= 2;
		arrayMultidimensional[2][1]= 5;
		arrayMultidimensional[2][2]= 21;
		
		int resultadoMultiDiagonal = 1;
		
		for (int i = 0; i < arrayMultidimensional.length; i++) {
			for (int j = 0; j < arrayMultidimensional[i].length; j++) {
				if (i==j) {
					resultadoMultiDiagonal= resultadoMultiDiagonal * 
							arrayMultidimensional[i][j];
				}
				
			}
		}
		System.out.println(resultadoMultiDiagonal);
	}

}
