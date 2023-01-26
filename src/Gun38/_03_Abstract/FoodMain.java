package Gun38._03_Abstract;

public class FoodMain {
    public static void main(String[] args) {
        Baklava bk=new Baklava();
        bk.setName("Baklava");
        bk.madeIn();
        bk.taste();

        CheeseCake ches1=new CheeseCake();
        ches1.setName("CheesCake");
        ches1.madeIn();
        ches1.taste();

        GreekSalad gs=new GreekSalad();
        gs.setName("GreekSalad");
        gs.madeIn();
        gs.taste();

        SezaSalad ss=new SezaSalad();
        ss.setName("SezarSalad");
        ss.madeIn();
        ss.taste();


    }
}
