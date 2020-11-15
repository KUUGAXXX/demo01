/*
package com.example.demo.controller;

import com.example.demo.bean.Plant1;
import com.example.demo.bean.T1;
import com.example.demo.mapper.Plant1Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BBBController {
   @Autowired
    Plant1Mapper pm2;

   @GetMapping("/getbbb")
    public T1 getb(Integer f1)
   {
       int m=1;
       T1 t=pm2.getbbb(m);
       return  t;

   }


    @GetMapping("/insertbbb/add")
    public String insertbbb(T1 t){

        pm2.insertbbb(5,5);
        return "success";
    }
}
*/
