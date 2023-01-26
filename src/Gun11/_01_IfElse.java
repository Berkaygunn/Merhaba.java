package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //Girilen bir sayının pozitif,negatif veya sıfır olduğunu yazdırınız.

        Scanner read=new Scanner(System.in);

        System.out.print("Sayı giriniz =");
        int number= read.nextInt();

        if (number>0)
            System.out.println("Pozitif");
        else
        {
            if (number == 0)
                System.out.println("0");
            else
                System.out.println("Negatif");
        }


    }
}
