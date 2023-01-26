package Gun04;

public class _07_SayiKelime {
    public static void main(String[] args) {
        // şu ana kadar sayıları birbirine çevirdik
        // yazıların rakama çevrilmesi , rakamların yazıya çevrilmesi var

        String ad="berkay";
        String kelimesayi="65"; // string halde , toplama gibi bir işleme giremez

        int sayideger=Integer.parseInt(kelimesayi); // sayiya dönüşür.

        int toplam=sayideger+sayideger;
        System.out.println("toplam = " + toplam);

        // toplam şuanda int yani sayı, bunu String e nasıl dönüştürürüm
        String strtoplam= Integer.toString(toplam); // String e dönüştürür
        System.out.println("strtoplam = " + strtoplam);

    }
}
