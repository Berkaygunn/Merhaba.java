package Gun37._02_Soru;

public class Duck implements Sailing,Flying{
    @Override
    public String food() {
        return "balık & yeşillik";
    }

    @Override
    public String ucma() {
        return "kanatlarıyla";
    }

    @Override
    public String yuzme() {
        return "ayaklarıyla";
    }
}
