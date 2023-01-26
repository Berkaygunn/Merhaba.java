package Gun13;

import java.util.Scanner;

public class _08_DoWhile {
    public static void main(String[] args) {
        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner read=new Scanner(System.in);
        String text;

        do {
            System.out.print("ifade giriniz =");
            text= read.nextLine();

            if (!text.equalsIgnoreCase("x"))
              System.out.println("program çalışıyor");
        }
        while (!text.equalsIgnoreCase("x"));
        System.out.println("program bitti");

    }
}
