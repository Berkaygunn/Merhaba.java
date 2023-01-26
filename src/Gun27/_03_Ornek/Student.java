package Gun27._03_Ornek;

import java.util.ArrayList;

public class Student {

    String name;
    int maxSaat;
    ArrayList<Lesson> dersleri=new ArrayList<>();

    public void dersEkle(Lesson ders)
    {
        int suantoplamSaat=0;
        for (Lesson d:dersleri)
            suantoplamSaat+=d.saat;

        if (suantoplamSaat+ders.saat <=maxSaat)
            dersleri.add(ders);
        else
            System.out.println(ders.name+": Kredi sınırı aşıldı");
    }
    public void dersleriYazdir()
    {
        System.out.println("\n*** Transkript ***");
        System.out.println("sayın "+name);
        System.out.println("Aldığınız dersler aşağıdadır.");
        for (Lesson d: dersleri)
            System.out.println(d.name+"->"+d.saat);

    }
    public static void unikurallari()
    {
        System.out.println("Kural 1: çaysız gelme");
        System.out.println("Kural 2: her zaman pozitif ol");
        System.out.println("Kural 3: verdiğin sözü unutma");
    }
}
