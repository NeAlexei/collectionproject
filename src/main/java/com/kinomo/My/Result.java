package com.kinomo.My;

import java.util.Iterator;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("Emp")
    @Expose
    private List<Emp> emp;

    public List<Emp> getEmp() {
        return emp;
    }

    public void setEmp(List<Emp> emp) {
        this.emp = emp;
    }

}

