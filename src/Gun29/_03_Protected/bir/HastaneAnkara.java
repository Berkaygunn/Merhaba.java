package Gun29._03_Protected.bir;

public class HastaneAnkara {
    public static void main(String[] args) {
        Doctor dok1=new Doctor();
        dok1.adi="berkay";
        dok1.bolumu="dahiliye";
        dok1.hastaneAd="ankara hastanesi";
        //dok1.SicilNo private

        Doctor dok2=new Doctor("mehmet");
    }
}
