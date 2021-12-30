/* programa en Java que pide un valor n y muestra todos los números desde 1 hasta n */
import java.util.Scanner;

public class EjercicioRepetitivoFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Introduce un entero: ");
		n = sc.nextInt();
		System.out.println("\nLos números del 1 al son " + n + ": ");
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}
}
