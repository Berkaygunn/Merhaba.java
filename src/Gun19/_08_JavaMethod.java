package Gun19;

import java.util.Arrays;

public class _08_JavaMethod {
    public static void main(String[] args) {
        // 20 elemanlı bir dizinin elemanlarını 100 e kadar random sayılarla
        // bir fonksiyonda doldurunuz ve aynı fonksiyonda yazdırınız.


        int[] dizi=new int[20];


        diziDoldurYazdir(dizi);
    }
    public static void diziDoldurYazdir(int[] sayilar){

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i]=(int)(Math.random()*101);
        }

        System.out.println("sayılar =" + Arrays.toString(sayilar));
    }



}
