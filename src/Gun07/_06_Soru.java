package Gun07;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // tek seferde girilen bir ad soyadın adını ve soyadını ayırıp
        // ayrı ayrı yazdırınız (sadece ad ve soyad)

        Scanner oku=new Scanner(System.in);

        System.out.print("Adınız Soyadınız = ");
        String adsoyad=oku.nextLine();

        int boslukIndex=adsoyad.indexOf(" ");
        String ad=adsoyad.substring(0,boslukIndex);
        String soyad=adsoyad.substring(boslukIndex+1);

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);


    }
}
