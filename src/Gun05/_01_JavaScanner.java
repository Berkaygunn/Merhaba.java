package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {

        int sayi = 0;

        Scanner okuyucu = new Scanner(System.in);

        System.out.print("sayi giriniz=");
        sayi = okuyucu.nextInt(); // kursor bekliyor saı girişi için.

        System.out.println("sayi = " + sayi);
    }
}
