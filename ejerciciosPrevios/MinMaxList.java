import java.util.LinkedList;

public class MinMaxList {
	
	public static void main(String[] args) {
 
        LinkedList<Double> t = new LinkedList<Double>();
 
        t.add(20.5);
        t.add(20.3);
        t.add(20.8);
        t.add(20.9);
        t.add(20.1);
        t.add(20.1);
        t.add(20.5);
        t.add(20.6);
        t.add(20.7);
 
       
        // Para obtener el maximo
        
        double max = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i) > max) {
                max = t.get(i);
            }
        }
        
        //Para obtener el minimo
        double min = max;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i) < min) {
                min = t.get(i);
            }
        }
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }    
}