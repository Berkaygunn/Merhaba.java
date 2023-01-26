package Gun14;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.

        Scanner read=new Scanner(System.in);
        System.out.print("Metin giriniz =");
        String text= read.nextLine();

        for (int i=0;i<text.length();i++)
        {
            if(text.charAt(i)==' ')
                continue;

            System.out.println(text.charAt(i));
        }

    }
}
