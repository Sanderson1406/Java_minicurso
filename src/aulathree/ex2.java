package aulathree;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Digite o numero para verificar: ");
		a = sc.nextInt();
		int resul = verificar(a);
		if (resul == 1) {
			System.out.println("É multiplo de 2");
		} else if (resul == 0) {
			System.out.println("Não é multiplo");
		}
	}
	public static int verificar(int a) {
		if (a%2 == 0) {
			return 1;
		} else {
			return 0;
		}
	}

}
