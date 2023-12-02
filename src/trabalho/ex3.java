package trabalho;
import java.util.Scanner; 
public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p1 = 0;
		int p2= 0;
		int c1 =0 ;
		int c2 = 0;
		p1 = sc.nextInt();
		c1 = sc.nextInt();
		p2 = sc.nextInt();
		c2 = sc.nextInt();
		int s1 = p1 * c1;
		int s2 = p2 * c2;
		if (s1 == s2) {
			System.out.println("0");
		} else if (s1 > s2) {
			System.out.println("-1");
		} else {
			System.out.println("1");
		}
		sc.close();
	}

}
