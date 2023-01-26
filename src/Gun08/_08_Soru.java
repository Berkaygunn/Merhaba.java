package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        //girilen bir cümledeki ilk kelimeyi yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Cümle giriniz =");
        String cumle=oku.nextLine();

        int boslukindex=cumle.indexOf(" ");

        System.out.println("cumle.substring(0,boslukindex ) = " + cumle.substring(0,boslukindex));


    }
}
