package Gun14;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {
        // kullanıcıdan 5 sayı isteyiniz.
        // bu sayılardan 6 ile 10 arasındakiler hariç,diğerlerini toplayınız.

        Scanner read=new Scanner(System.in);

        int toplam=0;
        for (int i=0;i<5;i++)
        {
            System.out.print("bir sayı giriniz =");
            int sayi= read.nextInt();

            if (sayi>6 && sayi<10)
                continue; //çalıştığı anda kendinden sonra gelen komutları pass geçirir.

            toplam+=sayi;
            System.out.println("toplam = " + toplam);


        }
    }
}
