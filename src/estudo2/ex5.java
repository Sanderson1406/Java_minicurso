package estudo2;
import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota;
		System.out.println("Nota: ");
		nota = sc.nextDouble();
		if  (nota >= 6 ) {
		System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}
	}

}
