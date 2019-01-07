package com.kinomo.My;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Emp {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("firstname")
    @Expose
    private String firstname;
    @SerializedName("age")
    @Expose
    private Integer age;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("salary")
    @Expose
    private Integer salary;

    public Emp(Integer id, String firstname, Integer age, String city, Integer salary) {
        this.id = id;
        this.firstname = firstname;
        this.age = age;
        this.city = city;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirsname(String firstname) {
        this.firstname = firstname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

}

