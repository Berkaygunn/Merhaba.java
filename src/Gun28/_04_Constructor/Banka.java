package Gun28._04_Constructor;

public class Banka {
    String adi;
    int subeSayisi;
    int kurulusYili;

    public Banka(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    public Banka(String adi, int subeSayisi) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
    }

    public Banka(int subeSayisi, int kurulusYili) {
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    @Override
    public String toString() {
        return "Banka{" +
                "adi='" + adi + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", kurulusYili=" + kurulusYili +
                '}';
    }
}
