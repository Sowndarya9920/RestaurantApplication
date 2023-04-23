package com.example.restaurant.model;

public class Restaurant {
    private String id;

    private String name;
    private String speciality;
    private String totalStaffs;
    private String phoneNo;
    private String openHours;
    Restaurant(){

    }

    public Restaurant(String id,String name,String speciality,String totalStaffs,String phoneNo,String openHours){
        this.id = id;
        this.name = name;
        this.speciality = speciality;
        this.totalStaffs = totalStaffs;
        this.phoneNo = phoneNo;
        this.openHours = openHours;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getTotalStaffs() {
        return totalStaffs;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setTotalStaffs(String totalStaffs) {
        this.totalStaffs = totalStaffs;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getOpenHours() {
        return openHours;
    }

    public void setOpenHours(String openHours) {
        this.openHours = openHours;
    }



}
