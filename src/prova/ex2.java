package prova;
import java.util.Arrays;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] niveis = new int[4];
        int i;
		for (i = 0; i < 4; i++) {
            niveis[i] = sc.nextInt();
        }
		Arrays.sort(niveis);
        int diferenca1 = Math.abs((niveis[0] + niveis[1]) - (niveis[2] + niveis[3]));
        int diferenca2 = Math.abs((niveis[0] + niveis[2]) - (niveis[1] + niveis[3]));
        int diferenca3 = Math.abs((niveis[0] + niveis[3]) - (niveis[1] + niveis[2]));
       int menorDiferenca = Math.min(diferenca1, Math.min(diferenca2, diferenca3));
        System.out.println(menorDiferenca);
        sc.close();
    }
	}
