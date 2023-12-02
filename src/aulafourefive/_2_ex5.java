package aulafourefive;
import java.util.Scanner;
public class _2_ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temp, conv;
		char op;
		while (true) {
			System.out.println("Digite a temperatura em ºC: ");
			temp = sc.nextDouble();
			conv = (temp * 1.8) + 32;
			System.out.printf("Temperatura em ºF: %.1f\n", conv);
			System.out.println("Deseja converter novamente? (S/N): ");
			op = sc.next().charAt(0);
			if (op == 'N' || op == 'n') {
                break;
            } else if (op != 'S' && op != 's') {
                System.out.println("OPÇÃO INVÁLIDA");
            }
		}
	}

}
