package com.security.Exceptions;

public class DepartmentException extends RuntimeException{

    public DepartmentException(){

    }

    public DepartmentException(String message){
        super(message);
    }
}
