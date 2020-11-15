package com.example.demo.mapper;


import com.example.demo.bean.Plant3;

import org.apache.ibatis.annotations.*;

@Mapper
public interface Plant3Mapper {
    @Select("select * from Plant3 where plant_comother=#{plant_comother}")
    public Plant3 selectk3(Integer plant_comother);

    @Options(useGeneratedKeys =true,keyProperty = "plant_comother")
    @Insert("insert into Plant3(user_id,con,plant_com,time,pon)VALUE(#{user_id},#{con},#{plant_com},#{time},#{pon})")
    public int insertk3(Plant3 p);

    @Delete("delete from Plant3 where plant_com=#{plant_comother}")
    public int deletek3(Integer plant_comother);
}
