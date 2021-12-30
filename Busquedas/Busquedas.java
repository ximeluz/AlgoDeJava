public class Busquedas {
//*BUSQUEDA LINEAL*/
	public static int busquedaLineal(int [] array, int e) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == e)
				return i;
		}
		return -1;
	}
//*BUSQUEDA LINEAL*/



//*BUSQUEDA BINARIA*/
	public static int busquedaBinaria(int [] array, int e) {
		return busquedaBinaria(array, e, 0, array.length - 1);
	}
	private static int busquedaBinaria(int [] array, int e, int ini, int fin) {
		if(fin < ini) {
			return -1;
		} else {
			int mitad = (ini + fin) / 2;
			if(e < array[mitad])
				return busquedaBinaria(array, e, 0, mitad - 1);
			else if(e > array[mitad])
				return busquedaBinaria(array, e, mitad + 1, fin);
			else
				return mitad;
	}
//*BUSQUEDA BINARIA*/
}
