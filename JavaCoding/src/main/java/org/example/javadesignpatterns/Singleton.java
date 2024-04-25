package org.example.javadesignpatterns;

import java.io.*;

public class Singleton implements Serializable{

    private static Singleton singleton;
    private Singleton(){};

    public static Singleton getInstance(){
        if(singleton==null)
        {
            singleton=new Singleton();
        }
        return singleton;
    }
}

class SingletonMain{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton newInstance = Singleton.getInstance();
        Singleton dupInstance = Singleton.getInstance();

        System.out.println("Original Instance=  "+newInstance.hashCode());
        System.out.println("Duplicate instance = "+dupInstance.hashCode()); // new object is not getting created

        //serialization and deserialization
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Miscellaneous\\samplefilecontents.txt"));
        objectOutputStream.writeObject(newInstance);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Miscellaneous\\samplefilecontents.txt"));
        Singleton brokensingletonobject = (Singleton) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("Original Instance=  "+newInstance.hashCode());
        System.out.println("Instance after serialization process = "+brokensingletonobject.hashCode());


    }
}
