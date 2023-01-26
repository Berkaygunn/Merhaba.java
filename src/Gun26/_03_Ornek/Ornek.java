package Gun26._03_Ornek;

import java.util.Scanner;

public class Ornek {
    // 1-Adım :Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazınız.
    //         (properties, fields, özellik, eleman, items) : width, length
    // 2-Adım :Çevre bulmak üzere Cevre isminde bir metod yazınız.
    // 3-Adım :Dikdörtgenin alanını bulan Alan isimli bir metod yazınız.
    // 4-Adım :1 tane nesne ye deger vererek metodların sonuçları yazdırınız.

    public static void main(String[] args) {

        Rectangle sonuc=new Rectangle();

        sonuc.length=5;
        sonuc.width=4;

        sonuc.cevre();
        sonuc.alan();
    }
}
