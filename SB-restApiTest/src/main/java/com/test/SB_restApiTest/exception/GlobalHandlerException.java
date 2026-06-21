package com.test.SB_restApiTest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandlerException {
       @ExceptionHandler(PersonNotFoundException.class)
       public ResponseEntity<?> handlerResourceNotFound(PersonNotFoundException ex){
    	   return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
       }
       
       @ExceptionHandler(Exception.class)
       public ResponseEntity<?> handleGlobalException(PersonNotFoundException ex){
    	   return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
       }
}
