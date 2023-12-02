package aulaseven;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o valor na posição %d %d: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        if (verificarQuadradoMagico(matriz)) {
            System.out.println("A matriz é um quadrado mágico.");
        } else {
            System.out.println("A matriz não é um quadrado mágico.");
        }
    }

    public static boolean verificarQuadradoMagico(int[][] matriz) {
        int tamanho = matriz.length;
        int somaEsperada = 0;
        for (int i = 0; i < tamanho; i++) {
            somaEsperada += matriz[0][i];
        }
        for (int i = 0; i < tamanho; i++) {
            int somaLinha = 0;
            for (int j = 0; j < tamanho; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha != somaEsperada) {
                return false;
            }
        }
        for (int i = 0; i < tamanho; i++) {
            int somaColuna = 0;
            for (int j = 0; j < tamanho; j++) {
                somaColuna += matriz[j][i];
            }
            if (somaColuna != somaEsperada) {
                return false;
            }
        }
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < tamanho; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        if (somaDiagonalPrincipal != somaEsperada) {
            return false;
        }
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < tamanho; i++) {
            somaDiagonalSecundaria += matriz[i][tamanho - 1 - i];
        }
        if (somaDiagonalSecundaria != somaEsperada) {
            return false;
        }
        return true;
    }
}

