package com.myblog2.demo.myblog.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(20,34,47,34,20,43,39,43,44,65,67,85);
        List<Integer> even = num.stream().distinct().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(even);
    }
}


