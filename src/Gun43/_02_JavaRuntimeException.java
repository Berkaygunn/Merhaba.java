package Gun43;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {

        System.out.println("program başladı");

        try {  // hata bölgesini try{} ine aldık
            Scanner read = new Scanner(System.in);

            System.out.print("Sayi1=");
            int sayi1 = read.nextInt();
            System.out.print("Sayi2=");
            int sayi2 = read.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);
        }
        catch (Exception hata)
        //  hata mesajlarını isimli Exception cinsinden değişkene attım
        {
            System.out.println("hata =" + hata.getMessage());
            System.out.println("lütfen tekrar deneyiniz");
        }


        System.out.println("program bitti");
    }
}
