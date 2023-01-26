package Gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {
        int sayi; // hafızada int kadar yer ayırıyor,sadece tam sayı atılabiliyor
        // tam sıyalarda default INT
        // tam sayılar
        byte byteDeger = 7;  // -128  127
        short shortDeger = 1645;  // -32000  32000
        int intDeger = 250000;
        long longDeger = 233266565656L;

        // ondalıklı sayılar
        // ondalıklı sayılarda default DOUBLE dır.

        double doubleDeger = 3.14754586552;  // noktadan sonra 16 hane duyarlıdır.
        float floatDeger = 3.14754F;         // noktadan sonra 7 hane duyarlıdır.


        char basHarf='B';  // bir karakter saklayabilir.
        String isim="berkay";  // kelime veya cümle saklayabilir

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("isim = " + isim);

    }
}
