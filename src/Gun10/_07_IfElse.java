package Gun10;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67 gibi.

        Scanner read =new Scanner(System.in);

        System.out.print("sayı dizesi =");
        String numbers=read.nextLine();

        int bosluk=numbers.indexOf(" ");
        String strnumber1=numbers.substring(0,bosluk);
        String strnumber2=numbers.substring(bosluk +1);

        int number1=Integer.parseInt(strnumber1);
        int number2=Integer.parseInt(strnumber2);

        if (number1==number2)
            System.out.println("Eşit");
        else
            System.out.println("Değil");

    }


}
