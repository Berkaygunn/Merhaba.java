package Gun39._05_OOP_Soru;

public class AdanaKebap implements IFood {

    public void marine(){
        System.out.println("Et dünden özel baharatlarla hazırlandı");
    }

    public void grill(){
        System.out.println("Köür ateşinde yavaş pişirildi");
    }

    @Override
    public void taste() {
        System.out.println("etin en güzel hali");
    }

    @Override
    public double ucret() {
        return 75;
    }
}
