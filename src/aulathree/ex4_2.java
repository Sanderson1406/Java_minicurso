package aulathree;
import java.util.Scanner;
public class ex4_2 {

	public static void main(String[] args) {
		int a, b, c;
		double d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero A= ");
		a = sc.nextInt();
		System.out.println("Digite o numero B= ");
		b = sc.nextInt();
		System.out.println("1 . Soma // 2. Produto do A pelo B ao quadrado // 3. Quadrado de A // 4. Modulo de A");
		c = sc.nextInt();
		d = verifica(a, b, c);
		System.out.println(d);
		sc.close();
		}
	public static double verifica(int a, int b, int c) {
		double eu = 0;
		switch (c) {
			case(1):
				eu = a + b;
				break;
			case(2):
				eu = (b * b) * a;
				break;
			case(3):
				eu = a *a;
				break;
			case(4):
				eu = a;
				break;
		}
		return eu;
	}
}
