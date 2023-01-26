package Gun32._02_Encapsulation;

public class Araba {
    private String renk;
    private int model;
    private double motorHacmi;
    private int kapiSayisi;

    public Araba() {
    }

    public Araba(String renk, int model, double motorHacmi, int kapiSayisi) {
        setRenk(renk);
        setModel(model);
        setMotorHacmi(motorHacmi);
        setKapiSayisi(kapiSayisi);
//        this.renk = renk;
//        this.model = model;
//        this.motorHacmi = motorHacmi;
//        this.kapiSayisi = kapiSayisi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    void setModel(int model){
        if (model>1990 && model<2022)
            this.model=model;
        else
            System.out.println("hatalı model");
    }
    int getModel(){
        return this.model;
    }

    void setMotorHacmi( double motorHacmi){
        if (motorHacmi>1000 && motorHacmi < 1900)
            this.motorHacmi=motorHacmi;
        else
            System.out.println("hatalı motorhacmi");
    }

    double getMotorHacmi(){
        return this.motorHacmi;
    }

    void setKapiSayisi(int kapiSayisi){
        if (kapiSayisi>3 && kapiSayisi < 7)
            this.kapiSayisi=kapiSayisi;
        else
            System.out.println("hatalı kapısayısı");
    }
    int getKapiSayisi(){
        return this.kapiSayisi;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model=" + model +
                ", motorHacmi=" + motorHacmi +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }
}
