package estudo2;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Numero: ");
		a = sc.nextInt();
		if (a%2 == 0) {
			System.out.println("É par");
		} else {
			System.out.println("É impar");
		}
	}

}
