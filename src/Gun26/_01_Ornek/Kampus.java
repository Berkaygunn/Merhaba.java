package Gun26._01_Ornek;

public class Kampus {
    public static void main(String[] args) {
        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)  -> tip
        // Ogrenci : okulNo, tamAd, okulu  -> Tip

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz
        // atayıp  yazdırınız.

        Ogrenci ogr=new Ogrenci();
        ogr.okulNo=1;
        ogr.tamAd="Berkay Gün";

        // 1. Yöntem
        ogr.okulu =new Okul();
        ogr.okulu.adi="Mehmet Akif Ersoy Okulu";
        ogr.okulu.mudurAdi="Merve Aslan";
        ogr.okulu.ucreti=50000;

        //2.Yöntem

        Okul ok=new Okul();
        ok.adi="Mehmet Akif Ersoy Okulu";
        ok.mudurAdi="Merve Aslan";
        ok.ucreti=50000;
        ogr.okulu=ok;

        System.out.println("ogr.okulNo = " + ogr.okulNo);
        System.out.println("ogr = " + ogr.tamAd);
        System.out.println("ogr = " + ogr.okulu.adi);
        System.out.println("ogr.okulu.mudurAdi = " + ogr.okulu.mudurAdi);
        System.out.println("ogr = " + ogr.okulu.ucreti);
    }
}
