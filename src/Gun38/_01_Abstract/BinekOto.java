package Gun38._01_Abstract;

// 2 si bir arada => 1 interface +1 parent clas == abstract class
public abstract class BinekOto {

    private String marka;
    private int uretimYili;
    private int vitesAdeti;

    public BinekOto(String marka, int uretimYili, int vitesAdeti) {
        setMarka(marka);
        setUretimYili(uretimYili);
        setVitesAdeti(vitesAdeti);
    }

    abstract int hizlanmaSuresi();

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesAdeti() {
        return vitesAdeti;
    }

    public void setVitesAdeti(int vitesAdeti) {
        this.vitesAdeti = vitesAdeti;
    }
}
