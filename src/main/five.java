package main;
import java.util.Scanner;
public class five {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        double a, b, c, d;
	        double dif;
	        System.out.println("Digite um numero para A: ");
	        a = sc.nextDouble();
	        System.out.println("Digite um numero para B: ");
	        b = sc.nextDouble();
	        System.out.println("Digite um numero para C: ");
	        c = sc.nextDouble();
	        System.out.println("Digite um numero para D: ");
	        d = sc.nextDouble();
	        dif = (a * b) - (c * d);
	        System.out.println("DIFERENCA = " + dif);
	        sc.close();
	}
}