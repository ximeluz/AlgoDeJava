import java.util.Scanner;
import java.util.Map;
import java.util.

public class Archivo {
	
	public static Map<Integer, CodigoPostal> cargar() {
		Map<Integer, List<CodigoPostal>> tabla = new HashMap<>();
		try {
			String archivo = "../resources/codigos.csv";
			Scanner archivo = new Scanner(new File(archivo));
		
			while(lector.hasNextLine()) {
				String linea = lector.nextLine();
				String [] data = line.split(",");

				CodigoPostal cp = new codigoPostal(data[0], data[1], data[3], data[4], data[5]);
				int hash = cp.hashcode();
				if(tabla.get(hash) == null) {
					List<CodigoPostal> lista = new LinkedList<CodigoPostal>();
					lista.add(cp);
					
				}
				//tabla.put(hash, cp);
			}
		} cath(FileNotFoundException fnfe) {
			System.out.println("*** ERROR: ARCHIVO NO ENCONTRADO.");
		}
	return tanbla;
	}
}
