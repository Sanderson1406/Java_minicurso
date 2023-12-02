package trabalho;
import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pnt = 1;
        int a = 1; 
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }

        int[] vetor2 = new int[n]; 
        for (int i = 1; i < n; i++) { 
            if (vetor[i] == vetor[i - 1]) {
                a++; 
            } else {
                a = 1; 
            }
            vetor2[i] = a; 
        }

        int maior = vetor2[0];

        for (int i = 1; i < n; i++) { 
            if (vetor2[i] > maior) {
                maior = vetor2[i];
            }
        }

        System.out.println(maior);
        sc.close();
    }
}
