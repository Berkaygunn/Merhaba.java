package Gun12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner read = new Scanner(System.in);

        System.out.print("sayı1 =");
        int sayi1 = read.nextInt();
        System.out.print("sayı2 =");
        int sayi2 = read.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Çıkarmaiçin Ç");
        System.out.println("Çarpma için P");
        System.out.println("Bölme için B");
        System.out.print("Hangi işlemi istiyorsunuz =");
        Scanner oku = new Scanner(System.in);
        String secim = oku.next();

        if (secim.equalsIgnoreCase("T"))
            System.out.println("Toplam = " + (sayi1 + sayi2));
        else if (secim.equalsIgnoreCase("Ç"))
            System.out.println("Çıkarma = " + (sayi1 - sayi2));
        else if (secim.equalsIgnoreCase("P"))
            System.out.println("Çarpma = " + (sayi1 * sayi2));
        else if (secim.equalsIgnoreCase("B"))
            System.out.println("Bölme = " + (sayi1 / sayi2));
        else
            System.out.println("İstenilen işlemi seçiniz");


    }
}
