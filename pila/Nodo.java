public class Nodo{
	private Nodo sig;
	private char info;

//Esta clase es un nodo en una lista cuya informacion es un caracter

	/******* U T I L E R I A ********/
	//get/setNodo de sig/info
	//constructores
	//acceso
	//toString
	//equals
	public Nodo (char in) {
		super();
		info = in;
		sig = null;
	}
	public Nodo (char in, Nodo n) {
		super();
		info = in;
		sig = n;
	}
	public char getInfo() {
		return info;
	}
	public Nodo getSig() {
		return sig;
	}
	public void setInfo(char in) {
		info = in;
	}
	public void setSig(Nodo s) {
		sig = s;
	}
	public String toString() {
		return " " + info;
	}
/**
*Dos nodos son iguales si sus informaciones son iguales y su apuntador es igual.
* @param n el nodo con el que se va a comparar this
* @return <code>true/code> si ambos nodos tienen la misma informacion y si apuntan al mismo objeto: <code>false</code> en otro caso.
*/

	public boolean equals(Nodo n) {
		return this.info == n.info
			&& this.sig == n.sig;
	}
	/******* U T I L E R I A ********/
}
