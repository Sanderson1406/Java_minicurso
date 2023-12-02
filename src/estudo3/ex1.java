package estudo3;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tamanho;
		System.out.println("Tamnho do vetor: ");
		tamanho = sc.nextInt();
		int[] nums = new int[tamanho];
		for (int i = 0; i < tamanho; i++) {
			nums[i] = sc.nextInt();
		}
		double resul = media(nums, tamanho);
		System.out.printf("A média é %.1f", resul);
		sc.close();
	}
	public static double media(int[] nums, int tamanho) {
		int soma = 0;
		int retorno;
		for (int i = 0; i < tamanho; i++) {
			soma += nums[i];
		}
		retorno = soma / tamanho; 
		return retorno;
	}

}
