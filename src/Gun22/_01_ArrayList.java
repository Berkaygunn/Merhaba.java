package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemanı
        // Array i sıralarken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("sayilar = " + sayilar);

        //Sıralama işlemi

        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        // Tersine çevir
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);
        
        // Max ve min eleman bulma 
        System.out.println("Collections.max(sayilar) = " + Collections.max(sayilar));
        System.out.println("Collections.min(sayilar) = " + Collections.min(sayilar));


        // bütün elemanları set etme
        Collections.fill(sayilar,0);  // bütün elemanllara 0 atar
        System.out.println("sayilar = " + sayilar);

        // replace
        Collections.replaceAll(sayilar,0,5); // 0 lara 5 atadı
        System.out.println("sayilar = " + sayilar);

        // tanımlarken değer atama
        int[] dizi={2,3,4,5};
        ArrayList<Integer> liste=new ArrayList<>(Arrays.asList(3,4,5,6));
        System.out.println("liste = " + liste);
        ArrayList<String> striste=new ArrayList<>(Arrays.asList("ahmet","4","mehmet","6"));
        System.out.println("striste = " + striste);
        ArrayList<Integer> liste2=new ArrayList<>();
        Collections.addAll(liste2, 2,3,4,5,6,7);

        //diziyi direk Arraylist e nasıl atarım
        Integer[] dizi2={2,3,4,5};
        ArrayList<Integer> list3=new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("list3 = " + list3);
    }
}
