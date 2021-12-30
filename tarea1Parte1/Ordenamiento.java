import java.util.*;

/**
 * Clase encargada de implementar los algoritmos de ordenamiento vistos en clase
 * sobre listas genericas.
 * 
 * @author Manejo de Datos 9158
 * @see Comparable
 */
public class Ordenamiento {

	/*
	 * Funcion encargada de intercambiar dos elementos dentro de la lista.
	 * l - La lista.
	 * i - La posicion del primer elemento a intercambiar.
	 * j - La posicion del segundo elemento a intercambiar.
	 */
	public static <T extends Comparable<T>> void intercambia(List<T> l, int i, int j) {
		// Collections.swap(l, i, j);
		T temp = l.get(i);
		l.set(i, l.get(j));
		l.set(j, temp);
	}
	
	/**
     * Ordena una lista usando el algoritmo Bubble sort. La lista recibida tiene
     * que contener nada mas elementos que implementan la interfaz {@link 
     * Comparable}.
     * @param <T> Tipo del que puede ser la lista.
     * @param l La lista que se ordenara.
     */
	public static <T extends Comparable<T>> void bubblesort(List<T> l) {
		// Les toca
	}

	/**
     * Ordena una lista usando el algoritmo Selection sort. La lista recibida 
     * tiene que contener nada mas elementos que implementan la interfaz {@link 
     * Comparable}.
     * @param <T> Tipo del que puede ser la lista.
     * @param l La lista que se ordenara.
     */
	public static <T extends Comparable<T>> void selectionsort(List<T> l) {
		// Les toca
	}

	/**
     * Ordena una lista usando el algoritmo Quick sort. La lista recibida tiene
     * que contener nada mas elementos que implementan la interfaz {@link 
     * Comparable}.
     * @param <T> Tipo del que puede ser la lista.
     * @param l La lista que se ordenara.
     */
	public static <T extends Comparable<T>> void quicksort(List<T> l) {
		quicksort(l, 0, l.size() - 1);
	}

	/*
	 * Metodo auxiliar para quicksort.
	 * l - La lista que se ordenara.
	 * ini - Indice que indica el inicio de la sublista.
	 * fin - Indice que indica el final de la sublista.
	 */
	private static <T extends Comparable<T>> void quicksort(List<T> l, int ini, int fin) {
		// Les toca
	}

	/**
     * Regresa una copia de la lista recibida, pero ordenada. La lista recibida
     * tiene que contener nada mas elementos que implementan la interfaz {@link
     * Comparable}.
     * @param <T> Tipo del que puede ser la lista.
     * @param l La lista que se ordenara.
     * @return Una copia de la lista recibida, pero ordenada.
     */
	public static <T extends Comparable<T>> List<T> mergesort(List<T> l) {
		// Les toca
		return null;
	}

	/*
	 * Metodo encargado de hacer la mezcla de dos listas. Regresa la union de 
	 * las dos listas, pero ordenada.
	 * izq - La lista del lado izquierdo.
	 * der - La lista del lado derecho.
	 */
	private static <T extends Comparable<T>> List<T> mezcla(List<T> izq, List<T> der) {
		// Les toca
		return null;
	}
}