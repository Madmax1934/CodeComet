package org.example.reflections;

public class Cat {
    private final String name;
    private final int height;


    public Cat(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
