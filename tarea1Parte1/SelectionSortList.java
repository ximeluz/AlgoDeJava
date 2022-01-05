import java.util.*;

// Ordena una lista usando el algoritmo Selection sort.

public class SelectionSortList {

	public static <T extends Comparable<T>> void intercambia(List<T> l, int i, int j) {
        // Collections.swap(l, i, j);
        T temp = l.get(i);
        l.set(i, l.get(j));
        l.set(j, temp);
    }    
    public static <T extends Comparable<T>> void SelectionSortList(List<T> l) {
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
    public static void main(String[] args) {
        LinkedList<String> listaG = new LinkedList<String>();

         // Add elements to LinkedList
         listaG.add("Cortes");
         listaG.add("Contreras");
         listaG.add("Cama");
    
       
        System.out.println("\nArreglo desordenado:");
        System.out.println("LinkedList: " + listaG);
       

        SelectionSortList(listaG);
       
        System.out.println("\nArreglo ordenado:");
        System.out.println("LinkedList: " + listaG);

        System.out.println();
    }
}
