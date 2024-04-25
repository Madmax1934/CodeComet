package org.example.Java8coding.Java8;

// Java Program to Illustrate Functional Interface
// With the Usage of Anonymous class

// Importing input output classes

// Interface
@FunctionalInterface
interface Cab {

    void bookCab();
}

// Practisedproblems.Main class
class GFG {

    // Method 1
    // Practisedproblems.Main driver method
    public static void main(String[] args)
    {

        // Creating object of above functional interface
        Cab cab =()-> {

                // Print statement
                System.out.println(
                        "Booking Successful!! Arriving Soon!!");
            };


        cab.bookCab();
    }
}

