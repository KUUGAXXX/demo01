package com.example.demo.controller;

import com.example.demo.bean.Plant1;
import com.example.demo.mapper.Plant1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;



@RestController
public class Plant1Controller {

    @Autowired
    //自动连接到UserService Bean
    Plant1Mapper pm1;

//测试使用，返回json格式
    @GetMapping("/zhongcao1")
    public String stu1(){
        return "stu1";
    }

    @GetMapping("/zhongcao")
    public Plant1 getp1(){
        int k=26;
        Plant1 p=pm1.getkkk(k);
        return p;
    }

    @GetMapping("/zhongcao/add")
    public String insertp1(){
       // SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date da = new Date(System.currentTimeMillis());
        Plant1 p=new Plant1(1,1,"asdasd","asdasd",da,1);
        pm1.insertkkk(p);
        return "success";
    }

    @GetMapping("zhongcao/delete")
    public String deletep1(){
        int i=2;//设置想要删除的值
        pm1.deletekkk(i);
        return "删除成功";
    }

}
