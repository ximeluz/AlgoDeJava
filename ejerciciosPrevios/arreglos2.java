public class arreglos2 {
    public static void main(String[] args) {
//Los arregos son un bloque continuo de memoria. Tamaños fijos.
//Inicializar los arreglos, es decir, definirlos con la palabra new
        int [] x = new int[5];
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        x[3] = 4;
        x[4] = 5;

        String [] s = new String[5];

        s[0] = "XD";
        s[1] = "-_-";
        s[2] = "._.";
        s[3] = ":V";
        s[4] = ":D";

        for (int i = 0; i < s.length; i++) {
        System.out.print(s[i] + " ");
        }
    }
}
