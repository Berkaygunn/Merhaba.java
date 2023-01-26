package Gun39._05_OOP_Soru;

import Utility.MyFunc;
import sun.reflect.generics.tree.SimpleClassTypeSignature;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {

        List<IFood> siparisler=new ArrayList<>();
        Scanner read=new Scanner(System.in);

        int secim=0;
        do {
            menu();
            secim=read.nextInt();
            switch (secim)
            {
                case 1:IFood ak=new AdanaKebap();
                siparisler.add(ak);
                break;

                case 2:IFood lh=new Lahmacun();
                    siparisler.add(lh);
                    break;

                case 3:IFood bo=new Borsh();
                    siparisler.add(bo);
                    break;

                case 4:IFood pa=new Palov();
                    siparisler.add(pa);
                    break;

            }
        }while (secim<5);

        System.out.println("Alınan siparişler");
        for (IFood f:siparisler){
            System.out.println(f.getClass().getSimpleName());
        }
        System.out.println("Siparişleriniz hazırlanıyor.. \n");
        MyFunc.Bekle(2);
        double toplam=0;
        for(IFood f: siparisler){
            TechnoKitchen.hazirla(f);
            toplam+=f.ucret();
            MyFunc.Bekle(2);
        }
        System.out.println("toplam ücret = " + toplam);


    }
    public static void menu(){
        System.out.print("\n***Menü***" +
                "\n1-Adana Kebap (75 Tl)" +
                        "\n2- Lahmacun (20 Tl)" +
                        "\n3-Palov (20 Tl)" +
                        "\n4-Borsh (40 Tl)" +
                        "\n5-Tamam " +
                        "\nSeçiminiz=");


    }
}
