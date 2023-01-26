package Gun14;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        //girilen bir sayıya kadar olan sayıların çarpımını bulunuz.
        //2.bölüm: carpimin değeri 10000 i geçtiğinde işlem sonlasın.

        Scanner read=new Scanner(System.in);

        int i=1;
        int carpim=1;
        System.out.print("sayı giriniz =");
        int sayi= read.nextInt();

        for (i=1; i<=sayi; i++)
        {
            carpim*=i;
           if (carpim>10000) {
               System.out.println("işlem sonlandı");
               break;
           }

        }

        System.out.println("carpim = " + carpim);
    }
}
