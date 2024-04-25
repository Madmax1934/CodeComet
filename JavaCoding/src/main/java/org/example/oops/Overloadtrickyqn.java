package org.example.oops;

public class Overloadtrickyqn {

    //order of preference would be first : int, long ,Integer, int..
    private void print(int i) {
        System.out.println("int");
    }
    private void print(Integer i) {
        System.out.println("integer");
    }

    private void print(long i) {
        System.out.println("long");
    }

    private void print(int... i) {
        System.out.println("int...");
    }

    private void print(byte i) {
        System.out.println("byte");
    }
    private void print(short i) {
        System.out.println("short");
    }

    public static void main(String[] args) {
        Overloadtrickyqn overloadtrickyqn = new Overloadtrickyqn();
        overloadtrickyqn.print(10);
    }

}
