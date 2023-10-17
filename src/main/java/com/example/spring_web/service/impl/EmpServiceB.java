package com.example.spring_web.service.impl;

import com.example.spring_web.dao.EmpDao;
import com.example.spring_web.pojo.Emp;
import com.example.spring_web.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmpServiceB implements EmpService {
    @Autowired
    private EmpDao empdao;

    @Override
    public List<Emp> listEmp() {
        List<Emp> empList = empdao.listEmp();

        empList.stream().forEach(emp -> {
            String gender = emp.getGender();
            if("1".equals(gender)){
                emp.setGender("男士");
            }else if("2".equals(gender)) {
                emp.setGender("女士");
            }

            String job = emp.getJob();
            if("1".equals(job)){
                emp.setJob("讲师");
            }else if("2".equals(job)) {
                emp.setJob("班主任");
            }else if("3".equals(job)) {
                emp.setJob("就业指导");
            }
        });

        return empList;
    }
}
