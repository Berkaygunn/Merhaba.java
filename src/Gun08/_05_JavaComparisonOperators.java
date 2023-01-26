package Gun08;

public class _05_JavaComparisonOperators {
    public static void main(String[] args) {
        int a = 50;
        int b = 50;

        // = atama işareti , == eşit mi ?
        System.out.println("(a b ye eşit mi ? = " + (a==b));
        System.out.println("(a b den farklı mi ? = " + (a!=b));

        System.out.println("(a b den büyük mü ? = " + (a>b));
        System.out.println("(a b den küçük mü ? = " + (a<b));

        System.out.println("(a b den büyük veya eşit mi ? = " + (a>=b));
        System.out.println("(a b den küçük veya eşit mi ? = " + (a<=b));
    }
}
