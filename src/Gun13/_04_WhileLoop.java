package Gun13;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        //girilen 20 sayıdan sadece pozitif olanların toplamını bulunuz.

        Scanner read=new Scanner(System.in);

        int sayac=0;
        int toplam=0;
        while (sayac<20)
        {
            System.out.print(sayac+".sayı giriniz =");
            int sayi= read.nextInt();

            if (sayi>0)
            {
                toplam=toplam+sayi;
            }
            sayac++;
        }
        System.out.println("toplam = " + toplam);
    }
}
