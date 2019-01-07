package com.kinomo.My;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Gson gson = new Gson(); //
        BufferedReader br = new BufferedReader(new FileReader("emp.json"));
        Result result = gson.fromJson(br, Result.class);

        if (result != null) { //если
            for (Emp emp : result.getEmp()) {
                System.out.println(emp.getId() + "-" + emp.getFirstname() + "-" + emp.getAge() + "-" + emp.getCity() + "-" + emp.getSalary());
            }
        }
        Iterator<Emp> iterator = result.iterator();
        /* hasnext()- проверяет, есть ли следующий элемент в списке(в интерфейсе list). Можно использовать для вывода всех
        элементов списка: цикл будет выполняться до тех пор, пока есть следующий элемент в коллекции.
          next- ;
          remove- ;*/
        while (iterator.hasNext());
        System.out.println(iterator.next());
    }
}
//            }
//        }
//    }
//}



//    Gson gson = new Gson();
/*Java object to Json*/
//    Employee_my employee_my = new Employee_my("John", 21, "J@gmail.com");
//    String json = gson.toJson(employee_my);
/*Json to java object*/
//    String json = "{\"firstName\":\"John\", \"age\":30, \"mail\":\"J@gmail.com\"}";
//    Employee_my employee_my_01 = gson.fromJson(json, Employee_my.class);