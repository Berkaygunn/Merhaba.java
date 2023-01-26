package Gun30._02_FinalVariables.Ornek2;

import java.util.Scanner;

public class Soru {
    // Sabitler isimli bir Class da sabit bir şekilde
    // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
    // bir dakikadaki saniye sayısını tanımlayınız.
    // mainde kullanıcıdan gun, saat, dakika alarak toplam
    // saniyeyi bulunuz.
    public static void main(String[] args) {

        int gun=0;
        int saat=0;
        int dakika=0;

        Scanner read=new Scanner(System.in);
        System.out.print("Gün ="); gun= read.nextInt();
        System.out.print("Saat ="); saat= read.nextInt();
        System.out.print("Dakika ="); dakika= read.nextInt();

        int toplamSaniye=
                gun
                *Sabitler.gundekiSaat
                *Sabitler.saatekiDakika
                *Sabitler.dakikadaSaniye
                +
                        saat
                *Sabitler.saatekiDakika
                *Sabitler.dakikadaSaniye
                +
                        dakika
                *Sabitler.dakikadaSaniye;

        System.out.println("toplamSaniye = " + toplamSaniye);


    }

}
