// import java.util.*;

public class PruebaAlumno {
	public static void main(String[] args) {
		Alumno a1 = new Alumno(318314428, "Irving Alfonso", "Aragon", "Aragon", 6);
		Alumno a2 = new Alumno(3150055075, "Miguel Guadalupe", "Bartolo", "Bolaños", 9);
		Alumno a3 = new Alumno(419004538, "Eduardo Imanol", "Bautista", "Briseño", 6);

		 System.out.println(a1.compareTo(a3));
	}
}