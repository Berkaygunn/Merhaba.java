package Gun06;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        // girilen bir ad soyadı örneğin "Ismet Temur" I.T şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Adınız ve Soyadınız =");
        String adsoyad= oku.nextLine();

        char ilkharf=adsoyad.charAt(0); // b
        int boslukIndex=adsoyad.indexOf(" ");
        char soyadilkharf=adsoyad.charAt(boslukIndex+1); // g

        System.out.println(ilkharf+"."+soyadilkharf+".");



    }
}
