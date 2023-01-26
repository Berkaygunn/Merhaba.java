package Gun10;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {
        //  && 've' işaretimiz
        //  || 'veya' işaretimiz

        //girilen sayı pozitif ve tek ise ekrana uygun sayı girildi
        //değilse uygun sayı girilmedi yazdırınız.
        Scanner read=new Scanner(System.in);
        System.out.print("sayı=");
        int number=read.nextInt();

        if (number%2==1 && number >0)
            System.out.println("Uygun sayı girildi");
        else
            System.out.println("Uygun sayı girilmedi");
    }
}
