package Gun41;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

public class _06_Duration {
    public static void main(String[] args) {
        // Duration : hem LocalTime hem de LocalDateTime arasındaki farkı verir

        //LocalTime

        LocalTime dersBaslangic=LocalTime.of(19,0,0);
        LocalTime dersBitis=LocalTime.of(22,0,0);

        Duration GunlukDersSuresi=Duration.between(dersBaslangic,dersBitis);
        System.out.println("GunlukDersSuresi = " + GunlukDersSuresi);

        System.out.println("toHours() = " + GunlukDersSuresi.toHours());  // farkım toplam saat hali
        System.out.println("toMinutes() = " + GunlukDersSuresi.toMinutes()); // farkın toplam dakika halini
        System.out.println("toMillis() = " + GunlukDersSuresi.toMillis());  // farkın toplam milisaniye halini

        // LocalDateTime **** 2 Tarih-saat arasındaki fark ****
        LocalDateTime from=LocalDateTime.of(2023,1,1, 0,0);
        LocalDateTime to=LocalDateTime.now();

        Duration farkZaman=Duration.between(from,to);
        System.out.println("farkZaman = " + farkZaman);
        System.out.println("toDays() = " + farkZaman.toDays());   // farkın toplam günü
        System.out.println("toHours() = " + farkZaman.toHours()); // farkın toplam saati
        System.out.println("toMinutes() = " + farkZaman.toMinutes());  // farkın toplam dakikası
    }
}
