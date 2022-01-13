 import java.util.*;

public class BusquedaBinariaList {
	public static <T extends Comparable<T>> int BusquedaBinariaList(List<T> l, T e) {
        return busquedaBinaria(l, e, 0, l.size() - 1); 
}   
    
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
  
public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();

         // Add elements to LinkedList
         l.add(1);
         l.add(3);
		 l.add(4);
         //l.add(2);
    
    
        System.out.println("LinkedList: " + l); 
    
        int index = BusquedaBinariaList(l, 4); 
    
        System.out.println("LinkedList: " + index);
        System.out.println();
 }
}
