package com.guava.example;

import com.google.common.base.Splitter;

import java.util.Iterator;

/**
 * @author : yyc
 * @date : 2019-7-8
 */
public class SplitterTester {

    public void testSplitter() {

        Iterable<String> split = Splitter.on(",").trimResults().omitEmptyStrings().split("a, b,c,d");

        Iterator<String> iterator = split.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
