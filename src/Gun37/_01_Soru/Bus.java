package Gun37._01_Soru;

public class Bus extends Vehicle implements IDeisel  {


    public Bus(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeDeisel() {
        return "bir depo ile 1000 km gider";
    }

    @Override
    public String drive() {
        return "hız sınırı 90 km";
    }
}
