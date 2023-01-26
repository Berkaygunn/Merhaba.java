package Gun11;

public class _08_JavaRandom {
    public static void main(String[] args) {
        //Math.Random() : double sayı üretir. 0 - 0,999999 arası

        double rndsayi=Math.random();
        System.out.println("rndsayi = " + rndsayi);

        // 0-6 arası üretsin istersek
        // 6 ile çarparım
        // 0-5,9999999
        // int çevirirsem 0-5;

        int rndtamsayi=(int)(Math.random()*6);
        System.out.println("rndtamsayi = " + rndtamsayi);
    }
}