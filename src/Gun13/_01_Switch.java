package Gun13;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        //Girilen bir ay numarasına göre kaç gün sürdüğünü yazdırın.

        Scanner read=new Scanner(System.in);

        System.out.print("Ay numarası girin =");
        int ay=read.nextInt();

        switch (ay)
        {

        case 1: System.out.println("31 gün"); break;
        case 2: System.out.println("29 gün"); break;
        case 3: System.out.println("31 gün"); break;
        case 4: System.out.println("30 gün"); break;
        case 5: System.out.println("31 gün"); break;
        case 6: System.out.println("30 gün"); break;
        case 7: System.out.println("31 gün"); break;
        case 8: System.out.println("31 gün"); break;
        case 9: System.out.println("30 gün"); break;
        case 10: System.out.println("31 gün"); break;
        case 11: System.out.println("30 gün"); break;
        case 12: System.out.println("31 gün"); break;
        default: System.out.println("hatalı no");

        }


        switch (ay)
        {
        case 1:
        case 3:
        case 5:
        case 7:
            case 8:
        case 10:
        case 12: System.out.println("31 gün"); break;

        case 2: System.out.println("29 gün"); break;

        case 4:
        case 6:
        case 9:
        case 11: System.out.println("30 gün"); break;

        default: System.out.println("hatalı no");
        }
    }
}
