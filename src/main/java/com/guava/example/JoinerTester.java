package com.guava.example;

import com.google.common.base.Joiner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : yyc
 * @date : 2019-7-8
 */
public class JoinerTester {

    public void joinerTest() throws IOException {

        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        String s = Joiner.on(" | ").skipNulls().join(list);

        StringBuffer buffer = new StringBuffer();
        StringBuffer stringBuffer = Joiner.on("||").appendTo(buffer, list);
        System.out.println(stringBuffer.toString());


        System.out.println(s);
    }
}
