package com.guava.example;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author : yyc
 * @date : 2019-7-8
 */
public class MultiMapTester {

    public void testMultiMap() {

        Multimap<String,String> multimap = ArrayListMultimap.create();

        multimap.put("lower", "a");
        multimap.put("lower", "b");
        multimap.put("lower", "c");
        multimap.put("lower", "d");
        multimap.put("lower", "e");

        multimap.put("upper", "A");
        multimap.put("upper", "B");
        multimap.put("upper", "C");
        multimap.put("upper", "D");

        List<String> lower = (List<String>) multimap.get("lower");
        System.out.println("Initial lower case list :" + lower);

        Map<String, Collection<String>> map = multimap.asMap();
        System.out.println("Multimap as a map");
        for (Map.Entry<String,  Collection<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            Collection<String> value =  multimap.get(key);
            System.out.println(key + ":" + value);
        }

        System.out.println("Keys of Multimap");
        Set<String> keys =  multimap.keySet();
        for(String key:keys){
            System.out.println(key);
        }

        System.out.println("Values of Multimap");
        Collection<String> values = multimap.values();
        System.out.println(values);


    }
}
