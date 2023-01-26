package Gun05;

import java.util.Scanner;

public class _02_Ornek1 {
    public static void main(String[] args) {
        // girilen bir adı ekrana yazdırınız.

        Scanner okuyucu=new Scanner(System.in);

        System.out.print("Adınızı giriniz");
        String ad= okuyucu.next(); // next () bir kelime okur.

        System.out.println("ad = " + ad);

        // okuyucu.next();    ->  bir kelime okur.
        //okuyucu.nextLine(); -> satırın tümünü okur.
    }
}
