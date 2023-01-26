package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        //otopark ücretleri
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

        Scanner read=new Scanner(System.in);

        System.out.print("Araba kaç saat kaldı =");
        int time=read.nextInt();

        if (time<=3)
            System.out.println("10 TL");
        else {
            if (time <= 5)
                System.out.println("15 TL");
            else
                System.out.println("20 TL");
        }

    }
}
