package com.lqw.java8_optional.test;

import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/1/25
 * @TIME: 9:57
 */

@Slf4j
public class OptionalTest {
    public static void main(String[] args) {

        //0001
        Optional<Integer> a = Optional.empty();
        System.out.println("0001:"+a);

        //0002
        Integer b = new Integer(20);
        Optional<Integer> obtB = Optional.of(b);
        System.out.println("0002:"+obtB);

        //0003
        Integer c = obtB.get();
        System.out.println("0003:"+c);

        //0004
        System.out.println("0004:"+Optional.ofNullable(a));

        //0005
        System.out.println("0005:"+obtB.isPresent());




    }
}
