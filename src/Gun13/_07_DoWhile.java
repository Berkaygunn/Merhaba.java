package Gun13;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        //kullanıcı 0 değeri girene kadar
        //girdiği sayıların toplamını bulunuz

        Scanner read=new Scanner(System.in);
        int sayi;
        int toplam=0;

        do {
            System.out.print("sayı giriniz =");
            sayi = read.nextInt();

            toplam = toplam + sayi;
        }

        while (sayi !=0);

        System.out.println("toplam = " + toplam);
    }
}
