package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen vize(%50) ve final(%50) notunu okuyarak ortalamayı bulunuz
        //        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        //        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("Sınav vize notu giriniz=");
        int vize = oku.nextInt();
        System.out.print("Sınav final notu giriniz=");
        int finall = oku.nextInt();

        int ortalama = (vize + finall) / 2;

        if (ortalama >= 60) {
            System.out.println("Geçtiniz");
            System.out.println("Tebrikler");
        } else
            System.out.println("büte kaldınız");
    }
}
