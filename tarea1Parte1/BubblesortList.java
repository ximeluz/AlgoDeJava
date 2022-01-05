import java.util.*;

public class BubblesortList {

// Funcion encargada de intercambiar dos elementos dentro de la lista.
	public static <T extends Comparable<T>> void intercambia(List<T> l, int i, int j) {
	 // Collections.swap(l, i, j);
     T temp = l.get(i);
     l.set(i, l.get(j));
     l.set(j, temp);
	}

 	public static <T extends Comparable<T>> void bubblesortList(List<T> l) {
		for(int i = 1; i < l.size(); i++) {
			for(int j = 0; j < l.size() - i; j++) {
				if(l.get(j).compareTo(l.get(j + 1)) > 0) {
					 intercambia(l, j, j+1);
                }
            }
        }
    }

	public static void main(String[] args) {
		LinkedList<String> listaG = new LinkedList<String>();

   		 // Add elements to LinkedList
   		 listaG.add("2");
    	 listaG.add("hola");
    	 listaG.add("3");
    	
	
		System.out.println("\nArreglo desordenado:");
		System.out.println("LinkedList: " + listaG);
		

		bubblesortList(listaG);
		
		System.out.println("\nArreglo ordenado:");
		System.out.println("LinkedList: " + listaG);

		System.out.println();
  }
}
