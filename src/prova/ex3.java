package prova;
import java.util.Scanner;
import entidades3.pacote;
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		pacote Pacotes = new pacote();
		Pacotes.total = sc.nextInt();
		Pacotes.n = sc.nextInt();
		for (int i = 0; i < Pacotes.n; i++) {
			Pacotes.Mi = sc.nextInt();
		}
		int resul = Pacotes.subtrair();
		System.out.println(resul);
		sc.close();
	}
}
