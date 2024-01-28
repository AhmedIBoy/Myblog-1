package com.myblog2.demo.myblog.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeMain
{
    public static void main(String[] args) {
        List<Employe> employee = Arrays.asList
        (
            new Employe("Ahmed",200000,35,"Mumbai"),
            new Employe("Jabir",24938,30,"Rachi"),
            new Employe("Mohammed",36276,25,"Banglore"),
            new Employe("Jawad",72636,32,"Mumbai")
        );
//=================1) calculate the salary of the all employee using stream api==============
//        double sum = employee.stream().mapToDouble(e -> e.getSalary()).sum();
//        System.out.println("ALl Employee Salary Sum : "+sum);
//================2)
    }
}
