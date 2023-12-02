package estudo2;
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		System.out.println("Digite a idade: ");
		idade=sc.nextInt();
		if (idade >= 18) {
			System.out.println("Pode votar");
		} else {
			System.out.println("Impossivel votar");
		}
	}

}
