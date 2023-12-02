package aulaseven;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho da Matriz: ");
		n  = sc.nextInt();
		int [][] matriz = new int [n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Digite o valor da Matriz: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println("\n");
			for (int j = 0; j < n;  j++) {
				System.out.printf("[%d]\t", matriz[i][j]);
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println("\n");
			for (int j = 0; j < n;  j++) {
				if (i == j) {
					System.out.printf("Diagonal Primcipal = [%d]\t", matriz[i][j]);
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println("\n");
			for (int j = 0; j < n;  j++) {
				if (matriz[i][j] < 0) {
					System.out.printf("Valores Negativos = [%d]\t", matriz[i][j]);
				}
			}
		}
		}

}
