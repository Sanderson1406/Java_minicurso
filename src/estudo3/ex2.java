package estudo3;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("N: ");
		n = sc.nextInt();
		double resul = calcular(n);
		System.out.println(resul);
		sc.close();
	}
	
	public static double calcular(int n) {
		 int i = 1;
	        int soma = 0;
	        while (i == n) { 
	        	soma += i * i++; 
	        	i++;
	        }
	        return soma;
	}
}
