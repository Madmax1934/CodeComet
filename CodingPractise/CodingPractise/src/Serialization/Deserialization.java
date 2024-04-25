package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\wsapps\\popdb\\configuration\\example-file.txt"));
            Student s = (Student)ois.readObject();
            System.out.println(s.id+", "+s.name);
            ois.close();
        }catch(Exception e)
        {
            System.out.println("message= "+e.getMessage());
        }
    }
}
