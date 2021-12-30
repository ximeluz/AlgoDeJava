///Este es un ejemplo

public class MiClase {
        int i;
        public MiClase() {
            i = 10;
            }
        // Este constructor establece el valor de i
        public MiClase( int valor ) {
            this.i = valor; // i = valor
            }
        // Este constructor también establece el valor de i
        public MiClase( int i ) {
            this.i = i;
            }
        public void Suma_a_i( int j ) {
            i = i + j;
            }
        }

