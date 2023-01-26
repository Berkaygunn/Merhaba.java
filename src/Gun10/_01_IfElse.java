package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir öğrenci notuna göre 50 den büyük eşit ise geçtiniz.
        // küçük ise kaldınız yazdırınız.

        Scanner oku=new Scanner(System.in);

        // 1. yöntem (Önceki)
        System.out.print("Öğrenci notu =");
        int not=oku.nextInt();

        if (not >= 50)
            System.out.println("Geçtiniz");

        if (not < 50)
            System.out.println("Kaldınız");

        // 2.yöntem (olması gereken)

        if (not >=50)  // her zaman tek bir kontrol yapar : baklava dilimi
            System.out.println("Geçtiniz");   // evet

        else
            System.out.println("Kaldınız");  // hayır


    }
}
