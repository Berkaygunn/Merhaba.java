package Gun18;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int sayi=0;    // 1 tane sayı
        int[] dizi=new int[100]; // 100 sayı

        int[] ders1notlari=new int[50];  // 50 kişilik sınıfın 1.dersin notları
        int[] ders2notlari=new int[50];
        int [] ders3notlari=new int[50]; // 0-49 arası index değişiyor

        int[][] tumdersnotlari=new int[3][50]; // 3 tane ders 50 öğrenci,150 tane sayı
                                               // 3 satır 50 sütun
                                               // her sayır 50 tane sayı, 50 sütun


        ders1notlari[0]=80; // tek boyutlu dizinin ilk(0) elemanına 80 değerini atadık
        tumdersnotlari[0][0]=80; // 2 boyutlu dizide 0. satırın,0.sütununa 80 değeri atandı

        System.out.println("tumdersnotlari = " + tumdersnotlari[0][0]);

        Scanner read=new Scanner(System.in);
        tumdersnotlari[0][0]= read.nextInt();
    }
}
