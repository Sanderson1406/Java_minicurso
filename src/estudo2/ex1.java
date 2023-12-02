package estudo2;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Numero 1: " );
		num1 = sc.nextInt();
		System.out.println("Numero 2: ");
		num2 = sc.nextInt();
		if (num1 < num2) {
			System.out.printf("O numro %d é maior", num2);
		} else if (num1 > num2) {
			System.out.printf("O numero %d é maior", num1);
		}
		sc.close();
	}

}
