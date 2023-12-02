package aulathree;
import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s, ss;
        System.out.println("Digite a String");
        s = sc.next();
        ss = remover(s);
        System.out.println(ss);
        sc.close();
    }

    public static String remover(String s) {
        return s.replaceAll("[aeiouAEIOU]", "");
    }
}
