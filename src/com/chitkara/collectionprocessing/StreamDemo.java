package com.chitkara.collectionprocessing;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Alice", true, 2500.0),
                new User("Bob", false, 4000.0),
                new User("Charlie", true, 1500.0)
        );

        // Streams Pipeline: Filter -> Map -> Reduce
        double totalActiveBalance = users.stream()
                .filter(User::isActive)                  // 1. Filtering
                .map(User::getBalance)                   // 2. Mapping
                .reduce(0.0, Double::sum);               // 3. Reducing (Aggregating)

        System.out.println("Total Active Balance: " + totalActiveBalance); // Output: 4000.0
    }
}
