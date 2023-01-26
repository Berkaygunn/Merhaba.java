package Gun08;

public class _01_JavaAritmeticOperators {
    public static void main(String[] args) {
        
        int a=9;
        int b=5;

        System.out.print("Toplama İşlemi = ");
        System.out.println("a+b sonuç = " + (a+b));

        System.out.print("Çıkarma İşlemi = ");
        System.out.println("a-b sonuç = " + (a-b));

        System.out.print("Çarpma İşlemi = ");
        System.out.println("axb sonuç = " + (a*b));

        System.out.print("Bölme İşlemi = ");
        System.out.println("a/b sonuç = " + (a/b));
        // normal sonuç 1.8 fakat tam sayıların bölümünde küsürat atılır.
        // bu sebeple sonuç 1 olur, yuvarlama yapmaz. çünkü int/int
        //tam sonuç istersek bir tanesini double çevirmen yeterli

        System.out.println("((double)a/b sonuç ) = " + ((double)a/b));

        System.out.println("Modül işlemi");
        System.out.println("a % b sonucu = " +(a % b)); // 4
        System.out.println("b % a sonucu = " +(b % a)); // 5
        //     sol büyük ise kalanı al.
        // sol küçük ise solu al.

    }
}
