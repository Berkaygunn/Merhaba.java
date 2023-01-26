package Gun07;

public class _10_StringUpperCase {
    public static void main(String[] args) {
        // touppercase : stringi büyük harfe çevirir.
        
        String text="Merhaba Dünya";

        System.out.println("orjinal hali = " + text); // Merhaba Dünya
        System.out.println("text.toUpperCase() = " + text.toUpperCase()); // MERHABA DÜNYA


        System.out.println("me veya ME ile başlıyor mu = " + text.toUpperCase().startsWith("ME"));

    }
}
