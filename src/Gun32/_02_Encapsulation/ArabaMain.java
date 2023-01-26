package Gun32._02_Encapsulation;

public class ArabaMain {
    public static void main(String[] args) {

        Araba arb1=new Araba();
        arb1.setRenk("kırmızı");
        arb1.setModel(1994);
        arb1.setMotorHacmi(1300);
        arb1.setKapiSayisi(5);

        System.out.println("arb1 = " + arb1);

        Araba arb2=new Araba("sarı",2030,1600,4);
        System.out.println("arb2 = " + arb2);
    }
}
