package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        //Kulannıcıdan adını ve soyadını alarak ekrana yazdırınız

        Scanner okuyucu=new Scanner(System.in);

        System.out.print("Adınız soyadınız");
        String advesoyad=okuyucu.nextLine();

        System.out.println("advesoyad = " + advesoyad);
    }
}
