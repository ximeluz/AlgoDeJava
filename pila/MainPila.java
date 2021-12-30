import java.util.Stack;

public class MainPila {
	
/** Pila = espacio de memorio, un lugar donde vamos a guardar informacion, datos, Utilizando metodos nativos:
* push introducir dato en la pila, 
* pop quitar el ultimo dato
* peek muestra el ultimo dato agregado a la pila
* empty ¿la pila tiene contenido o esta vacia?
* @param args 
* El primero que entra es el ultimo que sale
*/

	public static void main(String[] args) {
		Stack pila = new Stack();
		pila.push(0); //indice cero
		pila.push("String"); //indice uno
		pila.push("Dos"); //indice dos
		pila.push(3); //indice tres
		pila.push("cuatro"); //indice cuatro
	//solo se puede obtener el ultimo valor ingresado
	//peek para ver
	//pop para obtener

		System.out.println("El ultimo elemento en la pila es: " + pila.peek());

		while(pila.empty() == false) {
			System.out.println(pila.pop());
		}
		
	}
}
