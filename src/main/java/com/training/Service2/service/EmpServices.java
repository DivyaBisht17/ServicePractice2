package com.training.Service2.service;

import com.training.Service2.model.Emp;

import java.util.List;

public interface EmpServices {
    public List<Emp> getAll();
    public  Emp addEmp (Emp emp);
    public Emp updateEmp (Emp emp);
    public String deleteEmp  (int id);
}
