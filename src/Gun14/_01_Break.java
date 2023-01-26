package Gun14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        // girilen bir sayının, 2 aynı sayının carpımına
        // eşit olup olmadığını bulunuz.
        // 4 girdim -> 2*2 bu tam karedir.
        // 5 girdim -> değildir.
        // 9 girdim -> 3*3 bu tam karedir.

        Scanner read=new Scanner(System.in);

        System.out.print("Sayı giriniz =");
        int sayi= read.nextInt();
        int sayac=0;
        boolean tamkare=false;

        while (sayac<sayi)
        {
            if (sayac * sayac == sayi) {
                System.out.println("tam karedir");
                break;

            }

            sayac++;
        }
           if(tamkare==true)
            System.out.println("girdiğiniz sayı tam kare değildir.");

    }
}
