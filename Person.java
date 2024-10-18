package com.example.employeemanagementsystem;

public class Person {

    private int id;
    private String name;
    private String lname;
    private String gmail;
    private String yahoo;
    private String phone;
    private String country;

    // Constructor
    public Person(int id, String name, String lname, String gmail, String yahoo, String phone, String country) {
        this.id = id;
        this.name = name;
        this.lname = lname;
        this.gmail = gmail;
        this.yahoo = yahoo;
        this.phone = phone;
        this.country = country;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getYahoo() {
        return yahoo;
    }

    public void setYahoo(String yahoo) {
        this.yahoo = yahoo;
    }


}
