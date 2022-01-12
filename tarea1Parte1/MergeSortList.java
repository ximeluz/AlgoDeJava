import java.util.*;

public class MergeSortList {
// Funcion encargada de intercambiar dos elementos dentro de la lista.
	public static <T extends Comparable<T>> void intercambia(List<T> l, int i, int j) {
        // Collections.swap(l, i, j);
        T temp = l.get(i);
        l.set(i, l.get(j));
        l.set(j, temp);
    } 

	public static <T extends Comparable<T>> List<T> MergeSortList(List<T> l) {
       int tam = l.size();
//Caso base: nuestra lista tiene 0 o 1 elemento
		if(tam < 2) { 
        	return l;
		}
		
		int mitad = tam/2;
//subconjuntos derecho e izquierdo que son dos listas de nuestra lista principal
		LinkedList<T> izq = new LinkedList<T>();
		LinkedList<T> der = new LinkedList<T>();

//llenamos nuestros subconjuntos (las nuevas listas)
		for(int i = 0; i < mitad; i++) {
			izq.add(l.get(i));
		}
/*
*Aqui no supe que hacer con el apuntador k
*/
		//int k = 0;
		for(int j = mitad; j < tam; j++) {
			der.add(l.get(j));
			//k++;
		}

//subconjuntos de subconjuntos
		MergeSortList(izq);
		//return izq;

		MergeSortList(der);
		//return der;

//Mezcla
		return mezclaList(izq, der);

    }

	private static <T extends Comparable<T>> List<T> mezclaList(List<T> izq, List<T> der) {
		//Lista donde se unen ambos subconjuntos
		LinkedList<T> union = new LinkedList<T>();

		int i = 0;
		int j = 0;
//Aqui igual no supe como meter el apuntador k 
		//int k = 0;

		while(i < izq.size() && j < der.size()) {
			
			if(izq.get(i).compareTo(der.get(i)) < 0) {
				union.add(izq.get(j));
				//k++;
				i++;
			} else {
				union.add(der.get(j));
				//k++;
				j++;
			}
		}

		while(i < izq.size()) {
			union.add(izq.get(i));
			//k++;
			i++;
		}

		while(j < der.size()) {
			union.add(der.get(j));
			//k++;
			j++; 
		}	
		return union;
	}


//MAIN-------------------------------------------------------
	public static void main(String[] args) {
		LinkedList<Integer> listaG = new LinkedList<Integer>();

   		 // Add elements to LinkedList
   		 listaG.add(1);
    	 listaG.add(0);
    	 listaG.add(2);
    	
	
		System.out.println("\nArreglo desordenado:");
		System.out.println("LinkedList: " + listaG);
		

		MergeSortList(listaG);
		
		System.out.println("\nArreglo ordenado:");
		System.out.println("LinkedList: " + listaG);

		System.out.println();
  }
}
// Al final no me ordena nada U..U
