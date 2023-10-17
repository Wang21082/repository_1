package com.example.spring_web.service.impl;

import com.example.spring_web.dao.EmpDao;
import com.example.spring_web.dao.impl.EmpDaoA;
import com.example.spring_web.pojo.Emp;
import com.example.spring_web.service.EmpService;

import java.util.List;

public class EmpServiceA implements EmpService {
    private EmpDao empdao = new EmpDaoA();


    @Override
    public List<Emp> listEmp() {
        List<Emp> empList = empdao.listEmp();

        empList.stream().forEach(emp -> {
            String gender = emp.getGender();
            if("1".equals(gender)){
                emp.setGender("男");
            }else if("2".equals(gender)) {
                emp.setGender("女");
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
