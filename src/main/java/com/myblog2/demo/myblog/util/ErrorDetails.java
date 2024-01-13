package com.myblog2.demo.myblog.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class ErrorDetails {

    private int statusCode;
    private Date date;
    private String message;
    private String uri;


}
