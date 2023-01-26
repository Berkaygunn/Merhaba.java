package Gun07;

public class _13_StringReplaceAll {
    public static void main(String[] args) {
        // replaceall : replace gibi çalışır.farkı kriter (regex) verilebiliyor.
        // regex : regular expression / düzenli ifadeler
        // TODO (yapılacak) : ödev : regex olarak neler yazılabiliyor google dan araştırılacak
        String text="Merhaba Dünya123";

        System.out.println("text = " + text); // orjinal hali
        System.out.println("text.replaceAll([abn]) = " + text.replaceAll("[abn]","_"));
        // a veya b veya n ler _ haline gelir.

        System.out.println("text.replaceAll([A-Z]) = " + text.replaceAll("[A-Z]","_"));
        // A dan Z ye KADAR

        System.out.println("0-9 -> _  = " + text.replaceAll("[0-9]",""));
        // rakamları sil  Merhaba Dünya

        System.out.println("0-9 dışındakile -> _  = " + text.replaceAll("[^0-9]",""));
        // rakamları dışındakileri sil  123
    }
}
