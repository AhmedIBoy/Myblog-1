package com.myblog2.demo.myblog.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeMain
{
    public static void main(String[] args) {
        List<Employe> employee = Arrays.asList
        (
            new Employe("Ahmed",35,"Mumbai"),
            new Employe("Jabir",30,"Rachi"),
            new Employe("Mohammed",25,"Banglore"),
                new Employe("Jawad",32,"Mumbai")
        );

       List<Employe> empList = employee.stream().filter(e -> e.getAge() >= 30).collect(Collectors.toList());

       for(Employe ep : empList){
           System.out.println(ep.getName());
           System.out.println(ep.getCity());
           System.out.println(ep.getAge());
           System.out.println("=================");
       }
    }
}
