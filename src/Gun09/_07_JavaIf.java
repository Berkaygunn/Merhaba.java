package Gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // girilen cümledeki küçük veya büyük a harfinin olup olmadığını
        //  var veya yok şekilde yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print("Cümle =");
        String cumle=oku.nextLine();

        cumle=cumle.toLowerCase();

        if (cumle.contains("a") )
            System.out.println("VAR");

        if ( !cumle.contains("a") )
            System.out.println("YOK");

        //2.yol
        if (cumle.indexOf("a") != -1)
            System.out.println("VAR");

        if (cumle.indexOf("a") == -1)
            System.out.println("YOK");

        //3.yol
        boolean varmi=cumle.contains("a");
        if (varmi == true)
            System.out.println("VAR");
        if (varmi == false)
            System.out.println("YOK");

    }
}
