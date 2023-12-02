package aulathree;
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, i, x, y = 0 ;
		System.out.println("Digite quantos numeros:");
		a = sc.nextInt();
		for (i = 0; i < a; i++) {
			System.out.println("Digite um numero: ");
			x = sc.nextInt();
			y = y + x;
		}
		double resul = multi(a, y);
		System.out.println(resul);
	}
	public static double multi(double a, double y) {
		return y/a;
	}

}
