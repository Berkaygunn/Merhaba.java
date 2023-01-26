package Gun32._03_Encapsulation;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);
        Scanner read=new Scanner(System.in);

        Okul yeniOkul=new Okul("Kabataş Okulu",3);

        do {
            System.out.print("Adınız ="); String ad= read.nextLine();
            System.out.print("Soyadınız ="); String soyad= read.nextLine();
            System.out.print("Yaşınız ="); int yas= okuInt.nextInt();
            if (yas <15)
            {
                Ogrenci ogr=new Ogrenci(ad,soyad,yas);
                yeniOkul.getOgrenciler().add(ogr);

            }
            else
            {
                System.out.println("Öğrenci yaşı okul için uygun değil");
            }
        }while (yeniOkul.getOgrenciler().size() < yeniOkul.getKontenjan());

        System.out.println(" Öğrenciler = " + yeniOkul.getOgrenciler());
    }
}
