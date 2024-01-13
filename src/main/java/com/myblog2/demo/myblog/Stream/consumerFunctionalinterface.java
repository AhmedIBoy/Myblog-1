package com.myblog2.demo.myblog.Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumerFunctionalinterface {
    public static void main(String[] args) {
//       Consumer<Integer> number = result -> System.out.println(result);
//       number.accept(30);

//=================================Fruit Lists=============================================
//        List<String> fruits = Arrays.asList("Mango","Litchi","Kiwi","pomegranate","Pineapple");
//
//        Consumer<String> result = fruit -> System.out.println(fruit);
//        fruits.forEach(result);

//================================Employee Lists============================================

        List<String>  employee = Arrays.asList("Ahmed","Mohammed","Jabir","Jawad");

        Consumer<String> result = emp -> System.out.println(emp);
        employee.forEach(result);

//================================File Handling===========================================

//        Consumer<String> writeToTextFile = content ->
//        {
//            try {
//                Files.write(Paths.get("C:\\file_content/C.txt"),content.getBytes(), StandardOpenOption.APPEND);
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        };
//
//        writeToTextFile.accept("\n"+"My Designation Is Java Developer with 3 years of exp");
//        System.out.println("Successfully Content Added");

//========================================================================================

    }
}
