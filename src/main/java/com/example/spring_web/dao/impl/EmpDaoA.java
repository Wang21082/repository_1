package com.example.spring_web.dao.impl;

import com.example.spring_web.dao.EmpDao;
import com.example.spring_web.pojo.Emp;
import com.example.spring_web.utils.XmlParserUtils;

import java.util.List;

public class EmpDaoA implements EmpDao {

    @Override
    public List<Emp> listEmp() {
        String file=this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
