public class PruebaPila {
	public static void main (String[] args) {
		Nodo n1 = new Nodo('A');
		Nodo n2 = new Nodo('B', n1);
		Nodo n3 = new Nodo('C',n2);
		Pila p = new Pila();

		p.setTope(n3);


	}
}
