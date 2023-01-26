package Gun25;

public class _01_JavaClassAndObject {
    public static void main(String[] args) {

        int sayi=5;

        Araba benimArabam=new Araba(); // araba tür,tip adı,benimArabam nesne
        benimArabam.marka="BMW";
        benimArabam.renk="beyaz";
        benimArabam.motorHacmi=1600;
        benimArabam.yili=2000;

        System.out.println("benimArabam.marka = " + benimArabam.marka);
        System.out.println("benimArabam.yili = " + benimArabam.yili);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);
        System.out.println("benimArabam = " + benimArabam.renk);

    }
}
class Araba{
    String renk;
    int yili;
    String marka;
    int motorHacmi;
}
