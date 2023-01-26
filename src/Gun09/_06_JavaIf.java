package Gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        // girilen bir cümlede a harfinin geçip geçmediğini
        // bulunuz geçiyor ise evet geçmiyorsa hayır yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print("Cümle =");
        String cumle=oku.nextLine();

        if (cumle.contains("a") )
            System.out.println("EVET");

        if ( !cumle.contains("a") )
            System.out.println("HAYIR");

        //2.yol
        if (cumle.indexOf("a") != -1)
            System.out.println("EVET");

        if (cumle.indexOf("a") == -1)
            System.out.println("HAYIR");

        //3.yol
        boolean varmi=cumle.contains("a");
        if (varmi == true)
            System.out.println("EVET");
        if (varmi == false)
            System.out.println("HAYIR");







    }
}
