package aulafourefive;
import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int i;
		System.out.println("Digite o valor de N: ");
		n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			System.out.println(i);
		}
		System.out.println(n * n);
		System.out.println(n * n * n);
	}

}
