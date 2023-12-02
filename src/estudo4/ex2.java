package estudo4;
import java.util.Scanner;
import entidades2.two;
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] s = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um valor: ");
			s[i] = sc.nextInt();
		}
		two vetor = new two();
		vetor.nums = s;
		int resul = vetor.soma();
		System.out.printf("A soma é %d", resul);
		sc.close();
	}

}
