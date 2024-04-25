package org.example.Misc;

public class MainPlaywithkeywords{
    public static void main(String[] args) {
        System.out.println("value of static variable: "+PlayingwithKeywords.x);
        PlayingwithKeywords playingwithKeywords = new PlayingwithKeywords();
        //playingwithKeywords.method1();
        PlayingwithSubKeywords.multiplication();
        PlayingwithSubKeywords playingwithSubKeywords = new PlayingwithSubKeywords();
        System.out.println(playingwithSubKeywords.equals(playingwithKeywords));
        System.out.println("subclass object: "+playingwithSubKeywords.hashCode()+" superclass object: "+playingwithKeywords.hashCode());
    }
}
