package com.example.demo.controller;

import com.example.demo.bean.Plant2;
import com.example.demo.mapper.Plant2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.text.SimpleDateFormat;

@RestController
public class Plant2Cotronller {
    @Autowired
    Plant2Mapper pm2;

    @GetMapping("/ping")
    public Plant2 getp2(){
        Plant2 p= pm2.selectk2(4);
        return p;
    }
    @GetMapping("/ping/add")
    public int insertp2(){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date da = new Date(System.currentTimeMillis());
        Plant2 p=new Plant2(1,1,1,"asda",da,1);
        pm2.insertk2(p);
        return 111;
    }
    @GetMapping("/ping/delete")
    public int deletep2(){
        pm2.deletek2(1);
        return 111;
    }
}
