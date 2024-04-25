package Oops;

import java.util.zip.CRC32;

public class Cricketer {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cricketer(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cricketer{" +
                "id=" + id +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Cricketer crcktr = new Cricketer(25);
        Cricketer cricketer = crcktr;
        Cricketer cricketer1 = new Cricketer(25);
        System.out.println(cricketer==crcktr);
        System.out.println(cricketer.equals(cricketer1));
    }
}
