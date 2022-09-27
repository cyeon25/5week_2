package com.example.a5week_2;

public class Person {
    String name;
    String mobile;

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Person(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }
}
