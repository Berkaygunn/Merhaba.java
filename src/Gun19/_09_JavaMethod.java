package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _09_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        Scanner read=new Scanner(System.in);
        int[] dizi=new int[5];

        for (int i = 0; i <5 ; i++) {
            System.out.print(i+".sayi =");
            dizi[i]=read.nextInt();
        }
        System.out.println(Arrays.toString(dizi));

        enKucukYaz(dizi);
        enBuyukYaz(dizi);
        ortalamaYaz(dizi);

    }

    public static void enKucukYaz(int[] sayilar)
    {
        Arrays.sort(sayilar);
        System.out.println("en küçük = " + sayilar[0]);
    }

    public static void enBuyukYaz(int[] sayilar)
    {
     Arrays.sort(sayilar);
        System.out.println("en büyük = " + sayilar[sayilar.length-1]);
    }

    public static void ortalamaYaz(int[] sayilar)
    {
        int toplam=0;
        int ort=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam+=sayilar[i];
        }
        ort=toplam/sayilar.length;
        System.out.println("ort = " + ort);
    }
}
