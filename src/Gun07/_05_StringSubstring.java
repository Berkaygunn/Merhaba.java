package Gun07;

public class _05_StringSubstring {
    public static void main(String[] args) {
        // stringin belli bir bölümü alma işlemini yapar

        String s1="merhaba arkadaşlar";

        String parca1=s1.substring(3,9); // 3 nolu indexten 9 nolu indexe kadar alır
        System.out.println("parca1 = " + parca1);

        String parca2=s1.substring(8,15);
        System.out.println("parca2 = " + parca2);

        String parca3=s1.substring(8);  // verilen indexten itibaren sonuna kadar alır
        System.out.println("parca3 = " + parca3);

    }
}
