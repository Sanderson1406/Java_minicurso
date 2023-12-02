package aulathree;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		String l;
		System.out.println("Digite a nota A: "); 
		a = sc.nextDouble();
		System.out.println("Digite a nota B: ");
		b = sc.nextDouble();
		System.out.println("Digite a nota C: ");
		c = sc.nextDouble();
		System.out.println("Digite <A/a> para media aritmetica ou <P/p> para media ponderada");
		l = sc.next();
		double resul = media(a, b, c, l);
		System.out.printf("RESULTADO= ", resul);
		
		sc.close();
	}
	public static double media(double a, double b, double c, String l) {
		int peso1 = 5;
		int peso2 = 3;
		int peso3 = 2;
		int somapeso = peso1 + peso2 + peso3;
		if (l == "a" || l == "A") {
			return (a + b + c) /  3;
		} else if (l == "p" || l == "P") {
			return ((a*peso1)+ (b*peso2) +(c*peso3)) / somapeso;
		} 
		return 0.0;
	}

}
