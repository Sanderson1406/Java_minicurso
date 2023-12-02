package aulathree;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		a = sc.nextInt();
		System.out.println("Digite o valor de B: ");
		b = sc.nextInt();
		int resul = multi(a, b);
		System.out.println(resul);
	}
	public static int multi(int a, int b) {
		return a * b;
	}

}
