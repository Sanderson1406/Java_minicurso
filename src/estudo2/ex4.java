package estudo2;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.println("Digite o numero A: ");
		a = sc.nextInt();
		System.out.println("Digite o numero B: ");
		b= sc.nextInt();
		System.out.println("Digite o numero C: ");
		c = sc.nextInt();
		if ((a > b) && (a > c)) {
			System.out.println("A é maior");
		} else if ((b > a) && (b > c)) {
			System.out.println("B é maior");
		} else {
			System.out.println("C é maior");
		}
	}

}
