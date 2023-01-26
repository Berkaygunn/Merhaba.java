package Gun30;

public class GununSorusu {
    int a;

    static int b=0; // sen bitanesin 2 tane zaten olamaz

    void artir()
    {
        a++;
        b++;
    }

    public static void main(String[] args) {
        GununSorusu gs1=new GununSorusu();
        gs1.a=5;

        GununSorusu gs2=new GununSorusu();
        gs2.a=7;

        // a nın değeri kaç oldu şu anda : Burada verilecek cevap hangi a yı soruyorsunuz olmalı.
        // Burada her nesnenin a sı var ve gs1 in 5 gs2 nin 7 değeri var

        System.out.println("gs1 = " + gs1.a);
        System.out.println("gs2 = " + gs2.a);


        // soru : b değeri kaçtır : tek bir değeri vardır en son değer
        System.out.println("b = " + GununSorusu.b);  // 0


        gs1.artir();  // gs1.a -> 6  , b=1
        gs2.artir();  // gs2.a -> 8  , b=2
        //soru: a nın ve b nin son değerleri kaçtır.
        System.out.println("gs1 = " + gs1.a);
        System.out.println("gs2.a = " + gs2.a);
        System.out.println("b = " + GununSorusu.b);
    }
}
