package com.example.demo.bean;


import java.util.Date;
//entity类
public class Plant1 {
    private Integer plant;
    private Integer user_id;
    private Integer goods_id;
    private String pic;
    private String con;
    private Date time;
    private  Integer pon;

    public Plant1(Integer plant,Integer user_id, Integer goods_id, String pic, String con,Date time,Integer pon) {
        this.plant=plant;
        this.user_id = user_id;
        this.goods_id = goods_id;
        this.pic = pic;
        this.con = con;
        this.time= time;
        this.pon=pon;
    }
    public Plant1(Integer user_id, Integer goods_id, String pic, String con,Date time,Integer pon) {
        this.user_id = user_id;
        this.goods_id = goods_id;
        this.pic = pic;
        this.con = con;
        this.time= time;
        this.pon=pon;
    }

    public Integer getPlant() {
        return plant;
    }

    public void setPlant(Integer plant) {
        this.plant = plant;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getPon() {
        return pon;
    }

    public void setPon(Integer pon) {
        this.pon = pon;
    }

    @Override
    public String toString() {
        return "plant=" + plant +
                ", user_id='" + user_id + '\'' +
                ", goods_id='" + goods_id + '\'' +
                ", pic='" +pic + '\'' +
                ", con='" +con + '\'' +
                ", time='" +time + '\'' +
                ", pon='" +pon + '\'' +

                '}';
    }

}
