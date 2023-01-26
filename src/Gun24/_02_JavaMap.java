package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(1001,"ısmet temur");
        hm.put(1002,"cihat yılmaz");
        hm.put(2001,"talip yıldız");
        hm.put(5001,"eyüpcan bilgin");
        hm.put(1002,"hatice bayrak");

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        for (Integer k: hm.keySet()) {
            System.out.print(k + "\t");

            System.out.println();

            for (String v : hm.values()) {
                System.out.print(v + "\t");

                System.out.println();

                for (Map.Entry<Integer, String> kv : hm.entrySet()) {
                    System.out.println(kv.getKey() + " - " + kv.getValue());

                }

            }
        }
    }
}
