import java.util.Scanner;

public class Suma {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String name = "";
		int numberUno = 0, numberDos = 0, resultado = 0;

		System.out.println("¿Cual es tu nombre?");
		name = entrada.nextLine();

		System.out.println("Dame el primer valor para tu suma:");
		numberUno = entrada.nextInt();
		
		System.out.println("Dame el segundo valor para tu suma:");
		numberDos = entrada.nextInt();

		resultado = numberUno + numberDos;

		System.out.println("Hola " + name + ", el resultado de tu suma es: " + resultado);
	}
}
