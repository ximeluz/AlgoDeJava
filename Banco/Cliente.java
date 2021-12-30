public class Cliente {
/**
*representa un cliente del banco
*las operaciones bancarias de un cliente son asignadas aleatoriamente
*/
	private OperacionBancaria[] operaciones;
	private Cliente sig;

/**
* calcula el tiempo total en que el cliente es atendido
* @return la suma de los tiempos de sus operaciones bancarias
*/
	public double tiempoTotal() {
		double total = 0;
		for (OperacionBancaria op : operaciones) {
			total += op.getTiempo();
		}
		return total;
	}

/* ***UTILERIA****/
//constructor sin parametros que decida el numero de ob[1, 5]
//inicializa las operaciones bancarias del cliente ente 1 y 5 Hace que <code>sig<code> apunte a null.
	public Cliente() {
		super();
		sig = null;
		int num = (int)(Math.random() * 5) + 1;
		operaciones = new OperacionBancaria[num];
		for (int i = 0; i < operaciones.length; i++) {
			operaciones[i] = new OperacionBancaria();
		}
	}
//toString
	@Override
	public String toString() {
		String salida = "Cliente: \n";
		for (OperacionBancaria op : operaciones) {
			salida += op.toString() + "\n";
		}
		return salida + "\n";
	}
//accesos (gets)
	public void setSig(Cliente sig) {
		this.sig = sig;
	}
	public OperacionBancaria[] getOperaciones() {
		return operaciones;
	}
	public Cliente getSig() {
		return sig;
	}
//equals (opcional) en este caso  no los vamos a poner
/* ***UTILERIA****/
}
