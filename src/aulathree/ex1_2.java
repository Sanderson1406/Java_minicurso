package aulathree;
import java.util.Scanner;
public class ex1_2 {

	public static void main(String[] args) {
		int sm = 788;
		double sl;
		int resul;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Salario do usuario R$ ");
		sl  = sc.nextDouble();
		resul = soma(sm, sl);
		System.out.printf("RESULTADO = %d ",  resul);
		sc.close();
	}
	public static int soma(int sm, double sl) {
		int cont;
		for (cont = 0; sl >= sm; cont++) {
			sl = sl -sm;
		}
		return cont;
	}

}
