package Gun37._01_Soru;

public class toyotaPrius extends Vehicle implements IElectric,IGas{


    public toyotaPrius(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "ömür boyu kullan";
    }

    @Override
    public String changeOil() {
        return "bir depo ile 300 km gider";
    }

    @Override
    public String drive() {
        return "ilk 3 km elektrik ile gider";
    }
}
