package com.leapfinance.ExpenseTracker.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    private String firstName;
    private String lastName;
    private int age;
    private String occupation;
}
