package bonus;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		int n, i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de quadrados da fita: ");
		n = sc.nextInt();
		int [] vetor = new int [n];
		int [] vetor2 = new int [n];
		int cont = Integer.MAX_VALUE;
		for (i = 0; i < n; i++) {
			System.out.println("Digite um valor para colocar na fita quadriculada: <1 - Colorido // 0 - Não Colorido>");
			vetor[i] = sc.nextInt();
		}
		for (i = 0; i < n; i++) {
			if (vetor[i] == 0) {
				cont = 0;
			}
			vetor2[i] = Math.min(vetor2[i], cont);
			cont++;
		}
		cont = Integer.MAX_VALUE;
		  for ( i = n - 1; i >= 0; i--) {
	            if (vetor[i] == 0) {
	                cont = 0;
	            }
	            vetor2[i] = Math.min(vetor2[i], cont);
	            cont++;
	        }
		  for ( i = 0; i < n; i++) {
	            if (vetor[i] == -1) {
	                vetor[i] = Math.min(vetor2[i], 9);
	            }
	        }
	        for ( i = 0; i < n; i++) {
	            System.out.print(vetor[i] + " ");
	        }
	        sc.close();
	}

}
