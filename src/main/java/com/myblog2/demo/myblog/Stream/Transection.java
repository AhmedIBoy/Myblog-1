package com.myblog2.demo.myblog.Stream;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Transection {
    private int amount;
    private String type;
    private LocalDate localDate;
}
