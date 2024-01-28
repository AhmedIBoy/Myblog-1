package com.myblog2.demo.myblog.Stream;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class TransectionsMain {
    public static void main(String[] args) {
        List<Transection> transection = Arrays.asList(
                new Transection(200,"CR", LocalDate.of(2024,1,11)),
                new Transection(100,"DR", LocalDate.of(2023,7,23)),
                new Transection(500,"DR", LocalDate.of(2024,10,20)),
                new Transection(300,"CR", LocalDate.of(2025,4,7))
        );
//   filter out all credit transactions.
        Scanner sc = new Scanner(System.in);
        System.out.println("Which type of transaction record you want CR/DR give one input ");
        String trantype = sc.next();
        List<Transection> creditType = transection.stream().filter(e -> trantype.equals(e.getType())).collect(Collectors.toList());

//  we can sort these transactions by date:
        List<Transection> sortedByDate = transection.stream().sorted(Comparator.comparing(Transection::getLocalDate)).collect(Collectors.toList());

//
//  the total amount of credit transactions:
        double sumoFCreditTransection = creditType.stream().mapToDouble(Transection::getAmount).sum();

//
        for (Transection t : creditType){
            System.out.println("Type of Transaction Record : "+t.getType());
            break;
        }

        DoubleSummaryStatistics statistic = creditType.stream().mapToDouble(Transection::getAmount).summaryStatistics();
        System.out.println("Total Amount : "+ statistic.getSum());
        System.out.println("Average Amount : "+statistic.getAverage());
        System.out.println("Max Transaction : "+statistic.getMax());
        System.out.println("Min Transaction : "+statistic.getMin());
    }
}
