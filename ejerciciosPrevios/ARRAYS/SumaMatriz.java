public class SumaMatriz {
    public static void main(String args[]){
//CREO MI MATRIZ1
        int fila = 2;
        int columna = 2;
        int matriz1[][] = new int[fila][columna];

        matriz1[0][0] = 1;
        matriz1[0][1] = 0;
        matriz1[1][0] = 0;
        matriz1[1][1] = 1;
//IMPRIME MI MATRIZ1
        for(int i = 0; i < matriz1.length; i++) {
            for(int j = 0; j < matriz1[0].length; j++) {
                System.out.print(matriz1[i][j]);
            }   
        System.out.println("");
        }     
//CREO MI MATRIZ2
//        int filaM2 = 2;
//        int columnaM2 = 2;
        int matriz2[][] = new int[fila][columna];

        matriz2[0][0] = 0;
        matriz2[0][1] = 1;
        matriz2[1][0] = 1;
        matriz2[1][1] = 0;
//IMPRIME MI MATRIZ2
        for(int i = 0; i < matriz2.length; i++) {
            for(int j = 0; j < matriz2[0].length; j++) {
                System.out.print(matriz2[i][j]);
            }   
        System.out.println("");
        }   
//    }    

//CREO SUMA DE MATRICES
//	public int[][] suma(int [][] salida) {
		for(int i = 0; i < matriz1.length; i++) {
			for(int j = 0; j < matriz1[0].length; j++) {
				int suma[][] = new int[fila][columna];
//Voy imprimiendo la suma
						suma[i][j] = matriz1[i][j] + matriz2[i][j];
                		System.out.print(suma[i][j]);
           	 }
        	System.out.println("");
       	 }		
	}	
}











