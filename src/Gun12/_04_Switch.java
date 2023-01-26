package Gun12;

import java.util.Scanner;

public class _04_Switch {
    public static void main(String[] args) {
        // kullanıcının girdiği gün numarasına karşılık gelen günün adını yazınız.

        Scanner read=new Scanner(System.in);
        System.out.print("Gün=");
        int day= read.nextInt();

        switch (day) {
            case 1: System.out.println("pazartesi"); break;
            case 2:System.out.println("salı"); break;
            case 3:System.out.println("çarşamba"); break;
            case 4:System.out.println("perşembe"); break;
            case 5:System.out.println("cuma"); break;
            case 6:System.out.println("cumartesi"); break;
            case 7:System.out.println("pazar"); break;
            default: System.out.println("hatalı numara");
        }

    }
}
