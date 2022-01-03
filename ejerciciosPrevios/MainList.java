import java.util.LinkedList;

class MainList {
	public static void main(String[] args) {
		LinkedList lista = new LinkedList();

		lista.add("Palabra");
		lista.add(5);
		lista.add("Peten 100 Col. Narvarte.");

		if(lista.get(0) > lista.get(1)) {
			return False;
		}

	System.out.println("LinkedList: " + lista);
    System.out.println(lista.size());
    System.out.println("The element is: " + lista.get(3));


	}
}