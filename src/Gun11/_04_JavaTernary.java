package Gun11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        //Soru: Girilen sayı 50 den büyük ise 1 , değilse 0 değerini ekrana yazdırınız.
        // Ternary operatör ile yapınız.

        Scanner read=new Scanner(System.in);

        System.out.print("sayı =");
        int number=read.nextInt();

        int answer=((number > 50) ? 1 : 0);
        System.out.println("answer = " + answer);
    }
}
