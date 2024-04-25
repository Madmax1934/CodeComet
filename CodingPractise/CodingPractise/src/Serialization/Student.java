package Serialization;

import java.io.*;

public class Student implements Serializable {
     int id;
    transient String name;  //use 'transient' when you dont want to serialize any data member

    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) throws IOException {
        Student s1=new Student(211,"Sursan");

        FileOutputStream fs=new FileOutputStream("C:\\wsapps\\popdb\\configuration\\example-file.txt");
        ObjectOutputStream obj = new ObjectOutputStream(fs);
        obj.writeObject(s1);
        obj.close();
    }
}


