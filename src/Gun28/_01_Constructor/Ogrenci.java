package Gun28._01_Constructor;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinifi;

    public Ogrenci() {  // yapıcı metodlar : Constructor metdolar
        System.out.println("nesne oluşturuldu");
    }

    public Ogrenci (int id,String ad,String soyad,int sinifi) {
        this.id=id;
        this.ad=ad;
        this.soyad=soyad;
        this.sinifi=sinifi;
    }
    public Ogrenci (int id,String ad,String soyad) {

        this(id,ad,soyad,0); // this öğrenci metodunun kendisi

//        this.id = id;
//        this.ad = ad;
//        this.soyad = soyad;
//        this.sinifi=0;
    }
}

// mühendisin arabayı çizdiği kağıttaki modeller: class, tipin adı, türün adı
// buna bakarak yapılmış araba ise nesne, araba üretilirken yapılan işlemlerin
// yapıldığı metos ise Constructor yani yapıcı metodlar