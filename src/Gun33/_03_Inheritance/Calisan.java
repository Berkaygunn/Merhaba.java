package Gun33._03_Inheritance;

public class Calisan {
    private String isim;
    private double maas;
    private  double maasKatSayi;


    public double maasHesapla(){
        return maas*maasKatSayi;
    }
    public Calisan(String isim, double maas, double maaskatsayi) {
       setIsim(isim);
       setMaas(maas);
       setMaasKatSayi(maaskatsayi);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public double getMaasKatSayi() {
        return maasKatSayi;
    }

    public void setMaasKatSayi(double maasKatSayi) {
        this.maasKatSayi = maasKatSayi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatSayi=" + maasKatSayi +
                ",ödenecek maaş=" + maasHesapla() +
                '}';
    }
}
