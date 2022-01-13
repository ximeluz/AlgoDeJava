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
		// Checar elemento por elemento
		for(int i = 0; i < l.size(); i++) {
		// Si encuentra el elemento buscado entonces lo regresa
			if(l.get(i).compareTo(e) == 0) {
				return i;
			}
		}
//Si no encuentra el elmento buscado regresa -1
		return -1;
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
		// Caso base (Me salí de mi lista)
		if (fin < ini) {
			return -1;
		} else {
			int mitad = (ini + fin) / 2;
			if(l.get(mitad).compareTo(e) > 0) {
				return busquedaBinaria(l, e, 0, mitad - 1);
             }
             else if (l.get(mitad).compareTo(e) < 0) {
				return busquedaBinaria(l, e, mitad + 1, fin);
             } else {
                    return mitad;
			 }
		}
	}
}
