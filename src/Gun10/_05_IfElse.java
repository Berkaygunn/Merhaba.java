package Gun10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse
        //  hayır yazdırınız.

        Scanner read = new Scanner(System.in);

        System.out.print("String =");
        String text = read.nextLine();

        if (text.length() > 10 && text.toLowerCase().contains("study")  )
        System.out.println("evet");
        else
        System.out.println("hayır");

    }
}
