package Gun24;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {
        // bir kartvizit uygulamasını  2 kişi için yapınız

        HashMap<String,String> uKartVizit=new HashMap<>();
        uKartVizit.put("isim","uğur Yılmaz");
        uKartVizit.put("mail","uğur@Yılmaz.com");
        uKartVizit.put("adres","Çekmeköy/İstanbul");
        uKartVizit.put("telefon","0506458751");

        System.out.println("uKartVizit.get(isim) = " + uKartVizit.get("isim"));
        System.out.println("uKartVizit.get(telefon) = " + uKartVizit.get("telefon"));

        HashMap<String,String> aKartVizit=new HashMap<>();
        aKartVizit.put("isim","ayşe bayrak");
        aKartVizit.put("mail","ayşe@bayrak.com");
        aKartVizit.put("adres","şişli/İstanbul");
        aKartVizit.put("telefon","05144888285");

        HashMap<String, HashMap<String,String> > kartvizitler=new HashMap<>();

        kartvizitler.put("uğur",uKartVizit);
        kartvizitler.put("ayşe",aKartVizit);

        System.out.println("uğurun kartviziti = " + kartvizitler.get("uğur"));
        System.out.println("ayşenin kartviziti = " + kartvizitler.get("ayşe"));

        System.out.println("kartvizitler.get(ayşe).get(adres) = " + kartvizitler.get("ayşe").get("adres"));

        for (Map.Entry<String, HashMap<String,String> > kv:kartvizitler.entrySet()){
            System.out.println("mailler = " + kv.getValue().get("mail"));
        }



    }
}
