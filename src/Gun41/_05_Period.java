package Gun41;

import java.time.LocalDate;
import java.time.Period;

public class _05_Period {
    public static void main(String[] args) {
        // Period 2  ta, h arasındaki farkı gösterir.
        // LocalDate ler için kullanılır.

        LocalDate dogumTarihi=LocalDate.of(1975,10,20);
        LocalDate buGun=LocalDate.now();

        Period fark =Period.between(dogumTarihi,buGun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears()+"Yaşındasınız");

        /***********************************/
        Period period3Gun=Period.ofDays(3);
        Period period3ay=Period.ofMonths(3);


        System.out.println("period3Gun = " + period3Gun);
        System.out.println("period3ay = " + period3ay);

        LocalDate ucGunSonra=buGun.plus(period3Gun);
        System.out.println("ucGunSonra = " + ucGunSonra);

        LocalDate ucAySonra=buGun.plus(period3ay);
        System.out.println("ucAySonra = " + ucAySonra);

        /***********************************/

        // Kursun bitiş tarihini bulunuz  31 Ekim - 6 ay

        LocalDate kursbaslangici=LocalDate.of(2022,10,31);
        Period kursSure=Period.ofMonths(6);
        LocalDate kursBitis=kursbaslangici.plus(kursSure);

        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());


        // Kursun bitmesine ne kadar süre kaldı
        Period neKadarSureKaldi=Period.between(buGun,kursBitis);
        System.out.println("neKadarSureKaldi = " + neKadarSureKaldi);

        // Kurs ne kadar süredir devam ediyor
        Period suAnaKadarDevamSuresi=Period.between(kursbaslangici,buGun);
        System.out.println("suAnaKadarDevamSuresi = " + suAnaKadarDevamSuresi);



    }
}
