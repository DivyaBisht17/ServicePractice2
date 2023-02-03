package com.training.Service2.serviceImpl;

import com.training.Service2.model.Emp;
import com.training.Service2.service.EmpServices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpServices {

    @Override
    public List<Emp> getAll() {
        List<Emp> getAll=new ArrayList<>();
      Emp e1 = new Emp(11,"Divya",1000.25f,(long)1234567890,22,true);
      Emp e2 = new Emp(12,"Anjali",1000.25f,(long)245567890,22,true);
      Emp e3 = new Emp(13,"Kapil",1000.25f,(long)336767890,22,false);
      Emp e4 = new Emp(14,"Yogendr",1000.25f,(long)434567890,22,false);
      Emp e5 = new Emp(15,"Disha",1000.25f,(long)534567890,22,true);
      Emp e6 = new Emp(16,"Deepshikha",1000.25f,(long)734567890,22,true);
      Emp e7 = new Emp(17,"Babita",1000.25f,(long)834567890,22,true);
      Emp e8 = new Emp(18,"Divya",1000.25f,(long)934567890,22,true);
      Emp e9 = new Emp(19,"Shivangi ",1000.25f,(long)1034567890,22,true);
      Emp e10 = new Emp(20,"Meena",1000.25f,(long)244567890,22,true);
      getAll.add(e1);
      getAll.add(e2);
        getAll.add(e3);
        getAll.add(e4);
        getAll.add(e5);
        getAll.add(e6);
        getAll.add(e7);
        getAll.add(e8);
        getAll.add(e9);
        getAll.add(e10);
        return getAll;
    }

    @Override
    public Emp addEmp(Emp emp)
    {
        return emp;
    }

    @Override
    public Emp updateEmp(Emp emp) {
        return emp;
    }

    @Override
    public String deleteEmp(int id) {
        return "Delete Successfully id no:"+id;
    }
}
