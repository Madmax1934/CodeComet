package org.sursan.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int college_id;
    private String college_name;

    @OneToMany(mappedBy = "college")
    private List<Student> students;

    public College(int college_id, String college_name) {
        this.college_id = college_id;
        this.college_name = college_name;
    }

    public int getCollege_id() {
        return college_id;
    }

    public void setCollege_id(int college_id) {
        this.college_id = college_id;
    }

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }

    @Override
    public String toString() {
        return "College{" +
                "college_id=" + college_id +
                ", college_name='" + college_name + '\'' +
                '}';
    }
}
