package Gun24;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_Soru {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secenekkte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme (Bu secenekte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        Map<String, String> sozluk= new TreeMap<>();

        sozluk.put("masa", "4 ayaklı yemek yemeye yarayan araç..");
        sozluk.put("sandalye", "4 ayaklı oturmaya yarayan gereç.");
        sozluk.put("araba", "ulaşımı sağlayan 4 tekerli taşıt");
        sozluk.put("motorsiklet", "2 tekerlekli bir araç");


        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        int secim=0;

        do{
            //menü çıkacak (1-Ekleme, 2-Düzeltme, 3-Listeleme, 4-Arama)
            System.out.print("MENÜ\n1- EKLEME\n2- Düzeltme\n3- Listeleme\n4- Arama\n5- Silme\n6- Çıkış\nSeçiminiz=");
            //seçim alınacak
            secim =okuInt.nextInt();

            //seçime göre işlem yapılacak
            switch (secim)
            {
                case 1: //1 i seçti ise ekleme işlemini yap
                    //kelimeyi giriniz
                    System.out.print("Kelime giriniz=");
                    String kelime=okuStr.nextLine();
                    // manasını giriniz
                    System.out.print("Manasını yazınız=");
                    String manasi=okuStr.nextLine();
                    // buna uygun değişkene ekle
                    sozluk.put(kelime, manasi);
                    break;
                case 2: //2 yi seçti ise düzeltme işlemini yap
                    System.out.print("düzeltme seçildi, düzelteceğiniz kelimeyi yazınız =");
                    String dkelime=okuStr.nextLine();
                    System.out.print("Manasını düzeltin =");
                    String dmanasi=okuStr.nextLine();
                    sozluk.put(dkelime,dmanasi);
                    break;

                case 3:
                    System.out.println("Listeleme seçildi ");
                    for (Map.Entry<String,String> kv: sozluk.entrySet()){
                        System.out.println(kv.getKey()+ "-"+kv.getValue());
                    }
                    break;

                case 4:
                    System.out.print("Arama seçildi,Aranacak kelimeyi seçiniz =");
                    String akelime=okuStr.nextLine();

                    System.out.println(sozluk.get(akelime));

                    break;
                case 5:
                    System.out.print("Silme işlemi ,silinecek kelimeyi yazınız =");
                    String skelime=okuStr.nextLine();
                    sozluk.remove(skelime);
                    break;
            }

        }while(secim != 6); //çıkış olmadığı sürece devam et

        System.out.println(sozluk.entrySet());

    }
}
