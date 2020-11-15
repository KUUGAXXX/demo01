package com.example.demo.bean;


import java.sql.Date;

public class Plant2 {
    private Integer  plant_com;
    private Integer user_id;
    private Integer  plant;
    private String con;
    private Date time;
    private  Integer pon;



    public Plant2(Integer plant_com,Integer user_id, Integer plant, String con,Date time,Integer pon) {
        this.plant_com=plant_com;
        this.user_id = user_id;
        this.plant = plant;
        this.con = con;
        this.time=time;
        this.pon=pon;
    }

    public Plant2(Integer user_id, Integer plant, String con,Date time,Integer pon) {
        this.user_id = user_id;
        this.plant = plant;
        this.con = con;
        this.time=time;
        this.pon=pon;
    }

    public Integer getPlant_com() {
        return plant_com;
    }

    public void setPlant_com(Integer plant_com) {
        this.plant_com = plant_com;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getPlant() {
        return plant;
    }

    public void setPlant(Integer plant) {
        this.plant = plant;
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
        return "plant_com=" +plant_com +
                ", user_id='" + user_id + '\'' +
                ",plant='" +plant + '\'' +
                ", con='" +con + '\'' +
                ", time='" +time + '\'' +
                ",  pon='" + pon + '\'' +
                '}';
    }


}
