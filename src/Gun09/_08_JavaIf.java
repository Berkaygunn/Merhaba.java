package Gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        // kullanıcının 2 kez gireceği şifresinin aynı olduğunu
        // aynı veya değil şeklinde cevaplayınız

        Scanner oku = new Scanner(System.in);

        System.out.print("ŞİFRE =");
        String sifre = oku.nextLine();

        System.out.print("ŞİFRE TEKRAR =");
        String sifretekrar = oku.nextLine();

        boolean aynimi=sifre.equals(sifretekrar);

        if (aynimi == true)
            System.out.println("AYNI");

        if (aynimi == false)
            System.out.println("DEĞİL");


    }
}
