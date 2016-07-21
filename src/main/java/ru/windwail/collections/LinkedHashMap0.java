package ru.windwail.collections;

import java.util.LinkedHashMap;

/**
 * Created by icetusk on 21.07.16.
 */
public class LinkedHashMap0 {

    public static void main(String... args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>(100, 0.75f, true);

        lhm.put("aaaa",1);
        lhm.put("AaAa",2);
        lhm.put("AaBB",3);
        lhm.put("bbbb",4);

        for(String k: lhm.keySet()) {
            Integer value = lhm.get(k); // java.util.ConcurrentModificationException
            System.out.println(k + value);
        }
    }
}
