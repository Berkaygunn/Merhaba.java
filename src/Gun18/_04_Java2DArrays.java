package Gun18;

import java.util.Scanner;

public class _04_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu kullanıcıdan sayı alarak doldurunuz
        // daha sonra ayrı bir döngü de en büyük sayıyı bulunuz.


        Scanner read=new Scanner(System.in);
        int[][] dizi=new int[2][3];

        // burası okuma işlemi
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print("Sayı giriniz =");
                dizi[i][j]= read.nextInt();
            }

        }
         // burası yazma işlemi
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(dizi[i][j]+"\t");
            }
            System.out.println();
        }
        //en büyüğü bulma işlemi
        int enb=dizi[0][0];
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                if (dizi[i][j] > enb)
                    enb=dizi[i][j];
            }

        }
        System.out.println("enb = " + enb);
    }
}
