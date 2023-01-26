package Gun38._02_Abstract;

public class Dikdortgen extends Sekil {

    private double kk;
    private double uk;

    public Dikdortgen(double kk, double uk) {
        setKk(kk);
        setUk(uk);
    }

    @Override
    public double alan() {
        return this.kk*this.uk;
    }

    @Override
    public double cevre() {
        return (this.kk+this.uk)*2;
    }

    public double getKk() {
        return kk;
    }

    public void setKk(double kk) {
        this.kk = kk;
    }

    public double getUk() {
        return uk;
    }

    public void setUk(double uk) {
        this.uk = uk;
    }
}
