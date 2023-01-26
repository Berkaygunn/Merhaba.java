package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Java2DArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> matNotlari=new ArrayList<>();
        ArrayList<Integer> fizNotlari=new ArrayList<>();
        ArrayList<Integer> kimNotlari=new ArrayList<>();

        matNotlari.add(40);
        matNotlari.add(50);
        matNotlari.add(60);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);
        kimNotlari.add(100);

        // ArrayList in ArrayList i ni nasıl yaparım
        ArrayList< ArrayList<Integer>  > notlarListesi=new ArrayList<>(); // Listelerin listesi
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);

        // Soru 1:
        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız
        // Matematik : 40 50 60
        // Fizik : 30 40
        // Kimya : 70 80 90 100

        ArrayList<String> dersler=new ArrayList<>();
        dersler.add("matematik");
        dersler.add("fizik");
        dersler.add("kimya");

        for (int i = 0; i < notlarListesi.size(); i++) {  // her bir derslerin tüm notları

            System.out.print(dersler.get(i)+" : ");

            for (int j = 0; j < notlarListesi.get(i).size(); j++) { // tek tek notlar
                System.out.print(notlarListesi.get(i).get(j)+"\t");
            }

            System.out.println();
        }
        // Soru 2:
        // kullancıdan istediği bir dersin no sunu alarak(0-Mat,1-Fizik,2-Kim)
        // sadece istediği derse ait notları bir metodda yazdırınız.

        Scanner read=new Scanner(System.in);
        System.out.print("Ders no (0-Mat,1-Fizik,2-Kim) =");
        int dersNo= read.nextInt();

        istenilenNot(notlarListesi,dersNo);

        //Soru 3: yukarıda verilen derse ait not ortalamsını ve geçen sayısını bir metodda yazdırınız.

        gecensayisi(notlarListesi,dersNo);
    }

    public static void gecensayisi(ArrayList< ArrayList<Integer>  > notlarListesi,int dersNo)
    {
        int toplam=0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            toplam+=notlarListesi.get(dersNo).get(i);
        }
        int ort=toplam/notlarListesi.get(dersNo).size();
        int gecen=0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
         if (notlarListesi.get(dersNo).get(i)>=ort)
             gecen++;
        }
        System.out.println("ort = " + ort);
        System.out.println("gecen = " + gecen);
    }


    public static void istenilenNot(ArrayList< ArrayList<Integer>  > notlarListesi,int dersNo)
    {
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            System.out.print(notlarListesi.get(dersNo).get(i)+"\t");
        }
    }




}
