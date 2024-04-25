package org.example.breaksingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton implements Cloneable{

    private static Singleton instance;
    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }

        return instance;
    }

    @Override
    public Singleton clone() {
        try {
            Singleton clone = (Singleton) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

class MainSingleton{
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        Singleton singletoninstance = Singleton.getInstance();
        Singleton singletoninstance1 = Singleton.getInstance();
        System.out.println("Single ton object: "+singletoninstance.hashCode());
        System.out.println("Single ton duplicate object: "+singletoninstance1.hashCode());

        //ways to break singleton
        // 1.using reflection
        // 2.serialization and
        // 3.using cloning

        //1.using reflectionApI
        //- make the private constructor public and
        //- access the constructor and create as many objects

        Constructor constructor =Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        Singleton breakableinstance = (Singleton) constructor.newInstance();

        System.out.println("singleton object before breaking its behaviour: "+singletoninstance.hashCode());
        System.out.println("singleton object after breaking its behaviour: "+breakableinstance.hashCode());

        //2.Using serialization
        //-first serialize object and write to a file
        //- then deserialize and read from the file
/*
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Miscellaneous\\samplefilecontents.txt"));
        objectOutputStream.writeObject(singletoninstance);
        objectOutputStream.close();

        //now deserialze it
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Miscellaneous\\samplefilecontents.txt"));
        Singleton breakableSingletonInstance= (Singleton) objectInputStream.readObject();

        System.out.println("object before breaking singleton: "+singletoninstance.hashCode());
        System.out.println("object after serialize and deserialize: "+breakableinstance.hashCode());

 */

        //3. using cloning
        //-first make singleton class implement cloneable interface
        //-ovveride the clone method to newInstance

        Singleton instancecloned = singletoninstance.clone();
        System.out.println("object before breaking singleton: "+singletoninstance.hashCode());
        System.out.println("breaking singleton after cloning object: "+instancecloned.hashCode());

    }
}
