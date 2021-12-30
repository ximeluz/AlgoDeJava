public class Ordenamiento { 
	private static void intercambia(int [] array, int i, int j) {
//static nos permite utilizar esa funcion sin tener que crear 
//un objeto para llamarla (al igual que main) 
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void bubblesort(int [] array) {
		for(int i = 1; i < array.length; i++) {
			for(int j = 0; j < array.length - i; j++) {
				if(array[j] > array[j + 1]) {
					intercambia(array, j, j + 1);
				}
			}
		}
	}

	public static void main(String[] args) {
		int [] miArreglo = {6, 5, 3, 1, 8, 7, 2, 4};
		System.out.println("\n Arreglo desordenado:");
		for(int i = 0; i < miArreglo.length; i++) {
			System.out.println(miArreglo[i]);
		}
		bubblesort(miArreglo);
		System.out.println("\n Arreglo ordenado:");
        for(int i = 0; i < miArreglo.length; i++) {
        System.out.println(miArreglo[i]);
        }

	}
}
