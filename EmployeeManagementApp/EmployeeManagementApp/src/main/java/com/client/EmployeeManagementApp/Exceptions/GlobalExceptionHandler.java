package com.client.EmployeeManagementApp.Exceptions;

import com.client.EmployeeManagementApp.payloads.ApiResonse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundExceptions.class)
     public ResponseEntity<ApiResonse> handlerResourceNotFoundException(ResourceNotFoundExceptions ex){
        String msgs = ex.getMessage();
        ApiResonse response = ApiResonse.builder().msgs(msgs).success(true).status(HttpStatus.NOT_FOUND).build();

        return new ResponseEntity<ApiResonse>(response, HttpStatus.NOT_FOUND);
     }

}
