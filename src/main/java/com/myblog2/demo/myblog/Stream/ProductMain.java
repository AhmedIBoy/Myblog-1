package com.myblog2.demo.myblog.Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMain {
    public static void main(String[] args) {
        List<product> pro = Arrays.asList
                (
                  new product(40093,"MangoDolly","Havmor"),
                  new product(50003,"SimpleDolly","Kwalitywalls"),
                  new product(60002,"CottonCandy","BaskinRobbiens"),
                  new product(70003,"Chocobar","Havmor")
                );

        List<product> proList = pro.stream().filter(p -> p.getProductCompany().startsWith("H")).collect(Collectors.toList());

        for(product pe : proList){
            System.out.println(pe.getProductId());
            System.out.println(pe.getProductName());
            System.out.println(pe.getProductCompany());
            System.out.println("=======================");
        }
    }
}
