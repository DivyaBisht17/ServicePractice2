package com.training.Service2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    private  int id;
    private String name;
    private  Float salary;
    private  long account_No;
    private  int age ;
    private  boolean countryIndia;



}
