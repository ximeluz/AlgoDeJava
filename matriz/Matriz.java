public class Matriz {
	private double[][] mat;

/*Quiero SUMAR MATRICES 
suma la matriz de esta clase con la matriz 
que se pasa como parametro
@parma una matriz de doubles
@return una matriz de doubles, que sera la suma de ambas
*/

	public double[][] suma(double[][] m) {
		int nRen = mat.length;
		int nCol = mat[0].length;
		double[][] salida = new double[nRen][nCol];		


//revisar tamanios
		if(nRen != m.length) {
			return null;
		}
		if(nCol != m[0].length) {
			return null;
		}
		//sumar
		for(int ren = 0; ren < nRen; ren++) {
			for(int col = 0; col < nCol; col++) {
				salida[ren][col] = mat[ren][col] + m[ren][col];
			}
		}
		return salida;
	}	
	public int getRenglones() {
		return mat.length;
	}
	public int getColumnas() {
		return mat[0].length;
	}

/**********U T I L E R I A**********/
	public Matriz(double[][] m) {
		super();
		setMat(m);
	}
	public Matriz(int ren, int col) {
		super();
		mat = new double[ren][col];
	}
	public boolean equals(Matriz m) {
//Comparar tamanios
		if(mat.length != m.getRenglones()) {
			return false;
		}
		if(mat[0].length != m.getColumnas()) {
                return false;
        }  
//comparar entrada por entrada
		double[][] param = m.getMat();
		for(int ren = 0; ren < mat.length; ren++) {
			for(int col = 0; col < mat[ren].length; col++) {
				if(mat[ren][col] != param[ren][col]) {
					return false;
				}
			}
		}
		return true;
	}
	public String toString() {
		String salida = "";
		for(int ren = 0; ren < mat.length; ren++) {
			for(int col = 0; col < mat[ren].length; col++) {
				salida += "\t" + mat[ren][col];
			}
			salida += "\n";
		}
		return salida;
	}
	public void setMat(double[][] m) {
		mat = m;
	}
	public double[][] getMat() {
		return mat;
	}
/**********U T I L E R I A**********/
/*
Metodos obligados:
-toString "dibujar para ser humano, muestra el objeto"
-acceso setMat, getMat "Da valor u obtiene el valor del objeto"
-equals "Compara dos objetos y dice si son iguales"
-constructores ""
-suma
-resta
-multiplicacion por escalar
-multiplicacion de dos matrices
*/
}

