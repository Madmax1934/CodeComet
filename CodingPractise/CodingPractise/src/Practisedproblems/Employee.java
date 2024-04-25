package Practisedproblems;

public class Employee {

    int empid;
     String name;

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int eid, String ename)
     {
         this.empid=eid;
         this.name=ename;
     }

    @Override
    public String toString() {
        return "Practisedproblems.Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                '}';
    }
}
