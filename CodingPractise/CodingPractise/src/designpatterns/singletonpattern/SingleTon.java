package designpatterns.singletonpattern;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleTon implements Serializable{
 //making constructor private to avoid instantiating outside
    private SingleTon(){}
    private static SingleTon instance;
    public static SingleTon getInstance(){
        if(instance==null)
        {
           instance=new SingleTon();
        }
        return instance;
    }

    public void show()
    {
        System.out.println("Showing singleton design pattern");
    }
}

class Main{
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException {
        SingleTon singleTon=SingleTon.getInstance();
        SingleTon duplicateInstance = SingleTon.getInstance();
        singleTon.show();
        System.out.println("HashCode for Original singleton instance "+ singleTon.hashCode());
        System.out.println("Hashcode for duplicateInstance "+duplicateInstance.hashCode());
        //breaking singleton design pattern ....

        //1. using serialization

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\wsapps\\popdb\\configuration\\example-file.txt"));
        objectOutputStream.writeObject(singleTon);
        objectOutputStream.close();
        //deserializing
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\wsapps\\popdb\\configuration\\example-file.txt"));
        SingleTon brokeSingletonusingSerializationInstance = (SingleTon) objectInputStream.readObject();
        System.out.println("HashCode for Original singleton instance "+ singleTon.hashCode());
        System.out.println("Hashcode for duplicateInstance "+brokeSingletonusingSerializationInstance.hashCode());


        // 2.using Reflections
        Class<?> singleton=Class.forName("src.designpatterns.singletonpattern.SingleTon");
        Constructor<SingleTon> constructor=(Constructor<SingleTon>) singleton.getDeclaredConstructor();
        SingleTon brokeSingletonusingReflectionInstance=constructor.newInstance();

        System.out.println("HashCode for Original singleton instance "+ singleTon.hashCode());
        System.out.println("Hashcode after breaking singleTon "+brokeSingletonusingReflectionInstance.hashCode());
    }
}
