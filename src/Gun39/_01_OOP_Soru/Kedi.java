package Gun39._01_OOP_Soru;

public class Kedi extends Hayvan{
    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    public void yiyecegi() {
        System.out.println("mama");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("2 kap");
    }

    @Override
    public void guunlukUykuSuresi() {
        System.out.println("10 saat");
    }

    @Override
    public void sesi() {
        System.out.println("miyavv");
    }
}
