package com.test.SB_restApiTest.exception;

public class PersonNotFoundException extends RuntimeException{
       public PersonNotFoundException(String msg) {
    	   super(msg);
       }
}
