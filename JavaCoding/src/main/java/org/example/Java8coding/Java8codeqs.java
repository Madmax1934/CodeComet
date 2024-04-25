package org.example.Java8coding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8codeqs {
    public static void main(String[] args) {
        List<Integer> numbers= List.of(10,15,8,49,25,98,32,10,15);
        String str = "Java8 is awesome";
        String s1="act";
        String s2 = "cat";
        squaresofoddnos(numbers);


        System.out.println("Is the number Amstrong? "+Amstrongno(371));
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        countmorethan1(names);
        numbers.stream().map(s->s+"")
                .filter(i->i.startsWith("1"))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        findmax(numbers);
//        numbers.stream().map(i->i*i*i)
//                        .filter(j->j>50)
//                                .forEach(System.out::println);

//        findduplicates(numbers);
//        firstnonrepeatedchar(str);
//        firstrepeatedcharacter(str);
//        findcharwithcountmorethan2(numbers);
    }

    private static void findmax(List<Integer> numbers) {
        int x =numbers.stream().max(Integer::compare).get();
        System.out.println("Max value="+x);
    }

    private static boolean Amstrongno(int i) {

       int len= String.valueOf(i).length();
//        int sum=String.valueOf(i).chars().map(ch->Character.digit(ch,10))
//                .map(digit-> (int)Math.pow(digit,len)).sum();
//        return sum==i;
        int temp=i,sum=0;
        while(temp>0)
        {
            sum+=(int)Math.pow(temp%10,len);
            temp/=10;

        }
        return sum==i;
    }


    private static void squaresofoddnos(List<Integer> numbers) {
        numbers.stream().filter(i->i%2!=0).map(j->j*j).forEach(System.out::println);
    }

    private static void countmorethan1(List<String> names) {
        Map<String, Long> map = names.stream().filter(s -> Collections.frequency(names, s) > 1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }

    private static void findcharwithcountmorethan2(List<Integer> numbers) {
        if(numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i->i.getValue()>=2L)
                .map(en->en.getKey())
                .findAny().stream().count()>0)
        {
            System.out.println(true);
        }
        else
            System.out.println(false);
    }

    private static void firstrepeatedcharacter(String str) {
        Character c1 = str.chars()
                .mapToObj(c -> Character.toLowerCase(Character.valueOf((char) c)))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue() > 1L)
                .map(en -> en.getKey())
                .findFirst()
                .get();
        System.out.println("The first repeating character is : "+c1);

    }

    private static void firstnonrepeatedchar(String input) {
        Character result = input.chars()
                .mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(en->en.getValue()==1l)
                .map(entry->entry.getKey())
                .findFirst()
                .get();
        System.out.println("The first non repeated character is: "+result);

        //using set


    }

    private static void findduplicates(List<Integer> numbers) {
        Set<Integer> set = new HashSet<>();
        set.addAll(numbers);
        numbers.stream().filter(i-> !set.contains(i))
                .forEach(System.out::println);
    }
}
