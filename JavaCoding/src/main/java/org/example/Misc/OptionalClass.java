package org.example.Misc;

import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {


// Usage
        Optional<String> nameOptional = findNameById(123);
        if (nameOptional.isPresent()) {
            String name = nameOptional.get();
            System.out.println("Name found: " + name);
        } else {
            System.out.println("Name not found");
        }

    }

    public static Optional<String> findNameById(int id) {
        // Some logic to find the name by id
        if (!true) {
            return Optional.of("Sursan");
        } else {
            return Optional.empty(); // Indicates absence of a value
        }
    }
}
