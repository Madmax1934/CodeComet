package org.example.Misc;

public class Genericclass<T> {

    private T value;
    private T[] array;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void printArray(T[] arr)
    {
        array = arr;
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

class Mainclass
{
    public static void main(String[] args) {
        String s = "abc";
        int a=10;
        Genericclass gc = new Genericclass();
        gc.setValue(10);
        System.out.println(gc.getValue());

        Object[] arr;
        arr = new Object[]{"Apple","Ball","Cat"};
        gc.printArray(arr);

    }
}
