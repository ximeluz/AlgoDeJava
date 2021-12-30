public class Alumno implements Comparable<Alumno> {
	/*Atributos*/
	private int numCuenta;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private double promedio;

	/**
	 * crea un objeto alumno a partir de los parametros dados.
	 * @param numCuenta El numero de cuenta de el alumno.
	 * @param nombre El nombre del alumno.
	 * @param apPaterno El apellido paterno de el alumno.
	 * @param apMaterno El apellido materno de el alumno.
	 * @param promedio El promedio de el alumno.
	 */

	//ESTE ES EL CONSTRUCTOR:
	 public Alumno(int numCuenta, String nombre, String apPaterno, String apMaterno, double promedio) {
	 	this.numCuenta = numCuenta;
	 	this.nombre = nombre;
	 	this.apPaterno = apPaterno;
	 	this.apMaterno = apMaterno;
	 	this.promedio = promedio;
	 } 

	 /* GETERS */
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

	 /* SETERS */
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
	  	return "Alumno: {" + getNumCuenta + ", " + nombre + ", " + apPaterno + ", " + apMaterno + ", " + promedio + "}";
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

	   	return numCuenta == otro.numCuenta && nombre.equals(otro.nombre) && apPaterno.equals(otro.apPaterno) &&
	   	apMaterno.equals(otro.apMaterno) && promedio == otro.promedio;
	   }

	   public int compareTO(Alumno otroAlumno) {
	   	if(numCuenta > otroAlumno.numCuenta) 
	   		return 1;
	   	else if(numCuenta < otroAlumno.numCuenta)
	   		return -1;
	   	else
	   		return 0;
	   }
}
