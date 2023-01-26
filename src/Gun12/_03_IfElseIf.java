package Gun12;

import java.util.Scanner;

public class _03_IfElseIf {
    public static void main(String[] args) {
        // Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner read = new Scanner(System.in);
        System.out.print("ders =");
        String ders = read.nextLine();
        System.out.print("not =");
        int not = read.nextInt();

        System.out.println("ders ve not = " + ders + ":" + not);

        if (not >= 90)
            System.out.println("A");
        else if (not >= 80)
            System.out.println("B");
        else if (not >= 70)
            System.out.println("C");
        else if (not >= 60)
            System.out.println("D");
        else if (not >= 40)
            System.out.println("E");
        else
            System.out.println("F");


    }
}
