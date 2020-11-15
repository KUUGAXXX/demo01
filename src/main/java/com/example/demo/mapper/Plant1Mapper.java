package com.example.demo.mapper;

import com.example.demo.bean.T1;
import com.example.demo.bean.Plant1;
import org.apache.ibatis.annotations.*;


//1 @Mapper将UserDao声明为一个Mapper接口
//3 @Select, @Insert 分别代表了执行的真实SQL
//指定这是一个要操作数据库的mapper
//这个注解表示该类是一个MyBatis的mapper类
@Mapper
public interface Plant1Mapper {
    @Select("select * from Plant1 where plant=#{plant}")
    public Plant1 getkkk(Integer plant);

    //  @Select("select * from t1 where f1=#{f1}")
    // public T1 getbbb(Integer f1);

    @Options(useGeneratedKeys =true,keyProperty = "plant")
    @Insert("insert into Plant1(user_id,goods_id,pic,con,time,pon)VALUE(#{user_id},#{goods_id},#{pic},#{con},#{time},#{pon})")
    public int insertkkk(Plant1 p);


   // @Insert("insert into t1(f1,f2)VALUE(#{f1},#{f2})")
    //public int insertbbb(@Param("f1") int f1, @Param("f2") int f2);


    @Delete("delete from Plant1 where plant=#{plant}")
    public int deletekkk(Integer plant);


}
