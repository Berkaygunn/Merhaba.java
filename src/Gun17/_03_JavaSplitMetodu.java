package Gun17;

import java.util.Scanner;

public class _03_JavaSplitMetodu {
    public static void main(String[] args) {
        // Split : bir stringi parçalara ayırmak demek

        //kullanıcıdan alacağınız cümleyi kelimelerine göre alt alta yazdırınız.
        Scanner read=new Scanner(System.in);
        System.out.print("cümle=");
        String cumle=read.nextLine();

        String[] kelimeler=cumle.split(" ");

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);
        }
    }
}
