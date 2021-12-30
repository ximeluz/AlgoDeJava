//package md2022.listas.colas;
/**
*para hacer pruebas de operacion bancaria
*/

public class PruebasOperacionBancaria {
	public static void main(String[] args) {
		Fila f = new Fila();
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();

		f.formaCliente(c1);
		f.formaCliente(c2);

		System.out.println();

		System.out.println(f);
		System.out.println(f.status());

		f.atiendeCliente();
		System.out.println(f);
		System.out.println(f.status());
		
		System.out.println();
	}
}
