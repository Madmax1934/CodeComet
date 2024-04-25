package Java8;

import java.util.List;
import java.util.stream.Collectors;

public class FP01 {
    public static void main(String[] args) {
        printNumbersUsingStreams(List.of(1,3,13,24,5,21,5,3));
        List<String> courses = List.of("C++","Java","devOps","REactJS","Spring","Java","Spring");
       // printCourses(courses);

    }

    private static void printCourses(List<String> courses) {
        courses.stream().distinct().sorted(String::compareToIgnoreCase).forEach(System.out::println);
    }

    public static boolean isEven(int number){
        return number%2==0;
    }
    private static void printNumbersUsingStreams(List<Integer> integers) {
      //  integers.stream().filter(FP01::isEven).forEach(System.out::println);//Method reference

        int a =integers.stream()
                .filter(i->i%2!=0).reduce((x,y)->x+y).get();
        System.out.println("the result is : "+a);

        List<Integer> reslist= integers.stream().map(num->num*num).collect(Collectors.toList());
        reslist.forEach(System.out::println);
    }
}
