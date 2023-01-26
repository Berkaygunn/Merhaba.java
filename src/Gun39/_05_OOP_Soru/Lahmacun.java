package Gun39._05_OOP_Soru;

public class Lahmacun implements IFood{

  public void dough(){
    System.out.println("Mayalı hamur hazırlandı");
  }

  public void addMeat(){
    System.out.println("Özel kıyma eklendi");
  }

  public void bake() {
    System.out.println("Odun ateşinde pişirildi");
  }

    @Override
    public void taste() {
      System.out.println("Mükemmel yerli pizza");
    }

    @Override
    public double ucret() {
        return 20;
    }
}
