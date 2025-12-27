//qwsjwqeqwcdeghhvvjnkjwvdihdbd



// 
// EXCEPTION
package com.example.demo.exception;

public class DuplicateEmailException extends RuntimeException {

    public DuplicateEmailException() {
        super("Email already exists");
    }
}

……………………………..
package com.example.demo.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public String handleRuntime(RuntimeException ex) {
        return ex.getMessage();
    }
}

// ……………………………..

// …………………………………..


// ………………………………



