package com.kinomo.My;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Gson gson = new Gson();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("emp.json"));
            Result result = gson.fromJson(br, Result.class);

            if (result != null){
                for (Emp i : result.getEmp()){
                    System.out.println(i.getId() + " - " + i.getFirstname() + " - " + i.getAge() + " - " + i.getCity() + " - " + i.getSalary());
                }
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
