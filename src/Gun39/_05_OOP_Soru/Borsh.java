package Gun39._05_OOP_Soru;

public class Borsh implements IFood{

   public void boil(){
       System.out.println("kısık ateşte kaynatılır");
   }

   public void eaTomorrow(){
       System.out.println("bir gün sonra servis edilir");
   }


    @Override
    public void taste() {
        System.out.println("sıcak sebze çorbası");
    }

    @Override
    public double ucret() {
        return 40;
    }
}
