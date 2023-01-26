package Gun06;

public class _05_StringIndexOf {
    public static void main(String[] args) {
        // verilen karakterlerin string içindeki INDEX ini verir.
        // D nin index i kaçtır
        //05063445567 -> oda numarası kaçtır

        String cumle="Merhaba Dünya";

        System.out.println("cumle.indexOf(M) = " + cumle.indexOf("M")); // 0
        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a")); // 4
        System.out.println("cumle.indexOf(ha) = " + cumle.indexOf("ha")); // 3
        System.out.println("cumle.indexOf( ) = " + cumle.indexOf(" ")); // 7
        System.out.println("cumle.indexOf(A) = " + cumle.indexOf("A")); // -1
        System.out.println("cumle.indexOf(a, 5) = " + cumle.indexOf("a",5)); // 6


    }
}
