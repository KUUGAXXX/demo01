package com.example.demo.bean;


import java.sql.Date;

public class Plant3 {
    private Integer plant_comother;
    private Integer user_id;
    private Integer plant_com;
    private String  con;
    private Date time;
    private Integer  pon;

    public Plant3(Integer plant_comother, Integer user_id, Integer plant_com, String con,Date time,Integer pon) {
        this.plant_comother=plant_comother;
        this.user_id = user_id;
        this.plant_com = plant_com;
        this.con = con;
        this.time=time;
        this.pon=pon;
    }

    public Plant3( Integer user_id, Integer plant_com, String con,Date time,Integer pon) {
        this.user_id = user_id;
        this.plant_com = plant_com;
        this.con = con;
        this.time=time;
        this.pon=pon;
    }

    public Integer getPlant_comother() {
        return plant_comother;
    }

    public void setPlant_comother(Integer plant_comother) {
        this.plant_comother = plant_comother;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getPlant_com() {
        return plant_com;
    }

    public void setPlant_com(Integer plant_com) {
        this.plant_com = plant_com;
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
        return "plant_comother=" + plant_comother +
                ", user_id='" + user_id + '\'' +
                ", plant_com='" + plant_com + '\'' +
                ", con='" +con+ '\'' +
                ", time='" +time + '\'' +
                ",pon='" +pon + '\'' +
                '}';
    }

}
