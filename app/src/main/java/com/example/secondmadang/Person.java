package com.example.secondmadang;

public class Person {
    String name;
    String mobile;

    public Person(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public String getName() {
        return name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setName(String name) {
        this.name = name;
    }
}
