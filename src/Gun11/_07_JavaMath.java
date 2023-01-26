package Gun11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        // Math.max yöntemi ile girilen 3 sayıdan büyük olanı yazınız.
        Scanner read=new Scanner(System.in);

        System.out.print("sayı1 =");
        int number1= read.nextInt();
        System.out.print("sayı2 =");
        int number2= read.nextInt();
        System.out.print("sayı3 =");
        int number3= read.nextInt();

       //1.Yöntem
        int enb=Math.max(number1,number2);
        enb=Math.max(enb,number3);
        System.out.println("enb = " + enb);

        //2.Yöntem
        int enb2=Math.max(number1, Math.max(number2,number3));
        System.out.println("enb2 = " + enb2);
    }
}
