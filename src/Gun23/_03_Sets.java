package Gun23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler=new HashSet<>();
        renkler.add("red");
        renkler.add("blue");
        renkler.add("green");
        renkler.add("red");
        renkler.add("RED");

        //ekrana yazdırma
        System.out.println("renkler = " + renkler);

        //Ekrana tek tek nasıl yazdırırım

        for (String eleman:renkler) {  // sıra garanti değil
            System.out.println("eleman = " + eleman);
        }

        //set in kendi sırası nasıl ise onun aynısını verir.
        Iterator gosterge=renkler.iterator();
        while (gosterge.hasNext()) //sıradaki eleman var ise
        {
            System.out.println("gosterge.next() = " + gosterge.next());
            // .Next göstergenin gösterdiği elemanı temsil ediyor
        }
    }
}
