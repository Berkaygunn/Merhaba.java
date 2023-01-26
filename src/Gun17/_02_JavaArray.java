package Gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        //Kullanıcının gireceği bir cümlede kaç kelime olduğunu bulunuz
        // for döngüsü ile yapalım
        // bu gün hava çok güzel -> 5

        Scanner read=new Scanner(System.in);

        System.out.print("Bir cümle giriniz =");
        String cumle= read.nextLine();

        int bosluksayisi=0;
        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i)==' ')
                bosluksayisi++;
        }

        System.out.println("kelime sayısı = " + (bosluksayisi+1));
        
    }
}
