package Gun39._01_OOP_Soru;

public class Kartal extends Hayvan{
    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    public void yiyecegi() {
        System.out.println("et");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("bir kilo günde");
    }

    @Override
    public void guunlukUykuSuresi() {
        System.out.println("günlük 8 saat");
    }

    @Override
    public void sesi() {
        System.out.println("ciyakk fiuu");

    }
}
