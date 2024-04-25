package org.example.Java8coding.Java8;

import java.util.ArrayList;
import java.util.List;

class Stud implements Comparable<Stud>{
    int sid,sage;
    String sname;

    public Stud(int sid, int sage, String sname) {
        this.sid = sid;
        this.sage = sage;
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Stud{" +
                "sid=" + sid +
                ", sage=" + sage +
                ", sname='" + sname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Stud o) {
        return sname.length()>o.sname.length()?1:-1;
    }
}
public class Comparableexample {
    public static void main(String[] args) {

        List<Stud> studs = new ArrayList<>();
        studs.add(new Stud(101,28,"Xyz"));
        studs.add(new Stud(102,27,"Sursan"));
        studs.add(new Stud(103,26,"Abc"));

        //Collections.sort(studs,(i,j)->i.sname.equals(j.sname)?1:-1);
        Stud obj = new Stud(104,40,"Sal");
        

        for(Stud s:studs){
            System.out.println(s);
        }
    }
}
