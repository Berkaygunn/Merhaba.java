package Gun07;

public class _12_StringReplaceFirst {
    public static void main(String[] args) {
        // replacefirst : bir string içindeki karakterleri verilenle değiştirir.(sadece ilkini)


        String text="Merhaba Dünya";

        System.out.println("text.replaceFirst(a,e) = " + text.replaceFirst("a","e")); // Merhebe Dünye
        System.out.println("text.replaceFirst(Dünya,Java) = " + text.replaceFirst("Dünya","Java")); // Merhaba Java
        System.out.println("text.replaceFirst(a,'') = " + text.replaceFirst("a","")); // ilk a silindi

    }
}
