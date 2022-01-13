 import java.util.*;

public class BusquedaLinealList {
	public static <T extends Comparable<T>> int BusquedaLinealList(List<T> l, T e) {
        // Checar elemento por elemento
        for(int i = 0; i < l.size(); i++) {
        // Si encuentra el elemento buscado entonces lo regresa
            if(l.get(i).compareTo(e) == 0) {
                return i;
            }
        }
        return -1; 
    }  
public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();

         // Add elements to LinkedList
         l.add(1);
         l.add(3);
         l.add(2);
    
       
        System.out.println("LinkedList: " + l);
       
        int index = BusquedaLinealList(l, 0);
       
        System.out.println("LinkedList: " + index);
        System.out.println();
  }
}
