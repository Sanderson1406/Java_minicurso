package prova;
import java.util.Scanner;

import entidades3.Matriz;
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        Matriz teste = new Matriz();
        teste.matriz = matriz;
        int somatrue = teste.somadiagonal();
        System.out.println(somatrue);
        sc.close();
	}

}
