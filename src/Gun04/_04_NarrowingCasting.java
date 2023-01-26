package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        double oran=3.2;
        int sayi=5;

        sayi=(int) oran;  // büyük bir alanı , küçük alana atıyorsun.
        // tehlikeli işlem yapıyorsun, bundan dolayı challenger patladı.
        // değerlere bak , oluşan veri kaybını anladıysan ve kabulünse
        // bana bunu bilerek yaptığını göster.

        System.out.println("sayi = " + sayi);

        byte kisakenar=5;
        byte uzunkenar=7;
        byte cevre=(byte)(kisakenar+uzunkenar+kisakenar+uzunkenar);
        // eşitliğin sağ tarafı rakamlar toplandı, benim toplam burada INT durumunda
        // byte cevre = 2*12;  // int i -> byte atmaya çalışıyorsun.
        // eğer veri kaybı olmayacağından eminsen , veya veri kaybı önemli değilse
        // bana bunu yazarak göster.
        System.out.println("cevre = " + cevre);
        int cevre2=(kisakenar+uzunkenar+kisakenar+uzunkenar); // yukardaki işlemle uğraşmak istemessen alternatif işlem
        System.out.println("cevre2 = " + cevre2);

    }
}
