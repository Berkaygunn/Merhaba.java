package Gun06;

public class _09_StringTrim {
    public static void main(String[] args) {
        // trim : string başındaki ve sonundaki boşlukları alır.

        String text= "  Merhaba Dünya    ";

        System.out.println("orjinal hali = ->" + text+"<-");
        System.out.println("trimli hali = ->" + text.trim()+"<-");
    }

}
