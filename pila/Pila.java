public class Pila {
	Nodo tope;
	private int tamanio
	//agrega
	//quita el nodo tope de la lista
	public void quita() {
		if (!isVacia()) {
			tope = tope.getSig();
			tamanio --;
		}
	}
	//indica si la pila esta vacia 
	//tope ¿que valor tiene el tope?
	//anula (vacia la pila)
	//isVacia ¿Tope es nulo?
	public Nodo getTope() {
		return tope;
	}
	public void setTope(Nodo t) {
		tope = t;
	}
	public int getTamanio() {
		return tamanio;
	}
	public String toString() {
		Nodo aux = tope;
		String salida = " " + 
	}
}
