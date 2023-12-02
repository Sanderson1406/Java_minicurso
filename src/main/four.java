package main;
import java.util.Scanner;
public class four {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    double a, b, c;
	    double tri;
	    double cir,tra, qua, ret;
	    System.out.println("Digite um numero para A: ");
	    a = sc.nextInt();
	    System.out.println("Digite um numero para B: ");
	    b = sc.nextInt();
	    System.out.println("Digite um numero para C: ");
	    c = sc.nextInt();
	    tri = (a * c) / 2;
	    System.out.println("TRIANGULO: " + tri);
	    cir = 3.14159 * (c * c);
	    System.out.println("CIRCULO: " + cir);
	    tra = ((a + b) * c) / 2;
	    System.out.println("TRAPEZIO: " + tra);
	    qua = b * b;
	    System.out.println("QUADRADO: " + qua);
	    ret = a * b;
	    System.out.println("RETANGULO: " + ret);
	}
}
