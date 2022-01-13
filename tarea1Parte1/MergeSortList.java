import java.util.*;

public class MergeSortList {
// Funcion encargada de intercambiar dos elementos dentro de la lista. 

	public static <T extends Comparable<T>> List<T> MergeSortList(List<T> l) {
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
		izq =  MergeSortList(izq);
		der =  MergeSortList(der);

//Mezcla
		return mezclaList(izq, der);

    }

	private static <T extends Comparable<T>> List<T> mezclaList(List<T> izq, List<T> der) {
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


//MAIN-------------------------------------------------------
	public static void main(String[] args) {
		LinkedList<Integer> listaG = new LinkedList<Integer>();

   		 // Add elements to LinkedList
   		 listaG.add(5);
    	 listaG.add(4);
    	 listaG.add(3);
    	 //listaG.add(3);
    	 //listaG.add(0);
	
		System.out.println("\nArreglo desordenado:");
		System.out.println("LinkedList: " + listaG);
		
		List<Integer> nuevaLista = MergeSortList(listaG);
		
		System.out.println("\nArreglo ordenado:");
		System.out.println("LinkedList: " + nuevaLista);

		System.out.println();
  }
}
// Al final no me ordena nada U..U
