import java.util.LinkedList;

public class PruebaLista {
	public static void main(String[] args) {
		/** Para crear una lista Java nos ofrece dos opciones 
		 * la clase: ArrayList (arreglo dinamico)
		 * la clase: LinkedList (lista doblemente ligada) Nos permite simular una pila y una cola.
		 */
		 LinkedList<String> listaCadena = new LinkedList<String>();

		 /** Unicamento acepta objetos (clases envolventes)
		  * int -> Integer
		  * double -> Double
		  * char -> Character
		  * boolean -> Boolean
		  */
		 LinkedList<Integer> lista = new LinkedList<Integer>();

		 lista.add(2);
		 lista.add(10);
		 lista.add(0, 5);
		 lista.remove(1);

		 System.out.println(lista);
	}
}