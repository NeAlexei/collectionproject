package com.kinomo;

import com.kinomo.dao.DAO;
import com.kinomo.dao.DAOFactory;
import com.kinomo.dao.DAOFactory.DAOKeys;
import com.kinomo.dao.JsonDAO;
import com.kinomo.model.User;

public class Runner {

    public static void main(String[] args) {
//        DAO dao = DAOFactory.get(DAOKeys.JSON); // эквивалентно DAO dao = new JsonDAO();

//        dao.initialize();

        JsonDAO js = new JsonDAO();

        System.out.println(js.getById(10) + "\n");

        System.out.println(js.getAll());

        System.out.println(js.getUnique("Detroit"));
    }

}
