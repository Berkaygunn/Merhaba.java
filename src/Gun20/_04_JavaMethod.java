package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        // kullanıcının gireceği 2 sayının toplamını
        //bir fonksiyonda buldurup,bunun sonucunu mainde yazdırınız.

        Scanner read=new Scanner(System.in);

        System.out.print("1.sayı =");
        int sayi1= read.nextInt();

        System.out.print("2.sayı =");
        int sayi2= read.nextInt();

        int sonuc=toplams(sayi1,sayi2);
        System.out.print("sonuc = " + sonuc);
    }
    public static int toplams (int s1, int s2)
    {
        int toplam=0;
        toplam=s1+s2;

        return toplam;

        //2.yöntem
        // return (s1+s2);
    }

}
