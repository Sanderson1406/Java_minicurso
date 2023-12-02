package entidades3;

public class Matriz {
	public int[][] matriz;
	 int somaTotal;
	 int somaDiagonal;
	 public int soma() {
		 for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
             somaTotal += matriz[i][j];
         }
     }
		 return somaTotal;
	 }
	 public int somadiagonal() {
	        for (int i = 0; i < 3; i++) {
	            somaDiagonal += matriz[i][i];
	        }
	        return somaDiagonal;
	 }
}
