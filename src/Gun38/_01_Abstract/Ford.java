package Gun38._01_Abstract;

public class Ford extends BinekOto {
    public Ford(String marka, int uretimYili, int vitesAdeti) {
        super(marka, uretimYili, vitesAdeti);
    }

    @Override
    int hizlanmaSuresi() {
        return 0;
    }
}
