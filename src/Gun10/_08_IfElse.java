package Gun10;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123

        Scanner read=new Scanner(System.in);

        System.out.print("1 boşluklu 3 sayı dizesi girin =");
        String numbers=read.nextLine();

        int bosluk1=numbers.indexOf(" ");
        int bosluk2=numbers.lastIndexOf(" ");
        // int bosluk2yontem=numbers.indexOf(" ",bosluk1+1); // 2. boşluğu aramaya verilen yerden sonra başla

        int number1=Integer.parseInt(numbers.substring(0,bosluk1));
        int number2=Integer.parseInt(numbers.substring(bosluk1+1,bosluk2));
        int number3=Integer.parseInt(numbers.substring(bosluk2+1));

        if ((number1+number2+number3)% 2==0)
            System.out.println("Çift");
        else
            System.out.println("Tek");

    }
}
