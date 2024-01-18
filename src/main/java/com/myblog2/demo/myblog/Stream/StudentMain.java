package com.myblog2.demo.myblog.Stream;

import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> student = Arrays.asList
                (new Student(101,"Ahmed","Mumbai"),
                new Student(201,"Mohammed","Kolkata"),
                new Student(301,"Jabir","Mumbai"),
                new Student(401,"Ahmed","Bangalore")
                );

//        List<Student> m = student.stream().filter(e -> e.getCity().startsWith("M")).collect(Collectors.toList());
//        for(Student newRecord : m){
//            System.out.println(newRecord.getName());
//            System.out.println(newRecord.getRollno());
//            System.out.println(newRecord.getCity());
//            System.out.println("--------------------");
//        }

//==========================================================================
//        Map<String, List<Student>> collect = student.stream().collect(Collectors.groupingBy(e -> e.getCity()));
//
//        for(Map.Entry<String,List<Student>> result : collect.entrySet()){
//            String key = result.getKey();
//            List<Student> value = result.getValue();
//            System.out.println("City --> : "+key);
//            value.forEach(e -> System.out.println("Name : "+e.getName()+"\n"+"City : "+e.getRollno()));
//            System.out.println("=====================");
//        }

//=================================================================================

//        Map<String, List<Student>> name = student.stream().collect(Collectors.groupingBy(Student::getName));
//
//        for(Map.Entry<String,List<Student>> result : name.entrySet()){
//            String key = result.getKey();
//            List<Student> value = result.getValue();
//
//            System.out.println("Name : ---> "+key);
//            value.forEach(e -> System.out.println("RollNo --> : "+e.getRollno()+" ===> "+"City : "+e.getCity()));
//            System.out.println("====================================");
//        }

//========================================================================================

        List<Integer> num = Arrays.asList(29,18,43,74,34,27,59,43);
//        Integer sumOfFiveNum = num.stream().limit(5).reduce((a, b) -> a + b).get();
//        System.out.println(sumOfFiveNum);
//
//        List<Integer> numSumNum = num.stream().limit(5).map(e -> e + e).collect(Collectors.toList());
//        System.out.println(numSumNum);

//========================================================================================
//        List<Integer> skipEven = num.stream().skip(3).filter(e -> e % 2 == 0).collect(Collectors.toList());
//        System.out.println(skipEven);
//
//        Integer skipSum = num.stream().skip(3).reduce((a, b) -> a + b).get();
//        System.out.println(skipSum);

// ========================================================================================

//        Integer secundhighest = num.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
//        System.out.println(secundhighest);
//
//        Integer secondlowest = num.stream().sorted().distinct().skip(1).findFirst().get();
//        System.out.println(secondlowest);

//==================================Average======================================================

        double asDouble = num.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(asDouble);

        double asDouble1 = num.stream().filter(e -> e > 50).mapToInt(e -> e).average().getAsDouble();
        System.out.println(asDouble1);
    }


}
