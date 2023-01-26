package Gun14;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {


        Scanner read=new Scanner(System.in);

        int i=0;
        int toplam=0;
        System.out.print("girilen sayı= ");
        int sayi= read.nextInt();

        for (i=0; i<=sayi; i++)
        {
            toplam=toplam+i;
        }
        System.out.println("toplam = " + toplam);



    }
}
