package Gun16;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {
        // 50 kişi var
        int ogrnot;
        int ogrnot2;
        //....
        //....
        int ogrnot50;

        // bana bir tanımlamada birden fazla değer tutabilen bir değişkene ihtiyacım var.
        // ÇÖZÜM;
        int[] notlar =new int[50]; // 50 tane int saklar.

        notlar[0]=75;
        notlar[1]=88;
        //...
        //...
        notlar[49]=95; // en son elemean toplam sayısı -1 length -1 dir böylede 0-49 index tir.

        System.out.println("notlar[0] = " + notlar[0]);
        System.out.println("notlar.length = " + notlar.length);

        Scanner read=new Scanner(System.in);
        for (int i=0; i<notlar.length;i++)
        {
            System.out.print("Notu giriniz =");
            notlar[i]= read.nextInt();
        }
        for (int i=0; i<notlar.length;i++)
        {
            System.out.println(notlar[i]);
        }
    }
}
