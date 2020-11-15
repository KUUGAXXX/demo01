package com.example.demo.controller;


import com.example.demo.bean.Plant3;
import com.example.demo.mapper.Plant2Mapper;
import com.example.demo.mapper.Plant3Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.text.SimpleDateFormat;

@RestController
public class Plant3Cotronller {
    @Autowired
    Plant3Mapper pm3;

    @GetMapping("/huping")
    public Plant3 getp3(){
        Plant3 p= pm3.selectk3(7);
        return p;
    }
    @GetMapping("/huping/add")
    public int insertp3(){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date da = new Date(System.currentTimeMillis());
        Plant3 p=new Plant3(1,4,"zengjia huping",da,1);
        pm3.insertk3(p);
        return 111;
    }
    @GetMapping("/huping/delete")
    public int deletep3(){
        pm3.deletek3(1);
        return 111;
    }
}
