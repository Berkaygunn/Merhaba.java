package Gun24;

import java.util.*;

public class _04_JavaMap {
    public static void main(String[] args) {

        Map<Integer, String> hm=new HashMap<>(); // maplerden hashmap
        hm.put(2,"tilki");
        hm.put(3,"kedi");
        hm.put(7,"köpek");
        hm.put(8,"at");
        hm.put(9,"kurt");
        System.out.println("hm = " + hm); // hızlı çalışmak için,kendisine göre sıra

        Map<Integer, String> lhm=new LinkedHashMap<>(); // maplerden linkedhashmap
        lhm.put(2,"tilki");
        lhm.put(3,"kedi");
        lhm.put(7,"köpek");
        lhm.put(8,"at");
        lhm.put(9,"kurt");
        System.out.println("lhm = " + lhm); // eklendiği sıraya göre sıralı

        Map<Integer, String> tm=new TreeMap<>(); // maplerden treemap
        tm.put(2,"tilki");
        tm.put(3,"kedi");
        tm.put(7,"köpek");
        tm.put(8,"at");
        tm.put(9,"kurt");
        System.out.println("tm = " + tm); // her zaman sıralı key e göre , kendinden sortlu


    }
}
