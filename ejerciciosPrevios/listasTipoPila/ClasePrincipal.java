import javax.swing.JOptionPane;

public class ClasePrincipal {
	public static void main(String[] args) {
		int option = 0, nodo = 0;
		Pila pila = new Pila();

		do{
			try{

				option = Integer.parseInt(JOptionPane.showInputDialog(null, 
					"Menu de opciones\n\n"
					+ "1. Insetar un nodo\n"
					+ "2. Eliminar un nodo\n"
					+ "3. ¿La pila esta vacia?\n"
					+ "4. ¿Cual es el ultimo valor ingresado en la pila?\n"
					+ "5. ¿Cuantos nodos tiene la pila?\n"
					+ "6. Vaciar Pila\n"
					+ "7. Mostrar contenido de la pila\n"
					+ "8. Salir\n\n"));
//Estructura de control
			switch (option) {
				case 1:
					nodo = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Por favor ingresa el valor a guardar en el nodo"));
					pila.InsertarNodo(nodo);
					break;
				case 2:
					if(pila.PilaVacia()) {
                        JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor: " + pila.EliminarNodo());
                    } else {
                        JOptionPane.showMessageDialog(null, "La pila esta vacia ");
                    }   
					break;
				case 3:
					if(pila.PilaVacia()) {
						JOptionPane.showMessageDialog(null, "La pila esta vacia ");
					} else {
						JOptionPane.showMessageDialog(null, "La pila no esta vacia ");
					}	
					break;
				case 4:
					if(!pila.PilaVacia()) {
					JOptionPane.showMessageDialog(null, "El ultomo valor ingresado en la pila es " + pila.MostrarUltimoValorIngresado());
					} else {
						JOptionPane.showMessageDialog(null, "La pila esta vacia ");
					}
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "La pila contiene " + pila.TamanioPila() + " nodos.");
					break;
				case 6:
					if(!pila.PilaVacia()) {
						pila.VaciarPila();
						JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente");
					} else {
						JOptionPane.showMessageDialog(null, "La pila esta vacia");
					}
					break;
				case 7:
					pila.MostrarValores();
					break;
				case 8:
					option = 8;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion incorrecta, vuelve a intentar nuevamente");
					break;
 			}

			}catch(NumberFormatException e){
				
			}
		}while(option != 8);
	}
}
