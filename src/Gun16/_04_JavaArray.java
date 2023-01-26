package Gun16;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

        int[] sayi=new int[7];

        Scanner read=new Scanner(System.in);
        int toplam=0;
        int gecenler=0;
        for (int i = 0; i < sayi.length ; i++) {
            System.out.print("sayı =");
            sayi[i]=read.nextInt();

            toplam+=sayi[i];
        }
        int ort=toplam/ sayi.length;
        for (int i = 0; i < sayi.length; i++) {
            
            if (sayi[i]>ort && sayi[i] % 2==1)
                gecenler++;
        }
        System.out.println("ort = " + ort);
        System.out.println("ortalamayı geçen ve tek sayılar = " + gecenler);
    }
}
