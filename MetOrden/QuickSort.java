public class QuickSort {
	public static void intercambia(int [] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	private static void quicksort(int [] array, int ini, int fin) {
		//caso base
		if((fin - ini) < 1)
			return;

		int p = ini;
		int i = ini + 1;
		int j = fin;

		while(i < j) {
			if(array[i] > array[p] && array[j] <= array[p]) {
				intercambia(array, i, j);
			} else if(array[i] <= array[p]){
				i++;
			} else if(array[j] > array[p]) {
				j--;
			} else {
				i++;
				j--;
			}
		}
	if(array[i] > array[p]) {
		i--;
	}

	intercambia(array, i, p);
	quicksort(array, ini, i - 1);
	quicksort(array, i + 1, fin);
	}

	public static void quicksort(int [] array) {
		quicksort(array, 0, array.length - 1);
	}

	public static void main(String[] args) {
		int [] miArreglo = {5,9,3,1,8,7,2,6,4};
		
		System.out.println("\nArreglo desordenado:");
		for(int i = 0; i < miArreglo.length; i++) {
			System.out.print(miArreglo[i] + " ");
		}
		quicksort(miArreglo);
		System.out.println("\n\nArreglo ordenado:");
        for(int i = 0; i < miArreglo.length; i++) {
            System.out.print(miArreglo[i] + " ");
        }
   
			System.out.println();
	}
}
