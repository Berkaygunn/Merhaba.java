package Gun15;

import java.util.Scanner;

public class _02_JavaNestedLoop {
    public static void main(String[] args) {
        // 2 lerin çarpım tablosunu sormuştuk.
        // 2 x 1 =2
        // 2 x 2 =4
        // ....
        //
        // 5 lere kadar halini yapınız

        for (int j=2; j<5; j++)
        {
            for (int i=0; i<10; i++)
                System.out.println(j+"x"+i+"="+(j*i));
        }



    }
}
