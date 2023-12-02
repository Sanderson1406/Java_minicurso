package aulafourefive;
import java.util.Scanner;
public class _2_ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        int a = 0;
        int g = 0;
        int d = 0;

        while (true) {
            System.out.println("Digite o tipo de combustível:");
            System.out.println("1. Álcool // 2. Gasolina //  3. Diesel //  4. Fim");
            op = sc.nextInt();

            if (op == 1) {
                a++;
            } else if (op == 2) {
                g++;
            } else if (op == 3) {
                d++;
            } else if (op == 4) {
                break;
            } else {
                System.out.println("Opção inválida");
            }
        }

        System.out.println("MUITO OBRIGADO : )");
        System.out.println("Álcool: " + a);
        System.out.println("Gasolina: " + g);
        System.out.println("Diesel: " + d);
        sc.close();
    }
}
