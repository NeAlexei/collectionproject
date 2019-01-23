package com.kinomo.dao;

import com.google.gson.Gson;
import com.kinomo.model.User;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;

public class JsonDAO implements DAO {

    private List<User> users;

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
        UsersJson usersJson = gson.fromJson(br, UsersJson.class); //br - прочитанный из emp.Json, мапим на класс UsersJson.class

        users = usersJson.getListUser();

//        users = gson.fromJson(br, new TypeToken<List<User>>(){}.getType());

    }

    @Override
    public User getById(int id) {

//        for (User specificUser : usersJson) {
//            if (id == specificUser.getId()) {
//                System.out.println(specificUser.getFirstname() + specificUser.getAge());
//            return specificUser;
//            }
//        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public Map<String, List<User>> getUnique() {
        return null;
    }
}
