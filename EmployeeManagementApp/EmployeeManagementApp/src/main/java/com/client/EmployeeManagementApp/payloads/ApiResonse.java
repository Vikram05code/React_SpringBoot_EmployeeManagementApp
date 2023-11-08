package com.client.EmployeeManagementApp.payloads;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiResonse {
   private String msgs;
   private Boolean success;
   private HttpStatus status;

}
