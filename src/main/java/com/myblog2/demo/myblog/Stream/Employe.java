package com.myblog2.demo.myblog.Stream;

public class Employe {
    private String name;

    private int age ;
    private String city;

    public Employe(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}
