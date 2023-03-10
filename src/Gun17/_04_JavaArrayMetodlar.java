package Gun17;

import java.util.Arrays;

public class _04_JavaArrayMetodlar {
    public static void main(String[] args) {

        String[] isimler={"ahmet","zeynep","roman","yasin","cihan"};

        // diziyi string olarak direk yazdırır.
        System.out.println("isimler = " + Arrays.toString(isimler));

        //dizi sıralama
        Arrays.sort(isimler);
        System.out.println("isimler = " + Arrays.toString(isimler));

        //diziler eşit mi ?
        int[] a={1,8,3,54};
        int[] b={1,8,3,54};
        int[] c={1,8,2,54};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b)); // true
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c)); // false

        Arrays.sort(c); // sayı bazlı dizi sıralaması
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));

        //contains gibi çalışır, var ise pozitif bir değer döndürür, yok ise negatif
        System.out.println("Arrays.binarySearch(b,3) = " + Arrays.binarySearch(b,3));
        Arrays.sort(b); // ancak sıralanmış dizilerde doğru sonuç verir.
        System.out.println("Arrays.binarySearch(b,3) = " + Arrays.binarySearch(b, 3));
    }
}
