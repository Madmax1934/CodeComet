package org.example.reflections;

import java.io.File;
import java.lang.reflect.Field;

public class MainReflection {
    public static void main(String[] args) throws IllegalAccessException {
        Cat myCat = new Cat("Bujji",1);
        Field[] fields = myCat.getClass().getDeclaredFields();

        for(Field field: fields)
        {
            if(field.getName().equals("name"))
            {
                field.setAccessible(true);
                field.set(myCat,"Annie");
            }
        }
        System.out.println(myCat.getName());
    }
}
