package com.example.spring_web.controller;

import com.example.spring_web.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class RequestController {

    @RequestMapping("/simplePojo")
    public String simplePojo(User user){
        System.out.println(user);
        return "ok";
    }

    @RequestMapping("/ListParam")
    public String ListParam(@RequestParam List<String> list){
        System.out.println(list.toString());
        return "好的";
    }

        //日期时间参数
    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-ddHH:mm:ss") LocalDateTime updateTime){
            System.out.println(updateTime);
            return "OK";
    }

    //JSON参数
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return "OK";
    }

    //路径参数
    @RequestMapping("/path/{id}")
    public String pathParam(@PathVariable Integer id){
        System.out.println(id);
        return "OK";
    }


}

