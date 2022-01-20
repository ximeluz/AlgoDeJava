import java.util.Scanner;

/**
 * Clase encargada de poner a prueba la clase Hanoi.
 * 
 * @author Manejo de Datos 9158
 */
public class PruebaHanoi {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("\nElige la cantidad de discos con los que " + "quieres jugar: \t");
		int n = teclado.nextInt();
		Hanoi hanoi = new Hanoi(n);
		hanoi.juega();
	}
}
