package estudo4;
import java.util.Scanner;
import entidades2.cont;
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char respost;
		int resul;
		cont teste = new cont();
		System.out.println("Quer verificar um numero <S/N>");
		respost = sc.next().charAt(0);
		while (respost == 'S' || respost == 's') {
			System.out.println("Digite o valor: ");
			teste.num = sc.nextInt();
			System.out.println("Quer verificar um numero <S/N>");
			respost = sc.next().charAt(0);
		}
		resul = teste.somar();
		System.out.printf("A quantidade de impars: %d", resul);
		sc.close();
	}

}
