package com.myblog2.demo.myblog.Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiInterview {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(28,829,16,34,12,13);
//============print a sum of all numbers==========================
//        Optional<Integer> sum = num.stream().reduce(Integer::sum);
//        System.out.println("Sum of Numbers "+sum.get());

//===========print all numbers averages===========================

//        double asDouble = num.stream().mapToInt(e -> e).average().getAsDouble();
//        System.out.println("Average Of All Numbers :"+asDouble);

//============filter and average of all numbers===================

//    double filter = num.stream().filter(e -> e > 100).mapToInt(e -> e).average().getAsDouble();
//        System.out.println("Filter average of all Numbers :"+filter);

//============find out the even and Odd number==========================
//        List<Integer> even = num.stream().filter(e -> e % 2 == 0).toList();
//        System.out.println("Even Numbers from The List : "+even);
//
//        List<Integer> odd = num.stream().filter(e -> e % 2 != 0).toList();
//        System.out.println("Odd Numbers from The List : "+odd);

//===========print the number start with prefix 2 ======================

//        List<Integer> startWith = num.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
//        System.out.println(startWith);

//===========sort the number in ASC/DSC order=============================

//        List<Integer> sortedASC = num.stream().sorted().collect(Collectors.toList());
//        System.out.println(sortedASC);
//
//        List<Integer> sortedDSC = num.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//        System.out.println(sortedDSC);

//==============find first five numbers and sum of that num  given list===================

//        List<Integer> first = num.stream().limit(5).collect(Collectors.toList());
//        System.out.println(first);
//
//        Integer sumFirst = num.stream().limit(5).reduce((a, b) -> a + b).get();
//        System.out.println(sumFirst);


//==========find the 2nd highest/lowest numbers from the list=================
//        Integer high = num.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
//        System.out.println(high);
//
//        Integer lowest = num.stream().sorted().distinct().skip(1).findFirst().get();
//        System.out.println(lowest);
    }

}
