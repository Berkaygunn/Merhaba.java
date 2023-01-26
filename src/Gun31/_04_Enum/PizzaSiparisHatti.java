package Gun31._04_Enum;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        ArrayList<Pizza> siparisler=new ArrayList<>();

        int secim=0;
        do {
            menu();
            secim= read.nextInt();
            switch (secim){
                case 1:
                    Pizza sp=new Pizza(PizzaSize.SMALL);
                    siparisler.add(sp);
                    break;
                case 2:
                    Pizza mp=new Pizza(PizzaSize.MEDIUM);
                    siparisler.add(mp);
                    break;
                case 3:
                    Pizza lp=new Pizza(PizzaSize.LARGE);
                    siparisler.add(lp);
                    break;
                case 4:
                    siparisYazdir(siparisler);
                    break;
            }

        }while (secim<=4);
    }

    public static void menu(){
        System.out.println("*****Pizza Menü*****");
        System.out.println("1-Small");
        System.out.println("2-Medium");
        System.out.println("3-Large");
        System.out.println("4-İşleme al-Sipariş göster");
        System.out.println("5-Çıkış");
        System.out.print("Seçiminiz =");
    }

    public static void siparisYazdir(ArrayList<Pizza> siparisler){
        int s=0 , m=0 , l=0;

        for (Pizza p:siparisler) {
            if (p.size == PizzaSize.SMALL) s++;
            else if (p.size == PizzaSize.MEDIUM) m++;
            else if (p.size == PizzaSize.LARGE) l++;
        }
        System.out.println("*****Siparişleriniz*****");
        System.out.println("Small pizza = "+s);
        System.out.println("Medium pizza = "+m);
        System.out.println("Large pizza = "+l);
    }

}
