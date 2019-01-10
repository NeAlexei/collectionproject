package com.kinomo.dao;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.kinomo.My.Emp;
import com.kinomo.model.User;

import java.util.List;

public class Users {

    @SerializedName("Emp")
    @Expose
    private List<User> user;

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

}

