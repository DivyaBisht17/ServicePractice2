package com.training.Service2.controller;

import com.training.Service2.model.Emp;
import com.training.Service2.service.EmpServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmpController {
    @Autowired
    private EmpServices empServices;

@GetMapping("/addEmp")
    public List<Emp> getAll()
    {
        return empServices.getAll();
    }

    @PostMapping("/saveEmp")
    public  Emp saveEmp(@RequestBody Emp emp)
    {
        return  empServices.addEmp(emp);
    }
    @PutMapping("/updateEmp")
    public  Emp updateEmp (@RequestBody Emp emp)
    {
        return  empServices.updateEmp(emp);
    }
    //http://localhost:8080/api/v1/deleteEmp/19
    @DeleteMapping("/deleteEmp/{id}")
    public String getDelete(@PathVariable int id){
        return empServices.deleteEmp(id);
    }



}
