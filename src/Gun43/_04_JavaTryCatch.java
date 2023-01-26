package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("program başladı");

        try {
            Scanner read = new Scanner(System.in);

            System.out.print("Sayi1=");
            int sayi1 = read.nextInt();
            System.out.print("Sayi2=");
            int sayi2 = read.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);

//            String kelime="";
//            kelime.charAt(3);
        }
        catch (InputMismatchException hata)  // belirli bir hata
        {
            System.out.println("Lütfen sayı giriniz");
        }

        catch (ArithmeticException hata)  // belirli bir hata
        {
            System.out.println("Sıfıra bölme hatası");
        }

        catch (Exception hata)  // yukarıdakilerin dışında hatalar için
        {
            System.out.println("hata oluştu");
        }


        System.out.println("program bitti");
    }
}
