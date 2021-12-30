public class SelectionSort {
	private static void intercambia(int [] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	public static void selectionsort(int [] array) {
		for(int i = 0; i < array.length; i++) {//apuntador que se queda esperando hasta que j encuentre el minimo.
			int min = i;
			for(int j = i; j < array.length; j++) {//apuntador que sale a buscar el minimo.
				if(array[j] < array[min]) {
					min = j;
				}
			}
			intercambia(array, i, min);
		}
	}

	public static void main(String args[]) {
		int [] MiArreglo = {6, 5, 3, 1, 8, 7, 2, 4};
		System.out.println("\n Arreglo desordenado:");
		for(int i = 0; i < MiArreglo.length; i++) {
			System.out.print(MiArreglo[i] + "");
		}
		selectionsort(MiArreglo);
		System.out.println("\n Arreglo ordenado:");
		for(int i = 0; i < MiArreglo.length; i++) {
			System.out.print(MiArreglo[i] + "");
		}
	System.out.println("");
	}
}

