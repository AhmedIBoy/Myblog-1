package com.myblog2.demo.myblog.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamQuestion {
    public static void main(String[] args) {
        List<Employe> emp = Arrays.asList
                (
                        new Employe("Ahmed",36,"Mumbai"),
                        new Employe("Jabir",30,"Alibaag"),
                        new Employe("Jawad",30,"Alibaag"),
                        new Employe("Shuban",26,"Mumbai"),
                        new Employe("Ali",38,"Rachi")
                );
//===================Group the Employee Based On The city===============================================================
//        Map<String, List<Employe>> groupByCity = emp.stream().collect(Collectors.groupingBy(e -> e.getCity()));
//        for(Map.Entry<String,List<Employe>> e : groupByCity.entrySet()){
//            String city = e.getKey();
//            List<Employe> empList = e.getValue();
//            System.out.println("City : "+city);
//            empList.forEach(finalEmp -> System.out.println("Name :"+finalEmp.getName()+" --> "+"Age : "+finalEmp.getAge()));
//            System.out.println();
//        }

//==================Employee the Group By Age ======================================================================

//        Map<Integer, List<Employe>> ageGroup = emp.stream().collect(Collectors.groupingBy(e -> e.getAge()));
//        for(Map.Entry<Integer,List<Employe>> ee : ageGroup.entrySet()){
//            Integer age = ee.getKey();
//            List<Employe> ageValue = ee.getValue();
//            System.out.println("Age : "+age);
//            ageValue.forEach(finalAge -> System.out.println("Name :"+finalAge.getName()+"-->"+"City"+finalAge.getAge()));
//            System.out.println();
//        }

//==================Find The Employee Name start With("A")========================================================

//        List<Employe> findEmp = emp.stream().filter(e -> e.getName().startsWith("A")).collect(Collectors.toList());
//        for(Employe e : findEmp){
//            System.out.println("Name : "+e.getName());
//            System.out.println("Age : "+e.getAge());
//            System.out.println("City : "+e.getCity());
//            System.out.println("===================");
//        }


    }
}
