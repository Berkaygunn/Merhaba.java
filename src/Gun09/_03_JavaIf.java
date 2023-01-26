package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        //girilen iki sayıdan büyük olanın değerini ekrana yazdırınız
        //eşit ise eşit yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print("sayi1 giriniz=");
        int sayi1= oku.nextInt();

        System.out.print("sayi2 giriniz=");
        int sayi2= oku.nextInt();

        if (sayi1 > sayi2)
            System.out.println("sayi1 = " + sayi1);

        if (sayi1 == sayi2)
            System.out.println("sayılar birbirine eşittir");

    }
}
