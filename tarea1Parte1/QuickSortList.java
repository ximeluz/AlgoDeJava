import java.util.*;

// Ordena una lista usando el algoritmo Quick Sort.

public class QuickSortList {

    public static <T extends Comparable<T>> void intercambia(List<T> l, int i, int j) {
        // Collections.swap(l, i, j);
        T temp = l.get(i);
        l.set(i, l.get(j));
        l.set(j, temp);
    }
	/**
     * Ordena una lista usando el algoritmo Quick sort. La lista recibida tiene
     * que contener nada mas elementos que implementan la interfaz {@link 
     * Comparable}.
     * @param <T> Tipo del que puede ser la lista.
     * @param l La lista que se ordenara.
     */
    
	public static <T extends Comparable<T>> void QuickSortList(List<T> l) {
        QuickSortList(l, 0, l.size() - 1); 
    }   
	/*  
     * Metodo auxiliar para quicksort.
     * l - La lista que se ordenara.
     * ini - Indice que indica el inicio de la sublista.
     * fin - Indice que indica el final de la sublista.
     */
    
	private static <T extends Comparable<T>> void QuickSortList(List<T> l, int ini, int fin) {
//Caso la lista tiene una longitud 1 o 0
		if((fin - ini) < 1)
            return;
//--------------------------------------
        int p = ini;
        int i = ini + 1;
        int j = fin;

		while(i < j) {
			if(l.get(i).compareTo(l.get(p)) > 0 && l.get(j).compareTo(l.get(p)) <= 0) {
				intercambia(l, i, j);
			} else if (l.get(i).compareTo(l.get(p)) < 0) {
				i++;
			} else if(l.get(j).compareTo(l.get(p)) < 0) {
				j--;
			} else {
				i++;
				j--;
			} 
		}
		if(l.get(i).compareTo(l.get(p)) > 0) {
			i--;
		}
		intercambia(l, i, p);
		QuickSortList(l, ini, i - 1);
		QuickSortList(l, i + 1, fin);
    }


//LISTA PARA PRUEBAS:
    public static void main(String[] args) {
        LinkedList<Integer> listaG = new LinkedList<Integer>();

         // Add elements to LinkedList
         //listaG.add(20);
         listaG.add(1);
         //listaG.add(100);


        System.out.println("\nArreglo desordenado:");
        System.out.println("LinkedList: " + listaG);


        QuickSortList(listaG);

        System.out.println("\nArreglo ordenado:");
        System.out.println("LinkedList: " + listaG);

        System.out.println();
    }
}
