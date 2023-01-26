package Gun11;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner read=new Scanner(System.in);

        System.out.print("sayı sınırı =");
        int number= read.nextInt();

        int tutulansayi=(int)(Math.random()*number);

        System.out.print("Tahmininiz =");
        int tahmin= read.nextInt();

        if (tahmin==tutulansayi)
            System.out.println("Tebrikler");
        else
            System.out.println("bilemedin ki :) ");

    }
}
