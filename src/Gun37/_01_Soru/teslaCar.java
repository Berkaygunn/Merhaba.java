package Gun37._01_Soru;

public class teslaCar extends Vehicle implements IElectric{


    public teslaCar(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "Batarya 10 yıl ömürlü";
    }

    @Override
    public String drive() {
        return "oto pilot özelliği mevcut";
    }
}
