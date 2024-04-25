package org.example.Java8coding.Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Problems {
    public static void main(String[] args) {

        int[] givenArr = {1,2,4,6,7,10};
        List<Double> list = Arrays.asList(1.12, 2.05, 4.4, 6.3, 7.123, 10.0);
        List<Integer> somelist = Arrays.asList(1,2,4,6,7,10);

        List<String> strlist = List.of("pen","paper","pen","book","paper","board");

        freqstrs(strlist);
        sortdecimalrev(list);

        // join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter
        System.out.println(strlist.stream().collect(Collectors.joining(",","[","]")));
        //find maximum and minimum of those numbers
        System.out.println("find maximum and minimum of those numbers");
        System.out.println(list.stream().max(Comparator.naturalOrder()).get());
        System.out.println(list.stream().max(Comparator.reverseOrder()).get());

        //get three maximum numbers and three minimum numbers from the given list of integers
        System.out.println("get three maximum numbers and three minimum numbers from the given list of integers");
//        somelist.stream().sorted().limit(3).forEach(System.out::println);
//        somelist.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

        //check if two strings are anagrams or not?
        System.out.println("check if two strings are anagrams or not?");
        anagarmscheck();

        //merge two unsorted arrays into single sorted array using Java 8 streams
        System.out.println("merge two unsorted arrays into single sorted array using Java 8 streams");
        merge2arrs();

        //sum of all digits of a number in Java 8
        System.out.println("sum of all digits of a number in Java 8");
        sumofdigits();

        //Find second largest number in an integer array
        System.out.println("Find second largest number in an integer array");
        List<Integer> arrtoList = Arrays.stream(givenArr).boxed().toList();//collect(Collectors.toList());
        arrtoList.stream().sorted(Comparator.reverseOrder()).limit(2).forEach(System.out::println);

        //list of strings, sort them according to increasing order of their length
        System.out.println("list of strings, sort them according to increasing order of their length");
        strlist.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

        //an integer array, find sum and average of all elements
        System.out.println("an integer array, find sum and average of all elements");
        System.out.println("sum = "+Arrays.stream(givenArr).sum()+" and avg= "
                +(Arrays.stream(givenArr).sum()/givenArr.length));

        // find common elements between two arrays?
        System.out.println(" find common elements between two arrays?");
        findcommoneles();

        System.out.println("Reverse Integer array");
        int []revArr=IntStream.rangeClosed(1, givenArr.length).map(i->givenArr[givenArr.length-i]).toArray();
        System.out.println(Arrays.toString(revArr));

        System.out.println("find most repeated element in an array");
        mostfreqele(strlist);

        System.out.println("Check palindrome or not");
        palindromecheck();

        System.out.println("Given a list of strings, find out those strings which start with a number");
        decimalprefixinstring();

        System.out.println("extract duplicate elements from an array");
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> set = new HashSet<>();
        Set<Integer> dupele = listOfIntegers.stream().filter(i->!set.add(i)).collect(Collectors.toSet());
        System.out.println(dupele);

        System.out.println("Print duplicate characters in a string");
        dupcharsinstring();

    }

    public static void dupcharsinstring()
    {
        String s="tomato";
        String scpy="";
        Set<String> charset = new HashSet<>();
        System.out.println(Arrays.stream(s.split("")).filter(ch -> !charset.add(ch)).collect(Collectors.toSet()));
    }
    public static void decimalprefixinstring()
    {
        List<String> stringlist = List.of("1abc","xyz","String","0pqr");
        stringlist.stream().filter(i->Character.isDigit(i.charAt(0))).forEach(System.out::println);
    }
    public static void palindromecheck()
    {
        String str = "RADAR";
        boolean ispalindrome = IntStream.range(0,str.length()/2)
                .allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));

        if(ispalindrome)
            System.out.println("True! it is a palindrome");
        else{
            System.out.println("It is not a palindrome");
        }
    }
    public static void mostfreqele(List<String> stringList)
    {
        Map<String, Long> freqofele = stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map.Entry<String,Long> maxfreqele= freqofele.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("Most freq element key: "+maxfreqele.getKey()+" and its count = "+maxfreqele.getValue());
    }
    public static void findcommoneles()
    {

        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        list1.stream().filter(list2::contains).forEach(System.out::println);
    }
    public static void sumofdigits()
    {
        int x=789;
        System.out.println(Stream.of(String.valueOf(x).split("")).
                mapToInt(Integer::parseInt)
                .reduce((a,b)->a+b).getAsInt());
    }
    public static void anagarmscheck()
    {
        String s1 = "cat";
        String s2 = "tac";

        String ss1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String ss2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if(ss1.equals(ss2))
        {
            System.out.println(s1+" and "+s2+" are anagrams.");
        }
        else{
            System.out.println(s1+" and "+s2+" are not anagrams.");
        }
    }

    public static  void merge2arrs()
    {
        int[] arr1={1,3,2,15,4};
        int[] arr2 = {9,3,10,3,24,55};

        int[] sorted = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(sorted));
    }
    public static void sortdecimalrev(List<Double> anylist)
    {
        anylist.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    public static void freqstrs(List<String> strs){
        List<String> list1 = strs.stream().distinct().collect(Collectors.toList());
        for(String i:list1){
           int count =  (int)strs.stream().filter(j->j.equals(i)).count();
            System.out.println("For "+i+"count ="+count);
        }
    }
}
