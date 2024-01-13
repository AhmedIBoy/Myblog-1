package com.myblog2.demo.myblog.exception;


import com.myblog2.demo.myblog.util.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResourseNotFoundException.class)
    public ResponseEntity<Object> handleResourceNotFoundException(
                    ResourseNotFoundException e , WebRequest webRequest
            ){

    ErrorDetails error = new ErrorDetails(HttpStatus.NOT_FOUND.value(),new Date(),e.getMessage(),webRequest.getDescription(true));
            error.setMessage("Post Not Found Try with Some another Id");
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }
}
