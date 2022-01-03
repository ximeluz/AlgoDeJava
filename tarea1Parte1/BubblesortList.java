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
				if(l.get(j) > l.get(j + 1)) {
					 intercambia(l, j, j+1);
                }
            }
        }
    }

	public static void main(String[] args) {
		LinkedList listaG = new LinkedList();

   		 // Add elements to LinkedList
   		 listaG.add(1);
   		 listaG.add("Palabra");
    	 listaG.add(2);
    	 listaG.add("Hola");
    	 listaG.add("Mundo");
    	 listaG.add(16);
    	 listaG.add(23);
    	 listaG.add(69);
    	 listaG.add(30);
    	 listaG.add(2);
    	 listaG.add(8);
    	 listaG.add(17);
    	
	
		System.out.println("\nArreglo desordenado:");
		System.out.println("LinkedList: " + listaG);
		

		bubblesortList(listaG);
		
		System.out.println("\nArreglo ordenado:");
    	//System.out.println("LinkedList: " + bubblesortList(listaG));
        for(int i = 0; i < listaG.size(); i++) {
            System.out.println(listaG.get(i));
        }
  }
}
