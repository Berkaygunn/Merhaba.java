package Gun25._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class SoruCozum {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        Scanner read=new Scanner(System.in);

        ArrayList<Ogrenci> snf=new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Ogrenci ogr=new Ogrenci();

            System.out.print("Okul no ="); ogr.okulNo= oku.nextInt();
            System.out.print("Tam adı ="); ogr.tamAdi= read.nextLine();
            System.out.print("Notu ="); ogr.notu= oku.nextInt();

            snf.add(ogr);
        }

        bilgileriYazdir(snf);
        ortalamaYaz(snf);
    }
     public static void bilgileriYazdir( ArrayList<Ogrenci> snf)
    {
        for (Ogrenci ogr :snf){
            System.out.println("ogr.okulNo = " + ogr.okulNo);
            System.out.println("ogr.tamAdi = " + ogr.tamAdi);
            System.out.println("ogr.notu = " + ogr.notu);
        }
    }

    public static void ortalamaYaz( ArrayList<Ogrenci> snf)
    {
        int toplam=0;
        for (Ogrenci ogr: snf){
            toplam+= ogr.notu;
        }
        System.out.println("ort = " + (toplam/ snf.size()) );
    }
}
