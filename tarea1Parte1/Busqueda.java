import java.util.*;

/**
 * Clase encargada de implementar los algoritmos de busqueda vistos en clase
 * sobre listas genericas.
 * 
 * @author Manejo de Datos 9158
 * @see Comparable
 */
public class Busqueda {

	/**
     * Regresa la posicion del elemento buscado si es que lo encuentra, en otro
     * caso regresa -1. La lista recibida tiene que contener nada mas elementos
     * que implementan la interfaz {@link Comparable}.
     * @param <T> tipo del que puede ser la lista.
     * @param l La lista donde se buscara.
     * @param e El elemento a buscar.
     * @return La posicion del elemento o -1 si no o encuentra.
     */
	public static <T extends Comparable<T>> int busquedaLineal(List<T> l, T e) {
		// Les toca
	}

	/**
     * Regresa la posicion del elemento buscado si es que lo encuentra, en otro
     * caso regresa -1. La lista recibida tiene que contener nada mas elementos
     * que implementan la interfaz {@link Comparable}.
     * @param <T> tipo del que puede ser la lista.
     * @param l La lista donde se buscara.
     * @param e El elemento a buscar.
     * @return La posicion del elemento o -1 si no o encuentra.
     */
	public static <T extends Comparable<T>> int busquedaBinaria(List<T> l, T e) {
		return busquedaBinaria(l, e, 0, l.size() - 1);
	}

	/*
	 * Metodo auxiliar de busqueda binaria.
	 * l - La lista donde se buscara.
     * e - El elemento a buscar.
     * ini - Indice que indica el inicio de la sublista.
     * fin - Indice que indica el final de la sublista.
	 */
	private static <T extends Comparable<T>> int busquedaBinaria(List<T> l, T e, int ini, int fin) {
		// Les toca
	}
}