package Gun03;

public class _05_Ornek1 {
    public static void main(String[] args) {
        // iki kenarı tanımlı olarak verilen bir dikdörtgenin çevre ve alanını bulunuz.


        int kisakenar = 4;
        int uzunkenar = 7;
        
        int cevre = 2 * (kisakenar + uzunkenar);
        int alan = kisakenar * uzunkenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
