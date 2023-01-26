package Gun12;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        // daha önce çözdüğünüz hesap makinesi sorusunu
        // switch ile çözünüz.

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
        switch (secim.toUpperCase())
        {
            case "T":System.out.println("Toplam ="+(sayi1+sayi2)); break;
            case "Ç":System.out.println("Çıkarma ="+(sayi1-sayi2)); break;
            case "P":System.out.println("Çarpma ="+(sayi1*sayi2)); break;
            case "B":System.out.println("Bölme ="+(sayi1/sayi2)); break;
            default: System.out.println("doğru seçimi yapın");


        }



    }


}
