package Gun06;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {

        // girilen bir stringin sadece son harfini yazdırınız.

        Scanner oku= new Scanner(System.in);

        System.out.print("String gir=");
        String cumle=oku.nextLine();

        int uzunluk=cumle.length();
        char sonharf=cumle.charAt(uzunluk-1);

        System.out.println("sonharf = " + sonharf);

        //2.Yöntem
        System.out.println("son harf = " + cumle.charAt(cumle.length()-1));
    }
}
