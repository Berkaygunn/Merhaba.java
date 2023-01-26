package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList_Soru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner read=new Scanner(System.in);
        Scanner oku=new Scanner(System.in);
        ArrayList<Integer> notlar=new ArrayList<>();
        int toplam=0;
        String devamMi;

        do {
            System.out.print("Not =");
            int not= read.nextInt();
            notlar.add(not);
            toplam+=not;
            System.out.print("devam etmek istiyor musunuz (E/H)");
            devamMi=oku.next();

        }while (devamMi.equalsIgnoreCase("E"));

        int ort=toplam/notlar.size();
        System.out.println("ort = " + ort);
        int gecensayisi=0;

        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i)>ort)
                gecensayisi++;
        }
        System.out.println("gecensayisi = " + gecensayisi);





    }
}
