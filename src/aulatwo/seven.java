package aulatwo;
import java.util.Scanner;
public class seven {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        double a, b, resul;
	        int code;
	        System.out.println("Digite um numero para A: ");
	        a = sc.nextDouble();
	        System.out.println("Digite um numero para B: ");
	        b = sc.nextDouble();
	        System.out.println(" 1 - Soma");
	        System.out.println(" 2 - Subtração");
	        System.out.println(" 3 - Divisão");
	        System.out.println(" 4 - Multiplicação");
	        System.out.println("Digite um codigo de operação: ");
	        code = sc.nextInt();
	        switch (code) {
	            case 1:
	                resul = a + b;
	                System.out.printf("RESULTADO = %.1f", resul);
	                break;
	            case 2:
	                resul = a - b;
	                System.out.printf("RESULTADO = %.1f", resul);
	                break;
	            case 3:
	                resul = a / b;
	                System.out.printf("RESULTADO = %.1f", resul);
	                break;
	            case 4: 
	                resul = a * b;
	                System.out.printf("RESULTADO = %.1f", resul);
	                break;
	        }
	        sc.close();
	}

}
