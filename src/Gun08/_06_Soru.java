package Gun08;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // kullanıcının gireceği 2 sayının birbirine
        // eşit mi olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("a değeri girin=");
        int a=oku.nextInt();

        System.out.print("b değeri girin=");
        int b=oku.nextInt();


        System.out.println("a b ye eşit mi ? = " + (a==b));

    }
}
