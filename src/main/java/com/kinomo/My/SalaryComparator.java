package com.kinomo.My;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Emp> {

    public int compare(Emp o1, Emp o2) {
        return o1.getSalary()-o2.getSalary();// отриц, если первый < второго, положит, исле первый > второго и 0 исле они равны.
    }

}
