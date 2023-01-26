package Gun13;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        // girilen 20 sayının toplamının sonucunu yazdırınız.

        Scanner read=new Scanner(System.in);

        int sayac=0;
        int toplam=0;
        while (sayac<20)
        {
            System.out.print(sayac+".sayı giriniz =");
            int sayi= read.nextInt();
            toplam=toplam+sayi;

            sayac++;

        }
        System.out.println("toplam = " + toplam);
    }
}
