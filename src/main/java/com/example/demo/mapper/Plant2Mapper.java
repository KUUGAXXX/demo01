package com.example.demo.mapper;

import com.example.demo.bean.Plant2;
import org.apache.ibatis.annotations.*;

@Mapper
public interface Plant2Mapper {
    @Select("select * from Plant2 where plant_com=#{plant_com}")
    public Plant2 selectk2(Integer plant_com);

    @Options(useGeneratedKeys =true,keyProperty = "plant_com")
    @Insert("insert into Plant2(user_id,con,plant,time,pon)VALUE(#{user_id},#{con},#{plant},#{time},#{pon})")
    public int insertk2(Plant2 p);

    @Delete("delete from Plant2 where plant_com=#{plant_com}")
    public int deletek2(Integer plant_com);

}
