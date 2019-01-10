package com.kinomo.dao;

import com.google.gson.Gson;
import com.kinomo.My.Result;
import com.kinomo.model.User;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JsonDAO implements DAO {

    private List<User> users ;

    public JsonDAO() {

            initialize();

    }

    @Override
    public void initialize() {

        Gson gson = new Gson(); //
        BufferedReader br = null; //
        try {
            br = new BufferedReader(new FileReader("emp.json")); //
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Users usersJson = gson.fromJson(br, Users.class); //
        users = usersJson.getUser();

    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public Map<String, List<User>> getUnique() {
        return null;
    }
}
