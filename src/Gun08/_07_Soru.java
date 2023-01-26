package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // girilen bir sayının tek sayı olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Sayı =");
        int sayi=oku.nextInt();

        int kalan= sayi % 2;

        System.out.println("tek mi ="+(kalan==1));

        //2.Yöntem
        System.out.println("tek mi "+ (sayi%2 != 0)); // negatif girilme ihtimali
        //sebebi ile bu en doğru , çünkü bir üstte negatif girilirse -1 gelir








    }
}
