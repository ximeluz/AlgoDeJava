public class OperacionBancaria {
	private String nombre;
	private int tipo;
	private double tiempo;
	
/* 
*Elige aleatoriamente una operacion bancaria:
* 1 Deposito
* 2 Retiro
* 3 Consulta Saldo
* 4 Pago de servicio
* @return el nombre de la operacion bancaria
*/

	private String asignaNombre() {
		switch (tipo) {
			case 1: return "Deposito";
			case 2: return "Retiro";
			case 3: return "Consulta de saldo";
			case 4: return "Pago de servicio";
			default: return "";
		}
	}

	public double asignaTiempo() {
		switch (tipo) {
            case 1: return (Math.random() * 3) + 2;
            case 2: return (Math.random() * 3) + 3;
            case 3: return (Math.random() * 3) + 2;
            case 4: return (Math.random() * 2) + 1;
            default: return 0.0; 
        }   

	}

	/* ****UTILERIA******/
	/**
	*Genera una nueva operacion bancaria, decide tipo "(int)(Math.random() * 4) + 1" y asigna tiempo estimado
	*Deposito (2, 5) minutos "(Math.random() * 3) + 2"
	*retiro (3, 6) minutos "(Math.random() * 3) + 3"
	*consulta saldo (2, 5) min "(Math.random() * 3) + 2"
	*Pago servicio (1, 3) min "(Math.random() * 2) + 1"
	*/
	public OperacionBancaria() {
		super();
		tipo = (int)(Math.random() * 4) + 1;
		nombre= asignaNombre();
		tiempo = asignaTiempo();
	}
	public String getNombre() {
		return nombre;
	}
	public double getTiempo() {
		return tiempo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
		final OperacionBancaria other = (OperacionBancaria) obj;
		if(Double.doubleToLongBits(this.tiempo) != Double.doubleToLongBits(other.tiempo)) {
            return false;
        }
		//if(!Objects.equals(this.nombre, other.nombre)) {
		//	return false;
		//}
		return true;
	}

	@Override
	public String toString() {
		return "OperacionBancaria{" + "nombre = " + nombre + ". Tiempo = " + tiempo + "}";
	}
	/* ***UTILERIA****/
}
