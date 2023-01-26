package Gun33._03_Inheritance;

public class SirketMain {
    public static void main(String[] args) {
        Calisan cal1=new Calisan("berkay",5000,1.2);
        cal1.maasHesapla();


        GenelMudur gnlmdr1=new GenelMudur("kardelen",10000,1.8,30000);
        gnlmdr1.maasHesapla();

        System.out.println("cal1 = " + cal1);
        System.out.println("gnlmdr1 = " + gnlmdr1);
    }
}
