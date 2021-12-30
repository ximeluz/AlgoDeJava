public class PruebaMatriz {
	public static void main(String[] args) {
		//Matriz matriz;
		double[][] nueva = new double[3][2];
		double[][] otra = new double[2][2];
		Matriz matriz = new Matriz(nueva);
		Matriz matriz2 = new Matriz(otra);
		
		System.out.println();
//imprimir las matrices
		System.out.println(matriz);
		System.out.println();
		System.out.println(matriz2);
		
		System.out.println("Las matrices son iguales es " + matriz.equals(matriz2));
		
		System.out.println();
	}
}
