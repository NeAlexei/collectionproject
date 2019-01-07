package com.kinomo;

import com.google.gson.Gson;

public class Create_my {

    Gson gson = new Gson();

    /*Java object to Json*/
//    Employee_my employee_my = new Employee_my("John", 21, "J@gmail.com");
//    String json = gson.toJson(employee_my);

    /*Json to java object*/
    String json = "{\"firstName\":\"John\", \"age\":30, \"mail\":\"J@gmail.com\"}";
    Employee_my employee_my1 = gson.fromJson(json, Employee_my.class);


}
