package Gun36._06_Interface;

public class Dikdortgen implements ISekil {
    @Override
    public double alan(double kk, double uk) {
        return kk*uk;
    }

    @Override
    public double cevre(double kk, double uk) {
        return 2*(kk+uk);
    }
}
