package Gun33._03_Inheritance;

public class GenelMudur extends Calisan{
    private double tazminat;
    public GenelMudur(String isim, double maas, double maaskatsayi,double tazminat) {
        super(isim, maas, maaskatsayi);
        setTazminat(tazminat);
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+getTazminat();
    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public String toString() {
        return "GenelMudur{" +
                "isim=" + getIsim() +
                ",maaş=" + getMaas() +
                ",maaşkatsayısı=" + getMaasKatSayi() +
                ",tazminat=" + tazminat +
                ",ödenecek maaş=" + maasHesapla() +
                '}';
    }
}
