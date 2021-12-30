public class Matrices {
	public static void main(String args[]){
		int fila = 2;
		int columna = 2;
		int matriz[][] = new int[fila][columna];

		matriz[0][0] = 1;
		matriz[0][1] = 0;
		matriz[1][0] = 0;
		matriz[1][1] = 1;

		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
			}
		System.out.println("");
		}
	}
}
