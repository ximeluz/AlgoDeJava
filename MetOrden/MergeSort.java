public class MergeSort {
	
	private static int[] mezcla(int [] izq, int [] der) {
		int [] union = new int [izq.length + der.length];
		int i = 0, j = 0, k = 0; //apuntadores

		while(i < izq.length && j < der.length) {
			if (izq[i] < der[j]) {
				union[k] = izq[i];
				k++;
				i++;
			} else {
				union[k] = der[j];
				k++;
				j++;
			}
		}

		while(i < izq.length) {
			union[k] = izq[i];
			k++;
			i++;
		}

		while(j < der.length) {
			union[k] = der[j];
			k++;
			j++;
		}
		return union;
	}
	public static int[] mergesort(int [] array) {
		int tam = array.length;
	//caso base si el arreglo tiene un elemento o ninguno.
		if (tam < 2) {
			return array;
		}	
	
		int mitad = tam/2;
	
		int [] izq = new int[mitad];
		int [] der = new int[tam - mitad];

		for(int i = 0; i < mitad; i++) {
			izq[i] = array[i];
		}
		int k = 0;
		for (int j = mitad; j < tam; j++) {
			der[k] = array[j];
			k++;
		}
		izq = mergesort(izq);
		der = mergesort(der);
	
		return mezcla(izq, der);
    }	
	public static void main(String[] args) {
		int [] miArreglo = {6, 5, 3, 1, 8, 7, 2, 4};

			System.out.println("\nArreglo desordenado:");

			for(int i = 0; i < miArreglo.length; i++) {
				System.out.print(miArreglo[i] + " ");
			}	

		//mergesort(miArreglo);
			miArreglo = mergesort(miArreglo);

			System.out.println("\n\nArreglo ordenado:");

			for(int i = 0; i < miArreglo.length; i++) {
				System.out.print(miArreglo[i] + " ");
			}	
	}
}

