package Java8;

import java.util.ArrayList;
import java.util.List;

public class Distinctelements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("pqr");
        list.add("abc");
        list.stream().distinct().forEach(i-> System.out.println(i));
    }
}
