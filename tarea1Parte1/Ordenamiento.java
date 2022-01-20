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
		for(int i = 1; i < l.size(); i++) {
			for(int j = 0; j < l.size() - i; j++) {
				if(l.get(j).compareTo(l.get(j + 1)) > 0) {
					intercambia(list, j, j+1);
				}
			}
		}
	}

	/**
     * Ordena una lista usando el algoritmo Selection sort. La lista recibida 
     * tiene que contener nada mas elementos que implementan la interfaz {@link 
     * Comparable}.
     * @param <T> Tipo del que puede ser la lista.
     * @param l La lista que se ordenara.
     */
	public static <T extends Comparable<T>> void selectionsort(List<T> l) {
		for(int i = 0; i < l.size(); i++){
			int min = i;
            for(int j = i; j < l.size(); j++) {
				if(l.get(j).compareTo(l.get(min)) < 0) {
                    min = j;
                }
            }        
            intercambia(l, i, min);
        }
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
		//Caso la lista tiene una longitud 1 o 0
		if((fin - ini) < 1)
            return;
//----------------------------------------------
        int p = ini;
        int i = ini + 1;
        int j = fin;

		while(i < j) {
			if(l.get(i).compareTo(l.get(p)) > 0 && l.get(j).compareTo(l.get(p)) <= 0) {
				intercambia(l, i, j);
			} else if (l.get(i).compareTo(l.get(p)) <= 0) {
				i++;
			} else if(l.get(j).compareTo(l.get(p)) > 0) {
				j--;
			} else {
				i++;
				j--;
			} 
		}
//Caso: ambos apuntadores apuntan al mismo elemento
		if(l.get(i).compareTo(l.get(p)) > 0) {
			i--;
		}
		intercambia(l, i, p);
		quicksort(l, ini, i - 1);
		quicksort(l, i + 1, fin);
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
       int tam = l.size();
//Caso base: nuestra lista tiene 0 o 1 elemento
        if(tam < 2) { 
            return l;
        }
    
        int mitad = tam/2;
//subconjuntos derecho e izquierdo que son dos listas de nuestra lista principal
        List<T> izq = new LinkedList<T>();
        List<T> der = new LinkedList<T>();

//llenamos nuestros subconjuntos (las nuevas listas)
        for(int i = 0; i < mitad; i++) {
            izq.add(l.get(i));
        }
        for(int j = mitad; j < tam; j++) {
            der.add(l.get(j));
        }

//subconjuntos de subconjuntos
        izq =  mergesort(izq);
        der =  mergesort(der);

//Mezcla
        return mezcla(izq, der);
	}

	/*
	 * Metodo encargado de hacer la mezcla de dos listas. Regresa la union de 
	 * las dos listas, pero ordenada.
	 * izq - La lista del lado izquierdo.
	 * der - La lista del lado derecho.
	 */
	private static <T extends Comparable<T>> List<T> mezcla(List<T> izq, List<T> der) {
	//Lista donde se unen ambos subconjuntos
        List<T> union = new LinkedList<T>();

        int i = 0;
        int j = 0;

        while(i < izq.size() && j < der.size()) {

            if(izq.get(i).compareTo(der.get(i)) < 0) {
                union.add(izq.get(j));
                i++;
            } else {
                union.add(der.get(j));
                j++;
            }
        }

        while(i < izq.size()) {
            union.add(izq.get(i));
            i++;
        }

        while(j < der.size()) {
            union.add(der.get(j));
            j++;
        }  
        return union;
	}
}
