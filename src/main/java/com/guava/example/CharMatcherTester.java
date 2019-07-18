package com.guava.example;

import com.google.common.base.CharMatcher;

/**
 * @author : yyc
 * @date : 2019-7-8
 */
public class CharMatcherTester {

    public void testCharMatcher() {

        String s = CharMatcher.anyOf("ab").trimFrom("aabacatbaa");
        System.out.println(s);
    }

}
