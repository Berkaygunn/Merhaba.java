package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        // Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        // olduğunu Ternary operatör ile yazdırınız.

        Scanner read= new Scanner(System.in);

        System.out.print("Sayı =");
        int number=read.nextInt();

        String answer=((number>0) ? "pozitif" : (number<0 ? "negatif" : "sıfır"));
        System.out.println("answer = " + answer);
    }
}
