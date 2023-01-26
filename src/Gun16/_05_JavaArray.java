package Gun16;

public class _05_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz.
        // daha sonra random olarak bir tanesini seçip ekrana seçileni yazdırınız.


        String[] dizi={"trt","atv","fox","show tv","trt haber"};  // 01234

        int random=(int)(Math.random()*dizi.length);  // 5 e kadar, 5 dahil değil

        System.out.println("seçilen tv = " + random);

        // TODO : günün sorusu : bir döngü ile 5 tane rastgele buldurunuz.
        // TODO : fakat bir bulduğunu tekrar bulmasın


        }
}
