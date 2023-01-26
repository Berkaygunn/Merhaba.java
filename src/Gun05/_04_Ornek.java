package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // kullanıcıdan adını ve soyadını ayrı ayrı okutarak
        // alıp birlikte ekrana yazdırınz.

        Scanner okuyucu=new Scanner(System.in);

        System.out.print("ad");
        String ad=okuyucu.nextLine();

        System.out.print("soyad");
        String soyad=okuyucu.nextLine();
        System.out.println("Adınız ve soyadınız= "+ad+" "+soyad);

    }
}
