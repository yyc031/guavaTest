package com.guava.example;

import com.google.common.base.Optional;

/**
 * 对Optional类进行测试
 *
 * @author : yyc
 * @date : 2019-7-8
 */
public class OptionalTester {

    public void testOne() {

        Integer value1 = null;
        Integer value2 = 10;

        // fromNullable-允许传递的参数为空
        Optional<Integer> a = Optional.fromNullable(value1);

        // of-如果传递的参数为空，抛出NPE
        Optional<Integer> b = Optional.of(value2);

        System.out.println(sum(a, b));

    }

    private Integer sum(Optional<Integer> a, Optional<Integer> b) {

        // isPresent-校验值是否存在
        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        // or-返回值，如果不存在则返回输入的默认值
        Integer value1 = a.or(0);

        // get-获取应该存在的值
        Integer value2 = b.get();

        return value1+value2;
    }



}
