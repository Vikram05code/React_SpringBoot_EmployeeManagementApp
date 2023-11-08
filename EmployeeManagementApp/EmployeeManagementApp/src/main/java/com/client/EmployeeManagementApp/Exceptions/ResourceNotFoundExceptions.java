package com.client.EmployeeManagementApp.Exceptions;

public class ResourceNotFoundExceptions extends RuntimeException {

     public ResourceNotFoundExceptions(){
         super("Resource not found on server");
     }

     public ResourceNotFoundExceptions(String msgs){
         super(msgs);
     }

}
