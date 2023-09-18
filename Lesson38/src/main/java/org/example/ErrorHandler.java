package org.example;

import org.example.Exception.MistakeAgeException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(MistakeAgeException.class)
    public String errorAge() {
        return "error";
    }

}
