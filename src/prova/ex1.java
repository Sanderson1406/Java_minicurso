package prova;
import java.util.Scanner;
import entidades3.Idade;
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Idade idade = new Idade();
		idade.a = sc.nextInt();
		idade.b = sc.nextInt();
		idade.c = sc.nextInt();
		int resul = idade.verificar();
		System.out.println(resul);
		sc.close();
	}

}
