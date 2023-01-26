package Gun19;

public class _06_JavaMethod {
    public static void main(String[] args) {

        merhabayaz(); // Math.random();
        merhabayazberkay("berkay"); // Math.Abs(-10)

        cokmerhabayaz(5);

    }

    public static void merhabayaz(){
        System.out.println("merhaba dünya");
        System.out.println("merhaba dünya");
    }

    public static void merhabayazberkay(String isim)
    {
        System.out.println(isim+" merhaba");
    }

    public static void cokmerhabayaz(int miktar)
    {
        for (int i = 0; i < miktar; i++) {
            System.out.println(" merhaba");

        }
    }
}
