package Gun16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        //50 kişik bir sınıfın notlarını giriniz ve ortalamadan büyük
        //kaç not olduğunu bulunuz ve buları yazdırınız.

        int[] notlar=new int[50];

        Scanner read= new Scanner(System.in);
        int toplam=0;
        int gecenler=0;
        for (int i=0; i<notlar.length; i++)
        {
            System.out.print("not =");
            notlar[i]= read.nextInt();

            toplam+=notlar[i];
        }
        int ort=toplam/notlar.length;

        for (int i=0; i<notlar.length;i++)
        {
            if (notlar[i]>ort) {
                System.out.println("ortalamadan büyük notlar" + notlar[i]);
                gecenler++;
            }
        }
        System.out.println("ort = " + ort);
        System.out.println("geçenler = " + gecenler);
    }
}
