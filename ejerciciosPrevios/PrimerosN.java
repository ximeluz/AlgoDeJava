public class PrimerosN {
	public static void main(String[] args) {
		int suma = 0;
		
		for (int i = 0; i <= 100; i++) {
			suma = suma + i;
		}
		System.out.println("Suma de los primeros 100 naturales " + suma);
	}
}
