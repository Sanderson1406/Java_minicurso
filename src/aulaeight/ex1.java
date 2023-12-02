package aulaeight;
import java.util.Scanner;
import entidades.funcoes;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        funcoes notas = new funcoes();
        String aluno;
        System.out.println("Nome do aluno: ");
        aluno = sc.next();
        System.out.println("Nota 1: ");
        notas.nota1 = sc.nextDouble();
        while (notas.nota1 < 0 || notas.nota1 >= 30) {
            System.out.println("Nota 1 inválida, tente novamente: ");
            notas.nota1 = sc.nextDouble();
        }

        System.out.println("Nota 2: ");
        notas.nota2 = sc.nextDouble();
        while (notas.nota2 >= 35) {
            System.out.println("Nota 2 inválida, tente novamente: ");
            notas.nota2 = sc.nextDouble();
        }

        System.out.println("Nota 3: ");
        notas.nota3 = sc.nextDouble();
        while (notas.nota3 >= 35) {
            System.out.println("Nota 3 inválida, tente novamente: ");
            notas.nota3 = sc.nextDouble();
        }

        double soma = notas.soma();
        String result = notas.diferenca();
        double falta = notas.falta();

        System.out.printf("O aluno {%s} teve um total da sua nota de {%.1f}%n", aluno, soma);
        System.out.printf("Falta {%.2f} para {%s} alcançar a média%n", falta, aluno);
        System.out.println(result);

        sc.close();
    }
}
