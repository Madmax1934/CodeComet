package Practisedproblems;

import java.util.Comparator;

public class sortbyName implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        int namecomp =  o1.name.compareTo(o2.name);
        int idcompare = o1.getEmpid().compareTo(o2.getEmpid());

        return (namecomp == 0)? idcompare:namecomp;
    }
}
