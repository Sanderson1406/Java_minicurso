package trabalho;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bandejas = 0;
		bandejas = sc.nextInt();
		int l =0;
		int c = 0;
		int cont = 0;
		for (int i = 0; i < bandejas; i++) {
			l = sc.nextInt();
			c = sc.nextInt();
			if (l > c) {
				cont += c;
			} 
		}
		System.out.println(cont);
		sc.close();
	}

}
