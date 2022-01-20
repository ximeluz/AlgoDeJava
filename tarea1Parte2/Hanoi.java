import java.util.Stack;
import java.util.Scanner;
import java.util.EmptyStackException;

/**
 * Tarea 1 Segunda parte.
 * 
 * Clase encargada de simular el juego de las torres de Hanoi.
 * 
 * @author Manejo de Datos 9158
 *
 * @see Stack
 */
public class Hanoi {

	private Stack<String> torre_1;
	private Stack<String> torre_2;
	private Stack<String> torre_3;
	private int numDiscos;

	/**
	 * Construye las torres y coloca los discos en la primera torre.
	 * @param numDiscos El numero de discos con los que iniciara el juego.
	 */
	public Hanoi(int numDiscos) {
		this.numDiscos = numDiscos;
		torre_1 = new Stack<String>();
		torre_2 = new Stack<String>();
		torre_3 = new Stack<String>();
		llenaTorre();
	}

	/**
	 * Coloca los discos en la torre inicial.
	 * 			*
	 * 		   ***
	 *        *****
	 */
	private void llenaTorre() {
		for(int i = numDiscos; i > 0; i--) {
			torre_1.push("*".repeat(2 * i - 1));
		}
	}

	/**
	 * Regresa representacion del juego en forma de cadena.
	 * @return Una cadena con el proceso del juego.
	 */
	@Override public String toString() {
		// Hacemos copias de las torres para no afectar a las originales.
		Stack t1 = (Stack)torre_1.clone();
		Stack t2 = (Stack)torre_2.clone();
		Stack t3 = (Stack)torre_3.clone();
		
		String torres = "\nTorre 1:\n\n" + imprimeTorre(t1);
		torres += "\nTorre 2:\n\n" + imprimeTorre(t2);
		torres += "\nTorre 3:\n\n" + imprimeTorre(t3);

		return torres;
	}

	/**
	 * Regresa la representacion de una torre en forma de cadena.
	 * @return Una torre en forma de cadena.
	 */
	private String imprimeTorre(Stack t) {
		String torre = "";
		int n = numDiscos;

		while(!t.empty()) {
			torre += " ".repeat(--n);
			torre += t.pop() + "\n";
		}

		return torre;
	}

	/**
	 * Mueve el ultimo de disco de la torre origen a la torre destino, solo si
	 * este es un movimiento valido, es decir, si el disco a mover es menor al
	 * ultimo disco que esta en la torre destino.
	 * @param origen Torre de donde saldra el disco.
	 * @param destino Torre donde se colocara el disco.
	 */
	private void mueve(int origen, int destino) {
		Stack<String> from = selectTower(origen);
		Stack<String> to = selectTower(destino);

		if(from == null || to == null) {
			// TE TOCA: Imprime un error
			System.out.println("No entiendo, intenta otra torre.");
			
		} else 
		
		if(!validMove(from, to)) {
			// TE TOCA: Imprime un error
			System.out.println("\n Movimiento invalido. Intenta de nuevo.");
		} else {
			// TE TOCA: Realiza el movimiento.
			selectTower(destino).push(selectTower(origen).peek());
			selectTower(origen).pop();
		}
	}

	/**
	 * Selecciona la torre deseada. Las torres van del 1 al 3.
	 * 1 - Es la primera torre.
	 * 2 - Es la segunda torre.
	 * 3 - Es la tercera torre.
	 * Si la torre que piden es diferente de 1, 2 o 3 regresa null.
	 * 
	 * @param t La torre que se desea tomar.
	 * @return La pila que simula la torre si la torre fue un valor entre 1-3
	 * 		null e.o.c.
	 */
	private Stack<String> selectTower(int t) {
		switch(t) {
			case 1:
				return torre_1;
			case 2:
				return torre_2;
			case 3:
				return torre_3;
			default:
				return null;
		}
	}

	/**
	 * Se encarga de validar que un movimiento sea valido.
	 * Un movimiento es valido si el ultimo disco de la torre de origen es menor
	 * que el ultimo disco de la torre destino.
	 * @param origen Torre de donde saldra el disco.
	 * @param destino Torre donde se colocara el disco.
	 * @return True si es un movimiento valido, False e.o.c.
	 */
	private boolean validMove(Stack<String> origen, Stack<String> destino) {
		if(origen.empty()) {
			// TE TOCA: Que tiene que regresar en este caso??
			return false;
		}

		if(destino.empty()) {
			// TE TOCA: Que tiene que regresar en este caso??
			return true;
			
		}

		// TE TOCA: Compara los ultimos discos de la torre origen y destino.
		if(origen.peek().length() < destino.peek().length()){
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Encargado de pedir los movimientos hasta que el juego termine.
	 */
	public void juega() {
		Scanner teclado = new Scanner(System.in);
		int origen = 0;
		int destino = 0;
		int moves = 0;

		do {
			System.out.println(this);
			System.out.print("\n\nSacar disco de: \t");
			origen = teclado.nextInt();
			System.out.print("\n\nColorcalo en: \t\t");
			destino = teclado.nextInt();

			mueve(origen, destino);
			moves++;
		} while(!finished());

		System.out.println("\nFin del Juego. Muy bien!! :D");
		System.out.println("\nMovimientos realizados: " + moves);
		System.out.println("Minimo de movimientos: " + ((int)(Math.pow(2,numDiscos))-1));
	}

	/**
	 * Decide si el juego termino o no.
	 * @return True si el juego termino, False e.o.c.
	 */
	private boolean finished() {
		return torre_1.empty() && torre_2.empty();
	}
}
