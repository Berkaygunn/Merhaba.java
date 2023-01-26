package Gun06;

public class _08_StringContains {
    public static void main(String[] args) {
        // contains : bir stringin içerisinde karakterlerin
        // var olup olmadığını boolean cinsinden söyle true veya false

        String cumle="Merhaba Dünya";
        boolean varmi=cumle.contains("a");
        System.out.println("varmi = " + varmi);

        // direkt de yapabilirsiniz
        System.out.println("varmi = " + cumle.contains("a"));

        System.out.println("cumle.contains(k) =" + cumle.contains("k"));
    }
}
