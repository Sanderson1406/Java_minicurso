package bonus;
import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int soma;
        n = sc.nextInt();
        soma = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        for (int j = 1; j < n; j++) {
            int nextValue = j + 1;
            if (j + nextValue == soma) {
                System.out.printf("%d %d\n", j, nextValue); 
            }
        }
    }
}
