package Gun33._02_Inheritance;

public class Yilan extends Hayvan{
    int uzunluk;

    public Yilan(String renk, int kilo, String cinsi,int uzunluk) {
        super(renk, kilo, cinsi);
        setUzunluk(uzunluk);
    }

    @Override
    public void konustu() {
        System.out.println("tısss");
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }
}
