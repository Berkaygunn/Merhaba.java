package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {


        Scanner oku = new Scanner(System.in);

        System.out.print("Kısa kenar");
        int kisakenar = oku.nextInt();
        System.out.print("uzun kenar");
        int uzunkenar = oku.nextInt();

        int cevre = 2 * (kisakenar + uzunkenar);
        int alan = kisakenar * uzunkenar;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
