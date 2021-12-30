import javax.swing.JOptionPane;

public class Pila {
//asigna el comportamiento de tipo pila a nuestro programa
	private Nodo UltimoValorIngresado;
	int tamanio;
	String Lista = "";
//Constructor
	public Pila() {
		UltimoValorIngresado = null;
		tamanio = 0;
	}
//Metodo para saber si la pila esta vacia
	public boolean PilaVacia() {
		return UltimoValorIngresado == null;
	}
//Metodo para ingresar un nodo en la pila
	public void InsertarNodo(int nodo) {
		Nodo nuevo_nodo = new Nodo(nodo);
		nuevo_nodo.siguiente = UltimoValorIngresado;
		UltimoValorIngresado = nuevo_nodo;
		tamanio++;
	}
//Metodo para eliminar nodo de la pila
	public int EliminarNodo() {
		int aux = UltimoValorIngresado.informacion;
		UltimoValorIngresado = UltimoValorIngresado.siguiente;
		tamanio--;
		return aux;
	}
//Metodo para conocer el ultimo valor ingresado	
	public int MostrarUltimoValorIngresado() {
		return UltimoValorIngresado.informacion;
	}
//Metodo para conocer el tamanio de la pila
	public int TamanioPila() {
		return tamanio;
	}
//Metodo para vaciar la pila
	public void VaciarPila() {
		while(!PilaVacia()) {
			EliminarNodo();
		}
	}
//Metodo para mostrar el contenido de la pila
	public void MostrarValores() {
		Nodo recorrido = UltimoValorIngresado;
		while(recorrido != null) {
			Lista += recorrido.informacion + "\n";
			recorrido = recorrido.siguiente;
		}
	JOptionPane.showMessageDialog(null, Lista);
	Lista = " ";
	}
}
