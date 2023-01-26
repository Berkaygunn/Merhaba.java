package Gun10;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // girilen sayının tek mi çift mi olduğunu yazdırınız
        Scanner oku=new Scanner(System.in);

        System.out.print("sayı giriniz= ");
        int number= oku.nextInt();

        if (number % 2==0)
            System.out.println("ÇİFT");
        else
            System.out.println("TEK");
    }
}
