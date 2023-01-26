package Gun07;

public class _01_StringEquals {
    public static void main(String[] args) {
        // equals : 2 stringin birbirine eşit olup olmadığını kontrol eder.
        // sonuç boolean

        String s1="merhaba";
        String s2="MERHABA";

        boolean esitmi=s1.equals(s2);
        System.out.println("esitmi = " + esitmi); // s1 eşit mi s2 ye merhaba MERHABA

        System.out.println("s1.equals(s2) = " + s1.equals(s2)); // merhaba MERHABA

        System.out.println("s1.equals(merhaba) =" + s1.equals("merhaba")); // merhaba merhaba
    }
}
