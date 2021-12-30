public class Fila {
//Simula la fila de un banco
	private Cliente primero;
	private Cliente ultimo;
	private int largo;
	private double tiempo;
	private int clientesAtendidos;

//forma - agregar un cliente al final de la fila
public void formaCliente(Cliente c) {
	if (isVacia()) {
		primero = c;
		ultimo = c;
	} else {
		ultimo.setSig(c);
		ultimo = c;
	}
	largo ++;
}

public boolean isVacia() {
	return primero == null;
}

//atender - agregar el tiempo de atencion al cliente al tiempo de la fila y sacar al cliente de la fila
public void atiendeCliente() {
	tiempo += primero.tiempoTotal();
	clientesAtendidos ++;
	sacaCliente();
}
public void sacaCliente() {
	primero = primero.getSig();
	largo --;
}

/* ***UTILERIA****/

//constructor

	public Fila() {
		this.primero = null;
		this.ultimo = null;
		this.largo = 0;
		this.tiempo = 0;
		this.clientesAtendidos = 0;
	}

//acceso, pero sin setLargo(), sin tiempo ni clientes atendidos.

	public Cliente getPrimero(){
		return primero;
	}
	public void setPrimero(Cliente primero){
		this.primero = primero;
	}
	public Cliente getUltimo() {
		return ultimo;
	}
	public void setUltimo(Cliente ultimo) {
		this.ultimo = ultimo;
	}
	public int getLargo(){
		return largo;
	}
	public double getTiempo() {
		return tiempo;
	}
	public int getClientesAtendidos() {
		return clientesAtendidos;
	}

//toString

	@Override
	public String toString() {
		Cliente aux = primero;
		String salida = "\n";
		while (aux != null) {
			salida += aux.toString() + " -> ";
			aux = aux.getSig();
		}
		salida += "\n";
		return salida;
	}

//equals() (opcional)
/* ***UTILERIA****/

	public String status() {
		return "Fila{" + " largo = " + largo + ", tiempo = " + tiempo + ", clientes atendidos = " + clientesAtendidos + "}";
	}

}
