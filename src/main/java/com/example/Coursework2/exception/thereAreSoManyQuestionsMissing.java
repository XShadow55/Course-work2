package com.example.Coursework2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class thereAreSoManyQuestionsMissing extends RuntimeException{
    public thereAreSoManyQuestionsMissing() {
        super();
    }
}
