package com.example.fireb2;

public class MainModel {
    String name , email , address , turl;

    public MainModel() {

    }

    public MainModel(String name, String email, String address, String turl) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.turl = turl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTurl() {
        return turl;
    }

    public void setTurl(String turl) {
        this.turl = turl;
    }
}
