package Gun07;

public class _09_StringToLowerCase {
    public static void main(String[] args) {
        // tolowercase : stringi küçük harfe çevirir.

        String text="Merhaba Dünya";

        System.out.println("orjinal hali = " + text); // Merhaba Dünya
        System.out.println("text.toLowerCase() = " + text.toLowerCase()); // merhaba dünya

        // ek bilgi gibi...
        System.out.print("me ile veya ME ile başlıyor mu = " + text.toLowerCase().startsWith("me"));
    }
}
