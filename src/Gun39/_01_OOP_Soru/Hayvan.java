package Gun39._01_OOP_Soru;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public abstract class Hayvan {
    private final int id;
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;

    abstract void yiyecegi();
    abstract void yemekMiktari();
    abstract void guunlukUykuSuresi();
    abstract void sesi();

    private static int idSayac=1;

    @Override
    public String toString() {
        System.out.print("yiyeceği="); yiyecegi();
        System.out.print("yemek miktarı="); yemekMiktari();
        System.out.print("uyku süresi="); guunlukUykuSuresi();
        System.out.print("sesi="); sesi();

        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                '}';
    }

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
       setIsim(isim);
       setVahsi(vahsi);
       setDogumTarihi(dogumTarihi);
       this.id=idSayac++;
    }

    public int getId() {
        return id;
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
}
