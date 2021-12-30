/**
 * Clase que simula a un alumno.
 * 
 * @author Manejo de Datos 9158
 */
public class Alumno implements Comparable<Alumno> {
	
	/* Atributos */
	private int numCuenta;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private double promedio;

	/**
	 * Crea un objeto alumno a partir de los parametros dados.
	 * @param numCuenta El numero de cuenta del alumno.
	 * @param nombre El nombre del alumno.
	 * @param apPaterno El apellido paterno del alumno.
	 * @param apMaterno El apellido materno del alumno.
	 * @param promedio El promedio del alumno.
	 */
	public Alumno(int numCuenta, String nombre, String apPaterno, 
	String apMaterno, double promedio) {
		this.numCuenta = numCuenta;
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.promedio = promedio;
	}

	/* Getters */
	public int getNumCuenta() {
		return numCuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public double getPromedio() {
		return promedio;
	}

	/* Setters */
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	/**
	 * Regresa un alumno en forma de cadena.
	 */
	@Override public String toString() {
		return "Alumno: {" + numCuenta + ", " + nombre + ", " + apPaterno + 
			", " + apMaterno + ", " + promedio + "}";
	}

	/**
	 * Permite decidir si dos objetos son iguales.
	 */
	@Override public boolean equals(Object obj) {
		if(obj == null)
			return false;

		if(!(obj instanceof Alumno))
			return false;

		Alumno otro = (Alumno)obj;
		
		return numCuenta == otro.numCuenta && nombre.equals(otro.nombre) &&
			apPaterno.equals(otro.apPaterno) && apMaterno.equals(otro.apMaterno) &&
			promedio == otro.promedio;
	}

	// Alumno a1
	// Alumno a2
	// a1.compareTo(a2) < 0 --> a1 es menor que a2
	// a1.compareTo(a2) > 0 --> a1 es mayor que a2
	// a1.compareTo(a2) = 0 --> a1 es igual que a2
	public int compareTo(Alumno otroAlumno) {
		if (numCuenta > otroAlumno.numCuenta)
			return 1;
		else if (numCuenta < otroAlumno.numCuenta)
			return -1;
		else
			return 0;
	}
}