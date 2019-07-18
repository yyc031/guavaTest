package com.guava.example;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : yyc
 * @date : 2019-7-8
 */
public class BiMapTester {

    public void biMapTest() {

        // HashBiMap不支持相同的value
        BiMap<Integer, String> hashBiMap = HashBiMap.create();

        Map<Integer, String> hashMap = new HashMap<Integer, String>(16);

        // put相同的value时会抛出异常，需要使用forcePut
        hashMap.put(1, "xq");
        hashMap.put(2, "yyc");
        hashMap.put(3, "zzq");

        hashBiMap.putAll(hashMap);

        System.out.println(hashBiMap.inverse().get("yyc"));
        System.out.println(hashBiMap.values());
    }
}
