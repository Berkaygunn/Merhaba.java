package Gun18;

import java.util.Scanner;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // bütün doldurma işlemi bittikten sonra
        //  sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz.

        int[][] dizi=new int[2][3];
        int adet=0;


        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                dizi[i][j]=(int)(Math.random()*101);
            }
        }
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(dizi[i][j] + "\t");

                if (dizi[i][j] % 2 == 1)
                    adet++;
            }
            System.out.println();
        }
        System.out.println("tek sayı adeti =" + adet);

    }
}
