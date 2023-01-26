package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        // bir karenin çevresini ve alanını hesaplayın

        Scanner oku = new Scanner(System.in);

        System.out.print("kenar=");
        int kenar = oku.nextInt();

        int cevre = kenar * 4;
        int alan = kenar * kenar;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
