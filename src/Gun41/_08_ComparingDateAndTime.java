package Gun41;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class _08_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate buGUn=LocalDate.now();
        LocalDate dun=buGUn.minusDays(1);

        boolean sonraMi=buGUn.isAfter(dun);   // bugün dünden sonra mı
        System.out.println("sonraMi = " + sonraMi);

        boolean onceMi=buGUn.isBefore(dun);     // bugün dünden önce mi
        System.out.println("onceMi = " + onceMi);

        boolean esitMi=buGUn.isEqual(dun);     // bugün dün e eşit mi
        System.out.println("esitMi = " + esitMi);

        boolean artikYilMi=buGUn.isLeapYear();  // bugün artık yıl mı
        System.out.println("artikYilMi = " + artikYilMi);
    }
}
