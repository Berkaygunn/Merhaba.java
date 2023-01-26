package Gun39._05_OOP_Soru;

public class Palov implements IFood{

   public void fry(){
       System.out.println("Pirinç ve şehriye kavruldu");
   }

   public void boil(){
       System.out.println("Kısık ateşte pişirildi");
   }


    @Override
    public void taste() {
        System.out.println("Çocukların vazgeçilmezi");
    }

    @Override
    public double ucret() {
        return 20;
    }
}
