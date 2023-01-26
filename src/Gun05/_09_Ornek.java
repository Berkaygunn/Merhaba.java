package Gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        // kullanıcıdan ağırlığını ve boyunu double olarak alınız
        // ve bir satırda boyunuz ve kilonuz yazdırınız.
        // vücut kitle indexini de bularak yazdırnız

        Scanner deger = new Scanner(System.in);

        System.out.print("kilonuz=");
        double kilo = deger.nextDouble();

        System.out.print("boyunuz=");
        double boy = deger.nextDouble();

        System.out.println("kilonuz ve boyunuz = " + kilo + " " + boy);

        double index = kilo / (boy * boy);
        System.out.println("index = " + index);
    }
}
