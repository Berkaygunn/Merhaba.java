package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        // kullanıcının gireceği sayının tek mi çift mi olduğunu yazdırınız

        Scanner read=new Scanner(System.in);
        System.out.print("sayi=");
        int sayi=read.nextInt();

        String sonuc=(sayi % 2 ==0) ? "çift" : "tek"; // ? -> if  : -> else
        System.out.println("sonuc = " + sonuc);

    }
}
