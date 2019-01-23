package com.kinomo.dao;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.kinomo.model.User;

import java.util.List;

public class UsersJson {

    @SerializedName("Emp")
    @Expose
    private List<User> people;

    public List<User> getListUser() {
        return people;
    }

    public void setUser(List<User> people) {
        this.people = people;
    }

}

