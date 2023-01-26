package Gun19;

import java.util.Scanner;

public class _07_JavaMethod {
    public static void main(String[] args) {
        tekMiCiftMi(55);
        tekMiCiftMi(60);

        // kullanıcıdan sayı alarak onu tek mi çift mi yazdıralım
        tekMiCiftMiOku();
    }
    public static void tekMiCiftMi(int sayi){
        if (sayi % 2 !=0)
            System.out.println("tek");
        else
            System.out.println("çift");
    }
    public static void tekMiCiftMiOku(){
        Scanner read=new Scanner(System.in);
        System.out.print("sayı girin =");
        int sayi= read.nextInt();

        tekMiCiftMi(sayi);
    }
}
