package Gun22;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
        int sayi=5; // tek bir rakam tutabilen bir değişken
        int[] dizi=new int[20]; // 20 adet sayı saklayabilen bir değişken,uzunluğu sabit
        int[][] tablo=new int[20][2]; // 20x2 lik sayı saklayabilen değişken,sabit uzunluklu

        ArrayList<Integer> liste=new ArrayList<>();
        /***************/

        // bir sınıf bu sınıfta 20 kişi var ve bunların 3 dersi olsun.öğrencilerin bu 3 dese ait notlarını
        // nasıl bir değişkende saklayabilirim
        ArrayList<Integer> matNotlari=new ArrayList<>();
        ArrayList<Integer> fizNotlari=new ArrayList<>();
        ArrayList<Integer> kimNotlari=new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        // ArrayList in ArrayList i ni nasıl yaparım
        ArrayList< ArrayList<Integer>  > notlarListesi=new ArrayList<>(); // Listelerin listesi
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);

        notlarListesi.get(0); // matNotlari
        int matBirNot=notlarListesi.get(0).get(0); // mat notlarının ilkini attım.

        System.out.println("matBirNot = " + matBirNot);

        System.out.println("notlarListesi = " + notlarListesi.get(0));
        System.out.println("notlarListesi = " + notlarListesi.get(1));
        System.out.println("notlarListesi = " + notlarListesi.get(2));

        // yurkarıdakinin yerine bir for döngüsü nasıl kullanırız
        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println("notlarListesi = " + notlarListesi.get(i));
        }

        /********* satır sütun yazdırma *****/
        for (int i = 0; i < notlarListesi.size(); i++) {
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {   //notlar[].length
                System.out.println(notlarListesi.get(i).get(j)+"\t"); //notlar[i][j]
            }
            System.out.println();
        }








    }
}
