package trabalho;
import java.util.Scanner;
public class ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int hora1 = 0;
		int hora2 = 0;
		int cont = 0;
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			hora1 = sc.nextInt();
			hora2 = sc.nextInt();
			if (hora1 < hora2) {
				cont++;
			} else {
				continue;
			} 
		}
		System.out.println(cont);
		sc.close();
	}

}
