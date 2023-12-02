package estudo2;
import java.util.Scanner;
public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char l;
		System.out.println("Digite a letra: ");
		l  = sc.next().charAt(0);
		if (l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U' || l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u' ) {
			System.out.println("É vogal");
		} else {
			System.out.println("É conçoante");
		}
		sc.close();
	}

}
