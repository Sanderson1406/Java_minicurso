package estudo4;
import java.util.Scanner;
import entidades2.one;
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		one aluno = new one();
		System.out.println("Nota A: ");
		aluno.notaa = sc.nextDouble();
		System.out.println("Nota B: ");
		aluno.notab = sc.nextDouble();
		System.out.println("Nota C: ");
		aluno.notac = sc.nextDouble();
		System.out.println("Nota D: ");
		aluno.notad = sc.nextDouble();
		
		double resul = aluno.media();
		if (resul >= 6) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}
		sc.close();
	}

}
